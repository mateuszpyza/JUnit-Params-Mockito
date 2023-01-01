package models;

public class Employee {
    private final String firstName;
    private final String surname;
    private int numberOfWorkingSaturday;
    private double vakueOfOneTimeBonus;

    public Employee(String firstName, String surname, int numberOfWorkingSaturday, double valueOfOneTimeBonus) {
        this.firstName = firstName;
        this.surname = surname;
        this.numberOfWorkingSaturday = numberOfWorkingSaturday;
        this.vakueOfOneTimeBonus = valueOfOneTimeBonus;
    }

    public static int getNumberOfWorkingSaturday(Employee employee) {
        return employee.numberOfWorkingSaturday;
    }

    public static double getOneTimeBonus(Employee employee) {
        return employee.vakueOfOneTimeBonus;
    }
}
