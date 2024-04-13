import java.util.Scanner;

class Student {
    int rollNo;
    String collegeName;
    String branch;
    String name;
    double[] marks;
    
    public Student(int rollNo, String collegeName, String branch, String name) {
        this.rollNo = rollNo;
        this.collegeName = collegeName;
        this.branch = branch;
        this.name = name;
    }
    
    public void setMarks(double[] marks) {
        this.marks = marks;
    }
    
    public double calculatePercentage() {
        double totalMarks = 0;
        for (double mark : marks) {
            totalMarks += mark;
        }


 class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        Student[] students = new Student[4];
        
        for (int i = 0; i < 4; i++) {
            System.out.println("Enter details for student " + (i+1));
            System.out.print("Roll No: ");
            int rollNo = scanner.nextInt();
            scanner.nextLine();
            System.out.print("College Name: ");
            String collegeName = scanner.nextLine();
            System.out.print("Branch: ");
            String branch = scanner.nextLine();
            System.out.print("Name: ");
            String name = scanner.nextLine();
            
            students[i] = new Student(rollNo, collegeName, branch, name);
            
            if (branch.equalsIgnoreCase("CSE")) {
                double[] marks = new double[3];
                System.out.println("Enter marks for 3 subjects:");
                for (int j = 0; j < 3; j++) {
                    System.out.print("Subject " + (j+1) + ": ");
                    marks[j] = scanner.nextDouble();
                }
                students[i].setMarks(marks);
            }
        }
        
        System.out.println("\nDetails of Students:");
        for (int i = 0; i < 4; i++) {
            System.out.println("Student " + (i+1));
            System.out.println("Roll No: " + students[i].rollNo);
            System.out.println("College Name: " + students[i].collegeName);
            System.out.println("Branch: " + students[i].branch);
            System.out.println("Name: " + students[i].name);
            if (students[i].branch.equalsIgnoreCase("CSE")) {
                System.out.println("Percentage: " + students[i].calculatePercentage());
            }
            System.out.println();
        }
