import java.util.Scanner;


public class registration {
    String Sname;
    String Sdegree;
    String Semail;
    long Sphone;

    registration(String Sname, String Sdegree, long Sphone)

    this.Sname=Sname;
    this.Sdegree=Sdegree;
    this.Sphone=Sphone;

}
registration(String Semail, String Sname, String Sdegree)
{
    this.Semail=Semail;
    this.Sename=Sename;
    this.Sdegree=Sdegree;

}
void display() {
    System.out.println("your detail");
    System.out.println("Student Name "+Sname);
    System.out.println("Student Email: "+Semail);
    System.out.println("Student Phone: "+Sphone);
    System.out.println("Student Degree: "+Sdegree);
}
public static void main(String[] args) {
    int choice;
    long Sphone;
        String Semail, Sname, Sdegree;
        Scanner scn=new Scanner (System.in);
        System.out.println("enter 1 to reg using phone \n enter 2 to reg using email");
        Choice=scn.nextInt();
        if(Choice==1){
            System.out.println("Enter Phone Number");
            Sphone.scn.nextlong
              }
    
}