package com.driver.model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Driver{


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int DriverId;

    private String mobile;

    private String password;

    @OneToOne
    @JoinColumn
    Cab cab;

    @OneToMany
    List<TripBooking> tripList = new ArrayList<>();


    public Driver() {
    }

    public Driver(int driverId, String mobile, String password) {
        DriverId = driverId;
        this.mobile = mobile;
        this.password = password;
    }

    public int getDriverId() {
        return DriverId;
    }

    public void setDriverId(int driverId) {
        DriverId = driverId;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}