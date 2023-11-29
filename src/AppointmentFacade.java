import java.util.Calendar;

public class AppointmentFacade {


    private Appointment appointment;
    private AppointmentScheduler scheduler;

    public AppointmentFacade() {
        this.appointment = new Appointment();
        this.scheduler = AppointmentScheduler.getInstance();
    }

    public boolean handleAppointment(String customerName, Calendar appointmentTime, String appointmentType) {
        appointment.setCustomerName(customerName);
        appointment.setAppointmentTime(appointmentTime);
        appointment.setAppointmentType(appointmentType);
        return scheduler.scheduleAppointment(appointment);
    }

    public void createAndScheduleAppointment(String Customer_Name,int year,int Mounth,int day,int hour,int minute,String apptype) {
        String customerName = Customer_Name;
        Calendar appointmentTime = Calendar.getInstance();
        appointmentTime.set(year,Mounth, day, hour, minute);
        String appointmentType = apptype;
        boolean isScheduled = handleAppointment(customerName, appointmentTime, appointmentType);
        if (isScheduled) {
            System.out.println("تم جدولة الموعد بنجاح");
        } else {
            System.out.println("عذرًا الوقت المطلوب غير متاح");
        }
    }
}
