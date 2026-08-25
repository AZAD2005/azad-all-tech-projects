package com.ska.entities;

import jakarta.persistence.*;

import java.util.Date;
import java.util.Objects;

@Entity
@Table(name = "EMPLOYEE_ET")
public class EmployeeEntity {

    @Id
    @Column(name = "EMP_NAME")
    private String empName;

    @Column(name = "EMP_ID")
    private Integer empId;

    @Column(name = "EMP_DOJ")
    private Date empDoj;

    @Column(name = "EMP_SALARY")
    private Double empSalary;

    @Column(name = "IS_PER_EMP")
    private Boolean isPerEmp;


    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public Integer getEmpId() {
        return empId;
    }

    public void setEmpId(Integer empId) {
        this.empId = empId;
    }

    public Date getEmpDoj() {
        return empDoj;
    }

    public void setEmpDoj(Date empDoj) {
        this.empDoj = empDoj;
    }

    public Double getEmpSalary() {
        return empSalary;
    }

    public void setEmpSalary(Double empSalary) {
        this.empSalary = empSalary;
    }

    public Boolean getPerEmp() {
        return isPerEmp;
    }

    public void setPerEmp(Boolean perEmp) {
        isPerEmp = perEmp;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        EmployeeEntity that = (EmployeeEntity) o;
        return Objects.equals(empName, that.empName) && Objects.equals(empId, that.empId) && Objects.equals(empDoj, that.empDoj) && Objects.equals(empSalary, that.empSalary) && Objects.equals(isPerEmp, that.isPerEmp);
    }

    @Override
    public int hashCode() {
        return Objects.hash(empName, empId, empDoj, empSalary, isPerEmp);
    }

    @Override
    public String toString() {
        return "EmployeeEntity{" +
                "empName='" + empName + '\'' +
                ", empId=" + empId +
                ", empDoj=" + empDoj +
                ", empSalary=" + empSalary +
                ", isPerEmp=" + isPerEmp +
                '}';
    }
}
