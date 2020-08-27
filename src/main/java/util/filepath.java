package util;

import java.io.File;
import java.io.IOException;

//列出File的一些常用操作
public class filepath {
    /*
     * 列出指定目录下（包括其子目录）的所有文件
     */

    public static void listDirectory(File dir)throws IOException {
        if(!dir.exists())
            throw new IllegalArgumentException("目录："+dir+"不存在.");
        if(!dir.isDirectory()){
            throw new IllegalArgumentException(dir+"不是目录。");
        }
        /*String[] filenames=dir.list();//返回的是字符串数组 直接子的名称 不包含子目录
        for(String string:filenames){
            System.out.println(dir+"\\"+string);
        }*/
        //如果要遍历子目录下的内容就需要构造File对象做递归操作，File提供了直接返回File对象的API
        File[] files=dir.listFiles();
        //for(File file:files){
        //System.out.println(file);
        if(files!=null&&files.length>0){
            for(File file:files){
                if(file.isDirectory())
                    //递归
                    listDirectory(file);
                else
                    System.out.println(file);
            }
        }
    }
}