package com.entity;

import java.util.Date;

import javax.persistence.AttributeOverride;
import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "expert_users")
@AttributeOverride(name = "id", column = @Column(name = "uid"))
public class Author extends BaseEntity {

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "father_name")
    private String fatherName;

    @Temporal(TemporalType.DATE)
    @Column(name = "birth_date")
    private Date birthDate;

    @Embedded
    private AuthorDetails authorDetails;

    public String getFirstName() {
	return firstName;
    }

    public void setFirstName(String firstName) {
	this.firstName = firstName;
    }

    public String getLastName() {
	return lastName;
    }

    public void setLastName(String lastName) {
	this.lastName = lastName;
    }

    public String getFatherName() {
	return fatherName;
    }

    public void setFatherName(String fatherName) {
	this.fatherName = fatherName;
    }

    public Date getBirthDate() {
	return birthDate;
    }

    public void setBirthDate(Date birthDate) {
	this.birthDate = birthDate;
    }

    public AuthorDetails getAuthorDetails() {
	return authorDetails;
    }

    public void setAuthorDetails(AuthorDetails authorDetails) {
	this.authorDetails = authorDetails;
    }

}
