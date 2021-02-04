package com.example.model;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table
public class Client {
    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer code;
    @ManyToOne
    @JoinColumn(name = "code", nullable = false, foreignKey = @ForeignKey(name = "fk_client_documentType"))
    private DocumentType documentType;
    @Column
    private String documentNumber;
    @Column
    private String fullName;
    @Column
    private LocalDateTime birthDate;
    @OneToMany(mappedBy = "code", orphanRemoval = true)
    private List<Product> products;

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public DocumentType getDocumentType() {
        return documentType;
    }

    public void setDocumentType(DocumentType documentType) {
        this.documentType = documentType;
    }

    public String getDocumentNumber() {
        return documentNumber;
    }

    public void setDocumentNumber(String documentNumber) {
        this.documentNumber = documentNumber;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public LocalDateTime getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDateTime birthDate) {
        this.birthDate = birthDate;
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }
}
