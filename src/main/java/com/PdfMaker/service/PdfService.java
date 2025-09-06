package com.PdfMaker.service;


import com.PdfMaker.model.ResponseContent;
import com.PdfMaker.model.Tax;
import com.PdfMaker.util.PdfUtil;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.thymeleaf.context.Context;

import java.time.LocalDate;

@Service
public class PdfService {
    private final PdfUtil pdfUtil;

    public PdfService(PdfUtil pdfUtil) {
        this.pdfUtil = pdfUtil;
    }

    public ResponseContent generatePdf(){
        Tax tax = new Tax(
                "CTX-001",
                "TAX-98765",
                "Cliente de Prueba S.A.",
                "Bogotá",
                LocalDate.now().toString(),
                "Servicios de consultoría tecnológica",
                250000.00,
                47500.00,
                297500.00
        );

        Context context = new Context();
        context.setVariable("taxtManager", tax);

        byte[] pdfBytes = pdfUtil.generatePdf("tax", context);

        return new ResponseContent(
                pdfBytes,
                "Factura_Tax.pdf",
                MediaType.APPLICATION_PDF
        );
    }
}
