//  ## This is Sequential Search ##

#include<stdio.h>
void main(){
    int a[]={10,20,30,40};
    int n =4;
    int i;
    int x=30;
    for(i=0; i<=n-1; i++)
    {
        if(x==a[i]){
            printf("Data is found in index %d\n",i);
            return;
        }
    }
    if(i>=n-1){
       printf("Data is not found"); 
    }
}