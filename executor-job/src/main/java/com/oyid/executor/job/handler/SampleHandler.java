package com.oyid.executor.job.handler;

import com.xxl.job.core.biz.model.ReturnT;
import com.xxl.job.core.handler.annotation.XxlJob;
import org.springframework.stereotype.Component;


/**
 * Created with IntelliJ IDEA.
 * User: zhw
 * Date: 2020/12/21
 * Time: 17:31
 * Description: SampleHandler
 */
@Component
public class SampleHandler {

    @XxlJob("myHandler")
    public ReturnT<String> demoJobHandler(String param) {
        System.out.println("myHandler start,param = " + param);
        return ReturnT.SUCCESS;
    }
}
