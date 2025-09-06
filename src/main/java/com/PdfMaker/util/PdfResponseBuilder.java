package com.PdfMaker.util;

import com.PdfMaker.model.ResponseContent;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

@Component
public class PdfResponseBuilder {
    public static ResponseEntity<byte[]> build(ResponseContent responseContent){
        return ResponseEntity.ok()
                .header(HttpHeaders.CONTENT_DISPOSITION, "inline; filename=" + responseContent.fileName())
                .contentType(responseContent.contentType() != null ? responseContent.contentType() : MediaType.APPLICATION_PDF)
                .body(responseContent.content());
    }
}
