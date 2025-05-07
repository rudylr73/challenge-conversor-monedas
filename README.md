# challenge-conversor-monedas
Challenge Conversor de Monedas Programa Alura

# 💱 Conversor de Monedas - Java + API ExchangeRate

Este es un programa de consola escrito en Java que permite convertir entre distintas monedas utilizando datos en tiempo real obtenidos de la API pública de [ExchangeRate-API](https://www.exchangerate-api.com/). El objetivo principal es proporcionar una herramienta sencilla, precisa y actualizada para realizar conversiones básicas entre divisas.

---

## 🚀 Características

- Interfaz de texto amigable y fácil de usar.
- Acceso a datos actualizados en tiempo real desde la API.
- Conversión entre las siguientes monedas:
  - Dólar estadounidense (USD)
  - Peso argentino (ARS)
  - Real brasileño (BRL)
  - Peso colombiano (COP)
- Cálculos con formato de 2 decimales.
- Menú interactivo en bucle hasta que el usuario decida salir.
- Manejo de entradas inválidas del menú.

---

## 📷 Ejemplo de uso

```bash
======================================
      BIENVENIDO AL CONVERSOR DE MONEDAS
======================================
Seleccione una opción del siguiente menú:
1 - Dólares (USD) a Pesos Argentinos (ARS)
2 - Pesos Argentinos (ARS) a Dólares (USD)
3 - Dólares (USD) a Reales (BRL)
4 - Reales (BRL) a Dólares (USD)
5 - Dólares (USD) a Pesos Colombianos (COP)
6 - Pesos Colombianos (COP) a Dólares (USD)
9 - Salir del programa
======================================
Ingrese su opción: 1
Ingrese la cantidad: 20
20.00 Dólares son: 17645.00 Pesos Argentinos
🧩 Estructura del proyecto
Principal.java: clase principal que ejecuta el programa, maneja el menú y realiza las conversiones.

Convertor.java: clase modelo que representa las tasas de cambio individuales.

RespuestaApi.java: clase auxiliar que representa la estructura completa del JSON de la API y permite deserialización con Gson.

pom.xml (opcional): si se desea gestionar dependencias con Maven, como la librería Gson.

🛠️ Requisitos
JDK 11 o superior (por el uso de HttpClient)

Conexión a Internet activa (el programa consulta datos en línea)

Librería Gson de Google para parsear JSON

📦 Instalación
Clonar o descargar el repositorio.

Asegurarse de tener Gson en el classpath.

Si usás Maven, agregá esto al pom.xml:

xml
Copiar
Editar
<dependency>
    <groupId>com.google.code.gson</groupId>
    <artifactId>gson</artifactId>
    <version>2.10.1</version>
</dependency>
Si no usás Maven, descargá el .jar desde Gson Releases y añadilo manualmente al proyecto.

Compilar y ejecutar:

bash
Copiar
Editar
javac *.java
java Principal
🔐 Nota sobre la API
Este programa usa una clave gratuita de la API de ExchangeRate. Si dejás de tener acceso, podés obtener tu propia clave gratuita registrándote en:

➡️ https://www.exchangerate-api.com

Y luego reemplazar el valor en esta línea:

java
Copiar
Editar
URI.create("https://v6.exchangerate-api.com/v6/TU_API_KEY/latest/USD")
📚 Créditos
Desarrollado como ejercicio académico.

Utiliza la API pública de ExchangeRate para datos de conversión.

Deserialización de JSON implementada con la librería Gson (Google).

🧠 Futuras mejoras (opcional)
Permitir conversión entre cualquier par de monedas (no solo las predefinidas).

Agregar una interfaz gráfica con JavaFX o Swing.

Validación robusta de entradas del usuario.

Cacheo local de tasas para evitar múltiples requests a la API.

📄 Licencia
Este proyecto es de uso educativo y puede ser modificado y distribuido libremente con fines no comerciales.
