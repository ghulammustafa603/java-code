public class task4 {
    public static void main(String args[])
    {
        for(int i=0; i<200; i++)
        {
            int ct=0;
            for(int k=1; k<=i; k++) {
                if (i % k == 0) {
                    ct++;
                }
            }
                if(ct==2)
                {
                    System.out.println(i);
                }


        }
    }
}
