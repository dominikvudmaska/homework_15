package com.ness;

import ij.IJ;
import ij.ImagePlus;
import ij.process.ImageProcessor;

import java.awt.Font;
import java.awt.Color;

public class Main {
    public static void main(String[] args) {

        ImagePlus image = IJ.openImage("src/main/java/com/ness/xp.jpg");

        Font font = new Font("Arial", Font.BOLD, 200);

        ImageProcessor ip = image.getProcessor();
        ip.setColor(Color.BLACK);
        ip.setFont(font);
        ip.getWidth();
        ip.drawString("Hello world", ip.getWidth()/2,ip.getHeight()/2);

        image.show();

        IJ.save(image,"src/main/java/com/ness/xp_edited.jpg" );

        }
    }
