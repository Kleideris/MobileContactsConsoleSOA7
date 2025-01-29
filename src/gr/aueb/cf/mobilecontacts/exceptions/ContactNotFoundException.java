package gr.aueb.cf.mobilecontacts.exceptions;

import java.io.Serial;

public class ContactNotFoundException extends Exception {
    @Serial
    private static final long serialVersionUID = 1L;

    public ContactNotFoundException(String message) {
        super(message);
    }
}
