public class ClassDay1 {
  public static void main(String[] args) {
    //
    System.out.println("This Class for demo purpose created");

    //first object of student class is created below:
    Student object1 =  new Student();
    object1.setName("Rohit");
    object1.setRollNo(1);
    object1.setStandard(5);
    object1.setMarks(200);

    //Second object of student class is created below:
    Student object2= new Student();
    object2.setName("Prasad");
    object2.setRollNo(2);
    object2.setStandard(5);
    object2.setMarks(230);

    System.out.println("-----------------------------------------------------------");
    System.out.println("Name:: "+object1.getName());
    System.out.println("-----------------------------------------------------------");
  }
}
