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

    public void printCourseDetails(){
        System.out.println("Course: " + courseName + "| Enrolled: " + studentCount);
    }


    static void main(String[] args) {
        Task1 c1 = new Task1("Java", 80);
        Task1 c2 = new Task1("Database", 100);
        Task1 c3 = new Task1("Web", 70);

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
