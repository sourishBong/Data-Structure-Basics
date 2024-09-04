package binary.search.tree;

public class MainRecursive {

    public static void main(String args[]) {

        BinarySearchTreeRecursive bsT = new BinarySearchTreeRecursive();
        bsT.add(6);
        bsT.add(4);
        bsT.add(9);
        bsT.add(5);
        bsT.add(2);
        bsT.add(8);
        bsT.add(12);
        bsT.add(10);
        bsT.add(14);
        bsT.printTree(bsT.getRoot());

        Node temp = bsT.search(5);
        if (temp != null) {
            System.out.println("\n" + temp.getData() + " found in Tree !");
        }
        else
            System.out.println("\n Not found in Tree !");

        temp = bsT.search(10);
        if (temp != null) {
            System.out.println("\n" + temp.getData() + " found in Tree !");
        }
        else
            System.out.println("\n Not found in Tree !");
    }

}
