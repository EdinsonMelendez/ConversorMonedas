# 💱 Conversor de Monedas en Java

Este es un desafio de programacion que implementa un conversor de monedas utilizando **Java**, haciendo uso de la **ExchangeRate API**, la biblioteca **Gson** para análisis de JSON y una interfaz de texto interactiva.

## 🚀 Características

- Solicita tasas de cambio en tiempo real desde la API.
- Convierte entre diferentes monedas.
- Interfaz simple desde consola.
- Diseño modular con clases separadas para mayor claridad y escalabilidad.

---

## 🧩 Estructura del Proyecto

```
ConversorMonedas/
├── Main.java                 # Menú interactivo e interacción con el usuario
├── ApiCliente.java          # Cliente HTTP para obtener datos de la API
├── Conversor.java           # Lógica de conversión entre monedas
├── ExchangeRates.java       # Modelo para mapear el JSON de la API
├── Config.java              # Clave de API y configuración general
├── README.md                # Documentación del proyecto
```

---

## 🛠️ Requisitos

- Java 11 o superior
- [Gson](https://github.com/google/gson) (se descargo el `.jar`)
- Se creo una cuenta gratuita en [ExchangeRate API](https://www.exchangerate-api.com/) para obtener la clave de API

---

## 📖 Ejemplo de Uso

```plaintext
=== Bienvenido/a al Conversor de Moneda ===

1. USD
2. EUR
3. COP
4. JPY
5. BRL
6. Salir

Elija una opción: 1
Ingrese el monto: 100
Ingrese la moneda de destino (por ejemplo: EUR, COP): EUR
Resultado: 100.00 => 91.23 EUR
```

---

## 📚 Tecnologías Utilizadas

- Java 11+
- API ExchangeRate
- Gson (Google JSON parser)
- Java HttpClient / HttpRequest / HttpResponse

---

## 👨‍💻 Autor

Desarrollado por **Edinson Rafael Melendez Osorio** – *Estudiante de Ingeniería de Sistemas apasionado por Java y la programación web*.
