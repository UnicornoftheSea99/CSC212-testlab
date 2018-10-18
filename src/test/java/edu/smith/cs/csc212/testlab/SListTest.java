package edu.smith.cs.csc212.testlab;

import org.junit.Test;
import org.junit.Assert;

/**
 * This is a class that contains a whole bunch of JUnit tests.
 * @author jfoley
 *
 */
public class SListTest {

	@Test
	public void testLength() {
		SList<String> data = new SList<>();
		data.addToFront("list");
		data.addToFront("the");
		data.addToFront("test");
		Assert.assertEquals(3, data.size());
	}
	
	@Test
	public void testEmptyLength() {
		SList<String> data = new SList<>();
		Assert.assertEquals(0, data.size());
	}
	
	@Test
	public void testGet() {
		SList<String> data = new SList<>();
		data.addToFront("list");
		data.addToFront("the");
		data.addToFront("test");
		Assert.assertEquals("test", data.get(0));
		Assert.assertEquals("the", data.get(1));
		Assert.assertEquals("list", data.get(2));
	}
	
	@Test
	public void testGetCrashes() {
		SList<String> data = new SList<>();
		data.addToFront("list");
		data.addToFront("the");
		data.addToFront("test");
		try {
			Assert.assertEquals("test", data.get(3));
			Assert.fail("Should crash before this message!");
		} catch (Exception e) {
			// some kind of error runs.
		}
	}
	
	@Test
	public void testJoin() {
		SList<String> data = new SList<>();
		data.add("test");
		data.add("the");
		data.add("list");
		Assert.assertEquals("test the string", data.join());
	}
	
	@Test
	public void testRemoveFront() {
		SList<String> data = new SList<>();
		data.add("test");
		data.add("the");
		data.add("list");
		data.removeFront();
		Assert.assertEquals("the list", data.join());
	}
	
	@Test
	public void testRemoveEmpty() {
		SList<String> data = new SList<>();
		// We shouldn't do anything if you remove from an empty list...
		data.removeFront();
	}
	
	@Test
	public void testRemoveBackEmpty() {
		SList<String> data = new SList<>();
		// We shouldn't do anything if you remove from an empty list...
		data.removeBack();
	}
	
	@Test
	public void testAddBackEmpty() {
		SList<String> data = new SList<>();
		data.add("the");
		Assert.assertEquals("the", data.removeBack());
		
		data.add("the");
		data.add("list");
		Assert.assertEquals("list", data.removeBack());
		Assert.assertEquals("the", data.removeBack());
		
		data.add("test");
		data.add("the");
		data.add("list");
		Assert.assertEquals("list", data.removeBack());
		Assert.assertEquals("the", data.removeBack());
		Assert.assertEquals("test", data.removeBack());
	}
}
