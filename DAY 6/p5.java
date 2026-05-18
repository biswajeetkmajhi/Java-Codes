class CheckArgument extends Exception 
{
    CheckArgument(String m) 
    {
        super(m);
    }
}

class p5 
{
    public static void main(String[] args) 
    {
        try 
        {
            if (args.length < 4) 
            {
                throw new CheckArgument("Less than four arguments provided");
            }

            int sum = 0;
            for (int i = 0; i < 4; i++) 
            {
                int num = Integer.parseInt(args[i]);
                sum += num * num;
            }

            System.out.println("Output: " + sum);
        } 
        catch (CheckArgument e) 
        {
            System.out.println("Exception occurred - CheckArgument: " + e.getMessage());
        } 
        catch (NumberFormatException e) 
        {
            System.out.println("Exception occurred - Invalid number format");
        }
    }
}
