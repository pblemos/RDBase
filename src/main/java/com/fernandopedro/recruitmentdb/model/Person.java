package com.fernandopedro.recruitmentdb.model;

import javax.persistence.*;
import java.sql.Date;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "persons")
public class Person {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String name;

    /*optional*/
    private Date dateOfBirth;

    /*optional*/
    private String location;

    @Column(nullable = false)
    private String email;

    @Column(nullable = false)
    private String phone;

    @OneToMany
    private Set<SingleEducation> education;

    public void addEducation(String schoolName, String certificationName, Date date, int avgMark, String notes) {
        if (education == null) {
            education = new HashSet<>();
        }
        SingleEducation singleEducation = new SingleEducation();
        singleEducation.setSchoolName(schoolName);
        singleEducation.setCertificationName(certificationName);
        singleEducation.setEndDate(date);
        singleEducation.setAvgMark(avgMark);
        singleEducation.setNotes(notes);

        education.add(singleEducation);
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
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

    public Set<SingleEducation> getEducation() {
        return education;
    }

    public void setEducation(Set<SingleEducation> education) {
        this.education = education;
    }
}
