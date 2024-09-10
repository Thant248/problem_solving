public class InsertGreatestCommonDivisors {

    public static void main(String[] args) { 

        ListNode head = new ListNode();
            head.next = new ListNode(6);
            head.next.next = new ListNode(2);
            head.next.next.next = new ListNode(3);
            head.next.next.next.next = new ListNode(0);
            head.next.next.next.next.next = new ListNode(10);
            head.next.next.next.next.next.next = new ListNode(2);
            InsertGreatestCommonDivisors insertGreatestCommonDivisors = new InsertGreatestCommonDivisors();
            ListNode result = insertGreatestCommonDivisors.insetGreatestCommonDivisors(head);
            System.out.println(result);
    }


    public ListNode insetGreatestCommonDivisors(ListNode head){
        if (head.next == null) {
            return head;
        }

        ListNode node1 = head;
        ListNode node2 = head.next;

        while (node2 != null){
            int gcd = calculateGCD(node1.val, node2.val);
            ListNode newNode = new ListNode(gcd);

            node1.next = newNode;
            newNode.next = node2;

            node1 = node2;
            node2  = node2.next;
        }

        return head;
    }


    private int calculateGCD(int a, int b){
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}