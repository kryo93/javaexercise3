public class exceptionCheck
{
    public static void main(String[] args)
    {
        try
        {
            throw new myExecption("Its an error");

        }
        catch (Exception e)
        {
            System.out.println("i was here ");
        }

    }
}

class myExecption extends Exception
{
    public myExecption(String args)
    {

    }
}
