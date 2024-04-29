package labAss4;

public class SizeImp implements Size{

	@Override
	public String identifySize(FurnitureImp fImp) {
		String size;
		double volume = fImp.getLength() * fImp.getWidth() * fImp.getHeight();
		double lightVolume = 10000;
		if (volume < lightVolume) {
			size="light";
			fImp.setLight(true);
		}
		else {
			size="bulky";
			fImp.setLight(false);
		}
		return "Furniture type: "+fImp.getType()
			  +"\nFurniture volume: "+volume +" cubic inches"
			  + "\nFurniture size: "+size;
	}
	
	

}
