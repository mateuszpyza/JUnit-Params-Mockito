package apps;

import interfaces.BaseSalary;
import interfaces.WorkingSaturday;
import models.Employee;

public class SalaryCalculator {
    private BaseSalary baseSalary;
    private WorkingSaturday workingSaturday;

    public SalaryCalculator(BaseSalary baseSalary, WorkingSaturday workingSaturday) {
        this.baseSalary = baseSalary;
        this.workingSaturday = workingSaturday;
    }


    double calculateSalary(Employee employee) {
        return baseSalary.getBaseSalary(employee)+ Employee.getOneTimeBonus(employee)+ workingSaturday.getValueOfWorkingSaturdayBonus(employee)*Employee.getNumberOfWorkingSaturday(employee);
    }
}
