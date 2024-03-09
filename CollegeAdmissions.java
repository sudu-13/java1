import java.util.*;
import java.util.concurrent.LinkedBlockingDeque;

public class CollegeAdmissions {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numColleges = scanner.nextInt(); // Number of colleges
        int numStudents = scanner.nextInt(); // Number of students

        // Initialize colleges with their quotas
        Map<String, Integer> colleges = new HashMap<>();
        for (int i = 1; i <= numColleges; i++) {
            String collegeName = "C-" + i;
            int quota = scanner.nextInt();
            colleges.put(collegeName, quota);
        }

        // Initialize students with their details
        List<Student> students = new ArrayList<>();
        scanner.nextLine(); // Consume newline character
        for (int i = 1; i <= numStudents; i++) {
            String[] studentInfo = scanner.nextLine().split(",");
            String studentId = studentInfo[0];
            double percentage = Double.parseDouble(studentInfo[1]);
            String[] preferences = Arrays.copyOfRange(studentInfo, 2, 5);
            students.add(new Student(studentId, percentage, preferences));
        }

        // Sort students by percentage (in descending order) and then by studentId
        students.sort(new Comparator<Student>() {
            @Override
            public int compare(Student s1, Student s2) {
                if (s2.getPercentage() != s1.getPercentage()) {
                    return Double.compare(s2.getPercentage(), s1.getPercentage());
                } else {
                    return s1.getStudentId().compareTo(s2.getStudentId());
                }
            }
        });

        // Allocate students to colleges based on preferences
        for (Student student : students) {
            for (String preference : student.getPreferences()) {
                if (colleges.containsKey(preference) && colleges.get(preference) > 0) {
                    colleges.put(preference, colleges.get(preference) - 1);
                    student.setAllocatedCollege(preference);
                    break;
                }
            }
        }

        // Find cut-off percentages for colleges
        Map<String, Double> cutOffs = new HashMap<>();
        for (String college : colleges.keySet()) {
            double cutOff = 0.0;
            for (Student student : students) {
                if (student.getAllocatedCollege() != null && student.getAllocatedCollege().equals(college)) {
                    cutOff = student.getPercentage();
                    break;
                }
            }
            cutOffs.put(college, cutOff);
        }

        // Sort cut-off percentages in descending order
        cutOffs.entrySet().stream()
                .sorted(Map.Entry.<String, Double>comparingByValue().reversed())
                .forEach(entry -> System.out.println(entry.getKey() + " " + entry.getValue()));

        // Print colleges with no students
        for (String college : colleges.keySet()) {
            if (colleges.get(college) == colleges.get(college)) {
                System.out.println(college + " n/a");
            }
        }
    }
}

class Student {
    private String studentId;
    private double percentage;
    private String[] preferences;
    private String allocatedCollege;

    public Student(String studentId, double percentage, String[] preferences) {
        this.studentId = studentId;
        this.percentage = percentage;
        this.preferences = preferences;
        this.allocatedCollege = null;
    }

    public String getStudentId() {
        return studentId;
    }

    public double getPercentage() {
        return percentage;
    }

    public String[] getPreferences() {
        return preferences;
    }

    public String getAllocatedCollege() {
        return allocatedCollege;
    }

    public void setAllocatedCollege(String allocatedCollege) {
        this.allocatedCollege = allocatedCollege;
    }
}
