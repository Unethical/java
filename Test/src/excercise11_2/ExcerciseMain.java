package excercise11_2;

public class ExcerciseMain {
	public static void main(String []args){
		BST bst = new BST(new Character[] 
				{'j','p','d','f','s','b','n','k','e','w','c','r','g'});
		bst.inorder();
		System.out.println();
		bst.preorder();
		System.out.println();
		bst.postorder();
	}
	

}
