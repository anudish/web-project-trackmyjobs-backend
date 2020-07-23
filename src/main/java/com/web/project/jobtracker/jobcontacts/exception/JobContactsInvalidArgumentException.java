package com.web.project.jobtracker.jobcontacts.exception;

public class JobContactsInvalidArgumentException extends Exception {
    public JobContactsInvalidArgumentException() {
        super("Please provide valid Job Contacts data.");
    }

    public JobContactsInvalidArgumentException(String message) {
        super(message);
    }

    public JobContactsInvalidArgumentException(String message, Throwable cause) {
        super(message, cause);
    }

    public JobContactsInvalidArgumentException(Throwable cause) {
        super(cause);
    }

    public JobContactsInvalidArgumentException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
