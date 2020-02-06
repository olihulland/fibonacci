#include <stdio.h>

int fib(int * numAlong) //iterative fib function
{
    if (*numAlong == 1){
        return 0;
    }

    int nums[] = {0,1};
    int tmp;

    for (int i = 0; i < *numAlong - 2; i++){
        tmp = nums[1];
        nums[1] = nums[0] + nums[1];
        nums[0] = tmp;
    }

    return nums[1];
}

int main()
{
    int numAlong;
    printf("How far along the fibonacci sequence do you want printing? ");
    scanf("%d",&numAlong);

    printf("%d\n",fib(&numAlong));
}