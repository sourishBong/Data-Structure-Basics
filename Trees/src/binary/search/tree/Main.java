package binary.search.tree;

public class Main {
    public static void main(String[] args) {
        BinarySearchTree bsT = new BinarySearchTree();

//        bsT.add(6);
//        bsT.add(4);
//        bsT.add(9);
//        bsT.add(5);
//        bsT.add(2);
//        bsT.add(8);
//        bsT.add(12);
//        bsT.add(10);
//        bsT.add(14);

        bsT.add(6);
        bsT.add(5);
        bsT.add(8);
        bsT.add(12);
        bsT.add(18);
        bsT.add(15);

        //bsT.printTree(bsT.getRoot());

        int ans=bsT.findMin(bsT.getRoot());
        System.out.println(ans);


//        System.out.print("\nDeleting Node 6: ");
//        bsT.delete(6, bsT.getRoot());
//        bsT.printTree(bsT.getRoot());
//
//        System.out.print("\nDeleting Node 15: ");
//        bsT.delete(15, bsT.getRoot());
//        bsT.printTree(bsT.getRoot());
//
//        System.out.print("\nDeleting Node 1: ");
//        bsT.delete(1, bsT.getRoot());
//        bsT.printTree(bsT.getRoot());

//        Node temp = bsT.search(5);
//        if (temp != null) {
//            System.out.println("\n" + temp.getData() + " found in Tree !");
//        }else{
//            System.out.println("not found in Tree !");
//        }
//        temp = bsT.search(51);
//        if (temp != null) {
//            System.out.println("\n" + temp.getData() + " found in Tree !");
//        }else{
//            System.out.println("not found in Tree !");
//        }
    }
}
