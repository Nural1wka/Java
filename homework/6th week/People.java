public class People {
    public static void main(String[] args){
        Person negr = new Person("Alina", "Bew");
        System.out.println(negr);
        Student graphDrakula = new Student("Ben", "Moscow", "Computer Science", 3, 2.28);
        System.out.println(graphDrakula);
        Staff lord = new Staff("Galina", "Argentina", "N3", 200000.222);
        System.out.println(lord);
    }
}
class Person{
    private String name;
    private String address;
    public Person(String name, String address){
        this.name = name;
        this.address = address;
    }
    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Person[ name = " + name + ", address = " + address + " ]";
    }
}
class Student extends Person {
    private String program;
    private int year;
    private double fee;

    public Student(String name, String address, String program, int year, double fee) {
        super(name, address);
        this.program = program;
        this.year = year;
        this.fee = fee;
    }

    public String getProgram() {
        return program;
    }

    public int getYear() {
        return year;
    }

    public double getFee() {
        return fee;
    }

    public void setProgram(String program) {
        this.program = program;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setFee(double fee) {
        this.fee = fee;
    }

    @Override
    public String toString() {
        return "Student[" + super.toString() + ", program = " + program + ", year = " + year + ", fee = " + fee + " ]";
    }
}
class Staff extends Person{
    private String school;
    private double pay;
    public Staff(String name, String address, String school, double pay){
        super(name, address);
        this.school = school;
        this.pay = pay;
    }

    public String getSchool() {
        return school;
    }

    public double getPay() {
        return pay;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public void setPay(double pay) {
        this.pay = pay;
    }

    @Override
    public String toString() {
        return "Staff[" + super.toString() + ", school = " + school + ", pay = " + pay + " ]";
    }
}