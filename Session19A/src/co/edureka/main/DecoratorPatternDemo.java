package co.edureka.main;

interface Cab{
	String bookCab();
	int getCabFare();
}

class RegularCab implements Cab{
	
	public String bookCab(){
		return "Cab Booked !!";
	}
	public int getCabFare(){
		return 50;
	}
}

abstract class CabDecorator implements Cab{
	
	Cab cab;
	
	public CabDecorator(Cab cab) {
		this.cab = cab;
	}
	
	public String bookCab(){
		return cab.bookCab();
	}
	public int getCabFare(){
		return cab.getCabFare();
	}
}

class UberCab extends CabDecorator{
	
	public UberCab(Cab cab) {
		super(cab);
	}
	
	public String bookCab(){
		return cab.bookCab()+" Book me a Luxury Uber Cab ";
	}
	public int getCabFare(){
		return cab.getCabFare()+200;
	}
}

class OLACab extends CabDecorator{
	
	public OLACab(Cab cab) {
		super(cab);
	}
	
	public String bookCab(){
		return cab.bookCab()+" Book me a Shared OLA Cab ";
	}
	public int getCabFare(){
		return cab.getCabFare()+100;
	}
}

public class DecoratorPatternDemo {

	public static void main(String[] args) {
		
		RegularCab regCab = new RegularCab();
		System.out.println(regCab.bookCab());
		System.out.println("Fare: \u20b9"+regCab.getCabFare());
		
		
		Cab cab = new RegularCab();
		
		System.out.println();
		
		Cab cab1 = new UberCab(cab);
		System.out.println(cab1.bookCab());
		System.out.println("Fare: \u20b9"+cab1.getCabFare());
		
		System.out.println();
		
		Cab cab2 = new OLACab(cab);
		System.out.println(cab2.bookCab());
		System.out.println("Fare: \u20b9"+cab2.getCabFare());
	}

}
