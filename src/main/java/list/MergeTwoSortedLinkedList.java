package list;

public class MergeTwoSortedLinkedList {

    public static void main(String[] args) {

        ListNode listNode1 = new ListNode(1);
        ListNode num2 = new ListNode(2);
        listNode1.next = num2;
        ListNode num3 = new ListNode(4);
        num2.next = num3;

        ListNode listNode2 = new ListNode(3);
        num2 = new ListNode(4);
        listNode2.next = num2;
        num3 = new ListNode(5);
        num2.next = num3;

        ListNode result = mergeTwoLists(listNode1, listNode2);

        for (;result != null;result = result.next) {
            System.out.println(result.val);
        }
    }

    public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode resulthead = null, prev = null;
        if(l1 == null){
            return l2;
        }
        if(l2 == null){
            return l1;
        }
        ListNode lnode = null;
        while(l1 != null && l2 != null){

            if(l1.val < l2.val){
                lnode = new ListNode(l1.val);
                l1 = l1.next;
            }
            else{
                lnode = new ListNode(l2.val);
                l2 = l2.next;
            }
            if(resulthead == null){
                resulthead = lnode;
                prev = resulthead;
            }
            else{
                prev.next = lnode;
                prev = lnode;
            }
        }

        if(l1 != null){
            prev.next = l1;
        }
        if(l2 != null){
            prev.next = l2;
        }
        return resulthead;
    }
}
