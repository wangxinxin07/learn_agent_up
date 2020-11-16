package com.wxx.learn;

import com.wxx.learn.log.MyLog;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.instrument.ClassFileTransformer;
import java.lang.instrument.Instrumentation;

/**
 * @描述:
 * @文件名: com.wxx.learn.MyAgent.java
 * @创建人: wangxinxin
 * @创建时间: 2020/10/27
 * @修改人: wangxinxin
 * @修改备注: <br/>
 * <p>
 */
public class MyAgent {
    public static void premain(String agentArgs, Instrumentation inst) throws Exception {
        System.out.println("this is an perform monitor agent.");
        MyLog.log("this is an monitor agent");

        // 添加 Transformer
        ClassFileTransformer transformer = new PerformMonitorTransformer();
        inst.addTransformer(transformer);
    }

}
