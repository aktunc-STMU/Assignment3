
public class CargoShip extends Ship{
	
	int tonnage;

	public CargoShip(String name, String year, int tonnage) {
		super(name, year);
		this.tonnage = tonnage;
	}

	public int getCargo() {
		return tonnage;
	}

	public void setCargo(int tonnage) {
		this.tonnage = tonnage;
	}
	
	public String toString(){
		return "Name: " + this.name + "\nCargo Capacity: " + this.tonnage + " tons\n-------------------------";
	}

	
	

}
