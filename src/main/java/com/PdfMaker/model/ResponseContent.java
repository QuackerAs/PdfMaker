package com.PdfMaker.model;

import org.springframework.http.MediaType;

public record ResponseContent(
        byte[] content,
        String fileName,
        MediaType contentType
) {
}
