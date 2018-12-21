package co.edureka.bean;

// Bean or Model or POJO
public class Connection {

	String driver;
	String url;
	String username;
	String password;
	
	public Connection() {
		System.out.println(">> Connection Object Constructed");
	}

	public Connection(String driver, String url, String username, String password) {
		this.driver = driver;
		this.url = url;
		this.username = username;
		this.password = password;
	}

	public String getDriver() {
		return driver;
	}

	public void setDriver(String driver) {
		this.driver = driver;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public void myInit(){
		System.out.println(">> myInit Executed");
	}
	
	public void myDestroy(){
		System.out.println(">> myDestroy Executed");
	}
	
	@Override
	public String toString() {
		return "Connection [driver=" + driver + ", url=" + url + ", username=" + username + ", password=" + password
				+ "]";
	}
	
}
