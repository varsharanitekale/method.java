import java.util.Scanner;
public class thrreedifferentmethodwithdifftype {
    static int intmulti(int a, int b){
        return a*b;
    }
    static float floatmulti(float m, float n){
        return m*n;
    }
    static long longmulti(long i , long j ){
        return i*j;
    }
    
    
    
    
    
    
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        //input of the type int
        System.out.println("Enter your first number");
        int a=sc.nextInt();
        System.out.println("enter your secound number");
        int b=sc.nextInt();
        int w=intmulti(a, b);//calling method
        System.out.println("multipication of inter: " + w);

        System.out.println("Enter first float number");
        float m=sc.nextFloat();
        System.out.println("Enter Secound float number");

        float n=sc.nextFloat();
        float q=floatmulti(m, n);
        System.out.println("multiplication of the float: "+ q);// calling method

        System.out.println("Enter first long number");

        long i=sc.nextLong();
        System.out.println("Enter Secound long number");

        long j=sc.nextLong();
        //calling method......
        
        
        long r=longmulti(i, j);
        System.out.println("multipication of the long : "+ r);//calling method


    }
    
}
