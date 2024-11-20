import java.util.ArrayList;

public class AppointmentManager {
    private ArrayList<Appointment> appointments;

    public AppointmentManager() {
        appointments = new ArrayList<>();
    }

    public void createAppointment(Appointment appointment) {
        appointments.add(appointment); 
    }

    public void printExistingAppointments() {
        if (appointments.isEmpty()) {
            System.out.println("No appointments available.");
        } else {
            for (Appointment appointment : appointments) {
                appointment.printDetails();
                System.out.println("------------------------------");
            }
        }
    }

    public void cancelBooking(String patientMobile) {
        boolean found = false;
        for (int i = 0; i < appointments.size(); i++) {
            Appointment appointment = appointments.get(i);
            if (appointment.getPatientMobile().equals(patientMobile)) {
                appointments.remove(i);
                System.out.println("Appointment canceled for mobile: " + patientMobile);
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("No appointment found for mobile: " + patientMobile);
        }
    }
}
