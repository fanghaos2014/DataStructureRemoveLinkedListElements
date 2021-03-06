package leetccode203;

public class Solution {
	while(head != null && head.val == val){
        ListNode delNode = head;
        head = head.next;
        delNode = null;
    }
    if(head == null){
        return null;
    }
    ListNode prev = head;
    while(prev.next != null){
        if(prev.next.val == val){
            ListNode delNode = prev.next;
            prev.next = delNode.next;
            delNode.next = null;
        }
        else {
            prev = prev.next;
        }
    }
    return head;
}
}