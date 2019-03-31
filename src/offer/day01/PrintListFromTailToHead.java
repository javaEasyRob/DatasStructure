package offer.day01;

import java.util.ArrayList;
import java.util.Stack;

/**
 * ClassName PrintListFromTailToHead<br>
 * Function <br>
 * Day01-从尾到头打印链表<br>
 *
 * @author 辛江勇<br>
 * @version 1.0.0
 * @date 2018/10/20 20:45<br>
 */
public class PrintListFromTailToHead {
    public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
        Stack<Integer> stack = new Stack<>();
        ArrayList<Integer> list = new ArrayList<>();
        while (listNode != null) {
            stack.push(listNode.val);
            listNode = listNode.next;
        }
        while (!stack.isEmpty()) {
            list.add(stack.pop());
        }
        return list;
    }
}

class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}