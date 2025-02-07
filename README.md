# Api de facturas
## Autor: Emmanuel Cruz Hernández

### Descripción
Api para el proceso de facturación

* Listar facturas
* Obtener factura por identificador
* Insertar factura
* Actualizar factura
* Eliminar factura

### Factura

Una factura se compone de la siguiente estructura

        {
            "id": "1",
            "precioVenta": "1230",
            "fecha": "8 de septimbre de 2024",
            "divisa": "Peso mexicano (MXN)",
            "producto": {
                "clave": "12343",
                "descripcion": "Pollos"
            }
        }

### MANIFEST

En el directorio *Manifest* se encuentran los siguientes archivos

* **Dockerfile**: Archivo Dockerfile para crear la imagen del proyecto
* **facturas-deployment.yaml**: Configuración yaml para realizar el deploy de la imagen
* **facturas-service.yaml**: Configuración yaml para crear el servicio