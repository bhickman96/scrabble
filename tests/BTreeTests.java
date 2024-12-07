package tests;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;

import interfaces.ITree;
import models.BTree;

public class BTreeTests {
	@Test
	public void InitialisedBTreeWithNoElements_AddValueToBTree_FindValueReturnsTrue() {
		ITree<String> bTree = new BTree<String>(2);
		bTree.Add("Bob");
		assertTrue(bTree.Find("Bob"));
	}
}
