import java.util.Scanner;
 
public class FullNameString {
 
 public static void main(String[] args) {
 
  Scanner input = new Scanner(System.in);
  
  System.out.print("Enter first name :: ");
  String firstName = input.nextLine();
  
  System.out.print("Enter middle name :: ");
  String middleName = input.nextLine();
  
  System.out.print("Enter surname :: ");
  String lastName = input.nextLine();
  StringBuffer fullName = new StringBuffer();
  fullName.append(firstName);
  fullName.append(" ");
  fullName.append(middleName);
  fullName.append(" ");
  fullName.append(lastName);
  System.out.println("Hello, " + fullName);
 }
}