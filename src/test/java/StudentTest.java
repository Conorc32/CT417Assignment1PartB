import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class StudentTest {
    @Test
    public void testStudentConstructor() {
        System.out.println("Testing Student Constructor");
        String name = "Tom";
        int age = 22;
        String dateOfBirth = "10/10/1990";
        double id = 12;
        String course = "4BCT";
        List<String> modules = new ArrayList<>();

        String SoftEngIII = "CT417";
        String InformationRetrieval = "CT4100";
        String MachineLearning = "CT4101";
        String SystemsModelling = "CT561";

        modules.add(SoftEngIII);
        modules.add(InformationRetrieval);
        modules.add(MachineLearning);
        modules.add(SystemsModelling);
        Student student = new Student(name, age, dateOfBirth, id, course, modules);

        Assertions.assertEquals(student.getAge(), age);
        Assertions.assertEquals(student.getName(), name);
        Assertions.assertEquals(student.getDateOfBirth(), dateOfBirth);
        Assertions.assertEquals(student.getId(), id);
        Assertions.assertEquals(student.getModules(), modules);
        Assertions.assertEquals(student.getUsername(), name + age);
    }
}
