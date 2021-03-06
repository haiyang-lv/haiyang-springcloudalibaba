package com.haiyang.sca.dto;

import lombok.Data;

import java.io.Serializable;
import java.time.LocalDateTime;

@Data
public class UserDTO implements Serializable {

    private static final long serialVersionUID = 8113127982327468078L;
    /**
     * 主键
     */
    private Integer id;

    /**
     * 身份证
     */
    private String idCard;

    /**
     * 姓名
     */
    private String name;

    /**
     * 手机号
     */
    private String mobile;

    /**
     * 联系人手机号
     */
    private LocalDateTime birthday;

    /**
     * 性别
     */
    private Integer sex;

    /**
     * 创建时间
     */
    private LocalDateTime createTime;

}
