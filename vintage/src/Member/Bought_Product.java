package Member;

public class Bought_Product {

	private String id;				// 구매자 id
	private String product;			// 구매상품
	private int count;				// 구매 개수
	private int price;				// 총가격
	private String name;			// 수령자 이름
	private String CallNumber;		// 수령자 전화번호
	private String address;			// 수령 주소
	private String how;				// 결제방법
	
	public Bought_Product(String id, String product, int count, int price, String name, String callNumber,
			String address, String how) {
		super();
		this.id = id;
		this.product = product;
		this.count = count;
		this.price = price;
		this.name = name;
		CallNumber = callNumber;
		this.address = address;
		this.how = how;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getProduct() {
		return product;
	}

	public void setProduct(String product) {
		this.product = product;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCallNumber() {
		return CallNumber;
	}

	public void setCallNumber(String callNumber) {
		CallNumber = callNumber;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	
	public String getHow() {
		return how;
	}

	public void setHow(String How) {
		this.how = How;
	}
	
	
	
}
