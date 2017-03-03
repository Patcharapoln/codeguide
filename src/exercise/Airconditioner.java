package exercise;

public class Airconditioner implements Controlmachine {
	//TODO Edit an interface and modified this class
	
	/** status of machine */
	private String status;
	/** Temperature of air conditioner*/
	private int temp;

	/**
	 * Air conditioner is off.
	 */
	public Airconditioner() {
		this.status = "off";
	}

	/**
	 * set power on off.
	 */
	@Override
	public void setPowerOnOff(String status) {
		this.status = status;
	}

	/**
	 * get temperature of air conditioner.
	 * @return Temperature of air conditioner
	 */
	@Override
	public int getTemp() {
		return temp;
	}
}
