package Member;

public class Bought_Product {

	private String id;				// ������ id
	private String product;			// ���Ż�ǰ
	private int count;				// ���� ����
	private int price;				// �Ѱ���
	private String name;			// ������ �̸�
	private String CallNumber;		// ������ ��ȭ��ȣ
	private String address;			// ���� �ּ�
	private String how;				// �������
	
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
