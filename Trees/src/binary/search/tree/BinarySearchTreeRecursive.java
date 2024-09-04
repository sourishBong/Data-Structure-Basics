package binary.search.tree;

public class BinarySearchTreeRecursive {

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

    //Function to call recursive insert
    public boolean add(int value) {

        root = recursive_insert(this.root, value);
        return true;
    }

    //Recursive Function to insert a value in BST
    public Node recursive_insert(Node currentNode,int value){

        //Base Case
        if (currentNode == null) {
            return new Node(value);
        }

        if(value<currentNode.getData()){
            currentNode.setLeftChild(recursive_insert(currentNode.getLeftChild(),value));
        }else if(value>currentNode.getData()){
            currentNode.setRightChild(recursive_insert(currentNode.getRightChild(),value));
        }else{
            return currentNode;
        }
            return currentNode;
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
        return recursive_search(this.root,value);
    }

    private Node recursive_search(Node currentNode, int value) {

        if(currentNode==null)
            return null;

        if(currentNode.getData()==value)
            return currentNode;
        else if(currentNode.getData()>value)
         return recursive_search(currentNode.getLeftChild(),value);
        else
         return recursive_search(currentNode.getRightChild(),value);

    }
}
