package fileupload;

import base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

public class FileUploadTests extends BaseTests {

    @Test

    public void testUploadFile(){
        var fileUploadPage = homePage.clickFileUpload();
        String filePath = "C:\\Users\\GwenIarussi\\Downloads\\selenium-webdriver-java-course-c7.1.zip";
        fileUploadPage.uploadFile(filePath);
        //assertEquals(fileUploadPage.getUploadedFiles(), "selenium-webdriver-java-course-c7.1.zip");
        System.out.println(fileUploadPage.getUploadedFiles());
        String uploadedFile = fileUploadPage.getUploadedFiles();
        assertEquals(uploadedFile,"selenium-webdriver-java-course-c7.1.zip" );
    }
}
