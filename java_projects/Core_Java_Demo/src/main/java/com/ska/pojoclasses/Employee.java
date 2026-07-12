package com.ska.pojoclasses;

public class Employee {
    private String empName;
    private Integer empId;
    private String empContactNo;
//    private Address empAddress;

    public Employee(String empName, Integer empId, String empContactNo) {
        this.empName = empName;
        this.empId = empId;
        this.empContactNo = empContactNo;
    }

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

    public String getEmpContactNo() {
        return empContactNo;
    }

    public void setEmpContactNo(String empContactNo) {
        this.empContactNo = empContactNo;
    }



    @Override
    public String toString() {
        return "Employee{" +
                "empName='" + empName + '\'' +
                ", empId=" + empId +
                ", empContactNo='" + empContactNo + '\'' +
                '}';
    }
}
