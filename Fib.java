import java.util.Scanner;

public class Fib
{
    private static int fib(int numAlong)
    {
        if(numAlong == 1){
            return 0;
        }

        int nums [] = {0,1};
        int tmp;

        for (int i = 0; i < numAlong - 2; i++){
            tmp = nums[1];
            nums[1] = nums[0] + nums[1];
            nums[0] = tmp;
        }

        return nums[1];
    }

    public static int fibRec(int numAlong){
        int nums [] = {0,1};
        int count = 1;

        if (numAlong == count){
            return nums[0];
        }

        int tmp = nums[1];
        nums[1] = nums[0] + nums[1];
        nums[0] = tmp;

        count++;

        return fibRec(numAlong,nums,count);
    }

    public static int fibRec(int numAlong, int [] nums, int count){
        if (numAlong == count){
            return nums[0];
        }

        int tmp = nums[1];
        nums[1] = nums[0] + nums[1];
        nums[0] = tmp;

        count++;

        return fibRec(numAlong,nums,count);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("How far along in the fibonacci sequence do you want printing? ");
        int numAlong = input.nextInt();
        input.close();

        int ans = fib(numAlong);
        System.out.println(ans);

        ans = fibRec(numAlong);
        System.out.println(ans);
    }
}