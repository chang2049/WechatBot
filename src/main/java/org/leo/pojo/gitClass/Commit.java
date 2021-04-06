package org.leo.pojo.gitClass;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Date;
import java.util.List;

public class Commit {
    @JsonProperty("id")
    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }

    String id;

    @JsonProperty("tree_id")
    public String getTree_id() {
        return this.tree_id;
    }

    public void setTree_id(String tree_id) {
        this.tree_id = tree_id;
    }

    String tree_id;

    @JsonProperty("distinct")
    public boolean getDistinct() {
        return this.distinct;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    boolean distinct;

    @JsonProperty("message")
    public String getMessage() {
        return this.message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    String message;

    @JsonProperty("timestamp")
    public Date getTimestamp() {
        return this.timestamp;
    }

    public void setTimestamp(Date timestamp) {
        this.timestamp = timestamp;
    }

    Date timestamp;

    @JsonProperty("url")
    public String getUrl() {
        return this.url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    String url;

    @JsonProperty("author")
    public Author getAuthor() {
        return this.author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    Author author;

    @JsonProperty("committer")
    public Committer getCommitter() {
        return this.committer;
    }

    public void setCommitter(Committer committer) {
        this.committer = committer;
    }

    Committer committer;

    @JsonProperty("added")
    public List<Object> getAdded() {
        return this.added;
    }

    public void setAdded(List<Object> added) {
        this.added = added;
    }

    List<Object> added;

    @JsonProperty("removed")
    public List<Object> getRemoved() {
        return this.removed;
    }

    public void setRemoved(List<Object> removed) {
        this.removed = removed;
    }

    List<Object> removed;

    @JsonProperty("modified")
    public List<String> getModified() {
        return this.modified;
    }

    public void setModified(List<String> modified) {
        this.modified = modified;
    }

    List<String> modified;
}
