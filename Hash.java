package Hash;

import java.util.*;

public class Hash {
	
	int capacity;
	BST[] ht;
	
	public Hash(int capacity){
		ht = new BST[capacity];
		this.capacity = capacity;
	}

	public Hash(){
		this.capacity = 10;
		ht = new BST[this.capacity];
	}
	
	public void put(int key,int value){
		int index = key%capacity;
		if(ht[index] == null){
			ht[index] = new BST(value);
		}
		else{
			ht[index].add(value);
		}
	}
	
	public boolean search(int key,int value){
		int index = key%capacity;
		if(ht[index] == null){
			return false;
		}
		return ht[index].search(value);
	}
	
	public void get(int key){
		int index = key%capacity;
		if(ht[index] == null)
			System.out.println("Key "+ key +" does not exist");
		else
			ht[index].inorder();
	}
	
	public List<Integer> getKeys(){
		List<Integer> keys = new ArrayList<Integer>();
		for(int i=0;i<capacity;i++){
			if(ht[i]!=null){
				keys.add(i);
			}
		}
		return keys;
	}
	
	public void clear(){
		System.out.print("Hash indexes : ");
		for(int i=0;i<capacity;i++){
			if(ht[i]!=null){
				System.out.print(i + " ");
				ht[i].clear();
				ht[i] = null;
			}
		}
		System.out.println("have been cleared");
	}
	
	public List<List<Integer>> getValues(){
		List<List<Integer>> values = new ArrayList<List<Integer>>();
		for(BST b:ht){
			if(b!=null){
				values.add(b.getElements());
			}
		}
		return values;
	}
}
