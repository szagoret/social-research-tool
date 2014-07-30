package com.entity;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class AuthorDetails {
    @Column(name = "street_home")
    private String streetHome;

    @Column(name = "cpas")
    private String cpas;

    @Column(name = "mobil_number")
    private String mobilNumber;

    @Column(name = "phone_number")
    private String phoneNumber;

    @Column(name = "nr_pasport")
    private String nbPasport;

    public String getStreetHome() {
	return streetHome;
    }

    public void setStreetHome(String streetHome) {
	this.streetHome = streetHome;
    }

    public String getCpas() {
	return cpas;
    }

    public void setCpas(String cpas) {
	this.cpas = cpas;
    }

    public String getMobilNumber() {
	return mobilNumber;
    }

    public void setMobilNumber(String mobilNumber) {
	this.mobilNumber = mobilNumber;
    }

    public String getPhoneNumber() {
	return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
	this.phoneNumber = phoneNumber;
    }

    public String getNbPasport() {
	return nbPasport;
    }

    public void setNbPasport(String nbPasport) {
	this.nbPasport = nbPasport;
    }

}
