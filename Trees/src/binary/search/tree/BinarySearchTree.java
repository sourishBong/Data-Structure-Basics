package binary.search.tree;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BinarySearchTree {

    private Node root;

    public Node getRoot() {
        return root;
    }

    public void setRoot(Node root) {
        this.root = root;
    }

    public boolean isEmpty(){
        //if root is null then it means Tree is empty
        return root==null;
    }

    //Iterative Function to insert a value in BST
    public boolean add(int value){

        if(isEmpty()){
            root=new Node(value);
            return true;
        }

        //starting from root
        Node currentNode=root;

        //Traversing the tree untill valid position to insert the value
        while(currentNode!=null){
            Node leftChild=currentNode.getLeftChild();
            Node rightChild=currentNode.getRightChild();

            //If the value to insert is less than root value then move to left subtree
            //else move to right subtree of root
            //and before moving check if the subtree is null, if it's then insert the value.
            if(currentNode.getData()>value){
                if(leftChild==null){
                    leftChild=new Node(value);
                    currentNode.setLeftChild(leftChild);
                    return true;
                }
                currentNode = leftChild;
            }else{
                if (rightChild == null) {
                    rightChild = new Node(value);
                    currentNode.setRightChild(rightChild);
                    return true;
                }
                currentNode = rightChild;
            }
        }
        return false;
    }

    //Just for Testing purpose
    public void printTree(Node current)
    {
        if (current == null) return;

        System.out.print(current.getData() + ",");
        printTree(current.getLeftChild());
        printTree(current.getRightChild());

    }

    public Node search(int value) {

        if(isEmpty())
            return null;

        Node currentNode=this.root;

        while(currentNode!=null){
            Node leftChild=currentNode.getLeftChild();
            Node rightChild=currentNode.getRightChild();
            if(currentNode.getData()==value){
                return currentNode;
            }else if(currentNode.getData()>value){
                currentNode=leftChild;
            }else{
                currentNode=rightChild;
            }
        }
        return null;
    }

    public boolean delete(int value, Node currentNode) {

        if (root == null) {
            return false;
        }

        Node parent = null; //To Store parent of currentNode

        while(currentNode!=null && (currentNode.getData()!=value)){
            parent=currentNode;
            if(currentNode.getData()>value)
                currentNode=currentNode.getLeftChild();
            else
                currentNode=currentNode.getRightChild();
     }
        if(currentNode==null) {
            return false;
        }else if(currentNode.getLeftChild()==null && currentNode.getRightChild()==null){
            //if node is leaf node
            //if leaf node is root
            if(root.getData()==currentNode.getData()){
                setRoot(null);
                return true;
            }else if(currentNode.getData()< parent.getData()){
                parent.setLeftChild(null);
                return true;
            }else{
                parent.setRightChild(null);
                return true;
            }
        }else if(currentNode.getRightChild()==null){
            if(root.getData()==currentNode.getData()){
                setRoot(currentNode.getLeftChild());
                return true;
            }else if(currentNode.getData()< parent.getData()){
                parent.setLeftChild(currentNode.getLeftChild());
                return true;
            }else{
                parent.setRightChild(currentNode.getLeftChild());
                return true;
            }
        }else if(currentNode.getLeftChild()==null){
            if(root.getData()==currentNode.getData()){
                setRoot(currentNode.getRightChild());
                return true;
            }else if(currentNode.getData()<parent.getData()){
                parent.setLeftChild(currentNode.getRightChild());
            }else{
                parent.setRightChild(currentNode.getRightChild());
            }
        }
        else{
            //Find Least Value Node in right-subtree of current Node
            Node leastNode = findLeastNode(currentNode.getRightChild());
            //Set CurrentNode's Data to the least value in its right-subtree
            int temp = leastNode.getData();
            delete(temp, root);
            currentNode.setData(temp);
            //Delete the leafNode which had the least value
            return true;
        }
        return false;
    }

    //Helper function to find least value node in right-subtree of currentNode
    private Node findLeastNode(Node currentNode) {

        Node temp = currentNode;

        while (temp.getLeftChild() != null) {
            temp = temp.getLeftChild();
        }
        return temp;
    }

    public int findMin(Node root) {

        int min=Integer.MAX_VALUE;
        return recursiveMin(min,root);
    }

    private static int recursiveMin(int min, Node currentNode) {
        if(currentNode==null)
            return min;

        if(min>currentNode.getData()) {
            min = currentNode.getData();
        }
        min=recursiveMin(min,currentNode.getLeftChild());
        min=recursiveMin(min,currentNode.getRightChild());
        return min;
    }
    static int  counter;
    public static int findKthMax(Node root, int k) {

       counter=0;
       Node node=findRecursiveKthMax(root,k);
       if(node!=null){
           return node.getData();
       }else
           return-1;
    }

    private static Node findRecursiveKthMax(Node root, int k) {

        if(root==null)
            return null;

        Node node=findRecursiveKthMax(root.getRightChild(),k);

        if(counter!=k){
            counter++;
            node=root;
        }

        if(counter==k)
            return node;
        else{
            return findRecursiveKthMax(root.getLeftChild(),k);
        }

    }

    public static List<Integer> findAncestors(Node root, int k) {
        List<Integer> result = new ArrayList<>();
        Node currentNode = root;

        while (currentNode != null) {

            if (currentNode.getData() == k)
                break;
            else if (currentNode.getData() > k) {
                result.add(currentNode.getData());
                currentNode = currentNode.getLeftChild();
            } else {
                result.add(currentNode.getData());
                currentNode = currentNode.getRightChild();
            }
        }
        Collections.sort(result,Collections.reverseOrder());
        return result;
    }

    public static List<Integer> findAncestorsRecursive(Node root, int k) {
        List<Integer> result = new ArrayList<>();
        recursiveList(result,root,k);
        return result;
    }

    private static void recursiveList(List<Integer> result, Node root, int k) {
        if(root.getData()==k || root==null)
            return;

        if(root.getData()>k) {
            recursiveList(result, root.getLeftChild(), k);
            result.add(root.getData());
        }
        else {
            recursiveList(result, root.getRightChild(), k);
            result.add(root.getData());
        }
    }

    public static int findHeight(Node root) {

        if(root==null)
            return 0;

        int maxheight=Math.max(findHeight(root.getLeftChild()),findHeight(root.getRightChild()));
        return maxheight+1;
    }
}
