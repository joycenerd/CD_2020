int main() {
    int a=2048;
    int b=2048;
    while(a!=1) {
        a>>1;
    }
    printf("foo!\n");
    while(a<2048) {
        a<<1;
    }
    printf("bar!\n");
    if(a==b) {
        printf("fork!\n");
    }
    else {
        printf("bogo!\n");
    }
    return 0;
}