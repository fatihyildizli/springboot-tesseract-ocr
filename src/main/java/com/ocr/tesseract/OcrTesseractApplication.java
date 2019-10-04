package com.ocr.tesseract;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({"com.ocr.*"})
public class OcrTesseractApplication {

	public static void main(String[] args) {
		SpringApplication.run(OcrTesseractApplication.class, args);
	}

}
