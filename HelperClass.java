package com.example.tution;

public class HelperClass {
    String name, email, phone, school, username, password;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public HelperClass(String name, String email, String phone, String school, String username, String password) {
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.school = school;
        this.username = username;
        this.password = password;
    }

    public HelperClass() {
    }
}
