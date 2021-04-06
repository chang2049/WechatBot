package org.leo.pojo;

import lombok.Setter;
import lombok.Getter;

@Setter
@Getter
public class AccessToken {
    /**
     *  获取到的凭证
     */
    private String accessToken;

    /**
     *  凭证有效时间，单位：秒
     */
    private int expiresIn;
}
