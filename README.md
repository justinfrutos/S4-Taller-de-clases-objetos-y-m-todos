# Ejercicios Java — Capítulo 3 (clases y objetos)

**S4:** Taller de clases, objetos y métodos.

Proyecto académico con las clases **Factura**, **Empleado**, **Fecha**, **FrecuenciasCardiacas** y **PerfilMedico**, más sus aplicaciones de prueba. Incluye principios de código limpio (nombres claros, responsabilidades acotadas y utilidades compartidas para cálculos de frecuencia cardiaca).

## Requisitos

- [JDK](https://adoptium.net/) 8 o superior (se usa `java.time` en los ejercicios 3.16 y 3.17).

## Estructura

```
src/capitulo3/
  Factura.java, PruebaFactura.java
  Empleado.java, PruebaEmpleado.java
  Fecha.java, PruebaFecha.java
  FrecuenciasCardiacas.java, PruebaFrecuenciasCardiacas.java
  PerfilMedico.java, PruebaPerfilMedico.java
  AyudaCardiaca.java, RangoFrecuencia.java
```

## Compilar

Desde la raíz del proyecto:

```bash
javac -encoding UTF-8 -d out src/capitulo3/*.java
```

En Windows (PowerShell), equivalente:

```powershell
javac -encoding UTF-8 -d out src\capitulo3\*.java
```

## Ejecutar

```bash
java -cp out capitulo3.PruebaFactura
java -cp out capitulo3.PruebaEmpleado
java -cp out capitulo3.PruebaFecha
java -cp out capitulo3.PruebaFrecuenciasCardiacas
java -cp out capitulo3.PruebaPerfilMedico
```

Las dos últimas piden datos por teclado. Si en la consola no se ven bien las tildes, en PowerShell puedes usar `chcp 65001` antes de ejecutar.

---

## Resultados de ejecución (referencia)

Salida obtenida al compilar y ejecutar en el entorno local (los importes numéricos pueden usar coma o punto según la configuración regional de la JVM).

### PruebaFactura

- Factura inicial: pieza `A-100`, descripción martillo, cantidad **3**, precio **12,50**, monto **37,50**.
- Tras actualizar a cantidad **5** y precio **10,00**: monto **50,00**.
- Tras cantidad y precio no positivos: cantidad **0**, precio **0,00**, monto **0,00**.

### PruebaEmpleado

- Ana García: salario anual inicial **42 000,00**; tras aumento del 10 %: **46 200,00**.
- Luis Martínez: salario anual inicial **50 400,00**; tras aumento del 10 %: **55 440,00**.

### PruebaFecha

- Fecha inicial mostrada: **4/19/2026**; tras cambiar mes/día/año: **12/31/2025**.

### PruebaFrecuenciasCardiacas (entrada de ejemplo)

Datos usados en la prueba: nombre *Maria*, apellido *Garcia*, nacimiento **15/3/1995**.

| Concepto | Valor |
|----------|--------|
| Edad | 31 años |
| Frecuencia cardiaca máxima (220 − edad) | 189 lpm |
| Rango esperado (50 %–85 % del máximo) | 95 – 161 lpm |

*Nota: son estimaciones tipo AHA; no sustituyen consejo médico.*

### PruebaPerfilMedico (entrada de ejemplo)

Datos usados: *Juan Pérez*, sexo *M*, nacimiento **10/5/1990**, altura **175** cm, peso **70** kg.

| Concepto | Valor |
|----------|--------|
| Edad | 35 años |
| BMI | 22,9 (rango “Normal” según tabla del enunciado) |
| Frecuencia cardiaca máxima | 185 lpm |
| Rango de frecuencia esperada | 93 – 157 lpm |

Tabla de referencia BMI (enunciado):

- Bajo peso: menos de 18,5  
- Normal: entre 18,5 y 24,9  
- Sobrepeso: entre 25 y 29,9  
- Obeso: 30 o más  

---

## Licencia

Uso educativo. Las fórmulas de frecuencia cardiaca son orientativas; consulte siempre a un profesional de salud antes de entrenar.
