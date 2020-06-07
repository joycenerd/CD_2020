#include <stdio.h>
int a;
int main() {
    a = 0;
    if (a) printf("line5: a==0\n");
    a = 5;

    while(a) {
        printf("(In while loop)a = %d\n", a);
        a = a - 1;
    }
}