package model;

public class Teacher extends User {
    private int teacheriD;

    public Teacher(String firstName, String secondName, String lastName, int teacheriD) {
        super(firstName, secondName, lastName);
        this.teacheriD = teacheriD;
    }

    public int getTeacheriD() {
        return teacheriD;
    }

    public void setTeacheriD(int teacheriD) {
        this.teacheriD = teacheriD;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "teacheriD=" + teacheriD +
                "firstName=" + super.getFirstName() +
                ", secondName=" + super.getSecondName() +
                ", lastName=" + super.getLastName() + "}";
    }
}
