package file;

import java.io.File;
import java.io.FileFilter;

public class filepath {
    public static void main(String[] args) {
        String path = "/Users/zy/Desktop/ShiroExploit.V2.2/未命名文件夹/";		//要遍历的路径
        File file = new File(path);		//获取其file对象
        func(file);
    }

    private static void func(File file){
        File[] fs = file.listFiles();
        for(File f:fs){
            if(f.isDirectory())	//若是目录，则递归打印该目录下的文件
                func(f);
            if(f.isFile())		//若是文件，直接打印
                System.out.println(f);
        }
    }
}
