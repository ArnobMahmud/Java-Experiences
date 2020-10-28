package Assignment;
class Student{
    
    int id, semrster, age;
    double gpa;
    String name, nationality;
    Student(){

    }

    public void printData(String name, int id, int semester, int age, double gpa, String nationality) {
        
        System.out.println("Student Nmae :" + name);
        System.out.println("ID :" + id);
        System.out.println("Semester :" + semester);
        System.out.println("Age :" + age);
        System.out.println("GPA :" + gpa);
        System.out.println("Nationality :" + nationality);

    }
}