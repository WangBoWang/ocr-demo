package com.wangbowang.ocr.tesseract;

import net.sourceforge.tess4j.ITesseract;
import net.sourceforge.tess4j.Tesseract;

import java.io.File;

/**
 * 基于tesseract引擎实现ocr识别案例
 * @author wangb
 * @version 1.0.0
 * @since 2019/12/16
 */
public class TesseractDemo {

    public static void main(String args[]){
        ITesseract instance = new Tesseract();
        //支持绝对目录
        instance.setDatapath("D:\\tesseract\\tesseract-ocr\\tessdata");
        //选择字库文件（只需要文件名，不需要后缀名）
        instance.setLanguage("chi_sim");

        try {
            File imageFile = new File("C:\\Users\\wangb\\Desktop\\年前技术预研\\orctest\\01.png");
            //开始识别
            String result = instance.doOCR(imageFile);
            //打印图片内容
            System.out.println(result);
        } catch (Exception e) {
            //打印图片内容
            System.out.println(e.toString());
        }
    }
}
