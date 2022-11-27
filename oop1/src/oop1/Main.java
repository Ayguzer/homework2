package oop1;

public class Main {

	public static void main(String[] args) {
		Product product1 = new Product();
		// set
		product1.setName("Delonghi Coffee Machine");
		product1.setDiscount(9);
		product1.setImageUrl("image1.jpg");
		product1.setUnitPrice(7500);
		product1.setUnitsInStock(100);

		Product product2 = new Product();
		product2.setName("Smeg Coffee Machine");
		product2.setDiscount(8);
		product2.setImageUrl("image2.jpg");
		product2.setUnitPrice(5500);
		product2.setUnitsInStock(200);

		Product product3 = new Product();
		product3.setName("Kitchen Aid Coffee Machine");
		product3.setDiscount(7);
		product3.setImageUrl("image3.jpg");
		product3.setUnitPrice(9000);
		product3.setUnitsInStock(400);

		Product[] products = { product1, product2, product3 };
		System.out.println("<ul>");
		for (Product aliVeli : products) {
			System.out.println("<li>" + aliVeli.getName() + "</li>");
		}
		System.out.println("</ul>");

		IndividualCustomer individualCustomer = new IndividualCustomer();
		individualCustomer.setCustomerNumber("122");
		individualCustomer.setId(693);
		individualCustomer.setPhone("05551315544");
		individualCustomer.setFirstName("İsmail");
		individualCustomer.setLastName("Aygüzer");
		
		CorporateCustomer corporateCustomer=new CorporateCustomer();
		corporateCustomer.setTaxNumber("111111111");
		corporateCustomer.setCompanyName("AyguzerSoftware");
		
		

	}

}
