package com.example.domain;

public class School {

    private String shcoolName;

    public String getShcoolName() {
        return shcoolName;
    }

    public void setShcoolName(String shcoolName) {
        this.shcoolName = shcoolName;
    }

    @Override
    public String toString() {
        return "School{" +
                "shcoolName='" + shcoolName + '\'' +
                '}';
    }
}
