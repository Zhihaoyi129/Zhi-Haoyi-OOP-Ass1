public class GeneralPractitioner extends HealthProfessional {
    private String specialty; // 专长

    // 默认构造方法
    public GeneralPractitioner() {
        super(); // 调用父类的默认构造方法
        this.specialty = "General Medicine";
    }

    // 初始化父类和当前类的实例变量
    public GeneralPractitioner(int id, String name, String info, String specialty) {
        super(id, name, info); // 调用父类构造方法
        this.specialty = specialty;
    }

    // 打印详细信息，包括专业类型
    public void printDetails() {
        super.printDetails(); // 调用父类的 printDetails
        System.out.println("Specialty: " + specialty);
    }
}
