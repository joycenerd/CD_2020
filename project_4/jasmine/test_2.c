void main() {
    int a=1;
    int b;
    if(a<0) {
        b=10;
    }
    else {
        if(a==0) {
            b = 3;
            printf("bogo!\n");
        }
        else {
            b =  5;
            printf("fork!\n");
        }
    }
    printf("a: %d\n",a);
    printf("a: %d\n",b);
}