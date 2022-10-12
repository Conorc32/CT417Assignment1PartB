import org.joda.time.DateTime;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Collections;
import java.util.List;

public class CollegeTest {
    @Test
    public void testCourseProgrammeConstructor() {
        System.out.println("Conorc32's Junit test");
        final String courseName = "4BCT";
        List<String> modules = Collections.singletonList("CT417");
        List<Student> students = Collections.emptyList();
        DateTime startDate = new DateTime();
        DateTime endDate = startDate.plusYears(1);

        CourseProgramme courseProgramme = new CourseProgramme(courseName, modules, students, startDate, endDate);

        Assertions.assertEquals(courseProgramme.getCourseName(), courseName);
        Assertions.assertEquals(courseProgramme.getModules(), modules);
        Assertions.assertTrue(courseProgramme.getStudents().isEmpty());
        Assertions.assertEquals(courseProgramme.getStartDate(), startDate);
        Assertions.assertEquals(courseProgramme.getEndDate(), endDate);
    }
}
