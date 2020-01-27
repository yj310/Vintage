package Vintage;

public class Product {

	private int id;
	private String title;
	private int price;
	private String catagory;
	private int stock;
	
	/* 생성자 메서드 */
	public Product(int id, String title, int price, String catagory, int stock) {
		super();
		this.id = id;
		this.title = title;
		this.price = price;
		this.catagory = catagory;
		this.stock = stock;
	}

	/* getter, setter */
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
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

	public String getCatagory() {
		return catagory;
	}

	public void setCatagory(String catagory) {
		this.catagory = catagory;
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}
	
	
	
}
