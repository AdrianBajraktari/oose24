#include <iostream>
#include "Student.h"

struct T {
    char* name;
    int age;
    int matNr;
};

class Student2 {
    int matNr;
public:
    int getMatNr() const {
        return this->matNr;
    }
    Student2(int matNr) {
        this->matNr = matNr;
    }
};

int main() {
    while(true) {
        struct T* t = (struct T*) malloc(sizeof(char*) + sizeof(int) + sizeof(int));
        t->name = "Testus";
        t->age = 42;
        t->matNr = 42424242;
    }

    return 0;
}