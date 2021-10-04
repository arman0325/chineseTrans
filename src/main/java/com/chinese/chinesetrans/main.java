/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.chinese.chinesetrans;

import com.chinese.chinesetrans.dao.ReadAndCreateFile;
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
        System.out.println("Start to read file");
        File file = new File("./test.txt");
        StringBuilder fileString = new StringBuilder();
        ReadAndCreateFile rcf = new ReadAndCreateFile();
        
        fileString = rcf.readFile(file);
        
        System.out.println("Start to write file");
        rcf.writeFile("try.txt", fileString);
        System.out.println("Completed to write file");
        
    }
    
    
    
    
}
