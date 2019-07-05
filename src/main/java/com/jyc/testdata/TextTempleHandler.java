package com.jyc.testdata;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Properties;

/**
 * Created by ucar-jyc on 2017/8/11.
 */
public class TextTempleHandler extends TempletHandler {



    @Override
    public List<String> generateDataByTemplet(String path) {
        Properties prop = new Properties();
        Map<String,String> map = new HashMap<String,String>();
        try {
            prop.load(TextTempleHandler.class.getResourceAsStream(String.format("/templet/%s.properties",path)));
            /*String text = prop.getProperty("templet.text");
            String type = prop.getProperty("templet.type");*/

            for (Map.Entry<Object,Object> entry:prop.entrySet()) {
                String key = String.valueOf(entry.getKey());
                String value = String.valueOf(entry.getValue());
                map.put(key,value);
            }

            String type = map.get("templet.type");// 获取类型配置 int^3,int^5

            int num = Integer.valueOf(map.get("templet.num"));// 获取结果数量

            String[] typeArray = type.split(",");// 类型之间用","分隔

            for (int i = 0; i < typeArray.length; i++) {

            }

            System.out.println("s");
        } catch (IOException e) {
            e.printStackTrace();

        }
        return null;
    }


    public static void main(String[] args) {
        new TextTempleHandler().generateDataByTemplet("insert");
    }
}
