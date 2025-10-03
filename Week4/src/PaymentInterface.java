interface Payment{
	void pay(double amount);
	void refund(double amount);
}
class CreditCard implements Payment{
	private String cardNumber;
	
	public CreditCard(String cardNumber) {
		this.cardNumber = cardNumber;
	}
	@Override
	public void pay(double amount) {
		System.out.println("Paid Rs." + amount + " using Credit Card: " + cardNumber);
	}
	@Override
	public void refund(double amount) {
		System.out.println("Refundeed Rs." + amount + " to Credit Card: " + cardNumber);
	}
}
class UPIPayment implements Payment{
	private String upiId;
	
	public UPIPayment(String upiId) {
		this.upiId = upiId;
	}
	@Override
	public void pay(double amount) {
		System.out.println("Paid Rs." + amount + " using UPI ID: " + upiId);
	}
	@Override
	public void refund(double amount) {
		System.out.println("Refundeed Rs." + amount + " to UPI ID: " + upiId);
	}
	
}
public class PaymentInterface {
	public static void main(String[] args) {
		Payment p1 = new CreditCard ("9807-1243-7658-4765");
		p1.pay(1200);
		p1.refund(200);
		System.out.println("____________________________________");
		Payment p2 = new UPIPayment("code@upi");
		p2.pay(500);
		p2.refund(200);
	}
	

}
