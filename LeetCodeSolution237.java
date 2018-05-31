
private class ListNode {
    public int val;
    public ListNode next;
}

public class LeetCodeSolution237 {

    public void deleteNode(ListNode node) {
        // check not for tail
        if (node == null || node.next == null) { return; }
        //take the next nodes value and ignore the
        node.val = node.next.val;
        node.next = node.next.next;
    }
    
    public static void main(String[] args) { }
}