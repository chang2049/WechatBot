package org.leo.pojo.publishMessage;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Text {
    @JsonProperty("content")
    public String getContent() {
        return this.content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    String content;
}
