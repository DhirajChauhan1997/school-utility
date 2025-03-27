package com.dc.school.utility;

import org.springframework.util.DigestUtils;

public class InternalLogicUtility {

    public static synchronized String getConvertedPassword(String textPassword) {
        return (DigestUtils.md5DigestAsHex(textPassword.getBytes())).toString();
    }

    public static void main(String[] args) {
        System.out.println(getConvertedPassword("dhiraj@1997"));
    }
}
