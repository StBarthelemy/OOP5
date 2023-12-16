package model;

import java.util.List;

public class StudyGroup {
    private int numberGroup;
    private User teacherGroup;
    private List<User> students;

    public int getNumberGroup() {
        return numberGroup;
    }

    public void setNumberGroup(int numberGroup) {
        this.numberGroup = numberGroup;
    }

    public User getTeacherGroup() {
        return teacherGroup;
    }

    public void setTeacherGroup(User teacherGroup) {
        this.teacherGroup = teacherGroup;
    }

    public List<User> getStudents() {
        return students;
    }

    public void setStudents(List<User> students) {
        this.students = students;
    }

    public StudyGroup(int numberGroup, User teacherGroup, List<User> students) {
        this.numberGroup = numberGroup;
        this.teacherGroup = teacherGroup;
        this.students = students;
    }

    @Override
    public String toString() {
        return "StudyGroup [Номер группы=" + numberGroup + ", teacherGroup=" + teacherGroup + ", students=" + students
                + "]";
    }

}