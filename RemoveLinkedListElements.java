public class RemoveLinkedListElements {
    public static void main(String[] args) {
        
        RemoveLinkedListElements removeLinkedListElements = new RemoveLinkedListElements();
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(6);
        head.next.next.next = new ListNode(3);
        head.next.next.next.next = new ListNode(4);
        var result = removeLinkedListElements.removeElement(head, 6);
        System.out.println(result.val);
    }


    public ListNode removeElement(ListNode head, int val){
        ListNode dummyNode = new ListNode();
        dummyNode.next = head;
        ListNode current = dummyNode;

        while(current.next != null){
            if(current.next.val == val){
                current.next = current.next.next;
            }else{
                current = current.next;
            }
        }
        return dummyNode.next;
    }
}
