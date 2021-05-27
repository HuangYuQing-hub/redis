package com.hyq.test;

import com.hyq.pojo.Door;
import com.hyq.service.IDoorService;
import com.hyq.service.impl.DoorServiceImpl;
import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Component;

/**
 * @author huangyq
 * @date 2021-05-27
 */
@Component
public class Mytest {

    public static void main(String[] args) {
        Mytest a = new Mytest();
        a.testBatchUp();
    }
    public void testBatchUp(){
        List<Door> list = new ArrayList<>();
        for(int i=0;i<5;i++){
            Door door =  Door.builder().id(i).flag(3).build();
            list.add(door);
        }

        IDoorService doorService = new DoorServiceImpl();
        doorService.batchUp(list);
    }
}
