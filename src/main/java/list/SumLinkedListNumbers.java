package list;

class ListNode {
      int val;
      ListNode next;
      ListNode(int x) { val = x; }
  }

public class SumLinkedListNumbers {

    public static void main(String[] args) {

        ListNode listNode1 = new ListNode(2);
        ListNode num2  = new ListNode(4);
        listNode1.next = num2;
        ListNode num3  = new ListNode(3);
        num2.next =  num3;

        ListNode listNode2 = new ListNode(5);
        num2  = new ListNode(6);
        listNode2.next = num2;
        num3  = new ListNode(4);
        num2.next =  num3;

        ListNode result = addTwoNumbers(listNode1, listNode2);

        while (result != null ){
            System.out.println(result.val);
            result = result.next;
        }

    }

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        ListNode result = null, resultHead = null;
        boolean carryOver = false;
        int num1, num2, intSum;
        while(l1 != null || l2 != null){
            num1 = 0; num2 = 0; intSum = 0;
            if(l1 != null){
                num1 = l1.val;
                l1 = l1.next;
            }
            if(l2 != null){
                num2 = l2.val;
                l2 = l2.next;
            }
            intSum = num1 + num2;
            if(carryOver){
                intSum++;
                carryOver = false;
            }
            if(intSum > 9){
                intSum = intSum%10;
                carryOver = true;
            }

            ListNode sum = new ListNode(intSum);
            if(result == null){
                result = sum;
                resultHead = result;
            }
            else{
                result.next = sum;
                result = sum;
            }
        }
        if(carryOver){
            ListNode sum = new ListNode(1);
            result.next = sum;
        }
        return resultHead;

    }
}
