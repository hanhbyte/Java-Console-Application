package Lesson2.model;

public class User {
    private String name;
    private int number;
    private String code;

    public User() {
    }

    public User(String name, int number, String code) {
        super();
        this.name = name;
        this.number = number;
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", number=" + number +
                ", code='" + code + '\'' +
                '}';
    }
}
