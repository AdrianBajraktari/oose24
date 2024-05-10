#include<stdio.h>

void sort(int array[], int size, int (*comparator)(int, int)) {
    for(int i = 0; i < size; i++) {
        for(int j = i + 1; j < size; j++) {
            if(comparator(array[i], array[j]) > 0) {
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
        }
    }
}

int sortAsc(int a, int b) {
    return a > b ? 1: (a < b ? -1: 0);
}

int sortDesc(int a, int b) {
    return a > b ? -1: (a < b ? 1: 0);
}

int sortEven(int a, int b) {
    return (a % 2 == 0) && (b % 2 != 0) ? 1: ((a % 2 != 0) && (b % 2 == 0) ? -1: 0);
}

void printArray(int array[], int size) {
    printf("[ ");
    for(int i = 0; i < size; i++) {
        printf("%d ", array[i]);
    }
    printf("]\n");
}

int main(int argc, char** argv) {
    int array[] = {4, 2, 6, 9, 1, 2, 0, 5, 5, 8};
    printArray(array, 10);

    sort(array, 10, sortAsc);
    printArray(array, 10);

    sort(array, 10, sortDesc);
    printArray(array, 10);

    sort(array, 10, sortEven);
    printArray(array, 10);


    return 0;
}