

import java.util.Calendar;

public class Main {
    public static void main(String[] args) {

        AppointmentFacade facade = new AppointmentFacade();
        facade.createAndScheduleAppointment("Refat",2022,12,1,5,15,"cook");
        facade.createAndScheduleAppointment("Refat",2022,12,1,5,15,"cook");

    }
}