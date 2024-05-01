package extra2.a1;

import java.util.Arrays;
import java.util.Comparator;

public class GenericSortSolution {
    public static <T> void sort(T[] array, Comparator<T> comparator) {
        for(int i = 0; i < array.length; i++) {
            for(int j = i; j < array.length; j++) {
                if(comparator.compare(array[i], array[j]) == 1) {
                    T temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
    }


    public static void main(String[] args) {
        int[] array = new int[]{6,2,4,8,3,1,10,5};
        Integer[] array2 = Arrays.stream(array).boxed().toArray(Integer[]::new);
        GenericSortSolution.<Integer>sort(array2, (a,b) -> (int) Math.signum(a-b));
        System.out.println(Arrays.toString(array2));
    }
}
