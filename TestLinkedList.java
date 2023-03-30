/**
 * This class tests the GenericLinkedList class
 * 
 * @author rkelley/njohnson, Kirin Sharma
 * Module 3 Programming Project
 * CS131 Spring 2023
 */

public class TestLinkedList {

	public static void main(String[] args) {
		
		// Testing GenericLinkedList with String Objects
		GenericLinkedList<String> myList = new GenericLinkedList<String>();
		
		GenericNode<String> aNode=new GenericNode<String>();
		aNode.setData("Element 1");
		myList.addNode(aNode);
		aNode = new GenericNode<String>();
		aNode.setData("Element 2");
		myList.addNode(aNode);
		
		GenericNode<String> tempnode = myList.getList();
		do 
		{
			System.out.println(tempnode.getData());
			tempnode = tempnode.getNextNode();
		} while (tempnode!=null);

		System.out.println();
		
		
		// Testing GenericLinkedList with Integer Objects
		GenericLinkedList<Integer> myList2 = new GenericLinkedList<Integer>();
		
		GenericNode<Integer> aNode2 = new GenericNode<Integer>();
		aNode2.setData(55);
		myList2.addNode(aNode2);
		aNode2 = new GenericNode<Integer>();
		aNode2.setData(70);
		myList2.addNode(aNode2);
		
		GenericNode<Integer> tempnode2 = myList2.getList();
		do 
		{
			System.out.println(tempnode2.getData());
			tempnode2 = tempnode2.getNextNode();
		} while (tempnode2!=null);
		
		System.out.println();
		
		
		// Testing GenericLInkedList with Double Objects
		GenericLinkedList<Double> myList3 = new GenericLinkedList<Double>();
		
		GenericNode<Double> aNode3 = new GenericNode<Double>();
		aNode3.setData(3.1415);
		myList3.addNode(aNode3);
		aNode3 = new GenericNode<Double>();
		aNode3.setData(55.7849);
		myList3.addNode(aNode3);
		
		GenericNode<Double> tempnode3 = myList3.getList();
		do 
		{
			System.out.println(tempnode3.getData());
			tempnode3 = tempnode3.getNextNode();
		} while (tempnode3!=null);
		
	}//end main

}//end class
