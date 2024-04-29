# <p align=center>Visitor Design Pattern</p>
## Problem
You are a software developer working on an e-commerce platform that sells various types of furniture (chairs, tables, sofas, etc.). You want to implement a functionality that calculates the shipping cost based on the furniture type and size. Each furniture type might have its unique shipping cost calculation logic. For example, chairs might be lightweight and have a flat shipping rate, while sofas might be bulky and require a distance-based shipping cost calculation. Implementing separate shipping logic within each furniture class would lead to tight coupling and difficulty in adding new furniture types in the future. With that, implement a visitor design pattern approach.

## Note
I've considered the furniture to be "light" if their package volume is less than 10,000 cubic inches. Regardless of their shipping distance, their shipping fee will be equal to the base rate of ₱50. 

Meanwhile, I've considered the furniture to be "bulky" if their package volume is equal or greater than 10,000 cubic inches. This time, their shipping fee will be the sum of the base rate and the product of the shipping distance in kilometers and the rate per kilometer (shipping fee = base rate + (distance * rate per km)).

I've just made all these values up. Feel free to adjust them to your liking.

## UML Diagram
![visitor2](https://github.com/mfulo/visitorPattern2/assets/142382665/da306461-354c-4058-912e-672c7bba56df)

## Test code
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

## Sample Output
![image](https://github.com/mfulo/visitorPattern2/assets/142382665/096c7f71-e7f9-4d67-9114-ad318f29cafb)

