import java.util.Set;
import java.util.HashSet;

public class LeetCodeSolution160 {

    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if (headA == null || headB == null) { return null; }
        // check all nodes 
        Set<ListNode> set = new HashSet<ListNode>();
        // to maintain orignal structure
        ListNode iterator = headA;
        // add all nodes to to be checked against
        while (iterator != null) { 
            set.add(iterator);
            iterator = iterator.next;
        }
        // check if other list has a related/contained node
        iterator = headB;
        while (iterator != null) {
            if (set.contains(iterator)) { return iterator; }
            set.add(iterator);
            iterator = iterator.next;
        }
        return null;
    }

    public static void main(String[] args) { }
}