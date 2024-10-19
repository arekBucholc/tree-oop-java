package bucholc.arkadiusz.treeapp;

public class DeciduousTree extends Tree {
	private int numberOfLeaves;
	
	public DeciduousTree(String trunk, int numberOfBranches, int numberOfLeaves) {
		super(trunk, numberOfBranches, LeafType.BROADLEAF);
		this.numberOfLeaves = numberOfLeaves;
	}
	
	@Override 
	public void grow() {
		System.out.println("As the deciduous tree grows, new leaves appear on its branches.");
		numberOfLeaves += 100;
	}

	@Override 
	public void showTreeDetails() {
		super.showTreeDetails();
		System.out.println("This tree has " + numberOfLeaves + " " + this.getLeafType() + " leaves");
	}

	public void shedLeaves() {
		setNumberOfLeaves(0);
		System.out.println("Winter is coming, time to shed leaves.");
	}
	
	public int getNumberOfLeaves() {
		return numberOfLeaves;
	}
	
	public void setNumberOfLeaves(int numberOfLeaves) {
		this.numberOfLeaves = numberOfLeaves;
	}
}
