import java.util.Scanner;

class p1 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[4];  

        System.out.println("Enter 4 numbers:");  
        try 
        {
            for (int i = 0; i < 10; i++) 
            {
                arr[i] = sc.nextInt(); 
            }
        } 
        catch (ArrayIndexOutOfBoundsException e) 
        {
            System.out.println(e);
        }

        sc.close();
    }
}
