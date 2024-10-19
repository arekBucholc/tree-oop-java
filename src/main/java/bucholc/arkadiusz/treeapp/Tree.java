package bucholc.arkadiusz.treeapp;

public abstract class Tree {
	protected String trunk;
	protected int numberOfBranches;
	protected LeafType leafType;
	
	public Tree(String trunk, int numberOfBranches, LeafType leafType) {
		this.trunk = trunk;
		this.numberOfBranches = numberOfBranches;
		this.leafType = leafType;
	}
	
	public abstract void grow();
	
	public void showTreeDetails() {
		System.out.println("Tree with " + trunk + " trunk and " + numberOfBranches + " branches and with "+ leafType + " leaves.");
	}
	
	public String getTrunk() {
		return trunk;
	}
	
	public int getNumberOfBranches() {
		return numberOfBranches;
	}

	public void setTrunk(String trunk) {
		this.trunk = trunk;
	}
	
	public void setNumberOfBranches(int numberOfBranches) {
		this.numberOfBranches = numberOfBranches;
	}
	
	public LeafType getLeafType() {
		return leafType;
	}
	
	public void setLeafType(LeafType leafType) {
		this.leafType = leafType;
	}
}
