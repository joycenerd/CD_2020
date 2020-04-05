#include <stdio.h>
#include <stdlib.h>
#define N 20

/* Linklist


*/
typedef struct node *nodeptr;

typedef struct node {
    int data;
    nodeptr next;
}Node;

int main() {
    Node *head=(Node *)malloc(sizeof(Node));
    head->next=NULL;
    Node *ptr=head;
    head->data=0;
    int i;
    for(int i=1;i<=N;i++) {
        Node *newnode=(Node *)malloc(sizeof(Node)); // Comment test
        newnode->next=NULL;
        newnode->data=i;
        ptr->next=newnode;
        ptr=newnode;
    }
    ptr=head;
    while(ptr!=NULL) {
        printf("%d\n",ptr->data);
        head=ptr->next;
        free(ptr);
        ptr=head;
    }
    return 0;
}