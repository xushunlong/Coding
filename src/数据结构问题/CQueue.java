package 数据结构问题;

import java.util.LinkedList;

public class CQueue {
    LinkedList<Integer> stackA, stackB;

    public CQueue() {
        stackA = new LinkedList<>();
        stackB = new LinkedList<>();
    }

    public void appendTail(int value) {
        stackA.add(value);
    }

    public int deleteHead() {
        if (!stackB.isEmpty())
            return stackB.removeLast();
        if (stackB.isEmpty() && stackA.isEmpty())
            return -1;
        while (!stackA.isEmpty())
            stackB.add(stackA.removeLast());
        return stackB.removeLast();
    }
}
