
public class CruiseShip extends Ship{
	
	int passengers;

	public CruiseShip(String name, String year, int passengers) {
		super(name, year);
		this.passengers = passengers;
	}

	public int getPassengers() {
		return passengers;
	}

	public void setPassengers(int passengers) {
		this.passengers = passengers;
	}

	@Override
	public String toString() {
		return "Name: " + this.name + "\nMaximum passengers: " + this.passengers + "\n-------------------------";
	}
	
	

}
