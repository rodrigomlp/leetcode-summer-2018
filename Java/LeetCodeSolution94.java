import java.util.List;
import java.util.Queue;
import java.util.Stack;

public class TreeNode {
    public int data;
    public TreeNode left;
    public TreeNode right;
}

public class LeetCodeSolution94 {

    public static List inOrderTraversal(TreeNode root) {
        if (root == null) { return new ArrayList<>(); }
        // stack for node order, list to return in order, set for uniqueness
        Stack<TreeNode> stack = new Stack<>();
        List<Integer> list = new ArrayList<>();
        Set<TreeNode> set = new HashSet<>();

        stack.add(root);
        TreeNode current = root;

        while(!stack.isEmpty() || current != null) {
            // add all nodes smaller than current to the stack, in order
            while (current != null) {
                stack.add(current);
                current = current.left;
            }
            // smallest node in tree
            current = stack.pop();
            // the next node, ensure not in set
            if (set.contains(current) == false) {
                list.add(current.val);
                set.add(current);
            }
            //get next largest node
            current = current.right;
        }
        return list;
    }

    public static void main(String[] args) { }
}