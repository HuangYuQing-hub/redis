package com.hyq.controller;

import com.hyq.pojo.Door;
import com.hyq.service.IDoorService;
import java.util.ArrayList;
import java.util.List;

/**
 * @author huangyq
 * @date 2021-05-27
 */
public class DoorController {
    private static IDoorService doorService;
    public static void main(String[] args) {
        List<Door> list = new ArrayList<>();
        for(int i=0;i<5;i++){
            Door door =  Door.builder().id(i).flag(3).build();
            list.add(door);
        }
        System.out.println(doorService.batchUp(list));

    }
}
