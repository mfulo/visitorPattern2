package labAss4;

public class Warehouse {

	public static void main(String[] args) {
		Furniture chair = new FurnitureImp("stool",15,15,20,25);
		Furniture sofa = new FurnitureImp("sofa",70,35,30,25);
		Furniture table = new FurnitureImp("table",35,20,20,25);
	    
	    Size size = new SizeImp();
	    ShippingFee sFee = new ShippingFeeImp();
	
	    System.out.println(chair.accept(size)+"\nShipping fee: ₱"+chair.accept(sFee));
	    System.out.println();
	    System.out.println(sofa.accept(size)+"\nShipping fee: ₱"+sofa.accept(sFee));
	    System.out.println();
	    System.out.println(table.accept(size)+"\nShipping fee: ₱"+table.accept(sFee));

	}

}
