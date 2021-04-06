package org.leo.functions;

import com.microsoft.azure.functions.ExecutionContext;
import com.microsoft.azure.functions.HttpMethod;
import com.microsoft.azure.functions.HttpRequestMessage;
import com.microsoft.azure.functions.HttpResponseMessage;
import com.microsoft.azure.functions.HttpStatus;
import com.microsoft.azure.functions.annotation.AuthorizationLevel;
import com.microsoft.azure.functions.annotation.FunctionName;
import com.microsoft.azure.functions.annotation.HttpTrigger;
import org.leo.pojo.gitClass.HeadCommit;
import org.leo.pojo.gitClass.Root;
import org.leo.service.MessageService;
import org.leo.service.MessageServiceImpl;
import org.leo.service.WechatAuth;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.annotation.JsonProperty;


import java.io.IOException;
import java.util.Optional;

/**
 * Azure Functions with HTTP Trigger.
 */
public class HttpTriggerFunction {
    /**
     * This function listens at endpoint "/api/HttpExample". Two ways to invoke it using "curl" command in bash:
     * 1. curl -d "HTTP Body" {your host}/api/HttpExample
     * 2. curl "{your host}/api/HttpExample?name=HTTP%20Query"
     */



    @FunctionName("wechat")
    public HttpResponseMessage wechatAuth(
            @HttpTrigger(
                    name = "req",
                    methods = {HttpMethod.GET,HttpMethod.POST},
                    authLevel = AuthorizationLevel.ANONYMOUS)
                    HttpRequestMessage<Optional<String>> request,
            final ExecutionContext context) {
        if(request.getHttpMethod()== HttpMethod.GET){
        final String signature = request.getQueryParameters().get("signature");
        final String timestamp = request.getQueryParameters().get("timestamp");
        final String nonce = request.getQueryParameters().get("nonce");
        final String echostr = request.getQueryParameters().get("echostr");


        context.getLogger().info("Java HTTP trigger processed a request.");
        boolean checkSignature = WechatAuth.checkSignature(signature, timestamp, nonce);
        if(checkSignature){
            return request.createResponseBuilder(HttpStatus.OK).body(echostr).build();
        }else {
            return request.createResponseBuilder(HttpStatus.OK).body("fail").build();
        }
        }else{
            MessageService messageService = new MessageServiceImpl();
            String result = messageService.newMessageRequest(request);
            return request.createResponseBuilder(HttpStatus.OK).body(result).build();
        }
    }

    @FunctionName("github")
    public void webhookGit(
            @HttpTrigger(
                name = "req",
                methods = {HttpMethod.GET, HttpMethod.POST},
                authLevel = AuthorizationLevel.ANONYMOUS)
                HttpRequestMessage<Optional<String>> request,
            final ExecutionContext context) throws IOException {
        context.getLogger().info("Java HTTP trigger processed a request.");

        final String body = request.getBody().get();
        ObjectMapper om = new ObjectMapper();
        Root root = om.readValue(body, Root.class);

        HeadCommit head_commit = root.getHead_commit();

        String result = "我giao，"+head_commit.getAuthor().getName()+" "+head_commit.getMessage();

        System.out.println(body);

    }


}
