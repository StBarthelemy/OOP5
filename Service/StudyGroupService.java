package Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import javax.swing.GroupLayout.Group;

import model.Student;
import model.StudyGroup;
import model.Teacher;
import model.Type;
import model.User;

public class StudyGroupService {

    public StudyGroup createGroup(int number, User teacher, List<User> students) {
        return new StudyGroup(number, teacher, students);
    }

    
}
