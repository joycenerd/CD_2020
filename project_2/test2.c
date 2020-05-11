#include <stdio.h>


int main(void) {
    int a=0;

    if(a>0) {
        a++;
        if(a>5) {
            a=10;
        }
        else if (a<3) {
            a=-1;
        }
        else {
            a=2;
        }
    }
    else {
        a=3;
        if(a<3) {
            a=-1;
        }
        else {
            a=9;
        }
    }

    printf("%d",a);
    return 0;
}