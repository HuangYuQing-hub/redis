package com.hyq.service;

import com.hyq.pojo.Door;
import java.util.List;

/**
 * @author huangyq
 * @date 2021-05-27
 */
public interface IDoorService {
    boolean batchUp(List<Door> list);
}
