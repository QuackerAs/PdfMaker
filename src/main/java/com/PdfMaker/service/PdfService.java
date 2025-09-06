package com.PdfMaker.service;


import com.PdfMaker.model.ResponseContent;
import com.PdfMaker.model.Tax;
import com.PdfMaker.util.PdfUtil;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.thymeleaf.context.Context;

@Service
public class PdfService {
    private final PdfUtil pdfUtil;

    public PdfService(PdfUtil pdfUtil) {
        this.pdfUtil = pdfUtil;
    }

    public ResponseContent generatePdf(){
        Tax tax = new Tax(

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
