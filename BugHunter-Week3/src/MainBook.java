class Books{
	String Title;
	String Author;
	int Price;
	
	//default Constructor
	Books(){
		Title = "Unknown";
		Author = "Unknown";
		Price = 0;
	}
	
	
	//Parameterized Constructor
	Books(String Title, String Author , int Price){
		this.Title =  Title;
		this.Author = Author;
		this.Price = Price;
	}
	
	//Method to Dispaly
	
	void displayBookDetails() {
		System.out.println("Title: " + Title);
		System.out.println("Author: " + Author);
		System.out.println("Price: " + Price);
		System.out.println("---------------------------------------------------------");
	}
}
public class MainBook {
	public static void main(String[] args) {
		Books b1 = new Books("HarryPoter" , "J.K.Rowlling", 1500);
		Books b2 = new Books ("Peace of Happiness", "JohnHarry", 900);
		Books b3 = new Books ("The Fire of Wings", "Dr.A.P.J.Abdulkalam" , 1700);
		
		//Display
		b1.displayBookDetails();
		b2.displayBookDetails();
		b3.displayBookDetails();
		
	}

}
