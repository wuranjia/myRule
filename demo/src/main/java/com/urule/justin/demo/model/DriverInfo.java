package com.urule.justin.demo.model;

import com.bstek.urule.ClassUtils;
import lombok.Getter;
import lombok.Setter;

import java.io.File;

@Getter
@Setter
public class DriverInfo {
    private String name;
    private Long phone;
    private Integer sex;
    private Integer status;
    private String cardNo;
    private String cityGuid;
    private String gridGuid;

    public static void main(String[] args) {
        File file = new File("/Users/wuranjia/201907/urule/demo/src/main/java/com/urule/justin/demo/model/DriverInfo.xml");
        ClassUtils.classToXml(DriverInfo.class,file);
    }
}
