package co.edureka.main;

interface Plan{
	void setDataAndPrice();
	void showDataAndPrice();
}

class Plan2G implements Plan{
	
	int data;
	int price;
	
	public void setDataAndPrice(){
		data = 1;
		price = 200;
	}

	public void showDataAndPrice(){
		System.out.println(data+" GB data for Plan 2G is available at \u20b9"+price);
	}
}

class Plan3G implements Plan{
	
	int data;
	int price;
	
	public void setDataAndPrice(){
		data = 2;
		price = 300;
	}

	public void showDataAndPrice(){
		System.out.println(data+" GB data for Plan 3G is available at \u20b9"+price);
	}
}

class Plan4G implements Plan{
	
	int data;
	int price;
	
	public void setDataAndPrice(){
		data = 5;
		price = 500;
	}

	public void showDataAndPrice(){
		System.out.println(data+" GB data for Plan 4G is available at \u20b9"+price);
	}
}

class PlanFactory{
	
	public static Plan getPlan(int type){
		Plan plan = null;
		
		switch (type) {
			case 2:
				plan = new Plan2G();
				break;

			case 3:
				plan = new Plan3G();
				break;
				
			case 4:
				plan = new Plan4G();
				break;	
		}
		plan.setDataAndPrice();
		return plan;
	}
	
}

public class FactoryPatternDemo {

	public static void main(String[] args) {
		
		Plan plan = PlanFactory.getPlan(2);
		plan.showDataAndPrice();

	}

}
