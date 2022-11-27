package classesWithAttributes;

public class Main {

	public static void main(String[] args) {

		Product product = new Product(1, "Laptop", "Monster Abra A5 v15.8.3 Laptop", 22450, 200, "Dark");

		Product product1 = new Product();
		product1.name = "Laptop";
		product1.description = " Monster Abra A5 v15.8.3 Laptop";
		product1.setId(1);
		product1.price = 22450;
		product1.stockAmount = 200;

		ProductManager productManager = new ProductManager();
		productManager.Add(product1);
		System.out.println(product1.getCode());

	}

}
