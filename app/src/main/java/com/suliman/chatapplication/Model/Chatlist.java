package com.suliman.chatapplication.Model;


public class Chatlist {
    public String id;
    private boolean isseen;


    public Chatlist(String id, boolean isseen) {
        this.id = id;
        this.isseen = isseen;
    }

    public Chatlist() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public boolean isIsseen() {
        return isseen;
    }

    public void setIsseen(boolean isseen) {
        this.isseen = isseen;
    }

}
