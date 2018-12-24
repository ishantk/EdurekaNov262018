package co.edureka.mavendemo;

import org.apache.log4j.Logger;

@interface MyAnnotation{
	String message();
	int versionNumber() default 1;
}

class CA{
	
	//@MyAnnotation(message="This is a User Defined Annotation",versionNumber=1)
	@MyAnnotation(message="This is a User Defined Annotation")
	void show(){
		
	}
}

class CB extends CA{
	// Overriding : Comments provide Information !!
	// Annotation : Annotation also provides Information like Comment !! A bit more than Comment !!
	//				They can tell compiler what action during compilation should be taken !!
	@Override     
	void show(){
		
	}
}


public class App 
{
	
	static Logger logger = Logger.getLogger(App.class);
	
    public static void main( String[] args ){
    	
        System.out.println( "Hello World!" );
        
        // Show the message on Console and Write in a File
        logger.info("This is an information Message");
        logger.warn("This is a warning Message");
        logger.error("This is an error Message");
        
    }
}
