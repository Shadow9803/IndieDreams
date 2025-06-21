🎯 IndieDreams – Estimación de presupuesto
1. 🔌 Importaciones
java
Copiar
Editar
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
LocalDateTime.now() obtiene fecha y hora actuales 
sololearn.com
+15
docs.oracle.com
+15
labex.io
+15

DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss") permite un formato legible 
stackoverflow.com
+5
docs.oracle.com
+5
mkyong.com
+5

2. 🧭 Captura de datos
Se solicitan por consola:

Variable	Propósito
nombreDelJuego	Nombre del videojuego
plataformaPrincipalVideojuego	Plataforma objetivo
motorDesarrollo	Motor elegido
nombreJefeProyecto	Responsable del proyecto
numeroHorasDesarrolloTotal	Horas estimadas
costoHora, valorLicencias, gastosTotalesAdicionales	Costos por hora, licencias y extras

Uso de Scanner para leer cadenas y números. Para evitar problemas con nextLine() tras nextInt() o nextFloat(), es mejor limpiar el buffer con scanner.nextLine() 
laasyasettyblog.hashnode.dev
+6
geeksforgeeks.org
+6
coderanch.com
+6
.

3. 🧮 Cálculos de presupuesto
java
Copiar
Editar
float costoTotalHoras = numeroHorasDesarrolloTotal * costoHora;
float subtotalInicial = costoTotalHoras + valorLicencias + gastosTotalesAdicionales;
float honorariosAdministrativos = 0.05f; // 5 %
float imprevistos = 0.10f;                // 10 %
float costoTotalGeneral = subtotalInicial
    + (subtotalInicial * imprevistos)
    + (subtotalInicial * honorariosAdministrativos);
Suma horas + licencias + extras

Agrega 10 % por imprevistos y 5 % por costos administrativos

4. ⏱ Registro de fecha y hora
java
Copiar
Editar
LocalDateTime fechaRegistro = LocalDateTime.now();
DateTimeFormatter formato = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
fechaRegistro: fecha/hora del momento de ejecución 
howtodoinjava.com
+3
digitalocean.com
+3
mkyong.com
+3
geeksforgeeks.org
+5
stackoverflow.com
+5
labex.io
+5

fechaRegistro.format(formato): convierte en texto legible

5. 📊 Reporte final por consola
Salida tipo:

yaml
Copiar
Editar
Nombre del videojuego: …
Jefe del proyecto: …
Plataforma y motor: … | …
Costo por horas: …
Subtotal: …
Honorarios (5 %): …
Imprevistos (10 %): …
Costo total general: …
🕒 Fecha de registro: 2025‑06‑21 16:45:00
🚀 Cómo ejecutarlo
Copia el código en tu proyecto Java.

Ejecuta Main.

Responde a cada pregunta por consola.

Obtén el reporte con costo y hora de registro.

💡 Posibles mejoras
✅ Validar que los valores numéricos sean positivos.

💱 Formatear montos como moneda (ej. con DecimalFormat).

📄 Guardar reporte en un archivo .txt o .csv.

🗓 Adaptar fechas a otras zonas horarias o formatos.
