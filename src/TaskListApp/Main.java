package TaskListApp;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<TaskItem> taskList = new ArrayList<>();

        do {
            System.out.println("Выберите действие:\n" +
                    "1. Добавить задачу\n" +
                    "2. Вывести список задач\n" +
                    "3. Удалить задачу\n" +
                    "0. Выход");

            switch (scanner.nextInt()) {
                case 1 :
                    System.out.println("Введите задачу для планирования:");
                    Scanner inputScan = new Scanner(System.in);
                    var taskItem = new TaskItem(inputScan.nextLine());
                    taskList.add(taskItem);
                    break;
                case 2 :
                    System.out.println("Актуальные задачи:");
                    if (taskList.size() != 0) {
                        for (TaskItem task : taskList)
                            System.out.println((taskList.indexOf(task) + 1) + ". " + task.getDescription());
                    } else
                        System.out.println("Список задач пуст.\n");
                    break;
                case 3 :
                    System.out.println("Введите номер задачи, которую нужно удалить:");
                    if (taskList.size() != 0) {
                        Scanner inputScanner = new Scanner(System.in);
                        try {
                            int taskIndex =  inputScanner.nextInt() - 1;
                            taskList.remove(taskIndex);
                        } catch (Exception ex) {
                            System.out.println("Вы ввели некорректное значение.");
                        }
                    } else
                        System.out.println("Список задач пуст.\n");
                    break;
                case 0 :
                    return;
            }
        } while (true);
    }
}
