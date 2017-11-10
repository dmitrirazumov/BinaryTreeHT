public class Main {

    public static void main(String args[]) {

        BinaryTree binaryTree = new BinaryTree();

        binaryTree.add(8);
        binaryTree.add(4);
        binaryTree.add(12);
        binaryTree.add(2);
        binaryTree.add(6);
        binaryTree.add(14);

        binaryTree.remove(12);

        System.out.println(binaryTree.first() + ", " + binaryTree.last());
        System.out.println();

        System.out.println(binaryTree.contains(12));


    }
}
