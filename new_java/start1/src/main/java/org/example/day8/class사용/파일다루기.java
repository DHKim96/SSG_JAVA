package org.example.day8.class사용;

import java.io.File;

public class 파일다루기 {
    public static void main(String[] args) {
        File file = new File("C:\\jdk-17\\bin");

        System.out.println(file.exists());
        System.out.println(file.isFile());
        System.out.println(file.isDirectory()); // 디렉터리 == 폴더 == 패키지
        File[] files = file.listFiles();
        System.out.println(files.length);

        for(File f : files){
            // 확장자 exe 인 경우만 프린트
            String name = f.getName();
            if(name.endsWith(".exe")){
                System.out.println(name);
            }
        }

        System.out.println(file.getPath());
        System.out.println(file.getParent());
        System.out.println(file.getAbsolutePath());
    }
}
