import java.util.Scanner;



public class ModArray
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the array size: ");
        int size = sc.nextInt();
        System.out.println("enter the array elements: ");
        int arr[]=new int[size];
        for(int i=0;i<size;i++)
        {
            arr[i] = sc.nextInt();
        }
        System.out.println("enter the B value: ");
        int B = sc.nextInt();
        System.out.println(findmodArray(arr,B,size));
    }
    public static int findmodArray(int[] arr,int b,int size){
        int ans=0,power=1;
        for(int i=size-1;i>=0;i--) {
            ans = (ans + (arr[i] % b) * power) % b;
            power = (power * 10) % b;
        }
        return ans;
    }
}
