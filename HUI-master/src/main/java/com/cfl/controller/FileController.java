package com.cfl.controller;

import com.cfl.comment.Message;
import org.apache.commons.io.FileUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.apache.commons.codec.binary.Base64;
import sun.misc.BASE64Decoder;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.util.Date;

/**
 * Created by Administrator on 2018/2/9.
 */
@Controller
@RequestMapping("file")
public class FileController {
    @RequestMapping("fileUp")
    @ResponseBody
    public Message getFile(String img, HttpServletRequest request) {
        img = img.replace("data:image/png;base64,","");
        System.out.println(img);
        try {
            if(img == null || "".equals(img)){
                return  Message.fail("数据为空");
            }
            String projectPath = request.getSession().getServletContext().getRealPath("/");
            String context = request.getContextPath();
            String imgFilePath ="/userfiles/images/";
            File uploadPathFile = new File(projectPath+imgFilePath);

            //创建父类文件
            if(!uploadPathFile.exists() && !uploadPathFile.isDirectory()){
                uploadPathFile.mkdirs();
            }
            File imgeFile = new File(projectPath+imgFilePath,new Date().getTime()+".png");
            if(!imgeFile.exists()){
                imgeFile.createNewFile();
            }

            //对base64进行解码
            byte[] result = decodeBase64(img);
            //使用Apache提供的工具类将图片写到指定路径下
            FileUtils.writeByteArrayToFile(imgeFile,result);
            String path=imgFilePath+imgeFile.getName();
            return Message.success("成功!");
        }catch (Exception e){
            e.printStackTrace();
            return  Message.fail("上传失败，系统异常");
        }
    }

    /**
     * Base64解码.
     */
    public static byte[] decodeBase64(String input) {
        return Base64.decodeBase64(input.getBytes());
    }
}
