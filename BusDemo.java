package busResv;
import java.util.Scanner;
//import java.util.Scanner;
import java.util.ArrayList;

public class BusDemo {
public static void main(String[]args){
	ArrayList<Bus> buses = new ArrayList<Bus>();
	ArrayList<Booking> bookings=new ArrayList<Booking>();
	buses.add(new Bus(1,true,3));
	buses.add(new Bus(2,false,67));
	buses.add(new Bus(3,true,51));
	
	
	int userObj=1;
	Scanner scanner = new Scanner(System.in);
   for (Bus b:buses ) {
	   b.displayBusInfo();
   }
	
	
	while(userObj==1){
		System.out.println("enter 1 to booking and 2 to exit");
		userObj=scanner.nextInt();
		if(userObj==1) {
			Booking booking =new Booking();
			if(booking.isAvailable(bookings,buses)) {
				bookings.add(booking);
				System.out.println("Booking is Conform");
			}
				else 
				{
					System.out.println("Sorry this Bus is not Availabe today");
				}
			}
		}
			
	}
	

	
	

	
  }

