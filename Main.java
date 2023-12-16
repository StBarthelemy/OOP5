import Controller.Controller;

public class Main {
    public static void main(String[] args) {
        Controller controller = new Controller();
        controller.createStudent("qwe", "qwe", "qwe");
        controller.createStudent("qwe1", "qwe1", "qwe1");
        controller.createStudent("qwe2", "qwe2", "qwe2");
        controller.createTeacher("asd", "asd", "asd");
        controller.createTeacher("asd1", "asd1", "asd1");
        controller.getAllStudent();
        controller.getAllTeacher();


        controller.createGroup();
        
    }

}
