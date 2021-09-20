package org.arfna.method.common;

public enum EValidationMessage {

    INVALID_API(0, "The API called does not exist"),
    SUBSCRIBER_ALREADY_EXISTS(1, "The subscriber is already subscribed and is registered"),
    SUBSCRIBER_NEEDS_TO_CREATE_PASSWORD(2, "The subscriber has an email registered, but no password"),
    PASSWORD_NOT_LONG_ENOUGH(3, "The password must be at least 12 characters long"),
    PASSWORD_ONE_CAPITAL_CHAR(4, "The password must contain at least 1 capital letter"),
    PASSWORD_ONE_LOWERCASE_CHAR(5, "The password must contain at least 1 lowercase letter"),
    PASSWORD_NUMBER(6, "The password must contain at least 1 number"),
    PASSWORD_SPECIAL_CHAR(7, "The password must contain at least one special characters - {!@#$%^&*()<>+}"),
    LOGIN_INCORRECT(8, "The login information provided is incorrect")
    ;

    private int code;
    private String message;

    EValidationMessage(int code, String message) {
        this.code = code;
        this.message = message;
    }

    public int getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }
}
