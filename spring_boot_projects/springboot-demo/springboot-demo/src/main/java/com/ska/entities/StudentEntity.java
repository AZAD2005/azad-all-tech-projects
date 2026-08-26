package com.ska.entities;

import jakarta.persistence.*;

import java.util.Objects;

@Entity
@Table(name = "Student_ET")
public class StudentEntity {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer studentId;

    @Column(name = "STUDENT_NAME")
    private String studentName;

    @Column(name = "STUDENT_SECTION")
    private String studentSection;

    public Integer getStudentId() {
        return studentId;
    }

    public void setStudentId(Integer studentId) {
        this.studentId = studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getStudentSection() {
        return studentSection;
    }

    public void setStudentSection(String studentSection) {
        this.studentSection = studentSection;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        StudentEntity that = (StudentEntity) o;
        return Objects.equals(studentId, that.studentId) && Objects.equals(studentName, that.studentName) && Objects.equals(studentSection, that.studentSection);
    }

    @Override
    public int hashCode() {
        return Objects.hash(studentId, studentName, studentSection);
    }

    @Override
    public String toString() {
        return "StudentEntity{" +
                "studentId='" + studentId + '\'' +
                ", studentName='" + studentName + '\'' +
                ", studentSection='" + studentSection + '\'' +
                '}';
    }
}
