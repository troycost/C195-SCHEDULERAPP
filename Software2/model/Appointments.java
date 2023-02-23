package model;

import java.time.LocalDateTime;

public class Appointments {
    private int appointmentID;
    private String TitleForAppointment;
    private String DescriptionForAppointment;
    private String LocationForAppointment;
    private String TypeOfAppointment;
    private LocalDateTime start;
    //private String start;
    private LocalDateTime end;
    public int customerID;
    public int userID;
    public int contactID;

    public Appointments(int appointmentID, String TitleForAppointment, String DescriptionForAppointment,
                        String LocationForAppointment, String TypeOfAppointment, LocalDateTime start, LocalDateTime end, int customerID,
                        int userID, int contactID) {
        this.appointmentID = appointmentID;
        this.TitleForAppointment = TitleForAppointment;
        this.DescriptionForAppointment = DescriptionForAppointment;
        this.LocationForAppointment = LocationForAppointment;
        this.TypeOfAppointment = TypeOfAppointment;
        this.start = start;
        this.end = end;
        this.customerID = customerID;
        this.userID = userID;
        this.contactID = contactID;
    }

    /**
     *
     * @return appointmentID
     */
    public int getAppointmentID() {

        return appointmentID;
    }

    /**
     *
     * @return appointmentTitle
     */
    public String getTitleForAppointment() {

        return TitleForAppointment;
    }

    /**
     *
     * @return appointmentDescription
     */
    public String getDescriptionForAppointment() {

        return DescriptionForAppointment;
    }

    /**
     *
     * @return appointmentLocation
     */
    public String getLocationForAppointment() {

        return LocationForAppointment;
    }

    /**
     *
     * @return appointmentType
     */
    public String getTypeOfAppointment() {

        return TypeOfAppointment;
    }

    
    /**
     *
     * @return start
     */
    public LocalDateTime getStart() {
        System.out.println("start " + start);

        return start;
    }



    /**
     *
     * @return end
     */
    public LocalDateTime getEnd() {

        return end;
    }

    /**
     *
     * @return customerID
     */
    public int getCustomerID () {

        return customerID;
    }

    /**
     *
     * @return userID
     */
    public int getUserID() {

        return userID;
    }

    /**
     *
     * @return contactID
     */
    public int getContactID() {

        return contactID;
    }

}

