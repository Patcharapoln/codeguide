package exercise;

public class Fan implements Controlmachine {
	//TODO Edit an interface and delete unused method
	
	/** status of machine*/
	private String status;
	
	/**
	 * Fan is off.	
	 */
	public Fan(){
		this.status="off";
	}
	
	/**
	 * set power on off.
	 */
	@Override
	public void setPowerOnOff(String status){
		this.status=status;
	}
	
	@Override
	public int getTemp() {
		return 0;
	}
}
