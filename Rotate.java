

class ListNode {
     int val;
      ListNode next;
     ListNode(int x) { val = x; }
  }
 
public class Rotate {
	public ListNode head;
	public ListNode helper (int[] a) {
		head = null;
		ListNode p = head;
		for (int i = 0; i < a.length; i++) {
			ListNode curr = new ListNode(a[i]);
			if (head == null) {
				head = curr;
				p = head;
			} else {
				p.next = curr;
				p = p.next;
			}
		}
		return head;
	}
    public ListNode rotateRight(ListNode head, int k) {
        //bound cases
        if (head == null) {
            return null;
        }
        int length = 0;
        ListNode traverse = head;
        while (traverse != null) {
            length++;
            traverse = traverse.next;
        }
        if (length == 1) {
            return head;
        }
        
        ListNode tail = head;
        for (int i = 0; i < length - 1; i++) {
            tail = tail.next;
        }
        tail.next = head;
        k = length - k % length;
        System.out.println(k);
        for (int i = 0; i < k; i++) {
            tail = tail.next;
        }
        head = tail.next;
        tail.next = null;
        return head;
    }
}