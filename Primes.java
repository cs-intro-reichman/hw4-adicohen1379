public class Primes {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        Boolean [] prime=new Boolean[n+1];
        for(int i=0;i<n+1;i++)
        {
            prime[i]=true;
        }
        prime[0]=false;
        prime[1]=false;
        int counter=0;//סופר כמה מספרים לא ראשוניים יש
        int i=2;
        //int p=0;
        System.out.println("Prime numbers up to :"+n);
        while(i<=n)
        {
            int j=2;
            for( j=2;j<=n;j++)
            {
                if(i%j==0&&i!=j&&i>=j)
                {           
                    prime[i]=false;
                    counter++;
                    break;
                }
               else if((i==j||i%j!=0)&&i>=j)
                {
                    prime[i]=true;
                }
            }
            i++;
        }
        for(int k=0;k<=n;k++)
        {
            if(prime[k]==true)
            {
                System.out.println(k);
            }
        }
        int primeNum=n-1-counter;
        int precent=(int)((primeNum/(double)n)*100);
        System.out.println("There are "+primeNum+" primes between 2 and "+n+ " ("+precent+"% are primes)");
    }
}