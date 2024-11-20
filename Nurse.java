// Nurse.java
public class Nurse extends HealthProfessional {
    private String department; // 所属科室

    // 默认构造方法
    public Nurse() {
        super();
        this.department = "General Nursing";
    }

    // 初始化父类和当前类的实例变量
    public Nurse(int id, String name, String info, String department) {
        super(id, name, info);
        this.department = department;
    }

    // 打印详细信息，包括科室
    public void printDetails() {
        super.printDetails();
        System.out.println("Department: " + department);
    }
}
