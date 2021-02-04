package com.example.model;

import javax.persistence.*;

@Entity
public class DocumentType {
    @Id
    private Integer code;
    @Column
    private String name;
    @Column
    private String description;

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
