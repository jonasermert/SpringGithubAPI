package com.jonasermert.springgithubapi.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class GitService {
    GitHubClient gitHubClient;

    @Autowired
    public GitService(GitHubClient gitHubClient) {
        this.gitHubClient = gitHubClient;
    }

    public UserDtoGitHub getUser(String userName){
        return gitHubClient.getUser(userName);
    }
}
