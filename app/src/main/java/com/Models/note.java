package com.Models;

class note {
    private int id,color;
    private String title,body,date;
    public note(){}// default system added(is default constructor) but if there is explicit constructor
    // class  = type
    //used to initialize the object instance
    //how:invoked once only when the object creation
    public note(int id, int color, String title, String body, String date) {
        this.id = id;
        this.color = color;
        this.title = title;
        this.body = body;
        this.date = date;
    }
    //getter:for others to use
    //setter:for others to st the value
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getColor() {
        return color;
    }

    public void setColor(int color) {
        this.color = color;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
}
