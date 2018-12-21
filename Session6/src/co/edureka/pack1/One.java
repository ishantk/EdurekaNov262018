package co.edureka.pack1;

public class One {

	private void pvtShow(){
		System.out.println("This is private show of One");
	}
	
	void defShow(){
		System.out.println("This is default show of One");
	}
	
	protected void protShow(){
		System.out.println("This is protected show of One");
	}
	
	public void pubShow(){
		System.out.println("This is public show of One");
	}
	
}

// default
class Two{
	
	private void pvtShow(){
		System.out.println("This is private show of Two");
	}
	
	void defShow(){
		System.out.println("This is default show of Two");
	}
	
	protected void protShow(){
		System.out.println("This is protected show of Two");
	}
	
	public void pubShow(){
		System.out.println("This is public show of Two");
	}
	
}

/*
private class Three{
	
}

protected class Four{
	
}
*/

// PS: Classes can either be public or default !! > But Nested Classes i.e. Class within a class can be any modifier

// In 1 source file we can have only 1 public class !! But can have n number of default classes !!
// Because Java says we have to save the source file with same name as that of public class name !!
/*public class Hello{
	
}*/