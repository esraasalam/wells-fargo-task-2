package com.wellsfargo.counselor.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
Public  class Portfolio {



    @Id
    @GeneratedValue()
    private long protfolitId;

    @Column(nullable = false)
    private Long clientId;

    @Column(nullable = false)
    private String CreationDate;

    public Portfolio() {
    }

    public Portfolio(Long clientId, String creationDate) {
        this.clientId = clientId;
        CreationDate = creationDate;
    }

    public long getProtfolitId() {
        return protfolitId;
    }

    public void setProtfolitId(long protfolitId) {
        this.protfolitId = protfolitId;
    }

    public Long getClientId() {
        return clientId;
    }

    public void setClientId(Long clientId) {
        this.clientId = clientId;
    }

    public String getCreationDate() {
        return CreationDate;
    }

    public void setCreationDate(String creationDate) {
        CreationDate = creationDate;
    }
}