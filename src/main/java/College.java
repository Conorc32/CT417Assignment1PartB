import org.joda.time.DateTime;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class College {
    public CourseProgramme computerScience;
    public CourseProgramme arts;

    public void populateCollege() {
        String SoftEngIII = "CT417";
        String InformationRetrieval = "CT4100";
        String MachineLearning = "CT4101";
        String SystemsModelling = "CT561";

        List<String> computerScienceModules = new ArrayList<>();
        computerScienceModules.add(SoftEngIII);
        computerScienceModules.add(InformationRetrieval);
        computerScienceModules.add(MachineLearning);
        computerScienceModules.add(SystemsModelling);

        List<String> artsModules = new ArrayList<>();
        artsModules.add(InformationRetrieval);

        Student s1 = new Student("John", 23, "11/01/1999", 17345678, "4BCT", computerScienceModules);
        Student s2 = new Student("Ann", 21, "11/01/2001", 19345678, "4BA", artsModules);

        computerScience = new CourseProgramme(
                "Computer Science", computerScienceModules, Collections.singletonList(s1),
                new DateTime(), new DateTime());

        arts = new CourseProgramme(
                "Arts", artsModules, Collections.singletonList(s2),
                new DateTime(), new DateTime());

        System.out.println("Printing list of courses: " + computerScience.getCourseName() +" and " + arts.getCourseName());
        System.out.println("Their corresponding modules: " + computerScience.getModules() +"\n"+arts.getModules());
        System.out.println("Printing Student Information");
        printStudentInformation(s1);
        printStudentInformation(s2);
    }

    public static void main(String[] args) {
        College college = new College();
        college.populateCollege();
    }

    public void printStudentInformation(Student student) {
        System.out.println(student.getUsername() + student.getModules() + student.getCourse());
    }
}
