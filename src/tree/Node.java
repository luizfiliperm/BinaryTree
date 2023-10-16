package tree;

public class Node {
    private Node left;

    private Integer num;

    private Node right;

    public Node() {
    }

    public Node(Node left, Integer num, Node right) {
        this.left = left;
        this.num = num;
        this.right = right;
    }

    public Node getLeft() {
        return left;
    }

    public void setLeft(Node left) {
        this.left = left;
    }

    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }

    public Node getRight() {
        return right;
    }

    public void setRight(Node right) {
        this.right = right;
    }
}
