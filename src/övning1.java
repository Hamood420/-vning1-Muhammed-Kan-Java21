import java.util.Scanner;

public class övning1 {

	public static void main(String[] args) {
		 final String PASSWORD = "Test";
		    Scanner sc = new Scanner(System.in);
		    int attempts = 3;
		    String password = "admin123";
		    while (attempts-- > 0 && !PASSWORD.equals(password)) 
		    {
		        System.out.print("Enter your password: ");
		        password = sc.nextLine();
		        if (password.equals(PASSWORD)) 
		            System.out.println("Welcome");
		        else 
		            System.out.println("Incorrect. Number of attempts remaining: " + attempts);        
		    }
		}
}

