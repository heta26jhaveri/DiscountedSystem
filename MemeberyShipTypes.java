package discountsystem.core;

/**
 * This enum defines the types of membership and their discount% offered by the beauty saloon
 * @author apple
 *
 */
public enum MemeberyShipTypes{
	PREMIUM(0, 0), GOLD(0,0), SILVER(0, 0), NONE(0,0);
	
	double serviceDiscount;
	double productDiscount;

	/**
	 * Initialize membership
	 * @param serviceDiscount
	 */
	private MemeberyShipTypes(double serviceDiscount, double productDiscount){
		this.serviceDiscount = serviceDiscount;
		this.productDiscount = productDiscount;
	}


	public double getServiceDiscount(){
		return serviceDiscount;
	}

	public void setServiceDiscount(double serviceDiscount){
		this.serviceDiscount = serviceDiscount;
	}


	public double getProductDiscount(){
		return productDiscount;
	}

	public void setProductDiscount(double productDiscount){
		this.productDiscount = productDiscount;
	}
}
