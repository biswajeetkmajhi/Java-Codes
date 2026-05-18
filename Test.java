//2.

class Test 
{

    public static int[] generateFibonacci() 
    {
        int[] fib = new int[10];
        fib[0] = 0;
        fib[1] = 1;
        for (int i = 2; i < 10; i++) 
        {
            fib[i] = fib[i-1] + fib[i-2];
        }
        return fib;
    }

    public static int[] generatePrimes() 
    {
        int[] primes = new int[10];

        int count = 0;
        int num = 2; 

        while (count<10) 
	{
            if (isPrime(num)) 
	    {
                primes[count] = num;
                count++;
            }
            num++;
        }
        return primes;
    }

    public static boolean isPrime(int num) 
    {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) 
	{ 
            if (num%i==0) {
                return false;
            }
        }
        return true;
    }

    public static void printAlternate(int[] fib, int[] primes) 
    {
        System.out.println("First 10 Fibonacci and Prime numbers in alternate order:");
        for (int i = 0; i < 10; i++) 
	{
            System.out.print(fib[i]+" "+primes[i]+" ");
        }
    }

    public static void main(String[] args) 
    {
 
        int[] fib = generateFibonacci();
        int[] primes = generatePrimes();


        printAlternate(fib, primes);
    }
}
