import java.util.Scanner;
class LogIn{
LogIn(){}
public static void main(String [] args){
Scanner scan = new Scanner(System.in);
String username = "admin";
String password = "123#!";
int a = 0;
System.out.print("Please enter your username: ");
String username1=scan.nextLine();
System.out.print("Please enter your password: ");
String password1=scan.nextLine();
scan.nextLine();
if ((username.equals(username1)) && (password.equals(password1))){
System.out.println("You have successfully logged in. ");
}  else	if((username!=(username1)) && (password!=(password1))){
	while (a<1){
	a = a+1;
	int b =3;
	int c =1;
	System.out.print("INVALID ATTEMPT.You have " +(b-c) + " attempts left.");
	scan.nextLine();
	System.out.print("Please enter your username: " );
	String username2=scan.nextLine();
	System.out.print("Please enter your password: ");
	String password2=scan.nextLine();
	scan.nextLine();
	if((username.equals(username2)) && (password.equals(password2))){
	System.out.println("You have successfully logged in. ");
	} else if((username!=(username2)) && (password!=(password2))){
	System.out.print("INVALID ATTEMPT.You have " +(b-c-c) + " attempt left.");
	scan.nextLine();
	System.out.print("Please enter your username: ");
	String username3=scan.nextLine();
	System.out.print("Please enter your password: ");
	String password3=scan.nextLine();
	scan.nextLine();
	if ((username.equals(username3)) && (password.equals(password3))){
	System.out.println("You have successfully logged in. ");
	}else {
	if((username!=(username3)) && (password !=(password3))){
	System.out.println("Account Blocked");
	}
	}
	}
	a = a+1;
	}
}
}
}



