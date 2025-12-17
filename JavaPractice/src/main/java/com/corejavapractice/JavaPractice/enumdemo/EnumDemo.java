package com.corejavapractice.JavaPractice.enumdemo;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
enum STATUS{
    SUCCESS(200,"Data Fetched Successfully"),
    CREATED(201,"Resource Created"),
    ACCEPTED(202,"Request Accepted"),
    BAD_REQUEST(400,"Bad Request"),
    UNAUTHORIZED(401,"Unauthorized Access"),
    FORBIDDEN(403,"Forbidden Access"),
    NOT_FOUND(404,"Resource Not Found"),
    INTERNAL_SERVER_ERROR(500,"Internal Server Error"),
    SERVICE_UNAVAILABLE(503,"Service Unavailable");

    private int code;
    private String message;
}

public class EnumDemo {
    public static void main(String[] args) {
        System.out.println("Success:"+STATUS.SUCCESS.getCode()+" - "+STATUS.SUCCESS.getMessage());
        for(STATUS status : STATUS.values()){
            System.out.println(status+" : "+status.getCode()+" - "+status.getMessage());
        }
    }
}
