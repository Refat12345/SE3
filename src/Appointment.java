import java.util.Calendar;

public class Appointment {

    private String customerName;
    private Calendar appointmentTime;
    private String appointmentType;

    public Appointment(String customerName, Calendar appointmentTime, String appointmentType) {
        this.customerName = customerName;
        this.appointmentTime = appointmentTime;
        this.appointmentType = appointmentType;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public Calendar getAppointmentTime() {
        return appointmentTime;
    }

    public void setAppointmentTime(Calendar appointmentTime) {
        this.appointmentTime = appointmentTime;
    }

    public String getAppointmentType() {
        return appointmentType;
    }

    public void setAppointmentType(String appointmentType) {
        this.appointmentType = appointmentType;
    }
}
