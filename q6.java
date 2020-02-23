public class q6 {

       q6()throws ArithmeticException,ArrayIndexOutOfBoundsException {
            int a[]={1,2,3,4};
            try
            {
                int A=0;
                int B=5;
                int C =B/A;
                for(int i=0; i<5;i++)
                {
                    System.out.println(a[i]);
                }

            }
            catch (ArrayIndexOutOfBoundsException e)
            {
                System.err.println("Out of Bound error");
            }
            catch(ArithmeticException aa)
            {
                System.err.println("Arithmetic error");
            }
            finally{
                System.out.println("execution is over");
            }
        }
    }
