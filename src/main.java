import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

/**
 * @File
 * @Author Emily Weilan Tao
 * @Date
 * @Description
 * @Since version-1.0
 * @Copyright Copyright (c) 2020
 */
public class main {
    public static final String SOURCE_FILE = "./resource/xjj.PNG";
    public static final String DESTINATION_FILE = "./resource/out_xjj.PNG";
    private static int imageWidth;
    private static int imageHeight;

    public static void main(String[] args) {
        BufferedImage originalImage = null;
        try {

            originalImage = ImageIO.read(new File(SOURCE_FILE));
            imageWidth = originalImage.getWidth();
            imageHeight = originalImage.getHeight();

            GreyScaler greyScaler=new GreyScaler(originalImage);
            BufferedImage resultImage=greyScaler.getResultImage();

            File outputFile = new File(DESTINATION_FILE);
            ImageIO.write(resultImage, "PNG", outputFile);
        } catch (IOException e) {
        }
    }


}
