import java.util.Queue;

public class TreeNode {
    public int data;
    public TreeNode left;
    public TreeNode right;
}

public class LeetCodeSolution104 {

    public static int maxDepth(TreeNode root) {
        if (root == null) { return 0; }
        // queue for nodes on same level
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        int depth = 0;
        while (queue.size() > 0) {
            // get the nodes at current level
            int nodesAtLevel = queue.size();
            // add all nodes of very next level to queue
            while (nodesAtLevel > 0) {
                TreeNode current = queue.poll();
                if (current.left != null) { queue.add(current.left); }
                if (current.right != null) { queue.add(current.right); }
                nodesAtLevel--;
            }
            // the current level of the tree
            depth++;
        }
        return depth;
    }

    public static void main(String[] args) { }
}