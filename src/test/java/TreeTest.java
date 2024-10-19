import static org.junit.jupiter.api.Assertions.*;
import bucholc.arkadiusz.treeapp.ConiferousTree;
import bucholc.arkadiusz.treeapp.DeciduousTree;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TreeTest {
	DeciduousTree deciduousTree;
	ConiferousTree coniferousTree;

	@BeforeEach
	void setUp() {
		deciduousTree = new DeciduousTree("Thick", 10, 500);
		coniferousTree = new ConiferousTree("Slim", 20, 1500);
	}
	
	@Test
	void testDeciduousTreeGrowth() {
		deciduousTree.grow();
		assertEquals(600, deciduousTree.getNumberOfLeaves());
	}
	
	@Test
	void testConiferousTreeShedLeaves() {
		deciduousTree.shedLeaves();
		assertEquals(0, deciduousTree.getNumberOfLeaves());
	}
	
	@Test
	void testConiferousTreeGrowth() {
		coniferousTree.grow();
		assertEquals(1600, coniferousTree.getNumberOfNeedles());
	}
	
}
