package Service;

import java.util.ArrayList;
import java.util.List;

import model.Student;
import model.Teacher;
import model.Type;
import model.User;

public class ServiceData {
    protected static List<User> userList;

    public ServiceData() {
        this.userList = new ArrayList<>();
    }

    public void create(String firstName, String secondName, String lastName, Type type) {
        int id = getMaxId(type);
        if (type == Type.STUDENT) {
            userList.add(new Student(firstName, secondName, lastName, id));
        }
        if (type == Type.TEACHER) {
            userList.add(new Teacher(firstName, secondName, lastName, id));
        }

    }

    private int getMaxId(Type type) {
        boolean itsStudent = type == Type.STUDENT;
        int MaxId = 0;
        for (User user : userList) {
            if (user instanceof Student && itsStudent) {
                MaxId = ((Student) user).getStudentId() + 1;
            }
            if (user instanceof Teacher && !itsStudent) {
                MaxId = ((Teacher) user).getTeacheriD() + 1;
            }

        }
        return MaxId;
    }

    public List<User> getAllConcreatUsers(Type type) {
        List<User> resultList = new ArrayList<>();
        boolean itsStudent = type == Type.STUDENT;
        for (User user : userList) {
            if (user instanceof Student && itsStudent) {
                resultList.add(user);
            }
            if (user instanceof Teacher && !itsStudent) {
                resultList.add(user);
            }

        }
        return resultList;
    }

    public User getUserById(Type type, int id) { // реализован поиск user по id
        boolean itsStudent = Type.STUDENT == type;
        for (User user : userList) {
            if (user instanceof Teacher && !itsStudent && ((Teacher) user).getTeacheriD() == id) {
                return user;
            }
            if (user instanceof Student && itsStudent && ((Student) user).getStudentId() == id) {
                return user;
            }
        }
        return null;
    }

}
