package com.suhail.journalapp.service;

import org.springframework.stereotype.Service;
import com.suhail.journalapp.model.Journal;

import java.util.*;


@Service
public class JournalService {
    private Map<Integer ,Journal> journalMap= new HashMap<>();

//   add a journal
    public void addJournal(Journal journal){
        journalMap.put(journal.getId(),journal);

    }
//    get all journal at once
    public List<Journal> getAllJournal(){
        return new ArrayList<>(journalMap.values());
    }
//    get journal by id
    public Journal getJournalById(int id){
return journalMap.get(id);
    }
//    delete journal by id
    public boolean deleteJournalById(int id){
        return journalMap.remove(id) != null;
    }
    public void updateJournal(int id, Journal updatedJournal) {
        if (journalMap.containsKey(id)) {
            updatedJournal.setId(id); // ensure ID stays consistent
            journalMap.put(id, updatedJournal);
        }
    }



}




