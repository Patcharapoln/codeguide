package exercise;

public interface Controlmachine {
	//TODO delete or modified unused method in this interface 
	
	/**
	 * turn on/off a machine
	 * @param status = status of machine
	 */
	public void setPowerOnOff(String status);
		
	/**
	 * Get temperature of Air conditioner
	 * @return
	 */
	public int getTemp();
	
}
