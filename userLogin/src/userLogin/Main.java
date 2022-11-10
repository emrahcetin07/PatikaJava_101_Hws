package userLogin;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		String userName, password, password2;
		int select;
		Scanner inp = new Scanner(System.in);
		System.out.println(" User Name: ");
		userName = inp.nextLine();

		System.out.println(" Password: ");
		password = inp.nextLine();

		if (userName.equals("Emrah") && password.equals("hava101")) 
		{
			System.out.println("Login Successful");
		}
		else 
		{
			System.out.println("Wrong Password");
			System.out.println("Do you want to create a new password ");
			System.out.println("1-Yes\n2-No");
			System.out.println("Select: ");
			select = inp.nextInt();

			if (select == 1) {
				System.out.println("New Password: ");
				password2 = inp.nextLine();

				if (password.equals("java")|| password2.equals(password)) 
				{
					System.out.println("Could not create password!");
				} 
				else 
				{
					System.out.println("Password is created");
				}
			}

			else
			{
				System.out.println("See you!");
			}
		 }

	}

}
