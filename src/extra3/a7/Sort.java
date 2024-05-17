package extra3.a7;

public class Sort {
    public int[] sort(int[] array) {
        boolean change = true;                     // 1
        if (array.length > 1) {                    // 2
            while (change) {                       // 3
                change = false;                    // 4
                for (int i = array.length - 1;     // 5
                     i > 0;                     // 6
                     i--) {                     // 7
                    int i1 = array[i];             // 8
                    int i2 = array[i - 1];         // 9
                    if (i1 < i2) {                 //10
                        array[i] = i2;             //11
                        array[i - 1] = i1;         //12
                        change = true;             //13
                    }
                }
            }
        }
        return array;                              //14
    }
}
