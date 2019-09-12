<h1 align="center">¡Bienvenido! 👋</h1>
<p>
  <a href="https://twitter.com/sodepsa">
    <img alt="Twitter: sodepsa" src="https://img.shields.io/twitter/follow/sodepsa.svg?style=social" target="_blank" />
  </a>
</p>

> El siguiente proyecto contiene desafíos a resolver para potenciales developers

### 🏠 [Homepage](http://sodep.com.py)

## Instrucciones

Leer las instrucciones con atención e implementar lo que se tiene familiaridad en primer lugar.

Tanto para frontend como backend se puede usar algún framework de preferencia.

Adicionales instrucciones serán recibidas por e-mail por la persona que te envió este repo.

## Proyecto Manejador de Tareas

El desafío es implementar un manejador de tareas que permita una lista de tareas.

### Requisitos para el backend

#### 1) Implementar servicios REST de administración de tareas

Se pide poder realizar las siguientes acciones sobre tareas, mediante servicios REST:

* Listar, crear, eliminar tareas
* El listado de tareas se debe poder filtrar por tareas completadas, activas (aún no completadas) y todas las tareas (activas y completadas)
* Se debe poder editar la descripción de una tarea y además marcarla como "completada"
* Además de la eliminación individual, se debe poder eliminar todas las tareas completadas

Cada tarea debe tener las siguientes propiedades:
* Una descripción
* Una fecha y hora de creación
* Una fecha y hora de completitud
* Un estado que permita saber si la tarea está activa o ya fue completada

#### 2) Implementar servicios REST de asignación de tareas a usuarios

Se debe contar con un servicio que permita asignar una tarea a un usuario del sistema. La restricción que se pide para este servicio es que un usuario no pueda tener más de 5 tareas activas al mismo tiempo. El servicio debe implementar dicha validacion.

Se puede modelar la estructura de un usuario con las propiedades que se consideren necesarias.

#### 3) Implementar servicios REST de estadísticas de tareas

Se pide un servicio REST de consulta que devuelva los siguientes datos estadísticos:

* Tarea con mayor duración, entre el momento que fué creada y completada
* Tarea con menor duración
* Cantidad de tareas que fueron completadas en el día actual
* Cantidad de tareas activas en el día actual
* Porcentaje de tareas completadas sobre el total de tareas existentes

#### 4) Test Unitarios

Se debe implementar test unitarios o de integración que verifiquen los anteriores requerimientos funcionales del 1 al 3. No es necesario tener full coverage, sino seleccionar los puntos más críticos de la lógica del sistema y enfocarse en eso. Por ejemplo, asegurarse de que se puedan crear correctamente las tareas y marcarlas como completadas.

### Requisitos para el frontend

Se debe implementar una aplicación o página web que permita administrar tareas y que haga uso de los servicios REST desarrollados en el backend.

La aplicación de frontend debe permitir:
* Alta y baja de tareas
* Edición de la descripción de una tarea
* Marcar una tarea como completada
* Filtrar tareas completadas y activas
* Eliminar todas las completadas
* Asignación de tareas a usuarios
* Ver un dashboard con información estadística de tareas, de acuerdo a lo que retorne el backend

## Proyecto [Frontend]

> // TODO

## Guías generales

* Se debe proveer de una forma sencilla de probar los ejercicios. Para el caso del backend idealmente sería unos datos de prueba para inserción en base de datos y además una forma de poder invocar a los servicios REST
* Se debe proveer instrucciones detalladas de cómo levantar la solución enviada. Ya sea comandos de instalación/ejecución y todo lo necesario para ejecutar y probar la solución
* Se puede implementar la solución en cualquier framework con el que se esté familiarizado

## Empezando el Desafío

Para empezar a trabajar se debe clonar este proyecto localmente, agregando el código dentro del propio proyecto clonado. 

Cualquier documentación se puede agregar como archivos con extensión `.md`.

Se recomienda ir haciendo commits a medida que se avanza con la solución. Y agrupar estos commits si corresponde hacerlo.

## Envíar el código para evaluación

Cuando se finaliza el trabajo y se está listo para enviar, se debe utilizar el siguiente comando que va a generar una serie de archivos patch con los cambios realizados:

    git format-patch origin/master

Esto va a crear uno o más archivos `.patch` numerados en el directorio del proyecto.

Enviar un email con estos archivos adjuntados a la persona que te envió este test.

¡Buena suerte! 🎉

## Autor

👤 **Sodep S.A.**

* Twitter: [@sodepsa](https://twitter.com/sodepsa)
* Github: [@sodep](https://github.com/sodep)

## Dános tu apoyo

Con una ⭐️ si este repo te sirvió de ayuda.

***
_This README was generated with ❤️ by [readme-md-generator](https://github.com/kefranabg/readme-md-generator)_