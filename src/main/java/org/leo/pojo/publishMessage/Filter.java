package org.leo.pojo.publishMessage;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Filter {
    @JsonProperty("is_to_all")
    public boolean getIs_to_all() {
        return this.is_to_all;
    }

    public void setIs_to_all(boolean is_to_all) {
        this.is_to_all = is_to_all;
    }

    boolean is_to_all;

    @JsonProperty("tag_id")
    public int getTag_id() {
        return this.tag_id;
    }

    public void setTag_id(int tag_id) {
        this.tag_id = tag_id;
    }

    int tag_id;
}
