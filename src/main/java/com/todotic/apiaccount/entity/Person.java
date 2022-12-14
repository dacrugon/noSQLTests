package com.todotic.apiaccount.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.LocalDateTime;
import java.util.Date;

@Entity
@Table(name = "people")
@Getter
@Setter
public class Person {
    @Id
    @Column(name="idperson")
    private long id;
    private String name;
    @Column(name = "last_name")
    private String lastName;
    @Column(name = "identification_type")
    private String identificationType;
    @Column(name = "identification_number")
    private String identificationNumber;
    @Column(name = "date_birth")
    @JsonFormat(shape= JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy")
    private Date dateBirth;
    @Column(name = "city_birth")
    private String cityBirth;

    @Column(name = "create_at")
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime createdDate = LocalDateTime.now();

}
