import java.util.ArrayList;
//使用 ArrayList 存储所有预约对象。
//提供了创建、打印和取消预约的功能。
public class AppointmentManager {
    // 存储预约对象的列表
    private ArrayList<Appointment> appointments;

    public AppointmentManager() {
        appointments = new ArrayList<>();// 初始化空的预约列表
    }

    public void createAppointment(Appointment appointment) {
        appointments.add(appointment);// 将预约添加到列表
    }

    public void printExistingAppointments() { // 检查是否有预约
        if (appointments.isEmpty()) {
            System.out.println("No appointments available.");// 没有预约的话 打印提示
        } else {
            for (Appointment appointment : appointments) {
                appointment.printDetails();// 打印每个预约的详细信息
                System.out.println("------------------------------");// 用来分隔
            }
        }
    }

    public void cancelBooking(String patientMobile) {
        boolean found = false;// 用来标记是否找到匹配的预约（手机号）
        for (int i = 0; i < appointments.size(); i++) {
            Appointment appointment = appointments.get(i);
            if (appointment.getPatientMobile().equals(patientMobile)) {  // 使用 getter 方法
                appointments.remove(i);
                System.out.println("Appointment canceled for mobile: " + patientMobile);
                found = true;
                break;
            }
        }
        if (!found) {// 如果没有找到匹配的手机号
            System.out.println("No appointment found for mobile: " + patientMobile);
        }
    }
}
