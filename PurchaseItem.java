package Object_relations;

public class PurchaseItem {
	Product product;
	int count;
	
	PurchaseItem (Product product, int count) {
		this.product = product;
		this.count = count;
		if (this.count > 1 && !this.product.name.endsWith("s")) {
			this.product.name += "s";
		}
	}
	
	public String toString() {
		return this.product.name;
	}

}
