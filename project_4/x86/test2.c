#include <stdio.h>
int a;
int b;
int main() {
    a = 1;
    b = 0;
    if (1)
        printf("On\n"); // 2
    if (b)
        printf("Off\n"); // 2
}