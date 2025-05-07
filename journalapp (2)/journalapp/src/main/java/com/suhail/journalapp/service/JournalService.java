package com.suhail.journalapp.service;

import com.suhail.journalapp.repository.JournalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.suhail.journalapp.model.Journal;

import java.util.*;


@Service
public class JournalService {

@Autowired
private JournalRepository journalRepository;


//   add a journal
    public void addJournal(Journal journal){
        journalRepository.save(journal);
    }


//    get all journal at once
    public List<Journal> getAllJournal(){
        return journalRepository.findAll();
    }

//    get journal by id
    public Journal getJournalById(String id){
        return journalRepository.findById(id).orElse(null);
    }


//    delete journal by id
    public boolean deleteJournalById(String id){
        journalRepository.deleteById(id);
        return true;
    }


//    update journal by id
    public Journal updateJournal(String id, Journal updatedJournal) {
        Journal existing = journalRepository.findById(id).orElse(null);
        if (existing != null) {
            existing.setName(updatedJournal.getName());
            existing.setContent(updatedJournal.getContent());
            return journalRepository.save(existing);
        }
        return null;
    }



}




