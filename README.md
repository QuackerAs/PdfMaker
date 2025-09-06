📄 PdfMaker

PdfMaker es un proyecto en Spring Boot que permite generar documentos PDF dinámicos a partir de plantillas Thymeleaf, utilizando la librería OpenHTMLtoPDF.

🚀 Características principales

Generación de PDFs a partir de vistas HTML renderizadas.

Integración con Thymeleaf para trabajar con plantillas dinámicas.

Conversión de HTML + CSS a PDF mediante OpenHTMLtoPDF.

Respuesta del documento PDF en formato byte array o descarga directa.

Arquitectura modular que facilita la reutilización en otros proyectos.

🛠️ Tecnologías utilizadas

Java 17+

Spring Boot

Thymeleaf

OpenHTMLtoPDF

Maven

📂 Estructura del proyecto

controller/ → Endpoints para generar y descargar PDFs.

service/ → Lógica de renderizado y conversión a PDF.

model/ -> Modelos utilizados para popular el HTML

templates/ → Plantillas Thymeleaf utilizadas como base.

utils/ → Métodos auxiliares para manejo de archivos y streams.

