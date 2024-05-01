package lecture.lec05_generics;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class GenericTest {
    public static <T> void sort(T[] array, Comparable<T> comparator) {
        for(int i = 0; i < array.length; i++) {
            for(int j = i + 1; j < array.length; j++) {
                if(comparator.compareTo(array[i], array[j]) > 0) {
                    T temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        Comparable<Student> studentGradeComparatorAsc = new Comparable<Student>() {
            @Override
            public int compareTo(Student s1, Student s2) {
                if(s1.getFinalGrade() > s2.getFinalGrade()) {
                    return 1;
                }
                else if(s1.getFinalGrade() < s2.getFinalGrade()) {
                    return -1;
                }

                return 0;
            }
        };

        Comparable<Student> studentMatNrComparatorAsc = new Comparable<Student>() {
            @Override
            public int compareTo(Student s1, Student s2) {
                if(s1.getMatNr() > s2.getMatNr()) {
                    return 1;
                }
                else if(s1.getMatNr() < s2.getMatNr()) {
                    return -1;
                }

                return 0;
            }
        };

        Comparable<Student> studentNameComparatorAsc = new Comparable<Student>() {
            @Override
            public int compareTo(Student s1, Student s2) {
                if(s1.getLastName().compareTo(s2.getLastName()) > 0) {
                    return 1;
                }
                else if(s1.getLastName().compareTo(s2.getLastName()) < 0) {
                    return -1;
                }
                else {
                    if(s1.getFirstName().compareTo(s2.getFirstName()) > 0) {
                        return 1;
                    }
                    else if(s1.getFirstName().compareTo(s2.getFirstName()) < 0) {
                        return -1;
                    }
                    else {
                        return studentMatNrComparatorAsc.compareTo(s1, s2);
                    }
                }
            }
        };

        Comparable<Professor> profNameComparatorAsc = new Comparable<Professor>() {
            @Override
            public int compareTo(Professor p1, Professor p2) {
                if(p1.getLastName().compareTo(p2.getLastName()) > 0) {
                    return 1;
                }
                else if(p1.getLastName().compareTo(p2.getLastName()) < 0) {
                    return -1;
                }
                else {
                    if(p1.getFirstName().compareTo(p2.getFirstName()) > 0) {
                        return 1;
                    }
                    else if(p1.getFirstName().compareTo(p2.getFirstName()) < 0) {
                        return -1;
                    }
                    else {
                        return 0;
                    }
                }
            }
        };

        Comparable<Professor> profWComparatorAsc = new Comparable<Professor>() {
            @Override
            public int compareTo(Professor p1, Professor p2) {
                if(p1.getPos().compare(p2.getPos()) > 0) {
                    return 1;
                }
                else if(p1.getPos().compare(p2.getPos()) < 0) {
                    return -1;
                }
                else {
                        return 0;
                }
            }
        };

        Comparable<Person> personNameComparatorAsc = new Comparable<Person>() {
            @Override
            public int compareTo(Person p1, Person p2) {
                if(p1.getLastName().compareTo(p2.getLastName()) > 0) {
                    return 1;
                }
                else if(p1.getLastName().compareTo(p2.getLastName()) < 0) {
                    return -1;
                }
                else {
                    if(p1.getFirstName().compareTo(p2.getFirstName()) > 0) {
                        return 1;
                    }
                    else if(p1.getFirstName().compareTo(p2.getFirstName()) < 0) {
                        return -1;
                    }
                    else {
                        return 0;
                    }
                }
            }
        };

        Student[] students = new Student[] {
                new Student("Alice", "Wonderland", 42424242, 1.3f),
                new Student("Bob", "Miller", 538357, 3.1f),
                new Student("Charly", "Pooth", 7377356, 2.6f),
                new Student("Charly", "Mac", 32561, 3.0f),
                new Student("Dave", "Dave", 8753453, 4.0f),
                new Student("Dave", "Dave", 42, 1.0f),
                new Student("Elvis", "?:", 6786554, 1.0f)
        };

        sort(students, studentGradeComparatorAsc);
        System.out.println(Arrays.toString(students));

        sort(students, studentMatNrComparatorAsc);
        System.out.println(Arrays.toString(students));

        sort(students, studentNameComparatorAsc);
        System.out.println(Arrays.toString(students));



        Professor[] profs = new Professor[] {
              new Professor("Anton", "Müller", Professor.Position.W3),
              new Professor("Berbel", "Schmidt", Professor.Position.W2),
              new Professor("Sophie", "Neustedt", Professor.Position.W1),
              new Professor("Albus", "Dumbledore", Professor.Position.W3),
              new Professor("Xenia", "Xylophon", Professor.Position.W2)
        };

        sort(profs, profNameComparatorAsc);
        System.out.println(Arrays.toString(profs));

        sort(profs, profWComparatorAsc);
        System.out.println(Arrays.toString(profs));



        List<Person> personsList = new ArrayList<Person>(students.length + profs.length);
        Collections.addAll(personsList, students);
        Collections.addAll(personsList, profs);

        Person[] persons = personsList.toArray(new Person[personsList.size()]);
        sort(persons, personNameComparatorAsc);
        System.out.println(Arrays.toString(persons));

    }
}
