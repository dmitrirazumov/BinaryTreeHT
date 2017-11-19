public class Main {

    public static void main(String args[]) {

        BinaryTree binaryTree = new BinaryTree();

        binaryTree.add(84);
        binaryTree.add(50);
        binaryTree.add(41);
        binaryTree.add(83);
        binaryTree.add(20);
        binaryTree.add(0);
        binaryTree.add(86);
        binaryTree.add(97);
        binaryTree.add(33);
        binaryTree.add(59);
        binaryTree.add(23);
        binaryTree.add(1);
        binaryTree.add(48);
        binaryTree.add(89);
        binaryTree.add(21);
        binaryTree.add(91);
        binaryTree.add(88);
        binaryTree.add(42);
        binaryTree.add(70);
        binaryTree.add(47);


        binaryTree.remove(33);

        System.out.println(binaryTree.first() + ", " + binaryTree.last());
        System.out.println();

        System.out.println(binaryTree.contains(33));


    }
}
