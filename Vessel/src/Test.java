import java.util.*;

public class Test {
	
	public static void main(String Args[]){
		
		int num;
		String name = null;
		String year = null;
		int pass;
		int ton;
		int count = 0;
		String string;
		
		Ship[] shipArray = new Ship[10];
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("How many ships would you like to put in the array?");
		num = scan.nextInt();
		scan.nextLine();
		
		while(count < num){
			
			System.out.println("What is the type of ship for ship number " + (count + 1) + "\nThe three types are Cruise, Cargo, or Ship");
			string = scan.next();
			scan.nextLine();
			
			if(string.equals("Cruise")|| string.equals("cruise")){
				System.out.println("What is the name of the cruise ship?");
				name = scan.nextLine();
				
				System.out.println("What is the maximum passengers it can hold?");
				pass = scan.nextInt();
				scan.nextLine();
				
				CruiseShip cs = new CruiseShip(name, "NULL", pass);
				
				shipArray[count] = cs;
				count++;
				
			}
			else if(string.equals("Cargo")|| string.equals("cargo")){
				System.out.println("What is the name of the cargo ship?");
				name = scan.nextLine();
				
				System.out.println("What is the maximum cargo capacity in tons?");
				ton = scan.nextInt();
				scan.nextLine();
				
				CargoShip cargo = new CargoShip(name, "NULL", ton);
				
				shipArray[count] = cargo;
				count++;
				
			}
			else if(string.equals("Ship")|| string.equals("ship")){
				System.out.println("What is the name of the ship?");
				name = scan.nextLine();
				
				System.out.println("What was the year it was built?");
				year = scan.next();
				scan.nextLine();
				
				Ship s = new Ship(name, year);
				
				shipArray[count] = s;
				count++;
				
			}
			else{
				System.out.println("Please input a type that is valid");
			}
		}
		
		count = 0;
		
		System.out.println("\n\n-------------------------\n        All Ships        \n-------------------------");
		while(count < num){
			System.out.println(shipArray[count]);
			count++;
		}
		
		
		scan.close();
		
		
	}

}
