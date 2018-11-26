import java.util.*;
class TestBinary {
    public static void main(String [] args) {
        int data = 0;
        BinarySearch tree = new BinarySearch();
        tree.insert(50);
        tree.insert(30); 
        tree.insert(20); 
        tree.insert(40); 
        tree.insert(70); 
        tree.insert(60); 
        tree.insert(80); 
        
        System.out.println("Inorder traversal of the given tree: ");
        tree.inorder();
        System.out.println("Delete number: 20");
        tree.delete(20); 
        tree.inorder();
        System.out.println("Delete number: 60");
        tree.delete(60); 
        tree.inorder();  
        System.out.println("Delete number: 80");
        tree.delete(80); 
        tree.inorder(); 
    }
}