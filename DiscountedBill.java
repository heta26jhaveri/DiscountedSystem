package discountsystem.core;

/**
	An interface to defines discounted bill based on membership
*/
public interface DiscountedBill{
	public double getDiscountedBill(double bill, MemeberyShipTypes membershipType);
}
