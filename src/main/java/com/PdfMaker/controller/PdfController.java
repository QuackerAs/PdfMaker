package com.PdfMaker.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PdfController {

    @GetMapping("/generate")
    public ResponseEntity<byte[]> generatePdfTax(){
        return
    }
}
