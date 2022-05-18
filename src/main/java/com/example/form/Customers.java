package com.example.form;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Customers {

    @Id
    private int id;

    private String cname;

    private String email;

    public int getId() {
        return id;
    }

    public void setId(int id) {
       this.id = id;
    }

    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Customers{" +
                "id=" + id +
                ", cname='" + cname + '\'' +
                ", email='" + email + '\'' +
                '}';
    }


}
