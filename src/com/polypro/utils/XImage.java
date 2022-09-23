
package com.polypro.utils;

import java.awt.Image;
import java.io.File;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import javax.swing.ImageIcon;


public class XImage {
    public static Image getAppIcon() {
        //Đặt icon cho phần mềm - bổ sung sau
        URL url = XImage.class.getResource("com/edusys/icon/IconName.png");
        return new ImageIcon(url).getImage();
    }

    public static void save(File src) {
        File dst = new File("logos", src.getName());
        if(!dst.getParentFile().exists()){
        dst.getParentFile().mkdirs();
        }
        try {
            Path from = Paths.get(src.getAbsolutePath());
            Path to = Paths.get(dst.getAbsolutePath());
            Files.copy(from, to, StandardCopyOption.REPLACE_EXISTING);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public static ImageIcon read(String fileName) {
        File path = new File("logos", fileName);
        return new ImageIcon(path.getAbsolutePath());

    }
}
