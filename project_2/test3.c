#include <stdio.h>

int main(void) {
    int a,b=0,c;
    for(a=0;a<10;a++) {
        for(c=a;c<10;c++) {
        b++;
        }
    }
    while(b>0) {
        b--;
        if(b==1)  {
            break;
        }
    }
    return 0;
}