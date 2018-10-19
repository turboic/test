package com.example.test.controller;
import org.apache.commons.io.FileUtils;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;

@RestController
@RequestMapping("/file")
public class FileController {
    @Value("${file.filepath}")
    private String filePath;

    @Value("${file.filename}")
    private String fileName;

    @RequestMapping("/download")
    public String download(HttpServletRequest request, HttpServletResponse response) {

        response.setContentType("text/html;charset=utf-8");
        try {
            request.setCharacterEncoding("UTF-8");
        } catch (UnsupportedEncodingException e1) {
            e1.printStackTrace();
        }

        java.io.BufferedInputStream bis = null;
        java.io.BufferedOutputStream bos = null;

        String downLoadPath = filePath;  //注意不同系统的分隔符
        System.out.println(downLoadPath);

        try {
            for(int i=0;i<10;i++){
                fileName = ".jpg";
                fileName=i+""+fileName;
                System.out.println("执行次数"+fileName);
                long fileLength = new File(downLoadPath).length();
                response.setContentType("application/x-msdownload;");
                response.setHeader("Content-disposition", "attachment; filename=" + new String(fileName.getBytes("utf-8"), "ISO8859-1"));
                response.setHeader("Content-Length", String.valueOf(fileLength));
                bis = new BufferedInputStream(new FileInputStream(downLoadPath));
                bos = new BufferedOutputStream(response.getOutputStream());
                byte[] buff = new byte[2048];
                int bytesRead;
                while (-1 != (bytesRead = bis.read(buff, 0, buff.length))) {
                    bos.write(buff, 0, bytesRead);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (bis != null)
                try {
                    bis.close();
                } catch (IOException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            if (bos != null)
                try {
                    bos.close();
                } catch (IOException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
        }
        return null;
    }

    @RequestMapping("/download2")
    public ResponseEntity<byte[]> download2() throws IOException {
        HttpHeaders headers = new HttpHeaders();
        File file = new File(filePath);
        headers.setContentType(MediaType.APPLICATION_OCTET_STREAM);
        headers.setContentDispositionFormData("attachment", fileName);
               return new ResponseEntity<byte[]>(FileUtils.readFileToByteArray(file),
                headers, HttpStatus.CREATED);
    }

}
