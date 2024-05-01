#include <stdio.h>
#include <stdlib.h>
#include <string.h>

struct Student {
    char* name;
    int matNr;
    int (*getMatNr)(struct Student*);
    char* (*getName)(struct Student*);
};

int getMatNr(struct Student* this) {
    return this->matNr;
}

int getMatNr2(struct Student* this) {
    return this->matNr +5;
}

char* getName(struct Student* this) {
    return this->name;
}

struct Student* StudentConstructor(char* name, int matNr) {
    struct Student* student = (struct Student*) malloc(sizeof (struct Student));
    student->name = strdup(name);
    student->matNr = matNr;
    student->getMatNr = &getMatNr2;
    student->getName = &getName;
    return student;
}

void StudentDestructor(struct Student* this) {
    free(this->name);
    free(this);
}

int main(int argc, char** argv) {
    //= new Student(...);
    struct Student* student = StudentConstructor("Alice Wonderland", 4930493);
    struct Student* student2 = StudentConstructor("Bob Miller", 56184);
    if(student == NULL) {
        printf("Memory Allocation failed");
    }
    else {
        printf("%d\n", student->getMatNr(student));
        printf("%s\n", student->getName(student));

        printf("%d\n", student2->getMatNr(student2));
        printf("%s\n", student2->getName(student2));

        //delete student;
        free(student->name);
        free(student);
        student = NULL;
    }

    return 0;
}
