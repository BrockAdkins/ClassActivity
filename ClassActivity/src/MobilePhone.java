
public class MobilePhone {
	private String manufacturer;
	private String model;
	private String price;
	private String carrier;
	public MobilePhone(String manufacturer, String model, String price, String carrier) {
		super();
		this.manufacturer = manufacturer;
		this.model = model;
		this.price = price;
		this.carrier = carrier;
	}
	
	public String call(String phoneNumber) {
		return "I am calling " + phoneNumber;
	}
	
	public String text(String message) {
		return message;
	}

	@Override
	public String toString() {
		return "MobilePhone [manufacturer=" + manufacturer + ", model=" + model + ", price=" + price + ", carrier="
				+ carrier + "]";
	}
	
	

}
