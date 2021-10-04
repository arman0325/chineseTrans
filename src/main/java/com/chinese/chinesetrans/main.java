/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.chinese.chinesetrans;

import com.github.houbb.opencc4j.util.ZhConverterUtil;
import com.github.houbb.opencc4j.util.ZhTwConverterUtil;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;

/**
 *
 * @author arman
 */
public class main {
    public static void main(String[] args){
        System.out.print("Start to read file");
        File file = new File("./test.txt");
        StringBuilder fileString = new StringBuilder();
        fileString = readFile(file);
    }
    
    public static StringBuilder readFile(File file){
        FileInputStream in = null;
        StringBuilder sb = new StringBuilder();
        try{
            in = new FileInputStream(file);
            BufferedReader BR = new BufferedReader(new InputStreamReader(in,"UTF-8"));
            
            String line;
            while(( line = BR.readLine())!=null){
                String a = ZhTwConverterUtil.toTraditional(line);
                sb.append(a);
                sb.append("\n");
            }
            System.out.println(sb.toString());
            
            /*int i = in.read();
            while ((i != -1)){
                System.out.print((char)i);
                i =in.read();
            }
            */
            in.close();
        }catch(Exception e){
            e.getStackTrace();
        }finally{
            System.out.println("Read file done");
        }
        return sb;
    }
}
