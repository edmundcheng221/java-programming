package cheng.PART1;

public class Scouttrooper extends Stormtrooper{
	private String Type = "Scout";
	private String STID = "S-00";
	private String IDNumber = "ST";
	
	public String getIDNumber() {
		return IDNumber;
	}

	public void setIDNumber(String iDNumber) {
		IDNumber = iDNumber;
	}

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public Scouttrooper(String STID, String IDNumber) {
		super(STID, IDNumber);
		// TODO Auto-generated constructor stub
	}

//	public Scouttrooper(String iDNumber) {
//		super(iDNumber);
//		// TODO Auto-generated constructor stub
//	}

	@Override
	public void displayTrooper() {
		// TODO Auto-generated method stub
		System.out.println("I am a " + Type + "trooper");
		System.out.println("My ID Number is " + getIDNumber());
		System.out.println("My STID is " + getSTID());
		
	}

	public String getType() {
		return Type;
	}

	public void setType(String type) {
		Type = type;
	}
	
}
