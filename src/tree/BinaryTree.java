package tree;

public class BinaryTree {
    private Node root;

    public BinaryTree() {
        root = null;
    }

    public Node getRoot() {
        return root;
    }

    public void setRoot(Node root) {
        this.root = root;
    }

    public void insert(Integer num) {
        Node newNode = new Node(num);
        insert(root, newNode);
    }

    private void insert(Node node, Node newNode) {
        if (root == null) {
            root = newNode;
        } else {
            if (newNode.getNum() < node.getNum()) {
                if (node.getLeft() == null) {
                    node.setLeft(newNode);
                } else {
                    insert(node.getLeft(), newNode);
                }
            }else if(newNode.getNum() > node.getNum()){
                if (node.getRight() == null) {
                    node.setRight(newNode);
                } else {
                    insert(node.getRight(), newNode);
                }
            }
        }
    }
}
