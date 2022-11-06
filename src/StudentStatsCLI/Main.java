package StudentStatsCLI;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Objects;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        System.out.println("Формат ввода данных о студенте: \"ФИО, номер группы, номер студенческого билета\"\n");

        do {
            System.out.println("Введите информацию о студенте: (для завершения работы программы введите \"end\")");

            Scanner scanner = new Scanner(System.in);
            String inputText = scanner.nextLine();

            if (Objects.equals(inputText, "end")) {
                System.out.println("Список студентов:");
                for (Student student : students) {
                    System.out.println("- " + student);
                }
                break;
            }

            String[] splitText = inputText.split(" ");
            if (splitText.length < 5
                    || isNumeric(splitText[0])
                    || isNumeric(splitText[1])
                    || isNumeric(splitText[2])
                    || !isNumeric(splitText[4])) {
                System.out.println("Некорректно введеное поле");
            } else {
                Student student = new Student(splitText[0],
                        splitText[1],
                        splitText[2],
                        splitText[3],
                        Integer.parseInt(splitText[4]));

                if (students.contains(student))
                    System.out.println("Студент с такими данными уже есть");
                else {
                    students.add(student);
                    System.out.printf("Студент %d успешно добавлен.\n", student.getStudentId());
                }
            }
        } while (true);
    }

    public static boolean isNumeric(String s) {
        try {
            Integer.parseInt(s);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}
