package com.pux.xiaojs.jaxb;

/**
 * Created by xiaojs on 18/8/8.
 */
public class RW {

    static String generateXML(){
        Config config = new Config();
        config.setUrl("http://baidu.com");
        config.setRetUrl("http://baidu.com/retUrl");
        config.setNotifyUrl("http://baidu.com/notifyUrl");

        String xmlStr = JaxbUtils.convertToXml(config);
        return xmlStr;
    }

    static Config convertToConfig(String xmlStr){
        Config config = JaxbUtils.convertToBean(xmlStr, Config.class);
        return config;
    }

    public static void main(String[] args) {

        String xmlStr = generateXML();
        System.out.println(xmlStr);

        Config config = convertToConfig(xmlStr);
        System.out.println(config.getUrl());
    }
}
