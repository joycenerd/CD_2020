#include <stdio.h>
#include <stdlib.h>

typedef struct {
    int x;
    int y;
}COOR;

int main(void) {
    const int N=100;
    COOR data[N];
    int i;
    for(i=0;i<N;i++) {
        data[i].x=i;
        data[i].y=i*i;
    }
    int j=0;
    while(j<N) {
        printf("x=%d, y=%d\n",data[j].x,data[j].y);
        j++;
    }
    return 0;
}