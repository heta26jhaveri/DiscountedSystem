package discountsystem.core;

import java.util.Date;
/**
 * This class defines a visit of a customer at a specified date.
 * It also takes serviceExpense and productExpense as input and derives total bill for a customer.
 * 
 * @author jhaverih
 *
 */
public class Visit{
	Customer customer;
	Date visitDate;
	double serviceBill;
	double productBill;
	
	public Visit(Customer customer, Date visitDate, double serviceBill, double productBill){
		this.customer = customer;
		this.visitDate = visitDate;
		this.serviceBill = serviceBill;
		this.productBill = productBill;
	}
	
	public Customer getCustomer(){
		return customer;
	}

	public Date getVisitDate(){
		return visitDate;
	}

	public double getServiceBill(){
		return serviceBill;
	}

	public double getProductBill(){
		return productBill;
	}
	
	/**
		Computer final bill, apply discounts if any based on membership
	*/
	public double getFinalBill(){
		DiscountedBill serviceDiscount = new ServiceDiscountedBill();
		DiscountedBill productDiscount = new ProductDiscountedBill();
		
		return serviceDiscount.getDiscountedBill(this.serviceBill, this.getCustomer().getMemberType())
				+ productDiscount.getDiscountedBill(this.productBill, this.getCustomer().getMemberType());
	}
}
