// HealthProfessional.java
public class HealthProfessional {
    private int id;
    private String name;
    private String info;  // 其他描述信息

    // 默认构造方法
    public HealthProfessional() {
        this.id = 0;
        this.name = "Unknown";
        this.info = "General info";
    }

    // 构造方法初始化所有实例变量
    public HealthProfessional(int id, String name, String info) {
        this.id = id;
        this.name = name;
        this.info = info;
    }

    // 打印健康专业人员的详情
    public void printDetails() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Info: " + info);
    }
}
