import java.util.Scanner;
public class Sum{
public static void main(String[] args){
Scanner scan=new Scanner(System.in);
int x;
int y;
System.out.println("Enter the value of x");
x=scan.nextInt();
Scanner sca=new Scanner(System.in);
System.out.println("Enter the value of y");
y=sca.nextInt();
int z=x+y;
int m=x-y;
int n=x*y;
System.out.println("The value is " + z);

System.out.println("The value is " + m);

System.out.println("The value is " + n);

}
}
