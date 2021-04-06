package org.leo.pojo.gitClass;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Organization {
    @JsonProperty("login")
    public String getLogin() {
        return this.login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    String login;

    @JsonProperty("id")
    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    int id;

    @JsonProperty("node_id")
    public String getNode_id() {
        return this.node_id;
    }

    public void setNode_id(String node_id) {
        this.node_id = node_id;
    }

    String node_id;

    @JsonProperty("url")
    public String getUrl() {
        return this.url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    String url;

    @JsonProperty("repos_url")
    public String getRepos_url() {
        return this.repos_url;
    }

    public void setRepos_url(String repos_url) {
        this.repos_url = repos_url;
    }

    String repos_url;

    @JsonProperty("events_url")
    public String getEvents_url() {
        return this.events_url;
    }

    public void setEvents_url(String events_url) {
        this.events_url = events_url;
    }

    String events_url;

    @JsonProperty("hooks_url")
    public String getHooks_url() {
        return this.hooks_url;
    }

    public void setHooks_url(String hooks_url) {
        this.hooks_url = hooks_url;
    }

    String hooks_url;

    @JsonProperty("issues_url")
    public String getIssues_url() {
        return this.issues_url;
    }

    public void setIssues_url(String issues_url) {
        this.issues_url = issues_url;
    }

    String issues_url;

    @JsonProperty("members_url")
    public String getMembers_url() {
        return this.members_url;
    }

    public void setMembers_url(String members_url) {
        this.members_url = members_url;
    }

    String members_url;

    @JsonProperty("public_members_url")
    public String getPublic_members_url() {
        return this.public_members_url;
    }

    public void setPublic_members_url(String public_members_url) {
        this.public_members_url = public_members_url;
    }

    String public_members_url;

    @JsonProperty("avatar_url")
    public String getAvatar_url() {
        return this.avatar_url;
    }

    public void setAvatar_url(String avatar_url) {
        this.avatar_url = avatar_url;
    }

    String avatar_url;

    @JsonProperty("description")
    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    String description;
}
