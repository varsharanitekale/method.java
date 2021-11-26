import java.util.Scanner;
public class threemethodmaxnumber{
    public static int max(int a, int b){
        if(a>b){
            return a;
        }
        else{
            return b;

        }

    }
    public static int max(int a, int b,int c){
        return max(max( a,  b), c);

    }
    public static int max(int a, int b,int c,int d){
        return max(max( a,  b, c), d);

    }

    
    
    
    public static void main(String[] args){
        Scanner sc=new Scanner("System.in");
        // int a=sc.nextInt();
        // int b=sc.nextInt();
        // max(a, b);

        int choice=sc.nextInt();
        System.out.println("enter your choice  2/3/4");
        char C;
        do {
        System.out.println("How many number do you want to comapre?(2/3/4)");
		int ch=sc.nextInt();
        if (ch==2){
            System.out.println("Enter first number");
			int a=sc.nextInt();
			System.out.println("Enter second number");
			int b=sc.nextInt();
			int max=max(a,b);
			System.out.println("The maximun value is = "+max);
        }
        else if (ch==3){
            System.out.println("Enter first number");
			int a=sc.nextInt();
			System.out.println("Enter second number");
		    int b=sc.nextInt();
            System.out.println("Enter third number");
			int c=sc.nextInt();
			int max=max(a,b,c);
			System.out.println("The maximun value is = "+max);
        }else if (ch==4){
            System.out.println("Enter first number");
			int a=sc.nextInt();
			System.out.println("Enter second number");
            int b=sc.nextInt();
			System.out.println("Enter third number");
            int c=sc.nextInt();
			System.out.println("Enter fourth number");
			int d=sc.nextInt();
			int max=max(a,b,c,d);
			System.out.println("The maximun value is = "+max);
        }
        System.out.println("Do you wish to contnue?(yes/no)");
			C=sc.next().charAt(0);
		}while(C=='y'||C=='N');

    }
}