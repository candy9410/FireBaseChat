package com.lsh2017.firebasechat;

/**
 * Created by 이소희 on 2017-09-22.
 */

public class ChatData {
    private String userName;
    private String message;
    private String date;

    public ChatData() { }

    public ChatData(String userName, String message, String date) {
        this.userName = userName;
        this.message = message;
        this.date= date;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
}
