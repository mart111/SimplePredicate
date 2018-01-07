import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class PredicateStudents {

    public static Predicate<Student> isAdult() {

        return p -> p.getAge() > 17;
    }

    public static Predicate<Student> isNameBeginWithM() {

        return p -> p.getName().startsWith("M") || p.getName().startsWith("m");
    }

    public static List<Student> filterEmployees(List<Student> students, Predicate<Student> predicate) {
        return students.stream().filter(predicate).collect(Collectors.toList());

    }
}
