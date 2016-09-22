
public class Opg1
{
    public static main(String[] args)
    {

    }
    public static boolean check(String number)
    {
        int cross_sum = 0;

        int test =0;
        for (int i=0; i<number.length();i++)

            if (i%2==1)
            number.charAt(i)
        {
            if(!i&2==0){
                test = String.charat(i);
                test = i*2;
                if(test>=10)
                {
                    test = (test%10)+1;
                }

            }
        }
    }
}

//tag hvert charat
//charat til int
//double = int * 2
//if dobbelt < 10
//cross sum += dobbelt
//if dobbelt >=10
//cross sum += double %10 +1
//cross sum % 10 == 0 -> accepted
