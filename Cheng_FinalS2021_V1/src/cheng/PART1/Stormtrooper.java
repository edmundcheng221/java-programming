package cheng.PART1;

public abstract class Stormtrooper extends ImperialTrooper implements Tactical{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

//	public Stormtrooper(String iDNumber) {
//		super(iDNumber);
//	}

	private String STID;
	
	public Stormtrooper(String IDNumber, String STID) {
		super(IDNumber);
		this.STID = STID;
		// TODO Auto-generated constructor stub
	}
	
	public abstract void displayTrooper();
	
	public void move() {
		System.out.println(getIDNumber() + " is moving");
	}

	public String getSTID() {
		return STID;
	}

	public void setSTID(String sTID) {
		STID = sTID;
	}
}
