package bucholc.arkadiusz.treeapp;

public class ConiferousTree extends Tree {
	private int numberOfNeedles;
	
	public ConiferousTree(String trunk, int numberOfBranches, int numberOfNeedles) {
		super(trunk, numberOfBranches, LeafType.NEEDLE);
		this.numberOfNeedles = numberOfNeedles;
	}
	
	@Override 
	public void grow() {
		System.out.println("As the coniferous tree grows, new needles appear on its branches.");
		numberOfNeedles += 100;
	}

	@Override
	public void showTreeDetails() {
		super.showTreeDetails();
		System.out.println("This tree has " + numberOfNeedles + " " + this.getLeafType() + " leaves");
	}
	
	public int getNumberOfNeedles() {
		return numberOfNeedles;
	}
	
}
