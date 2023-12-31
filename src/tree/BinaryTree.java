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

    public boolean remove(Integer num){
        if(root == null){
            return false;
        }
        remove(root, num);
        return true;
    }

    private void remove(Node node, Integer num){
        if(node == null){
            return;
        }
        if(num < node.getNum()){
            remove(node.getLeft(), num);
        }else if(num > node.getNum()){
            remove(node.getRight(), num);
        }else{
            if(node.getLeft() == null && node.getRight() == null){
                node = null;
            }else if(node.getLeft() == null){
                node = node.getRight();
            }else if(node.getRight() == null){
                node = node.getLeft();
            }else{
                Node temp = node.getRight();
                while(temp.getLeft() != null){
                    temp = temp.getLeft();
                }
                node.setNum(temp.getNum());
                remove(node.getRight(), temp.getNum());
            }
        }
    }

    public Integer find(Integer num){
        return find(root, num);
    }

    private Integer find(Node node, Integer num){
        if(node == null){
            return null;
        }
        if(num < node.getNum()){
            return find(node.getLeft(), num);
        }else if(num > node.getNum()){
            return find(node.getRight(), num);
        }else{
            return node.getNum();
        }
    }

    public void empty(){
        empty(root);
    }

    private void empty(Node node){
        if(node == null){
            return;
        }
        empty(node.getLeft());
        empty(node.getRight());
        node = null;
    }

    public void print(int order){
        if(root == null){
            System.out.println("Empty tree");
            return;
        }
        switch (order) {
            case 1 -> printPreOrder(root);
            case 2 -> printInOrder(root);
            case 3 -> printPostOrder(root);
            default -> System.out.println("Invalid order");
        }
        System.out.println();
    }

    private void printPreOrder(Node node){
        if(node == null){
            return;
        }
        System.out.print(node.getNum() + " ");
        printPreOrder(node.getLeft());
        printPreOrder(node.getRight());
    }

    private void printInOrder(Node node){
        if(node == null){
            return;
        }
        printInOrder(node.getLeft());
        System.out.print(node.getNum() + " ");
        printInOrder(node.getRight());
    }

    private void printPostOrder(Node node){
        if(node == null){
            return;
        }
        printPostOrder(node.getLeft());
        printPostOrder(node.getRight());
        System.out.print(node.getNum() + " ");
    }
}
