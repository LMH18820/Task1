//Class to demonstrate local, instance, and static variable scopes in java
public class Task1 {
    static int totalStudents = 0;

    String courseName;
    int studentCount;

    public Task1(String name, int count){
        courseName = name;
        studentCount = count;
        totalStudents = totalStudents + count;
    }

    public void showPassRate(int passedStudents){
        double passRate = (passedStudents * 100.0) / studentCount;
        System.out.println("Pass rate for " + courseName + ": " + passRate + "%");
    }


    //Main method to create course objects and test variable scope outputs
    static void main(String[] args) {
        Task1 c1 = new Task1("Java OOP", 85);
        Task1 c2 = new Task1("Database System", 95);
        Task1 c3 = new Task1("Web Development", 75);

        System.out.println(c1.courseName + " has " + c1.studentCount + " students. ");
        System.out.println(c2.courseName + " has " + c2.studentCount + " students.");
        System.out.println(c3.courseName + " has " + c3.studentCount + " students.");

        System.out.println("--------------------------------------");

        c1.showPassRate(74);
        c2.showPassRate(44);
        c3.showPassRate(65);

        System.out.println("--------------------------------------");

        System.out.println("Total university students: " + Task1.totalStudents);
    }
}
