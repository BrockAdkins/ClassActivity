import java.util.Scanner;

public class Driver {
	
	
	public static void main(String[] args) {
	int proceed = 1;	
		while (proceed > 0) {
			Scanner scan = new Scanner(System.in);
			
			System.out.println("Who made the phone?");
			
			String manufacturer = scan.nextLine();
			
			System.out.println("What is the model of the phone?");
			
			String model = scan.nextLine();
			
			System.out.println("What is the price of the phone?");
			
			String price = scan.nextLine();
			
			System.out.println("Who is the carrier?");
			
			String carrier = scan.nextLine();
			
			MobilePhone phone = new MobilePhone(manufacturer, model, price, carrier);
			
			System.out.println("What is the phone number? (use xxx-xxx-xxxx format)");
			
			String number = scan.nextLine();
			
			System.out.println(phone.call(number));
			
			System.out.println("What text message would you like to send?");
			
			String text = scan.nextLine();
			
			System.out.println("Message: " + phone.text(text));
			
			System.out.println(phone.toString());
			
			System.out.println("Would you like to create a new phone? ('y' for yes or 'n' for no)");
			
			String newPhone = scan.nextLine();
			
			if (newPhone.equals("y")) {
				proceed+=1;
			}
			else if (newPhone.equals("n")) {
				proceed = 0;
			}
		}

	}

}
