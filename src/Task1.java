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


    static void main(String[] args) {
        Task1 c1 = new Task1("Java", 80);
        Task1 c2 = new Task1("Database", 100);
        Task1 c3 = new Task1("Web", 70);

        System.out.println("Course Details ->" + c1.courseName + " | Total: " + c1.studentCount);
        System.out.println("Course Details ->" + c2.courseName + " | Total: " + c2.studentCount);
        System.out.println("Course Details ->" + c3.courseName + " | Total: " + c3.studentCount);

        System.out.println("--------------------------------------");

        c1.showPassRate(74);
        c2.showPassRate(44);
        c3.showPassRate(65);

        System.out.println("--------------------------------------");

        System.out.println("Total university students: " + Task1.totalStudents);
    }
}
