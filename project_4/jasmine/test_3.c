int main() {
    int a;
    int b;
    int c;
    for(a=0;a<10;a++) {
        for(c=a;c<10;c++) {
            b++;
        }
    }
    while(b>0) {
        b--;
        if(b==1)  {
            --a;
        }
    }
    return 0;
}