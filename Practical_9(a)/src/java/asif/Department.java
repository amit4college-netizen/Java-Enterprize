package asif;

import jakarta.persistence.*;
import java.util.*;

@Entity
@Table(name="Department")
public class Department {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int deptId;

    private String deptName;

    @OneToMany(mappedBy="department", cascade=CascadeType.ALL)
    private List<Employee> employees = new ArrayList<>();

    public Department() {
    }

    public int getDeptId() {
        return deptId;
    }

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    public void addEmployee(Employee employee) {
        employees.add(employee);
        employee.setDepartment(this);
    }
}