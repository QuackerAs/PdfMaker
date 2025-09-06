package com.PdfMaker.util;

import com.openhtmltopdf.pdfboxout.PdfRendererBuilder;
import org.springframework.stereotype.Component;
import org.thymeleaf.TemplateEngine;
import org.thymeleaf.context.Context;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;

@Component
public class PdfUtil {
    private final TemplateEngine templateEngine;


    public PdfUtil(TemplateEngine templateEngine) {
        this.templateEngine = templateEngine;
    }

    public String renderHtml(String templateName, Context context){
        return templateEngine.process(templateName, context);
    }

    public byte[] generatePdfFromHtml(String htmlContent, String basePath) {
        try (ByteArrayOutputStream outputStream = new ByteArrayOutputStream()){
            PdfRendererBuilder builder = new PdfRendererBuilder();
            builder.withHtmlContent(htmlContent, basePath);
            builder.toStream(outputStream);
            builder.run();
            return outputStream.toByteArray();
        } catch (IOException e){
            throw new RuntimeException("Error al generara el PDF", e);
        }
    }

    public byte[] generatePdf(String templateName, Context context) {
        String htmlContent = renderHtml(templateName, context);
        String baseUrl = new File("src/main/resources/static/").toURI().toString();
        return generatePdfFromHtml(htmlContent, baseUrl);
    }
}
