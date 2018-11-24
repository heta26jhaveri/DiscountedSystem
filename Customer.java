package discountsystem.core;

/**
 * This class defines the customer - name and his/her membership type
 * @author jhaverih
 *
 */
public class Customer{
	private String name;
	private MemeberyShipTypes memberType;
	
	public Customer(String name, MemeberyShipTypes memberType){
		this.name = name;
		this.memberType = memberType;
	}
		
	public MemeberyShipTypes getMemberType(){
		return memberType;
	}
	
	public void setMemberType(MemeberyShipTypes memberType){
		this.memberType = memberType;
	}

	public String getName(){
		return name;
	}
	
	/**
		Check if the customer is a member of the saloon
	*/
	public boolean isMember(){
		return !this.memberType.equals(MemeberyShipTypes.NONE);
	}
}
