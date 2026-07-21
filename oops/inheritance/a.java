
// Base Class
class AssignPerson {
    private String name;
    private String dateOfBirth;

    public AssignPerson(String name, String dateOfBirth) {
        this.name = name;
        this.dateOfBirth = dateOfBirth;
    }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    
    public String getDateOfBirth() { return dateOfBirth; }
    public void setDateOfBirth(String dateOfBirth) { this.dateOfBirth = dateOfBirth; }
}

// Teacher Class inheriting from Person
class AssignTeacher extends AssignPerson {
    private double salary;
    private String subject;

    public AssignTeacher(String name, String dateOfBirth, double salary, String subject) {
        super(name, dateOfBirth);
        this.salary = salary;
        this.subject = subject;
    }

    public double getSalary() { return salary; }
    public void setSalary(double salary) { this.salary = salary; }

    public String getSubject() { return subject; }
    public void setSubject(String subject) { this.subject = subject; }
}

// Student Class inheriting from Person (with standard getters and setters)
class AssignStudent extends AssignPerson {
    private String studentId;

    public AssignStudent(String name, String dateOfBirth, String studentId) {
        super(name, dateOfBirth);
        this.studentId = studentId;
    }

    public String getStudentId() { return studentId; }
    public void setStudentId(String studentId) { this.studentId = studentId; }
}

// CollegeStudent Class inheriting from Student
class CollegeStudent extends AssignStudent {
    private String collegeName;
    private String year; // e.g., "First", "Second", "Third", "Fourth"

    public CollegeStudent(String name, String dateOfBirth, String studentId, String collegeName, String year) {
        super(name, dateOfBirth, studentId);
        this.collegeName = collegeName;
        this.year = year;
    }

    public String getCollegeName() { return collegeName; }
    public void setCollegeName(String collegeName) { this.collegeName = collegeName; }

    public String getYear() { return year; }
    public void setYear(String year) { this.year = year; }
}


public class a{
    public static void main(String[] args) {
        // Instantiate and test Teacher object
        AssignTeacher teacher = new AssignTeacher("Alice Smith", "1980-05-12", 75000.0, "Computer Science");
        System.out.println("--- Teacher Details ---");
        System.out.println("Name: " + teacher.getName());
        System.out.println("DOB: " + teacher.getDateOfBirth());
        System.out.println("Salary: $" + teacher.getSalary());
        System.out.println("Subject: " + teacher.getSubject());
        System.out.println();

        // Instantiate and test CollegeStudent object
        CollegeStudent student = new CollegeStudent("Bob Jones", "2004-09-20", "CS101", "State University", "Second");
        System.out.println("--- College Student Details ---");
        System.out.println("Name: " + student.getName());
        System.out.println("DOB: " + student.getDateOfBirth());
        System.out.println("ID: " + student.getStudentId());
        System.out.println("College: " + student.getCollegeName());
        System.out.println("Year: " + student.getYear());
    }
}
