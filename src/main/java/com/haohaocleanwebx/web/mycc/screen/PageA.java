package com.haohaocleanwebx.web.mycc.screen;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.alibaba.citrus.turbine.Context;
import com.alibaba.citrus.turbine.dataresolver.Params;

public class PageA {
    private static final Logger logger   = LoggerFactory.getLogger(PageA.class);
    private static final String URI_LIST = "/pageA/list";
    
    public void doList(@Params String pageString,Context context){
        if (logger.isInfoEnabled()) {
            logger.info("do list info:{}", pageString);
        }

        
    }

}
