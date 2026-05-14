package com.example.holamundorest;

public class ApiResponse {

    private final String message;
    private final String version;
    private final long timestamp;
    private final boolean success;

    public ApiResponse(String message, String version, long timestamp, boolean success) {
        this.message = message;
        this.version = version;
        this.timestamp = timestamp;
        this.success = success;
    }

    public String getMessage() {
        return message;
    }

    public String getVersion() {
        return version;
    }

    public long getTimestamp() {
        return timestamp;
    }

    public boolean isSuccess() {
        return success;
    }
}
