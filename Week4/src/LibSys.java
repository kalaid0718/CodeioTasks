class Book{
	String title;
	String author;
	int price;
	
	public Book(String title, String author, int price){
		this.title = title;
		this.author = author;
		this.price = price;
	}
	void printDetails() {
		System.out.println("Title: " + title + ",\nAuthor: " + author +"\nPrice:" + price );
	}
	

}

class TextBook extends Book{
	String sub;
	int edition;
	public TextBook(String title, String author, int price,String sub,int edition) {
		super(title, author, price);
		this.sub = sub;	
		this.edition = edition;
	}
	@Override
	void printDetails() {
		super.printDetails();
		System.out.println("Subject: " + sub + "\nEdition:" + edition);
		System.out.println("--------------------------------------------------------------");
	}
}
class Magazine extends Book{
	String issueDate;
	
	public Magazine(String title, String author, int price,String issueDate) {
		super(title, author, price);
		this.issueDate = issueDate;	
	}
	@Override
	void printDetails() {
		super.printDetails();
		System.out.println("Issued Date:" + issueDate);
	}
	
}
public class LibSys {
	public static void main (String[] args) {
		TextBook b = new TextBook("Fire Of Wings" , "Dr.A.P.J.Abdul kalam" , 400 , "Science Fiction" , 1); 
		Magazine m = new Magazine("Tech World" , "Sahil" , 300 , "15th sep 2025");
		System.out.println("TextBook Details:");
		b.printDetails();
		System.out.println("Magazine Details:");
		m.printDetails();
	}

}
