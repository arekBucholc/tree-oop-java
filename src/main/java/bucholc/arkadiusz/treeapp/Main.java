package bucholc.arkadiusz.treeapp;

public class Main {
	public static void main(String[] args) {
		
		DeciduousTree oak = new DeciduousTree("Thick", 10, 100);
		oak.showTreeDetails();
		oak.grow();
		oak.showTreeDetails();
		oak.shedLeaves();
		oak.showTreeDetails();
		System.out.println("------------------------------------------");
		
		ConiferousTree pine = new ConiferousTree("Slim", 10, 100);
		pine.showTreeDetails();
		pine.grow();
		pine.showTreeDetails();
		
	}
}
