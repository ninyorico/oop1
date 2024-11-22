public class Polymorphism{
    public static void main(String[] args) {
    Student student = new Student("Niño", "City of Calaca, Batangas", "BSIT",2);
    System.out.println("Student Name: " + student.getName());
    System.out.println("Student Address: " + student.getAddress());
    System.out.println("Student Program: " + student.getProgram());
    System.out.println("Student Year: " + student.getYear());
    System.out.println(student.toString());
    System.out.println("");
    Staff staff = new Staff("Mat", "City of Calaca, Dacanlao, Batangas", "BSU",500);
    System.out.println("Staff Name: " + staff.getName());
    System.out.println("Staff Address: " + staff.getAddress());
    System.out.println("Staff School: " + staff.getSchool());
    System.out.printf("Staff Salary: %.2f \n",staff.getSalary());
    System.out.println(staff.toString());
}
}