package StudentStatsCLI;

import java.util.UUID;

public class Student {
    private String name;
    private String surname;
    private String patronymic;
    private int groupNumber;
    private final UUID studentId;

    public Student(String name, String surname, String patronymic, int groupNumber) {
        this.name = name;
        this.surname = surname;
        this.patronymic = patronymic;
        this.groupNumber = groupNumber;
        this.studentId = UUID.randomUUID();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public int getGroupNumber() {
        return groupNumber;
    }

    public void setGroupNumber(int groupNumber) {
        this.groupNumber = groupNumber;
    }
}
