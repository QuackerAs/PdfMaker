package com.PdfMaker.controller;

import com.PdfMaker.service.PdfService;
import com.PdfMaker.util.PdfResponseBuilder;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PdfController {
    private final PdfService pdfService;

    public PdfController(PdfService pdfService) {
        this.pdfService = pdfService;
    }

    @GetMapping("/generate")
    public ResponseEntity<byte[]> generatePdfTax(){
        return PdfResponseBuilder.build(PdfService.generatePdf());
    }
}
