package com.urule.justin.demo.service;

import com.bstek.urule.model.ExposeAction;
import org.springframework.stereotype.Component;

@Component("carInfoService")
public class CarInfoService {

    /**
     * 获取车辆编号
     * @param bikeNo
     * @return
     */
    @ExposeAction("getCarInfo")
    public Integer getCarInfo(String bikeNo){
        if("1".equals(bikeNo)){
            return 1;
        }else{
            return 2;
        }
    }
}
