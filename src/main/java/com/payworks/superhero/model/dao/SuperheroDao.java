package com.payworks.superhero.model.dao;

import lombok.Data;
import org.hibernate.annotations.Type;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Date;
import java.util.List;

/**
 * @author prasa on 04-02-2018
 * @project superhero
 */
@Entity
@Data
public class SuperheroDao {
    @Id
    @GeneratedValue
    private Long id;

    private String name;

    private String pseudonym;

    private String publisher;

    private List<String> skills;

    private List<String> allies;

    @Type(type="date")
    private Date dateOfFirstAppearance;
}
