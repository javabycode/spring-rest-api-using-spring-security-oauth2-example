package com.javabycode.model;

import java.io.Serializable;

public class Fruit implements Serializable {
	
	private static final long serialVersionUID = 691914827490230925L;
	
	private long id;
    private String name;
    private String produceBy;
    private String note;

    public Fruit() {
    }

    public Fruit(long id, String name, String produceBy, String note) {
        this.id = id;
        this.name = name;
        this.produceBy = produceBy;
        this.note = note;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setName(String name) {
		this.name = name;
	}
    
    public void setNote(String note) {
		this.note = note;
	}
    
    public void setProduceBy(String produceBy) {
		this.produceBy = produceBy;
	}
    
    public String getName() {
		return name;
	}
    
    public String getNote() {
		return note;
	}
    
    public String getProduceBy() {
		return produceBy;
	}
}