#include <stdio.h>

void proc(int& x) {
    x = 72;
    printf("Passed: %d\n", x);
}


int main(int argc, char** argv) {
    int x = 5;

    proc(x);

    printf("%d\n", x);

    return 0;
}