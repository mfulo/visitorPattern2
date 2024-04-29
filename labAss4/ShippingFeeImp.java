package labAss4;

public class ShippingFeeImp implements ShippingFee{

	@Override
	public double computeShippingFee(FurnitureImp fImp) {
		double flatRate = 50;
		double ratePerKm = 10;
		double sf;
		if (fImp.isLight())
			sf=flatRate;
		else
			sf=flatRate+(fImp.getDistance()*ratePerKm);
		return sf;
	}
	
	

}
