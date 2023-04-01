public class Main {
    public static void main(String [] args){
        BinaryTree binaryTree = new BinaryTree();
        binaryTree.setRoot(new Node("Root Layer"));

        binaryTree.getRoot().setLeft(new Node("Layer 1 Node 1"));
        binaryTree.getRoot().setRight(new Node("Layer 1 Node 2"));

        binaryTree.getRoot().getLeft().setLeft(new Node("Layer 2 Node 1"));
        binaryTree.getRoot().getLeft().setRight(new Node("Layer 2 Node 2"));
        binaryTree.getRoot().getRight().setLeft(new Node("Layer 2 Node 3"));
        binaryTree.getRoot().getRight().setRight(new Node("Layer 2 Node 4"));

        System.out.println(binaryTree.getBFS().toString());
    }
}
