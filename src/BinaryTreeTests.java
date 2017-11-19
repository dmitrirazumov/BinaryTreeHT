import org.junit.Test;

import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertFalse;

public class BinaryTreeTests {

    @Test
    public void test() {
        BinaryTree tree1 = new BinaryTree();
        BinaryTree tree2 = new BinaryTree();
        BinaryTree tree3 = new BinaryTree();
        BinaryTree tree4 = new BinaryTree();
        BinaryTree tree5 = new BinaryTree();
        BinaryTree tree6 = new BinaryTree();

        tree1.add(8);

        tree1.remove(8);
        assertEquals(0, tree1.size());
        assertFalse(tree1.contains(8));

        tree2.add(8);
        tree2.add(3);
        tree2.add(12);
        tree2.add(1);
        tree2.add(6);
        tree2.add(10);
        tree2.add(14);

        tree2.remove(14);
        assertEquals(1, tree2.first());
        assertEquals(12, tree2.last());
        assertEquals(6, tree2.size());
        assertFalse(tree2.contains(14));

        tree3.add(8);
        tree3.add(3);
        tree3.add(12);
        tree3.add(1);
        tree3.add(6);
        tree3.add(14);

        tree3.remove(1);
        assertEquals(5, tree3.size());
        assertEquals(3, tree3.first());
        assertEquals(14, tree3.last());
        assertFalse(tree3.contains(1));

        tree4.add(8);
        tree4.add(4);
        tree4.add(12);
        tree4.add(2);
        tree4.add(6);
        tree4.add(14);

        tree4.remove(12);
        assertEquals(5, tree4.size());
        assertEquals(2, tree4.first());
        assertEquals(14, tree4.last());
        assertFalse(tree4.contains(12));

        tree5.add(8);
        tree5.add(4);
        tree5.add(12);
        tree5.add(2);
        tree5.add(6);            //                       (8)
        tree5.add(10);           //                    /     \
        tree5.add(14);           //                  /        \
        tree5.add(1);            //                /           \
        tree5.add(3);            //               4            (12)
        tree5.add(5);            //            /    \        /    \
        tree5.add(7);            //           2      6      10    14
        tree5.add(9);            //          / \    / \    / \   /  \
        tree5.add(11);           //         1   3  5   7  9  11 13  15
        tree5.add(13);
        tree5.add(15);

        tree5.remove(8);
        tree5.remove(12);
        assertEquals(13, tree5.size());
        assertEquals(1, tree5.first());
        assertEquals(15, tree5.last());
        assertFalse(tree5.contains(8));
        assertFalse(tree5.contains(12));

        tree6.add(84);
        tree6.add(50);
        tree6.add(41);
        tree6.add(83);
        tree6.add(20);
        tree6.add(0);
        tree6.add(86);
        tree6.add(97);
        tree6.add(33);
        tree6.add(59);
        tree6.add(23);
        tree6.add(1);
        tree6.add(48);
        tree6.add(89);
        tree6.add(21);
        tree6.add(91);
        tree6.add(88);
        tree6.add(42);
        tree6.add(70);
        tree6.add(47);

        tree6.remove(33);
        assertEquals(19, tree6.size());
        assertEquals(0, tree6.first());
        assertEquals(97, tree6.last());
        assertFalse(tree6.contains(33));
    }
}


