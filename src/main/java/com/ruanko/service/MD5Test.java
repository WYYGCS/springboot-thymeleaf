package com.ruanko.service;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class MD5Test {
    /**
     * 对明文字符串进行MD5加密
     * @param source 传入的明文字符串
     * @return 加密结果
     */
    public static String md5(String source) {
        // 1.判断source是否有效
        if(source == null || source.length() == 0 ) {
            //2.如果不是有效的字符串抛出异常
            throw new RuntimeException("不是有效字符串");
        }


        try {
            //3.获取MessageDigest对象
            String algorithm = "md5";

            MessageDigest messageDigest = MessageDigest.getInstance(algorithm);

            //4.获取明文字符串对应的字节数组
            byte[] input = source.getBytes();
            //5.执行加密
            byte[] output = messageDigest.digest(input);
            //6.创建BigInteger对象
            int signum = 1;
            BigInteger bigInteger = new BigInteger(signum,output);
            //7.按照16进制将bigInteger的值转换为字符串
            int radix = 16;
            String encoded = bigInteger.toString(radix).toUpperCase();

            return encoded;
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }

        return null;
    }


    public static void main(String[] args) {
        String sourceString = "10082";
        String md5salt="54sdf";
        String sxj=sourceString+md5salt;
//        C42ADED41F65A0EB0360D2714663EB9F
        System.out.println("字符串相加："+sxj);
        System.out.println(MD5Test.md5(sourceString+md5salt));
    }
}
