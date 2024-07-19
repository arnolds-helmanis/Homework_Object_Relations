package Object_relations;

import java.util.ArrayList;

public class Purchase {
	String clientName;
	ArrayList<PurchaseItem> itemList = new ArrayList<PurchaseItem>();
	
	Purchase (String clientName) {
		this.clientName = clientName;
	}
	
	void addItem (Product product, int count) {
		PurchaseItem purchase = new PurchaseItem(product, count);
		this.itemList.add(purchase);
		
	}
	
	void getSum() {
		double total = 0;
		int count = 0;
		for (PurchaseItem p : itemList) {
			double sum = p.count * p.product.pricePerItem;
			total += sum;
			count += p.count;
		}
		System.out.println(this.clientName + " bought " + count + " items with a total price of " + total + "€:");
		for (PurchaseItem item : itemList) {
			System.out.println(" - " + item.count + " " + item.product.name + " for " + (item.count * item.product.pricePerItem + "€"));
		}
	}
	
	void clearPurchaseList() {
		if (this.itemList.size() == 0) {
			System.out.println(this.clientName + ", your purchase list is already empty!");
			return;
		}
		this.itemList.clear();
		System.out.println(this.clientName + ", your purchase list is now empty!");
	}
	
	void removeLastItem() {
		if (this.itemList.size() == 0) {
			System.out.println(this.clientName + ", your purchase list is already empty!");
			return;
		}
		PurchaseItem removedItem = this.itemList.get(this.itemList.size()-1);
		this.itemList.remove(this.itemList.size()-1);
		System.out.println(this.clientName + ", the last item in your purchase list - " + removedItem + " - was removed.");
	}
	
	void removeMostExpensiveItem() {
		double maxTotal = 0;
		int index = 0;
		for (PurchaseItem p : itemList) {
			if ((p.count * p.product.pricePerItem) > maxTotal) {
				maxTotal = p.count * p.product.pricePerItem;
				index = itemList.indexOf(p);
			}
		}
		System.out.println(this.clientName + ", the most expensive product in your list(" + itemList.get(index).count + " " + itemList.get(index) + " with the total cost of " + maxTotal + "€) was removed.");
		itemList.remove(index);
	}

}
