package com.corejavapractice.JavaPractice.exceptionhandling.centralizedexceptionhandling;

//@Value -- This makes the class immutable and generates everything (Java 8 style)
//What it replaces (The Boilerplate)
//When you compile the code above, Lombok generates all of this for you:
//Final Class: The class itself is marked final (cannot be inherited).
//Private Final Fields: Every field becomes private final.
//All-Args Constructor: A constructor that initializes every field.
//Getters: getStatus(), getMessage(), etc.
//equals() and hashCode(): Proper implementations based on the fields.
//toString(): A nice string representation (e.g., ErrorResponse(status=404, ...)).
//No Setters: Since fields are final, no setters are generated
public class ErrorResponse {
    private final int status;
    private final String message;
    private final long timeStamp;

    public ErrorResponse(int status, String message, long timeStamp){
        this.status = status;
        this.message = message;
        this.timeStamp = timeStamp;
    }

    @Override
    public String toString() {
        return "ErrorResponse{" +
                "status=" + status +
                ", message='" + message + '\'' +
                ", code=" + timeStamp +
                '}';
    }

    public int getStatus(){ return status; }
    public String getMessage(){ return message; }
    public long getTimeStamp(){ return timeStamp; }
}
