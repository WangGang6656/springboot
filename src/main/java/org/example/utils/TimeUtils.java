package org.example.utils;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

// 获取时间工具类
public class TimeUtils {

    // 定义时间格式
    private static final DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

    /**
     * 获取当前时间的字符串表示形式
     * @return 当前时间的字符串表示形式
     */
    public static String getCurrentTime() {
        // 获取当前时间
        LocalDateTime now = LocalDateTime.now();

        // 格式化当前时间
        return now.format(formatter);
    }
}