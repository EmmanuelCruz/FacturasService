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

### CAMBIOS

Nuevo cambio desde la rama nueva

### ESTRATEGIA ENTRE RAMAS

Considerando que un proyecto será desarrollado y mantenido por 6 personas en el equipo de trabajo y cada una de ellas tendrá un feature asignado, la propuesta más viable para la estrategia de ramas es tener un control con *Ramas de Características*, en la que cada persona tendrá un feature desarrollando.

Por ejemplo:

* feature/task_person1
* feature/task_person2
* feature/task_person3
* feature/task_person4
* feature/task_person5
* feature/task_person6

Al ser concluidas las actividades individualmente, los cambios serían mezclados con la rama *dev*. Una vez que todos los cambios de los features se encuentran en la rama *dev*, se crearía una rama de Liberación con la siguiente nomenclatura

* release/versionX

En esta rama se realizarían correcciones finales, que posteriormente se mezclarían con las ramas *dev* y *master*.

Finalmente, en caso de ser requerido, cuando se encuentran errores en la rama *master*, se crearía una rama a partir de *master* con la siguiente nomenclatura

* hotfix/versionX

Una vez realizadas las correcciones pertinentes, los cambios de esta rama se mezclarían con las ramas *dev* y *master*