package info.thecodinglive.model;

import javax.persistence.*;

@Entity
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "STUDENT_ID")
    private Long id;
    private String userName;
    private String grade;

    @ManyToOne(fetch = FetchType.LAZY) // MTO는 즉시로딩이 기본이므로 한 번에 전부 가져옴, 성능에 문제 -> 지연로딩으로 변경
    @JoinColumn(name = "SCHOOL_ID")
    private School school;

    public Student(String userName) {
        this.userName = userName;
    }

    public School getSchool() {
        return this.school;
    }

    public void setSchool(School school) {
        this.school = school;
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUserName() {
        return this.userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getGrade() {
        return this.grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    @Override
    public String toString() {
        return "Student{" + "id=" + id + ", userName='" + userName + '\'' + ", grade='" + grade + '\'' + ", school="
                + school + '}';
    }
}
