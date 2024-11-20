public class AssignmentOne {
    public static void main(String[] args) {
        // 创建 AppointmentManager 对象（管理所有预约）
        AppointmentManager manager = new AppointmentManager();

        // 创建医生对象
        GeneralPractitioner gp1 = new GeneralPractitioner(1, "Dr. James", "Family Doctor", "Pediatrics");
        GeneralPractitioner gp2 = new GeneralPractitioner(2, "Dr. Carry", "General Medicine", "Cardiology");
        Nurse nurse1 = new Nurse(3, "Nurse Black", "Resident nurse", "inpatient department");

        // 打印医生信息
        System.out.println("Health Professionals:");
        gp1.printDetails();
        System.out.println("------------------------------");
        gp2.printDetails();
        System.out.println("------------------------------");
        nurse1.printDetails();
        System.out.println("------------------------------");

        // 创建预约
        System.out.println("Creating appointments...");
        Appointment app1 = new Appointment("Klay Thompson", "73371411314", "08:00", gp1);
        Appointment app2 = new Appointment("Kyrie Irving", "20111160921", "09:30", nurse1);
        Appointment app3 = new Appointment("Alice Smith", "39830712919", "10:00", gp2);

        // 将预约添加到管理器
        manager.createAppointment(app1);
        manager.createAppointment(app2);
        manager.createAppointment(app3);

        // 打印现有预约
        System.out.println("Printing existing appointments:");
        manager.printExistingAppointments();

        // 取消一个预约
        System.out.println("Cancelling an appointment...");
        manager.cancelBooking("1234567890");

        // 打印更新后的预约
        System.out.println("Updated appointments:");
        manager.printExistingAppointments();
    }
}
