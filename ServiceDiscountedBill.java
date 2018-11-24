package discountsystem.core;

/**
	This is the service discount implementation of discounted bill
*/
public class ServiceDiscountedBill implements DiscountedBill{

	@Override
	public double getDiscountedBill(double serviceBill, MemeberyShipTypes memberType){
		return serviceBill - (serviceBill*memberType.getServiceDiscount());
	}
}
