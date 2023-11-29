import java.util.ArrayList;
import java.util.Calendar;

public class AppointmentScheduler {
    private static AppointmentScheduler instance;
    private ArrayList<Appointment> appointments;

    private AppointmentScheduler() {
        this.appointments = new ArrayList<>();
    }

    public static AppointmentScheduler getInstance() {
        if (instance == null) {
            instance = new AppointmentScheduler();
        }
        return instance;
    }

    public boolean scheduleAppointment(Appointment appointment) {
        if (isAvailable(appointment.getAppointmentTime())) {
            appointments.add(appointment);
            return true;
        } else {
            return false;
        }
    }

    public boolean isAvailable(Calendar desiredTime) {
        for (Appointment appointment : appointments) {
            if (appointment.getAppointmentTime().equals(desiredTime)) {
                return false;
            }
        }
        return true;
    }
}
