package labAss4;

public class FurnitureImp implements Furniture{
	private String type;
	private double length;
	private double width;
	private double height;
	private double distance;
	private boolean isLight;
	
	public FurnitureImp (String type,double length,double width,double height,double distance) {
		this.type = type;
		this.length = length;
		this.width = width;
		this.height = height;
		this.distance = distance;
	}
	
	public boolean isLight() {
		return isLight;
	}

	public void setLight(boolean isLight) {
		this.isLight = isLight;
	}

	public String getType() {
		return type;
	}

	public double getLength() {
		return length;
	}

	public double getWidth() {
		return width;
	}

	public double getHeight() {
		return height;
	}

	public double getDistance() {
		return distance;
	}

	@Override
	public String accept(Size size) {
		return size.identifySize(this);
	}

	@Override
	public double accept(ShippingFee sFee) {
		return sFee.computeShippingFee(this);
	}

}
