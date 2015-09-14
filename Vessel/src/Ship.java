public class Ship {
	
	String name;
	String year;
	
	
	
	
	
	public Ship(String name, String year) {
		super();
		this.name = name;
		this.year = year;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getYear() {
		return year;
	}


	public void setYear(String year) {
		this.year = year;
	}
	
	
	
	public String toString(){
		return "Name: " + this.name + "\nYear built: " + this.year + "\n-------------------------";
	}
	
	

}
