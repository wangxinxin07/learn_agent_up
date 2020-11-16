package com.wxx.learn.log;

import java.io.File;
import java.io.FileOutputStream;

/**
 * @author: wangxinxin-hj
 * @date: 2020/11/16 0:22
 */
public class MyLog {
    public static void log(String msg) throws Exception {
        File file = new File("D://111.txt");
        if (!file.exists()) {
            file.createNewFile();
        }
        FileOutputStream fous = new FileOutputStream(file, true);
        fous.write(msg.getBytes());
        fous.write("\r\n".getBytes());
        fous.flush();
        fous.close();
    }
}
