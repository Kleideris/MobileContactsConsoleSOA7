package gr.aueb.cf.mobilecontacts.dto;

public class MobileContactReadOnlyDTO extends BaseDTO {
    private String firstname;
    private String lastname;
    private String phoneNumber;

    public MobileContactReadOnlyDTO() {

    }

    public MobileContactReadOnlyDTO(Long id, String firstname, String lastname, String phoneNumber) {
        setId(id);
        this.firstname = firstname;
        this.lastname = lastname;
        this.phoneNumber = phoneNumber;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }
}