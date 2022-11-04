package CallCenterProj;

import java.util.ArrayDeque;
import java.util.Deque;

public class CallCenter {
    private Deque<String> calls = new ArrayDeque<>();

    public void addCall(String phone) {
        calls.offer(phone);
    }

    public String getNext() {
        return calls.poll();
    }

    public void transferCall(String phone) {
        calls.addFirst(phone);
    }

    public boolean workIsExist() {
        return !calls.isEmpty();
    }
}
