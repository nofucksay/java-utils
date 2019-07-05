package com.jyc.testdata;

import java.util.List;

/**
 * Created by ucar-jyc on 2017/8/11.
 */
public abstract class TempletHandler {



    /**
     * 按模板生成数据
     * @param templet
     * @param num
     * @return
     */
    public abstract List<String> generateDataByTemplet(String path);
}
