/**
 * Appointment 类用于表示患者与健康专业人员之间的预约信息。
 * 包含患者的基本信息、预约时间以及与之关联的医生对象。
 */
public class Appointment {
    private String patientName;//名字
    private String patientMobile;//手机号，用于预约（唯一标识）
    private String timeSlot;//时间
    private HealthProfessional doctor;//医生等

    // 构造方法 来初始化一个预约对象。
    public Appointment(String patientName, String patientMobile, String timeSlot, HealthProfessional doctor) {
        this.patientName = patientName;
        this.patientMobile = patientMobile;
        this.timeSlot = timeSlot;
        this.doctor = doctor;
    }

    // Getter 方法
    public String getPatientMobile() {
        return patientMobile;//返回患者手机号
    }

    // 打印预约信息的方法
    public void printDetails() {
        System.out.println("Patient Name: " + patientName);
        System.out.println("Patient Mobile: " + patientMobile);
        System.out.println("Time Slot: " + timeSlot);
        doctor.printDetails();
    }
}
