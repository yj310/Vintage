package Manager;

public class Product {

	private String title;
	private int price;
	private String category;
	private int stock = 0;
	private int id;
	
	
	/* 생성자 메서드 */
	public Product(int id, String title, int price, String category) {
		super();
		this.title = title;
		this.price = price;
		this.category = category;
		this.id = id;
	}

	/* getter, setter */
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}
	
	public int getId() {
		return id;
	}
	
	public void getId(int id) {
		this.id = id;
	}
	
	
	
}
