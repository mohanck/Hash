package Hash;

import java.util.*;

public class HashTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		BST tree = new BST(10);
//		tree.add(5);
//		tree.add(15);
//		tree.add(25);
//		tree.add(0);
//		tree.inorder();
//		System.out.println(tree.search(0));		
		
		Hash h = new Hash();
		h.put(2, 10);
		h.put(2, 20);
		h.put(2, 30);
		h.put(2, 5);
		
		h.put(21, 10);
		h.put(22, 2);
		h.put(23, 30);
		h.put(24, 5);
				
		System.out.println("Value 20 exists in key 2 " + h.search(2, 20));
		System.out.println("Value 50 exists in key 2 " + h.search(2, 50));
		
		System.out.print("Elements present at key 2 : "); h.get(2);
		System.out.print("Elements present at key 5 : "); h.get(5);
				
		List<Integer> keys = h.getKeys();
		Iterator<Integer> keysIterator = keys.listIterator();
		System.out.print("Hash Keys are : ");
		while(keysIterator.hasNext()){
			System.out.print((Integer)keysIterator.next() + " ");
		}
		System.out.println();
		
		
		List<List<Integer>> values = h.getValues();
		Iterator<List<Integer>> valuesIterator = values.listIterator();
		System.out.println("Hash Values are : ");
		while(valuesIterator.hasNext()){
			System.out.println(((List<Integer>)valuesIterator.next()));
		}
		
		h.clear();
	}

}
