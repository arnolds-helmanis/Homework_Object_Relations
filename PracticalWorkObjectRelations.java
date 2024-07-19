package Object_relations;

public class PracticalWorkObjectRelations {

	public static void main(String[] args) {
		Product prod1 = new Product("banana", 0.50, "food");
		Product prod2 = new Product("beer can", 1.99, "beverage");
		Product prod3 = new Product("bread loaf", 2.15, "food");
		Product prod4 = new Product("xBox", 499.50, "toys");
		Product prod5 = new Product("milk pack", 1.30, "beverage");
		Product prod6 = new Product("PlayStation", 450, "toys");
		Product prod7 = new Product("rice pack", 1.75, "food");
		Product prod8 = new Product("pepsi can", 1.23, "beverage");
		Product prod9 = new Product("Sega Genesis", 125.50, "toys");
		
		Purchase pur1 = new Purchase ("Jim");
		pur1.addItem(prod9, 2);
		pur1.addItem(prod5, 1);
		pur1.addItem(prod7, 3);
		Purchase pur2 = new Purchase("John");
		pur2.addItem(prod2, 5);
		pur2.addItem(prod3, 1);
		pur2.addItem(prod6, 1);
		Purchase pur3 = new Purchase("Kate");
		pur3.addItem(prod1, 10);
		pur3.addItem(prod4, 1);
		pur3.addItem(prod8, 1500);
		
		pur3.getSum();
		pur2.getSum();
		pur1.getSum();
		
		pur1.clearPurchaseList();
		pur1.clearPurchaseList();
		
		pur2.removeLastItem();
		
		pur3.removeMostExpensiveItem();
		
		
	}

}
