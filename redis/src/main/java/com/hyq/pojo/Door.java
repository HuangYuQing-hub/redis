package com.hyq.pojo;

import lombok.Builder;
import lombok.Data;

/**
 * @author huangyq
 * @date 2021-05-27
 */
@Data
@Builder
public class Door {

    private Integer id;
    private String doorName;
    private String openTime;
    private int flag;
    private String phone;

}
