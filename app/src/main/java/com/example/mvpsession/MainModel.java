package com.example.mvpsession;

public class MainModel {

    int data;
    String ans, ques;
    long hello;
    boolean bye;


    public void setQues(String ques) {
        this.ques = ques;
    }

    public void setHello(long hello) {
        this.hello = hello;
    }

    public void setBye(boolean bye) {
        this.bye = bye;
    }

    public int getData() {
        return data;
    }

    public String getAns() {
        return ans;
    }

    public String getQues() {
        return ques;
    }

    public long getHello() {
        return hello;
    }

    public boolean isBye() {
        return bye;
    }

    public MainModel(int data, String ans, String ques, long hello, boolean bye) {
        this.data = data;
        this.ans = ans;
        this.ques = ques;
        this.hello = hello;
        this.bye = bye;
    }
}
