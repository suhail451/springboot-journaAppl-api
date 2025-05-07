package com.suhail.journalapp.repository;
import com.suhail.journalapp.model.Journal;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface JournalRepository extends MongoRepository<Journal,String>{

}
