package org.leo.pojo.publishMessage;

 import com.fasterxml.jackson.databind.ObjectMapper; // version 2.11.1
 import com.fasterxml.jackson.annotation.JsonProperty;

public class PublishMessage{
    @JsonProperty("filter")
    public Filter getFilter() {
        return this.filter; }
    public void setFilter(Filter filter) {
        this.filter = filter; }
    Filter filter;
    @JsonProperty("text")
    public Text getText() {
        return this.text; }
    public void setText(Text text) {
        this.text = text; }
    Text text;
    @JsonProperty("msgtype")
    public String getMsgtype() {
        return this.msgtype; }
    public void setMsgtype(String msgtype) {
        this.msgtype = msgtype; }
    String msgtype;
}
