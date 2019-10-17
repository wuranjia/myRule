package com.urule.justin.demo.controller;


import com.bstek.urule.Utils;
import com.bstek.urule.runtime.KnowledgePackage;
import com.bstek.urule.runtime.KnowledgeSession;
import com.bstek.urule.runtime.KnowledgeSessionFactory;
import com.bstek.urule.runtime.service.KnowledgeService;
import com.urule.justin.demo.model.CarInfo;
import com.urule.justin.demo.model.DriverInfo;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

@RestController
@RequestMapping("/rule/test")
public class UruleTestController {

    Log logger = LogFactory.getLog(UruleTestController.class);


    @RequestMapping(path = "/run", method = RequestMethod.GET)
    public String run(@RequestParam String bikeNo) throws IOException {
        //从Spring中获取KnowledgeService接口实例
        KnowledgeService service = (KnowledgeService) Utils.getApplicationContext().getBean(KnowledgeService.BEAN_ID);
        //通过KnowledgeService接口获取指定的资源包"projectName/test123"
        KnowledgePackage knowledgePackage = service.getKnowledge("测试项目/driverBelong2Car");
        //通过取到的KnowledgePackage对象创建KnowledgeSession对象
        KnowledgeSession session = KnowledgeSessionFactory.newKnowledgeSession(knowledgePackage);

        CarInfo carInfo = new CarInfo();
        DriverInfo driverInfo = new DriverInfo();
        carInfo.setBikeNo(bikeNo);
        driverInfo.setStatus(1);
        //将业务数据对象Employee插入到KnowledgeSession中
        session.insert(carInfo);
        //执行所有满足条件的规则
        session.fireRules();

        logger.info("carInfo = " + carInfo.toString());
        return "success";
    }
}
