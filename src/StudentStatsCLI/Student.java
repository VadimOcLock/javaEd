package StudentStatsCLI;

import java.util.HashMap;
import java.util.Objects;
import java.util.UUID;

public class Student {
    private String name;
    private String surname;
    private String patronymic;
    private String groupNumber;
    private final Integer studentId;

    public Student(String name, String surname, String patronymic, String groupNumber) {
        this.name = name;
        this.surname = surname;
        this.patronymic = patronymic;
        this.groupNumber = groupNumber;
        this.studentId = (int) (Math.round(Math.random() * 1000000));
    }

    public Student(String name, String surname, String patronymic, String groupNumber, Integer studentId) {
        this.name = name;
        this.surname = surname;
        this.patronymic = patronymic;
        this.groupNumber = groupNumber;
        this.studentId = studentId;
    }

    public Integer getStudentId() {
        return studentId;
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

    public String getGroupNumber() {
        return groupNumber;
    }

    public void setGroupNumber(String groupNumber) {
        this.groupNumber = groupNumber;
    }

    @Override
    public String toString() {
        return  name + " " +
                surname + " " +
                patronymic + ", " +
                groupNumber + ", " +
                studentId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return Objects.equals(studentId, student.studentId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, patronymic, groupNumber, studentId);
    }
}
