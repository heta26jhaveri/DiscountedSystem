package discountsystem.core;
/**
	This is the product discount implementation of discounted bill
*/
public class ProductDiscountedBill implements DiscountedBill{
	@Override
	public double getDiscountedBill(double productBill, MemeberyShipTypes membershipType){
		return productBill - productBill*membershipType.getProductDiscount();
	}
}
