package com.mercury.basic;

public class StringBuilderBufferTest {
    /** 
    * @Description:  
    * @Param: [args] 
    * @return: void 
    * @Author: yangdar1en 
    * @Date:  
    */ 
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        StringBuilder sb2 = sb;
        sb.append("abc").append("dfe");

        System.out.println(sb == sb2);

        // StringBuffer is sync
        // so it is thread-safe
        StringBuffer sbf;
    }

}
