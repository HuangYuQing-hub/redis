package com.hyq.pojo;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Builder;
import lombok.Data;

/**
 * @author huangyq
 * @date 2021-05-27
 */
@Data
@Builder
@TableName("td_door")
public class Door {

    private Integer id;
    private String doorName;
    private String openTime;
    private int flag;
    private String phone;

}
