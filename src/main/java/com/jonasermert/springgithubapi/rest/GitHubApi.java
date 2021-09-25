package com.jonasermert.springgithubapi.rest;

import org.springframework.data.repository.query.Param;

public class GitHubApi {

    @Headers(
            "Authorization: Bearer {" + ACCESS_TOKEN_PARAM + "}"
    )
    public interface GitHubApi {

        String ACCESS_TOKEN_PARAM = "access-token";

        @RequestLine("GET /users/{username}")
        UserDtoGitHub getUser(@Param(ACCESS_TOKEN_PARAM) String accessToken,
                              @Param("username") String userName);
}
