package com.jonasermert.springgithubapi.rest;

import com.jonasermert.springgithubapi.config.GithubClientConfigProperties;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class GithubClient {

    private final GitHubApi gitHubApi;
    private final GithubClientConfigProperties githubClientConfigProperties;

    @Autowired
    public GitHubClient(GithubClientConfigProperties githubClientConfigProperties){
        this.githubClientConfigProperties = githubClientConfigProperties;

    }

    public UserDtoGitHub getUser(String userName){
        return gitHubApi.getUser(getAccessToken(), userName);

    }

    private String getAccessToken() {
        return githubClientConfigProperties.getAccessToken();
    }


}
