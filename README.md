<h1 align="center">¡Bienvenido! 👋</h1>
<p>
  <a href="https://twitter.com/sodepsa">
    <img alt="Twitter: sodepsa" src="https://img.shields.io/twitter/follow/sodepsa.svg?style=social" target="_blank" />
  </a>
</p>

> El siguiente proyecto contiene desafíos a resolver para potenciales developers. Es un proyecto elaborado y mantenido por Sodep S.A.

### 🏠 [Visitar SODEP](http://sodep.com.py)

## Instrucciones

Leer las instrucciones con atención e implementar lo que se tiene familiaridad en primer lugar. Adicionales instrucciones serán recibidas por e-mail por la persona que te envió este repo.

Para el backend es requerimiento utilizar el lenguaje **Java**, y en general se puede utilizar cualquier framework/librería que facilite la implementación.

## Proyecto Manejador de Tareas

El primer desafío es desarrollar un manejador de tareas.

### Requisitos para el backend

#### 1) Implementar servicios REST de administración de tareas

El primer paso es implementar servicios REST que faciliten el trabajo con tareas mediante las siguientes acciones:

* Listado, creación y eliminación de tareas
* Un filtro del listado de tareas que permita obtener las tareas completadas, activas (aún no completadas) y todas las tareas (activas y completadas)
* Actualización de una tarea, editando su descripción y poder marcarla como "completada"
* Además de la eliminación individual, permitir eliminar todas las tareas completadas

Cada tarea tiene las siguientes propiedades:
* Una descripción
* Una fecha y hora de creación
* Una fecha y hora de completitud
* Un estado que permita saber si la tarea está activa o ya fue completada

Se puede agregar otras propiedades que se consideren necesarias.

#### 2) Implementar servicios REST de asignación de tareas a usuarios

Se pide contar con un servicio que permita asignar una tarea a un usuario del sistema. La restricción para este servicio es que un usuario no pueda tener más de 5 tareas activas al mismo tiempo. Corresponde al servicio implementar dicha validacion.

Se puede modelar la estructura de un usuario con las propiedades que se consideren necesarias.

#### 3) Implementar servicios REST de estadísticas de tareas

Se pide un servicio REST de consulta que devuelva los siguientes datos estadísticos:

* Tarea con mayor duración, entre el momento que fué creada y completada
* Tarea con menor duración
* Cantidad de tareas que fueron completadas en el día actual
* Cantidad de tareas activas en el día actual
* Porcentaje de tareas completadas sobre el total de tareas existentes

#### 4) Test Unitarios

Escribir test unitarios o de integración que verifiquen los anteriores requerimientos funcionales del 1 al 3. No es necesario tener full coverage, sino seleccionar los puntos más críticos de la lógica del sistema y enfocarse en eso. Por ejemplo, asegurarse de que se puedan crear correctamente las tareas y marcarlas como completadas.

### Requisitos para el frontend

El desafío aquí es crear una aplicación WEB que permita administrar tareas y que haga uso de los servicios REST desarrollados en el backend.

La aplicación WEB debe ofrecer las funcionalidades de:
* Alta y baja de tareas
* Edición de la descripción de una tarea
* Marcar una tarea como completada
* Filtrar tareas completadas y activas
* Eliminar todas las tareas completadas
* Asignación de tareas a usuarios
* Ver un dashboard con información estadística de tareas, de acuerdo a lo que retorne el backend

## Proyecto Frontend: GitHub Client

El objetivo es desarrollar una página web que actué como cliente del [API de GitHub](https://developer.github.com/v3/).

El cliente muestra la siguiente información obtenida de GitHub:

* Lista de repositorios ordenados por los más populares y con posibilidad de filtrar por el día, la semana y el mes actual
* Por cada repositorio mostrar su dueño, avatar, cantidad de estrellas y cantidad de issues abiertos. Además de otra información que se considere útil para enriquecer visualmente el listado de repositorios
* Permitir buscar una persona u organización y mostrar los repositorios públicos que posee clasificados por cantidad de estrellas

Diseñar y estructurar el HTML/CSS de la página, de la forma más amigable posible en el tiempo que se tiene disponible.

## Guías generales

* Proveer de una forma sencilla de probar los ejercicios. Para el caso del backend idealmente sería unos datos de prueba para inserción en base de datos y además una forma de poder invocar a los servicios REST. Para el frontend adjuntar los API KEY necesarios para comunicación con GitHub o la forma de conseguirlo 
* Adjuntar documentación con instrucciones detalladas de cómo levantar la solución enviada. Ya sea comandos de instalación/ejecución y todo lo necesario para ejecutar y probar la solución
* Se puede implementar la solución con cualquier framework o librería que facilite el desarrollo. Y se recomienda utilizar herramientas con las que se esté familiarizado. La único no negociable es la **utilización del lenguaje Java** 🙃.

## Empezando el Desafío

Para empezar a trabajar clonar este proyecto localmente, agregando el código dentro del proyecto clonado. 

Adjuntar cualquier documentación al proyecto en forma de archivos con extensión `.md`.

Se recomienda ir haciendo commits a medida que se avanza con la solución. Agrupando estos commits si corresponde hacerlo.

## Envíar el código para evaluación

Crear un fork de este repositorio para implementar los ejercicios haciendo commits a medida que se los van resolviendo.

Luego al finalizar enviar un email con el link al fork a la persona que te envió este test.

¡Buena suerte! 🎉

## Autor

👤 **Sodep S.A.**

* Twitter: [@sodepsa](https://twitter.com/sodepsa)
* Github: [@sodep](https://github.com/sodep)

## Dános tu apoyo

Con una ⭐️ si este repo te sirvió de ayuda.

***
_This README was generated with ❤️ by [readme-md-generator](https://github.com/kefranabg/readme-md-generator)_
