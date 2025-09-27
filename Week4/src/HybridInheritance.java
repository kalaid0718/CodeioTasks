class Human{
	void printHu() {
		System.out.println("I am a Human");
	}
}
class Student extends Human{
	void printSt() {
		System.out.println("I am a Student");
	}
}
class BoysRep extends Student{
	void printBR() {
		System.out.println("I am the  Boy's Rep");
	}
}
class GirlsRep extends Student{
	void printGR() {
		System.out.println("I am the Girl's Rep");
	}
}

public class HybridInheritance {
	public static void main(String[] args) {
		BoysRep br = new BoysRep();
		br.printHu();
		br.printSt();
		br.printBR();
		System.out.println();
		
		GirlsRep gr = new GirlsRep();
		gr.printHu();
		gr.printSt();
		gr.printGR();
		

	}

}
