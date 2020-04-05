#include <stdio.h>

int main(void) {
    int x=100;
    x+=100;
    x-=50;
    x*=100;
    x/=30;
    x%=9;
    x&=10;
    x|=10;
    x^=2;
    x&1;
    x|0;
    
    char c='x';
    unsigned int ui=0;
    long int li=0L;
    long long int lli=0LL;
    const char *str="This is a string";
    printf("Hello this is input1.c\n");
    if(x>0) {
        printf("foo\n");
    }
    else {
        printf("bar\n");
    }
    printf(x>100?"Yes\n":"No\n");
    return 0;
}