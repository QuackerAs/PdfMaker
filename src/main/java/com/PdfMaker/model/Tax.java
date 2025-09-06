package com.PdfMaker.model;

public record Tax(
        String ID_CONTEXT,
        String TAX_ID,
        String CLIENT,
        String CITY,
        String LOCALDATE,
        String CONTENT,
        Double PRICE,
        Double IVA,
        Double TOTAL_PRICE

) {
}
