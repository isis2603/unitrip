# API de la aplicación UNITRIP

## Entidad Viaje
### Estructura de objeto Viaje
```javascript
{ 
    id: '' /*Tipo Long*/,
    name: '' /*Tipo String*/,
    description: '' /*Tipo String*/,
    image: '' /*Tipo String*/,
    itinerarios: [] /*Colección de registros de Itinerarios*/,
    experiencias: [] /*Colección de registros de Experiencias*/
}
```


### Servicios
Método | URL | Acción | Parametros | Cuerpo | Retorno 
------------ | ------------- | ------------- | ------------- | ------------- | -------------
GET|/viajes |Lista los registros de Viaje (READ) |@QueryParam page: página a consultar.@QueryParam maxRecords: cantidad de registros a consultar.Si se omite alguno de estos parámetros se obtiene todos los registros en la base de datos|	|Colección de registros de Viaje y el total de registros en la base de datos en el header X-Total-Count|
GET|/viajes/:viajeid |Obtener los atributos de una instancia de Viaje (READ) |@PathParamviajesid: Identificador del registro  | | Atributos de la instancia de Viaje| 
POST|/viajes |Crear una nueva instancia de la entidad Viaje (CREATE) | |Atributos de la instancia de Viaje a crear | Instancia de Viaje creada, incluyendo su nuevo ID| 
PUT|/viajes/:viajeid |Actualiza una instancia de la entidad Viaje (UPDATE) |@PathParam viajeid: Identificador del registro |Objeto JSON de Viaje | Instancia de Viaje actualizada
DELETE|/viajes/:viajesid |Borra instancia de Viaje en el servidor (DELETE) |@PathParam viajeid: Identificador del registro | | | 
GET|/viajes/:viajeid |Obtener los atributos de una instancia de Viaje (READ) |@PathParam viajesid: Identificador del registro  | | Atributos de la instancia de Viaje|
GET|/viajes/:viajesid/itinerarios |Listar registros de itinerarios (Itinerario) asociados a Viaje|@PathParam viajesid: Identificador del viaje  | | Colección de objetos JSON de itinerarios(Itinerario)|
GET|/viajes/:viajesid/itinerarios/:itinerariosid |Obtener un registro de itinerario (Itinerario) asociado a un Viaje|@PathParam viajesid: Identificador de instancia de Viaje - @PathParam itinerariosid: Identificador de instancia de Itinerario | | Lista de registros de itinerarios(Itinerario)|
POST|/viajes/:viajesid/itinerarios/:itinerariosid |Asocia una instancia de itinerario a una de Viaje|@PathParam viajesid: Identificador de instancia de Viaje - @PathParam itinerariosid: Identificador de instancia de Itinerario |Registro de itinerario(Itinerario) para asociar a Viaje |Instancia de Itinerario(Itinerario) asociada a instancia de Viaje|
DELETE|/viajes/:viajesid/itinerarios/:itinerariosid |Actualización de instancias de itinerarios (Itinerario) asociadas a Viaje|@PathParam viajesid: Identificador de instancia de Viaje - @PathParam itinerariosid: Identificador de instancia de Itinerario |Colección de instancias de itinerarios(Itinerarios) a actualizar|Colección de instancias de itinerarios(Itinerarios) actualizados|
GET|/viajes/:viajesid/experiencias |Listar registros de experiencias (Experiencia) asociados a Viaje|@PathParam viajesid: Identificador del viaje  | | Colección de objetos JSON de experiencias(Experiencia)|
GET|/viajes/:viajesid/experiencias/:experienciasid |Obtener un registro de experiencia (Experiencia) asociado a un Viaje|@PathParam viajesid: Identificador de instancia de Viaje - @PathParam experienciasid: Identificador de instancia de Experiencia | | Lista de registros de experiencias(Experiencias)|
POST|/viajes/:viajesid/experiencias/:experienciasid |Asocia una instancia de experiencia a una de Viaje|@PathParam viajesid: Identificador de instancia de Viaje - @PathParam experienciasid: Identificador de instancia de Experiencia |Registro de experiencia(Experiencia) para asociar a Viaje |Instancia de experiencia(Experiencia) asociada a instancia de Viaje|
DELETE|/viajes/:viajesid/experiencias/:experienciasid |Actualización de instancias de experiencias (Experiencia) asociadas a Viaje|@PathParam viajesid: Identificador de instancia de Viaje - @PathParam experienciasid: Identificador de instancia de Experiencia |Colección de instancias de experiencias(Experiencia) a actualizar|Colección de instancias de experiencias(Experiencia) actualizados|

## Entidad Itinerario
### Estructura de objeto Itinerario
```javascript
{ 
    id: '' /*Tipo Long*/,
    name: '' /*Tipo String*/,
    description: '' /*Tipo String*/,
    fechaInicio:  '' /*Tipo Date*/,
    fechaFin:  '' /*Tipo Date*/,
    paradas: [] /*Colección de registros de Paradas*/
}
```
### Servicios
Método | URL | Acción | Parametros | Cuerpo | Retorno 
------------ | ------------- | ------------- | ------------- | ------------- | -------------
GET|/itinerarios |Lista los registros de Itinerario (READ) |@QueryParam page: página a consultar.@QueryParam maxRecords: cantidad de registros a consultar.Si se omite alguno de estos parámetros se obtiene todos los registros en la base de datos|	|Colección de registros de Itinerario y el total de registros en la base de datos en el header X-Total-Count|
GET|/itinerarios/:itinerariosid |Obtener los atributos de una instancia de Itinerario (READ) |@PathParam itinerariosid: Identificador del registro  | | Atributos de la instancia de Itinerario| 
POST|/itinerarios |Crear una nueva instancia de la entidad Itinerario (CREATE) | |Atributos de la instancia de Itinerario a crear | Instancia de itinerariosid creada, incluyendo su nuevo ID| 
PUT|/itinerarios/:itinerariosid |Actualiza una instancia de la entidad Itinerario (UPDATE) |@PathParam itinerariosid: Identificador del registro |Objeto JSON de Itinerario | Instancia de Itinerario actualizada
DELETE|/itinerarios/:itinerariosid |Borra instancia de Itinerario en el servidor (DELETE) |@PathParam itinerariosid: Identificador del registro | | |
GET|/itinerarios/:itinerariosid/paradas |Listar registros de paradas (Parada) asociados a Itinerario|@PathParam itinerarioid: Identificador del itinerario  | | Colección de objetos JSON de paradas(Parada)|
GET|/itinerarios/:itinerariosid/paradas/:paradasid |Obtener un registro de parada (parada) asociado a un Itinerario|@PathParam itinerariosid: Identificador de instancia de Itinerario - @PathParam paradasid: Identificador de instancia de Parada | | Lista de registros de paraddas(Paradas)|
POST|/itinerarios/:itinerariosid/paradas/:paradasid |Asocia una instancia de Parada a una de itinerario|@PathParam itinerariosid: Identificador de instancia de Itinerario - @PathParam paradasid: Identificador de instancia de Parada |Registro de parada(Parada) para asociar a Itinerario |Instancia de paradas(Parada) asociada a instancia de Itinerario|
DELETE|/itinerarios/:itinerariosid/paradas/:paradasid |Actualización de instancias de paradas (Parada) asociadas a Itinerario|@PathParam itinerariosid: Identificador de instancia de Itinerario - @PathParam paradasid: Identificador de instancia de Parada |Colección de instancias de paradas(Parada) a actualizar|Colección de instancias de paradas(Parada) actualizados|


## Entidad Parada
### Estructura de objeto Parada
```javascript
{ 
    id: '' /*Tipo Long*/,
    name: '' /*Tipo String*/,
    latitude: /*Tipo Long*/,
    longitude: /*Tipo Long*/,
    description: '' /*Tipo String*/,
    fechaLlegeda:  '' /*Tipo Date*/,
    fechaSalida:  '' /*Tipo Date*/,
    eventos: [] /*Colección de registros de Eventos*/
}
```
### Servicios
Método | URL | Acción | Parametros | Cuerpo | Retorno 
------------ | ------------- | ------------- | ------------- | ------------- | -------------
GET|/paradas |Lista los registros de Parada (READ) |@QueryParam page: página a consultar.@QueryParam maxRecords: cantidad de registros a consultar.Si se omite alguno de estos parámetros se obtiene todos los registros en la base de datos|	|Colección de registros de Viaje y el total de registros en la base de datos en el header X-Total-Count|
GET|/paradas/:viajeid |Obtener los atributos de una instancia de Parada (READ) |@PathParamparadasid: Identificador del registro  | | Atributos de la instancia de Parada| 
POST|/paradas |Crear una nueva instancia de la entidad Parada (CREATE) | |Atributos de la instancia de Parada a crear | Instancia de Parada creada, incluyendo su nuevo ID| 
PUT|/:paradas/:paradasid |Actualiza una instancia de la entidad Parada (UPDATE) |@PathParam paradasid: Identificador del registro |Objeto JSON de Parada | Instancia de Parada actualizada
DELETE|/:paradas/:paradasid |Borra instancia de Parada en el servidor (DELETE) |@PathParam paradasid: Identificador del registro | | | 

## Entidad Evento   
### Estructura de objeto Evento
```javascript
{ 
    id: '' /*Tipo Long*/,
    name: '' /*Tipo String*/,
    latitude: /*Tipo Long*/,
    longitude: /*Tipo Long*/,
    description: '' /*Tipo String*/,
    fechaInicio:  '' /*Tipo Date*/,
    fechaFin:  '' /*Tipo Date*/
}
```
### Servicios
Método | URL | Acción | Parametros | Cuerpo | Retorno 
------------ | ------------- | ------------- | ------------- | ------------- | -------------
GET|/eventos |Lista los registros de Evento (READ) |@QueryParam page: página a consultar.@QueryParam maxRecords: cantidad de registros a consultar.Si se omite alguno de estos parámetros se obtiene todos los registros en la base de datos|	|Colección de registros de Evento y el total de registros en la base de datos en el header X-Total-Count|
GET|/eventos/:viajeid |Obtener los atributos de una instancia de Evento (READ) |@PathParameventosid: Identificador del registro  | | Atributos de la instancia de Evento| 
POST|/eventos |Crear una nueva instancia de la entidad Evento (CREATE) | |Atributos de la instancia de Evento a crear | Instancia de Evento creada, incluyendo su nuevo ID| 
PUT|/eventos/:eventosid |Actualiza una instancia de la entidad Evento (UPDATE) |@PathParam eventosid: Identificador del registro |Objeto JSON de Evento | Instancia de Evento actualizada
DELETE|/eventos/:eventosid |Borra instancia de Evento en el servidor (DELETE) |@PathParam eventosid: Identificador del registro | | | 

## Entidad Experiencia
### Estructura de objeto Experiencia
```javascript
{ 
    id: '' /*Tipo Long*/,
    name: '' /*Tipo String*/,
    description: '' /*Tipo String*/,
    fechaPublicacion:  '' /*Tipo Date*/
}
```
### Servicios
Método | URL | Acción | Parametros | Cuerpo | Retorno 
------------ | ------------- | ------------- | ------------- | ------------- | -------------
GET|/experiencias |Lista los registros de Experiencia (READ) |@QueryParam page: página a consultar.@QueryParam maxRecords: cantidad de registros a consultar.Si se omite alguno de estos parámetros se obtiene todos los registros en la base de datos|	|Colección de registros de Experiencia y el total de registros en la base de datos en el header X-Total-Count|
GET|/experiencias/:viajeid |Obtener los atributos de una instancia de Experiencia (READ) |@PathParamexperienciasid: Identificador del registro  | | Atributos de la instancia de Experiencia| 
POST|/experiencias |Crear una nueva instancia de la entidad Experiencia (CREATE) | |Atributos de la instancia de Experiencia a crear | Instancia de Experiencia creada, incluyendo su nuevo ID| 
PUT|/experiencias/:experienciasid |Actualiza una instancia de la entidad Experiencia (UPDATE) |@PathParam experienciasid: Identificador del registro |Objeto JSON de Experiencia | Instancia de Experiencia actualizada
DELETE|/experiencias/:experienciasid |Borra instancia de Experiencia en el servidor (DELETE) |@PathParam experienciasid: Identificador del registro | | | 





   [dill]: <https://github.com/joemccann/dillinger>
   [git-repo-url]: <https://github.com/joemccann/dillinger.git>
   [john gruber]: <http://daringfireball.net>
   [@thomasfuchs]: <http://twitter.com/thomasfuchs>
   [df1]: <http://daringfireball.net/projects/markdown/>
   [marked]: <https://github.com/chjj/marked>
   [Ace Editor]: <http://ace.ajax.org>
   [node.js]: <http://nodejs.org>
   [Twitter Bootstrap]: <http://twitter.github.com/bootstrap/>
   [keymaster.js]: <https://github.com/madrobby/keymaster>
   [jQuery]: <http://jquery.com>
   [@tjholowaychuk]: <http://twitter.com/tjholowaychuk>
   [express]: <http://expressjs.com>
   [AngularJS]: <http://angularjs.org>
   [Gulp]: <http://gulpjs.com>

   [PlDb]: <https://github.com/joemccann/dillinger/tree/master/plugins/dropbox/README.md>
   [PlGh]:  <https://github.com/joemccann/dillinger/tree/master/plugins/github/README.md>
   [PlGd]: <https://github.com/joemccann/dillinger/tree/master/plugins/googledrive/README.md>
   [PlOd]: <https://github.com/joemccann/dillinger/tree/master/plugins/onedrive/README.md>
