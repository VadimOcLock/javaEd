package CallCenterProj;

public class Main {
    public static void main(String[] args) {
        CallCenter center = new CallCenter();
        center.addCall("+7 999 999 99 99");
        center.addCall("+7 999 999 99 98");
        center.addCall("+7 999 999 99 97");
        center.addCall("+7 999 999 99 96");
        center.addCall("+7 999 999 99 95");
        center.addCall("+7 999 999 99 94");
        center.addCall("+7 999 999 99 93");

        while (center.workIsExist()) {
            callHandle(center);
        }
    }

    private static void callHandle(CallCenter center) {
        final String nextCall = center.getNext();
        if (nextCall == null)
            System.out.println("Звонков в очереди нет.");
        else
            System.out.printf("Звонок %s взят в работу!\n", nextCall);
    }
}
