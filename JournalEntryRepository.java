package net.engineeringdigest.journalApp.repository;

import net.engineeringdigest.journalApp.controller.entity.JournalEntry;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface JournalEntryRepository extends MongoRepository<JournalEntry, ObjectId> {

}
