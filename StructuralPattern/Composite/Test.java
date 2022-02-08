package Composite;

public class Test {
    public static void main(String[] args) {
        TreeNode nodeA = new TreeNode("A");
        TreeNode nodeB = new TreeNode("B");
        nodeA.add(nodeB);
        // System.out.println(JSON.toJSONString(nodeA));
    }
}
