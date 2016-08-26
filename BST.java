package Hash;

import java.util.*;

public class BST{
	Node root;
	
	public BST(int val){
		root = new Node(val);
	}
	
	public void add(int val){
		root = add(val,root);
	}
	
	public Node add(int val, Node root){
		if(root==null)
			root = new Node(val);
		else if(root.data >= val)
			root.left = add(val,root.left);
		else 
			root.right = add(val,root.right);
		
		return root; 
	}
	
	public boolean search(int val, Node root){
		if(root==null)
			return false;
		else if(root.data==val)
			return true;
		else if(root.data>val)
			return search(val,root.left);
		else
			return search(val,root.right);
	}
	
	public boolean search(int val){
		return search(val,root);
	}
	
	public void inorder(Node root){
		if(root==null)
			return;
		inorder(root.left);
		System.out.print(root.data + " -- ");
		inorder(root.right);
	}
	public void inorder(){
		inorder(root);
		System.out.println();
	}
	
	public void clear(){
		clear(root);
	}
	
	public void clear(Node root){
		if(root == null){
			return ;
		}
		clear(root.left);
		clear(root.right);
		root=null;
	}
	
	public List<Integer> getElements(){
		List<Integer> values = new ArrayList<Integer>();
		Stack<Node> s = new Stack<Node>();
		values = preorder(s);
		return values;
	}
	
	public List<Integer> preorder(Stack<Node> s){
		List<Integer> values = new ArrayList<Integer>();
		while(true)
		{
			while(root != null){
				s.push(root);
				values.add(root.data);
				root=root.left;
			}
			if(!s.isEmpty()){
				root=s.pop();
				root=root.right;
			}
			else //if(s.isEmpty()) ****
				return values;
		}
	}

public class Node{
	Node left,right;
	int data;
	
	public Node(){
		data = 0;
	}
	
	public Node(int d){
		data = d;
	}
}
}