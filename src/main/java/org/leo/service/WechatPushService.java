package org.leo.service;


import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import net.sf.json.JSONObject;
import org.leo.pojo.AccessToken;
import org.leo.pojo.publishMessage.Filter;
import org.leo.pojo.publishMessage.PublishMessage;
import org.leo.pojo.publishMessage.Text;
import org.leo.util.CommonUtil;

public class WechatPushService {
//    private String appID = "wx435d4ed3ea3b10d7";
//    private String appSecret = "7ecc2e48be75d319d5ee75bfacc79d3e";

    private String appID = "wx40a2826d78fc688e";
    private String appSecret = "c26aef51cc15927f4f1f8b8e49b9db14";
//    private String accessToken = null;
//    http请求方式: POST https://api.weixin.qq.com/cgi-bin/message/mass/sendall?access_token=ACCESS_TOKEN

    public String prepareMessage(String str) throws JsonProcessingException {
//        AccessToken accessToken = CommonUtil.getToken(appID,appSecret);
        PublishMessage publishMessage = new PublishMessage();
        Filter filter = new Filter();
        Text text = new Text();
        filter.setIs_to_all(false);
        filter.setTag_id(1);
        text.setContent("str");
        publishMessage.setMsgtype("text");
        publishMessage.setFilter(filter);
        publishMessage.setText(text);

        ObjectMapper objectMapper = new ObjectMapper();
        String s = objectMapper.writeValueAsString(publishMessage);
        return s;

    }

    public void publishMessage(String str){
        String reqUrl = "https://api.weixin.qq.com/cgi-bin/message/mass/sendall?access_token=ACCESS_TOKEN";
        AccessToken accessToken = CommonUtil.getToken(appID,appSecret);
        reqUrl = reqUrl.replace("ACCESS_TOKEN",accessToken.getAccessToken());
        JSONObject post = CommonUtil.httpsRequest(reqUrl, "POST", str);
        System.out.println(post.get("errmsg"));
    }


    public void tempPush(String user, String name, String message, String url){
        String s = "{\n" +
                "\n" +
                "    \"touser\":\""+user+"\",\n" +
                "\n" +
                "    \"template_id\":\"0lJsaIKPAp4v1ArVuvWREEH5LFzzj6UrX4e5l-jgHGM\",\n" +
                "\"url\":\""+url+"\",\n" +
                "\n" +
                "    \"topcolor\":\"#FF0000\",\n" +
                "\n" +
                "    \"data\":{\n" +
                "\n" +
                "            \"Name\": {\n" +
                "\n" +
                "                \"value\":\""+name+"\",\n" +
                "\n" +
                "                \"color\":\"#173177\"\n" +
                "\n" +
                "            },\n" +
                "\n" +
                "            \"Message\":{\n" +
                "\n" +
                "                \"value\":\""+message+"\",\n" +
                "\n" +
                "                \"color\":\"#173177\"\n" +
                "\n" +
                "            }\n" +
                "\n" +
                "    }\n" +
                "\n" +
                "}";
//        System.out.println(s);

        String reqUrl = "https://api.weixin.qq.com/cgi-bin/message/template/send?access_token=ACCESS_TOKEN";
        AccessToken accessToken = CommonUtil.getToken(appID,appSecret);
        reqUrl = reqUrl.replace("ACCESS_TOKEN",accessToken.getAccessToken());
        JSONObject post = CommonUtil.httpsRequest(reqUrl, "POST", s);
//        System.out.println(post.get("errcode"));
//        System.out.println(post.get("errmsg"));
//        System.out.println(post.toString());

    }

}
