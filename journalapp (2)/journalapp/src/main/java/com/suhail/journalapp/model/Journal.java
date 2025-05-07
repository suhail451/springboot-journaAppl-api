package com.suhail.journalapp.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "journals")
public class Journal {

    @Id
    private String id; // MongoDB uses String (ObjectId) by default

    private String name;
    private String content;

    public Journal() {
        // No-arg constructor is required for Spring Data MongoDB
    }

    public Journal(String name, String content) {
        this.name = name;
        this.content = content;
    }

    public Journal(String id, String name, String content) {
        this.id = id;
        this.name = name;
        this.content = content;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
