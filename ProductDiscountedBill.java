package discountsystem.core;

public class ProductDiscountedBill implements DiscountedBill{

	@Override
	public double getDiscountedBill(double productBill, MemeberyShipTypes membershipType){
		return productBill - productBill*membershipType.getProductDiscount();
	}

}
