package Constructor;

class product{
	private String itemNo;
	private String name;
	private double price;
	private short qty;
	
	
	public product(String itemNo) {
			itemNo=itemNo;
	}
	public product(String itemNo,String name) {
		itemNo=itemNo;
		this.name=name;
	}
	public product(String itemNo,String name,double price,short qty) {
		itemNo=itemNo;
		this.name=name;
		setPrice(price);
		setQuantity(qty);
	}
	public void setPrice(double price) {
		this.price=price;
	}
	public void setQuantity(short qty) {
		this.qty=qty;
	}
	public String getItemNo() {
		return itemNo;
	}
	public String getName() {
		return name;
	}
	public double getPrice() {
		return price;
		}
	public short getQuantity() {
		return qty;
	}
	
}

class Customer{
	private String custId;
	private String name;
	private String address;
	private String phon;
	
	public Customer(String custId,String name) {
		this.custId=custId;
		this.name=name;
	}
	
	public Customer(String custId,String name,String address,String phon ) {
		this.custId=custId;
		this.name=name;
		setAddress(address);
		setAddress(phon);
	}
	
	public String getCustId() {
		return custId;
	}
	public String getName() {
		return name;
	}
	public String getAddress() {
		return address;
	}
	public String getPhon() {
		return phon;
	}
	public void  setAddress(String address) {
		this.address=address;
	}
	public void setPhon(String phon) {
		this.phon=phon;
	}
}


public class Product_Customer {

	public static void main(String[] args) {
		product p[]=new product[3];
		
	}

}
