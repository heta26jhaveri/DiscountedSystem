package discountsystem.core;

public class ServiceDiscountedBill implements DiscountedBill{

	@Override
	public double getDiscountedBill(double serviceBill, MemeberyShipTypes memberType){
		return serviceBill - (serviceBill*memberType.getServiceDiscount());
	}
	
}
