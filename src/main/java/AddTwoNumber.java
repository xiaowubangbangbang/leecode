/**
 * <p>给出两个&nbsp;<strong>非空</strong> 的链表用来表示两个非负的整数。其中，它们各自的位数是按照&nbsp;<strong>逆序</strong>&nbsp;的方式存储的，并且它们的每个节点只能存储&nbsp;<strong>一位</strong>&nbsp;数字。</p>
 *
 * <p>如果，我们将这两个数相加起来，则会返回一个新的链表来表示它们的和。</p>
 *
 * <p>您可以假设除了数字 0 之外，这两个数都不会以 0&nbsp;开头。</p>
 *
 * <p><strong>示例：</strong></p>
 *
 * <pre><strong>输入：</strong>(2 -&gt; 4 -&gt; 3) + (5 -&gt; 6 -&gt; 4)
 * <strong>输出：</strong>7 -&gt; 0 -&gt; 8
 * <strong>原因：</strong>342 + 465 = 807
 * </pre>
 * <div><div>Related Topics</div><div><li>链表</li><li>数学</li></div></div>\n<div><li>👍 5276</li><li>👎 0</li></div>
 */
public class AddTwoNumber {
    public static void main(String[] args) {
        ListNode l1 = new ListNode(9);
        ListNode node = new ListNode(9);
        l1.next = node;
        node.next = new ListNode(9);
        ListNode l2 = new ListNode(9);
        l2.next = new ListNode(9);
        ListNode listNode = addTwoNumbers(l1, l2);
        System.out.println(listNode);
    }

    /**
     * @param l1 [9,9,9,9,9,9,9]
     * @param l2 [9,9,9,9]
     * @return [8, 9, 9, 9, 0, 0, 0, 1]
     */
    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode head = null, tail = null;
        int carry = 0;
        while (l1 != null || l2 != null) {
            int n1 = l1 != null ? l1.val : 0;
            int n2 = l2 != null ? l2.val : 0;
            int sum = n1 + n2 + carry;

            if (head == null) {
                head = tail = new ListNode(sum % 10);
            } else {
                tail.next = new ListNode(sum % 10);
                tail = tail.next;
            }
            carry = sum / 10;
            if (l1 != null) {
                l1 = l1.next;
            }
            if (l2 != null) {
                l2 = l2.next;
            }
        }
        if (carry > 0) {
            tail.next = new ListNode(carry);
        }
        return head;
    }

    static class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

}
