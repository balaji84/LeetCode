/**
 * Definition for singly-linked list.
 * class ListNode {
 *     public int val;
 *     public ListNode next;
 *     ListNode(int x) { val = x; next = null; }
 * }
 */
public class Solution {
    public ListNode reorderList(ListNode A) {
        
        ListNode head = A;
        
        ListNode slow = A;
        ListNode fast = A;
        while(fast!=null && fast.next!=null){
            fast = fast.next.next;
            slow = slow.next;
        }
        //
        if(fast!=null && fast.next!=null){
            slow = slow.next;
        }
        
       
        ListNode mid = slow.next;
         slow.next= null;
        ListNode rev = reverse(mid);
        
        
        ListNode temp = head;
        while(temp!=null && rev!=null){
            ListNode next1 = temp.next;
            temp.next = rev;
            
            ListNode rev1 = rev.next;
            rev.next = next1;
            
            temp = next1;
            rev =   rev1;           
            //1->2->3 4->5
            //1->
        }
        
        return head;
        //1->2->3->4->5
        //1->5->2->4->3
        
        //1->2  5->4->3
        //1->5->2->4->3
        
        //without extend slow if odd
        //1->2->3 4->5
        //1->2->3 5->4
        //1->5->2->4->3
        
        //1->4->2->
        
        //1->2->3->4
        
        //1->2  3->4
        //1->2  4->3
        //1->4->2->3
        
        
        
    }
    private ListNode reverse(ListNode cur){
        
        ListNode prev = null;
        ListNode next = null;
        
        //1-2-3
        while(cur!=null){
            next = cur.next;
            cur.next = prev;
            prev = cur;
            cur = next;
        }
        
        return prev;
    }
}
