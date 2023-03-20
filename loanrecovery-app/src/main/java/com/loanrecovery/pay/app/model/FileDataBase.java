package com.loanrecovery.pay.app.model;

import javax.persistence.*;

@Entity
@Table(name = "files")
public class FileDataBase {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false, updatable = false)
    private Long id;

    private String name;

    private String type;

    private Integer file_priority;

    private Boolean processed;

    @Lob
    private byte[] data;

    public FileDataBase() {
    }

    public FileDataBase(
            String name, String type, byte[] data, Integer file_priority, Boolean processed) {
        this.name = name;
        this.type = type;
        this.data = data;
        this.file_priority = file_priority;
        this.processed = processed;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public byte[] getData() {
        return data;
    }

    public void setData(byte[] data) {
        this.data = data;
    }

    public Integer getFile_priority() {
        return file_priority;
    }

    public void setFile_priority(Integer file_priority) {
        this.file_priority = file_priority;
    }

    public Boolean getProcessed() {
        return processed;
    }

    public void setProcessed(Boolean processed) {
        this.processed = processed;
    }

}

