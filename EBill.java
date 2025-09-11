
public class EBill {
	public static void main(String[] args) {
		int bill,discount,finalamount;
		bill=400;
		discount=0;
		finalamount=bill-discount;
		
		if(bill>1000) {
			discount=(bill*10)/100;
		}
		else if(bill>=500 && bill<=1000) {
			discount=(bill*5)/100;
		}
		else {
			discount=0;
			System.out.println("Pay the full bill:"+bill);
		}
		finalamount=bill-discount;
		System.out.println("Your bill is:₹"+bill);
		System.out.println("Discount:₹"+discount);
		System.out.println("Final Payment:₹"+finalamount);
		
		
		
	}

}
