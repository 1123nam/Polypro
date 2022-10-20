/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.polypro.utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 *
 * @author ADMIN
 */
public class XFile {
    public static int readInt(String path) throws Exception{
        File file = new File(path);
           int n= 0;
            if(file.isFile()){
            FileInputStream fis = new FileInputStream(file);
             n  = fis.read();
            fis.close();
            }
            return n;   
           
    }
    
    public static void writeInt(String path, int number) throws Exception{
            FileOutputStream fos = new FileOutputStream(path);
            fos.write(number);
            fos.close();
    }
}
