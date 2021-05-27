package com.hyq.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.hyq.pojo.Door;
import com.hyq.service.IDoorService;
import java.util.List;

/**
 * @author huangyq
 * @date 2021-05-27
 */
public class DoorServiceImpl extends ServiceImpl implements IDoorService {
    @Override
    public boolean batchUp(List<Door> list) {

        return super.updateBatchById(list);
    }

}
