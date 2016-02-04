package com.rui.utils;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Apache Httpclient 4.0 工具包装类
 *
 * @author shezy
 */
@SuppressWarnings("all")
public class HTMLUtil {

    /**
     * 返回符合该正则表达式的 字符串 列表
     * pString：源字符串
     * pExpress：用于匹配的正则表达式
     * 最好举个例子
     */
    public static List<String> getPatternString(String pString, String pExpress) {
        Pattern pattern = Pattern.compile(pExpress);
        String s = pString;

        List<String> sList = new ArrayList<String>();
        Matcher matcher = pattern.matcher(s);
        while (matcher.find()) {
            sList.add(matcher.group());
        }

        return sList;
    }

}
