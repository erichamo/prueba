package com.example.model;

import javax.persistence.*;

@Entity
public class Claim {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer code;
    @Column
    private String reason;
    @Column
    private String description;
    @ManyToOne
    @JoinColumn(name = "code", nullable = false, foreignKey = @ForeignKey(name = "fk_claim_client"))
    private Client client;
    @ManyToOne
    @JoinColumn(name = "code", nullable = false, foreignKey = @ForeignKey(name = "fk_claim_product"))
    private Product product;

    public Integer getCode() { return code; }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }
}
