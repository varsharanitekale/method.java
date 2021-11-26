import java.util.Scanner;
public class multipication_usingmethod {
    public static int multiplication( int m, int n){
        return m * n;

    }

//main------>
    public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter First number");
    int a=sc.nextInt();
    System.out.println("Enter SEcound number");
    int b=sc.nextInt();
     int result=multiplication(a, b);
     System.out.println("Multiplication:"+result);



    }
    
}
