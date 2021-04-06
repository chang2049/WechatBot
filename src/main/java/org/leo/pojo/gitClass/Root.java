package org.leo.pojo.gitClass;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class Root {
    @JsonProperty("ref")
    public String getRef() {
        return this.ref;
    }

    public void setRef(String ref) {
        this.ref = ref;
    }

    String ref;

    @JsonProperty("before")
    public String getBefore() {
        return this.before;
    }

    public void setBefore(String before) {
        this.before = before;
    }

    String before;

    @JsonProperty("after")
    public String getAfter() {
        return this.after;
    }

    public void setAfter(String after) {
        this.after = after;
    }

    String after;

    @JsonProperty("repository")
    public Repository getRepository() {
        return this.repository;
    }

    public void setRepository(Repository repository) {
        this.repository = repository;
    }

    Repository repository;

    @JsonProperty("pusher")
    public Pusher getPusher() {
        return this.pusher;
    }

    public void setPusher(Pusher pusher) {
        this.pusher = pusher;
    }

    Pusher pusher;

    @JsonProperty("organization")
    public Organization getOrganization() {
        return this.organization;
    }

    public void setOrganization(Organization organization) {
        this.organization = organization;
    }

    Organization organization;

    @JsonProperty("sender")
    public Sender getSender() {
        return this.sender;
    }

    public void setSender(Sender sender) {
        this.sender = sender;
    }

    Sender sender;

    @JsonProperty("created")
    public boolean getCreated() {
        return this.created;
    }

    public void setCreated(boolean created) {
        this.created = created;
    }

    boolean created;

    @JsonProperty("deleted")
    public boolean getDeleted() {
        return this.deleted;
    }

    public void setDeleted(boolean deleted) {
        this.deleted = deleted;
    }

    boolean deleted;

    @JsonProperty("forced")
    public boolean getForced() {
        return this.forced;
    }

    public void setForced(boolean forced) {
        this.forced = forced;
    }

    boolean forced;

    @JsonProperty("base_ref")
    public Object getBase_ref() {
        return this.base_ref;
    }

    public void setBase_ref(Object base_ref) {
        this.base_ref = base_ref;
    }

    Object base_ref;

    @JsonProperty("compare")
    public String getCompare() {
        return this.compare;
    }

    public void setCompare(String compare) {
        this.compare = compare;
    }

    String compare;

    @JsonProperty("commits")
    public List<Commit> getCommits() {
        return this.commits;
    }

    public void setCommits(List<Commit> commits) {
        this.commits = commits;
    }

    List<Commit> commits;

    @JsonProperty("head_commit")
    public HeadCommit getHead_commit() {
        return this.head_commit;
    }

    public void setHead_commit(HeadCommit head_commit) {
        this.head_commit = head_commit;
    }

    HeadCommit head_commit;
}
