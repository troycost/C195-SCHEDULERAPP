package model;

public class ReportMonth {
    public String appointmentMonth;
    public int TotalNumberOfAppointments;

    /**
     * @param appointmentMonth
     * @param TotalNumberOfAppointments
     */
    public ReportMonth(String appointmentMonth, int TotalNumberOfAppointments) {
        this.appointmentMonth = appointmentMonth;
        this.TotalNumberOfAppointments = TotalNumberOfAppointments;
    }

    /**
     * @return appointmentMonth
     */
    public String getAppointmentMonth() {

        return appointmentMonth;
    }

    /**
     * @return appointmentTotal
     */
    public int getTotalNumberOfAppointments() {

        return TotalNumberOfAppointments;
    }
}
