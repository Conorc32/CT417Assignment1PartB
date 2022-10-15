import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Collections;
import java.util.List;

public class ModuleTest {
    @Test
    public void testModuleConstructor() {
        String moduleName = "Systems Modelling";
        String moduleId = "CT345";
        List<Student> students = Collections.emptyList();
        List<String> courses = Collections.singletonList("4BCT");
        double lecturerId = 141;
        Module module = new Module(moduleName, moduleId, students, courses, lecturerId);

        Assertions.assertEquals(module.getModuleName(), moduleName);
        Assertions.assertEquals(module.getModuleId(), moduleId);
        Assertions.assertEquals(module.getStudents(), students);
        Assertions.assertEquals(module.getCourses(), courses);
        Assertions.assertEquals(module.getLecturerId(), lecturerId);
    }
}
