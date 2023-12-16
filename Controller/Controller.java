package Controller;

import java.util.List;
import java.util.Scanner;

import Service.ServiceData;
import Service.StudyGroupService;
import Viev.StudentViev;
import Viev.StudyGroupView;
import Viev.TeacherViev;
import model.Student;
import model.Teacher;
import model.Type;
import model.User;

public class Controller {
    private final ServiceData serviceData = new ServiceData();
    private final StudentViev studentViev = new StudentViev();
    private final TeacherViev teacherViev = new TeacherViev();
    private final StudyGroupView groupView = new StudyGroupView();
    private final StudyGroupService groupService = new StudyGroupService();

    public void createStudent(String firstName, String secondName, String lastName) { 
        serviceData.create(firstName, secondName, lastName, Type.STUDENT);
    }

    public void getAllStudent() { 
        for (User user : serviceData.getAllConcreatUsers(Type.STUDENT)) {
            studentViev.printConsole((Student) user);
        }
    }

    public void createTeacher(String firstName, String secondName, String lastName) { 
        serviceData.create(firstName, secondName, lastName, Type.TEACHER);
    }

    public void getAllTeacher() {
        for (User user : serviceData.getAllConcreatUsers(Type.TEACHER)) { 
            teacherViev.printConsole((Teacher) user);
        }
    }

    public Integer getGroupNumber() { 
        int number;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите номер группы");
        number = scanner.nextInt();
        return number;
    }
   
    

    public User getGroupTeacher() { 
        int id;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите ID педагога");
        id = scanner.nextInt();

        return ServiceData.getUserById(Type.TEACHER, id);

    }

    public List<User> studentsInGroup() { 

        List<User> studentsGroup = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите ID студентов,  Для выхода введите -1");

        while (true) {

            int number = scanner.nextInt();

            studentsGroup.add(ServiceData.getUserById(Type.STUDENT, number));

            if (number == -1) {

                break;
            }

        }

        return studentsGroup;

    }


    public void createGroup() {

        int numberGroup = getGroupNumber();
        User teacherGroup = getGroupTeacher();
        List<User> students = studentsInGroup();
        StudyGroup studyGroup = groupService.createGroup(numberGroup, teacherGroup, students);
    }
}