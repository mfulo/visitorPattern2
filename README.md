# <p align=center>Visitor Design Pattern</p>
## Problem
You are a software developer working on an e-commerce platform that sells various types of furniture (chairs, tables, sofas, etc.). You want to implement a functionality that calculates the shipping cost based on the furniture type and size. Each furniture type might have its unique shipping cost calculation logic. For example, chairs might be lightweight and have a flat shipping rate, while sofas might be bulky and require a distance-based shipping cost calculation. Implementing separate shipping logic within each furniture class would lead to tight coupling and difficulty in adding new furniture types in the future. With that, implement a visitor design pattern approach.

## UML Diagram

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

