

import java.util.Calendar;

public class Main {
    public static void main(String[] args) {
        AppointmentScheduler scheduler = AppointmentScheduler.getInstance();

        Calendar appointmentTime = Calendar.getInstance();
        appointmentTime.set(2023, Calendar.NOVEMBER, 29, 15, 30);
        Appointment appointment = new Appointment("Customer1", appointmentTime, "خادمة");

        boolean isScheduled = scheduler.scheduleAppointment(appointment);

        if (isScheduled) {
            System.out.println("تم جدولة الموعد بنجاح");
        } else {
            System.out.println("عذرًا الوقت المطلوب غير متاح");
        }
    }
}