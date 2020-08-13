package com.david0926.edcansummer;

public class MemoModel {
    private String time, text, email;

    public MemoModel(){}

    public MemoModel(String time, String text, String email) {
        this.time = time;
        this.text = text;
        this.email = email;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
