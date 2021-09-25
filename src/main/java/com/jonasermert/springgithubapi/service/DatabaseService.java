package com.jonasermert.springgithubapi.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DatabaseService {

    DatabaseRepository databaseRepository;

    @Autowired
    public DatabaseService(DatabaseRepository databaseRepository) {
        this.databaseRepository = databaseRepository;
    }

    public GitUserDBEntity save(GitUserDBEntity gitUserDBEntity){
        return databaseRepository.save(gitUserDBEntity);
    }
}
