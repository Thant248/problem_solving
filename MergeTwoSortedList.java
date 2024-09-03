public class MergeTwoSortedList {

    public static void main(String... args){
        ListNode list1 = new ListNode(1);
        list1.next = new ListNode(2);
        list1.next.next = new ListNode(4);
        ListNode list2 = new ListNode(1);
        list2.next = new ListNode(3);
        list2.next.next = new ListNode(4);

        MergeTwoSortedList mergeTwoSortedList = new MergeTwoSortedList();
        ListNode listNode = mergeTwoSortedList.mergeTwoLists(list1, list2);
        System.out.println(listNode.val);
        System.out.println(listNode.next.val);
        System.out.println(listNode.next.next.val);
        System.out.println(listNode.next.next.next.val);
        System.out.println(listNode.next.next.next.next.val);
        System.out.println(listNode.next.next.next.next.val);
        System.out.println(listNode.next.next.next.next.next.val);
    }
    
    public ListNode mergeTwoLists(ListNode list1, ListNode list2){

        ListNode listNode = new ListNode();
        ListNode head = listNode;

        while (list1 != null && list2 != null){

            if (list1.val < list2.val) {
                head.next = list1;
                list1 = list1.next;
            }else {
                head.next = list2;
                list2 = list2.next;
            }
            head = head.next;
        } 

        if (list1 != null) {
            head.next = list1;
        }else {
            head.next = list2;
        }
        return listNode.next;
    }
}
