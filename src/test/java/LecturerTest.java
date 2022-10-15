import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Collections;
import java.util.List;

public class LecturerTest {
    @Test
    public void testLecturerConstructor() {
        System.out.println("Testing Lecturer Constructor");
        String name = "John";
        int age = 50;
        String dateOfBirth = "10/10/1972";
        double id = 12;
        List<String> modulesTaught = Collections.singletonList("MA120");
        Lecturer lecturer = new Lecturer(name, age, dateOfBirth, id, modulesTaught);

        Assertions.assertEquals(lecturer.getAge(), age);
        Assertions.assertEquals(lecturer.getName(), name);
        Assertions.assertEquals(lecturer.getDateOfBirth(), dateOfBirth);
        Assertions.assertEquals(lecturer.getId(), id);
        Assertions.assertEquals(lecturer.getModulesTaught(), modulesTaught);
        Assertions.assertEquals(lecturer.getUsername(), name + age);
    }
}
