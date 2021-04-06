package org.leo.service;

import com.microsoft.azure.functions.HttpRequestMessage;

import java.util.Optional;

public interface MessageService {
    /**
     * 微信公众号处理
     * @param request
     * @return
     */
    String newMessageRequest(HttpRequestMessage<Optional<String>> request);
}
