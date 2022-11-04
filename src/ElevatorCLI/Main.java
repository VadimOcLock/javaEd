package ElevatorCLI;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Queue;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Deque<Integer> floors = new ArrayDeque<>();
        int waitDoorsInSeconds = 10;
        int waitMoveInSeconds = 5;
        int totalSeconds = 0;
        int previousFloor = -1;

        System.out.println("Документация лифта:\n" +
                "Скорость движения лифта между парой этажей равна 5 секунд.\n" +
                "Время остановки на открытие и закрытие дверей лифта 10 секунд.\n");

        do {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Ожидаю ввода этажа: (для завершения введите 0)");
            try {
                int floor = scanner.nextInt();
                if (floor == 0) {
                    if (floors.peek() != null) {
                        int queueSize = floors.size();
                        for (int i = 0; i < queueSize; i++) {
                            System.out.print("этаж " + floors.poll() + " --> ");
                        }
                        System.out.print("этаж 0\n");
                    }
                    System.out.println("Время затраченное лифтом на маршрут: " + totalSeconds + " с.");
                    return;
                }
                else if (floor > 0 && floor <= 25) {
                    if (floors.peek() != null)
                        previousFloor = floors.peekLast();
                    floors.offer(floor);
                }

                if (previousFloor != -1) {
                    totalSeconds += Math.abs(floors.peekLast() - previousFloor) * waitMoveInSeconds;
                    totalSeconds += waitDoorsInSeconds;
                }
            } catch (Exception ex) {
                System.out.println("Введите корректное значение.");
            }
        } while (true);
    }
}
