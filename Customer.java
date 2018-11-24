package discountsystem.core;

/**
 * This class defines the customer
 * @author apple
 *
 */
public class Customer{
	private String name;
	
	public MemeberyShipTypes getMemberType(){
		return memberType;
	}

	public void setMemberType(MemeberyShipTypes memberType){
		this.memberType = memberType;
	}

	public String getName(){
		return name;
	}

	private MemeberyShipTypes memberType;
	
	public Customer(String name, MemeberyShipTypes memberType){
		this.name = name;
		this.memberType = memberType;
	}
	
	public boolean isMember(){
		return !this.memberType.equals(MemeberyShipTypes.NONE);
	}
	
	
}
