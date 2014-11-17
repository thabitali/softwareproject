import java.util.Scanner;
public class Car{
int make;
int year;
int color;
public void setMake(int make){
this.make=make;
}
public void setYear(int year){
this.year=year;
}
public void setColor(int color){
this.color=color;
}
}
public static void main(String[]args){
Scanner sca=new Scanner();
String mak;
System.out.println("Enter the make");
mak=sca.nextInt();
Scanner sca2=new Scanner();
int yr;
System.out.println("Enter the year");
yr=sca2.nextInt();
Scanner sca3=new Scanner();
String colo;
System.out.println("Enter the color");
colo=sca3.nextInt();
Car car1=new Car();
car1.setMake(mak);
car1.setYear(yr);
car1.setColor(colo);
Car car2=new Car();
car2.setMake(mak);
car2.setYear(yr);
car2.setColor(colo);
System.out.println(car1.equals(car2));
}






