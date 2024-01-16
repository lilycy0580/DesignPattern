package com.dp.use_pattern;

import java.util.Random;

public class Client {

    // 发送邮件的数量,从数据库中取值
    private static int MAX_COUNT = 6;

    public static void main(String[] args) {
        // 模拟发送邮件
        int i=0;
        // 从数据库中获取模板
        Mail mail = new Mail(new AdvTemplate());
        mail.setTail("xxx银行版权所有");
        while(i<MAX_COUNT){
            // todo 原型模式
            Mail mailClone = mail.clone();
            mailClone.setAppellation(getRandString(5)+"先生/女士");
            mailClone.setReceiver(getRandString(5)+"@"+getRandString(8)+".com");
            sendMail(mail);
            i++;
        }
    }

    public static void sendMail(Mail mail){
        System.out.println("标题:"+mail.getSubject()+"\t收件人："+mail.getReceiver()+"\t....发送成功！");
    }

    public static String getRandString(int maxLength){
        String source = "qwertyuiopasdfghjklzxcvbnmQWERTYUIOPASDFGHJKLZXCVBNM";
        StringBuffer stringBuffer = new StringBuffer();
        Random random = new Random();
        for (int i = 0; i < maxLength; i++) {
            stringBuffer.append(source.charAt(random.nextInt(source.length())));
        }
        return stringBuffer.toString();
    }
}
