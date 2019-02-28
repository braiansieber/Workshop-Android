# Workshop Android dictado por Marcelo Busico


## Primera Clase
###  Consigna:

- EditText para ingresar nombre y botón para ir a otra activity.
- Cuando se apriete el botón se debe abrir la segunda activity y mostrar en un TextView un “Hola NOMBRE_INGRESADO_EN_PRIMERA_PANTALLA”. Se debe recibir el nombre como parte del intent.
- En la segunda pantalla un botón para volver a la primera pantalla y que le devuelva como result el mensaje escrito en otro EditText propio de la segunda pantalla.
- Manejar la rotación de pantalla haciendo un saveinstancestate y chequeando eso en el on-create para las dos pantallas.
- La primer pantalla chequea el result y en base a eso muestra la respuesta procesada en un TextView pegado a la parte inferior de la pantalla donde si el usuario ingresó algo en la segunda pantalla lo menciona y sino ingresó nada (lo chequeamos con el result code, no vale comparar por string vacio en la primera pantalla) muestra un mensaje diciendo que el usuario canceló la operación.
- Todo debe estar traducido tanto a inglés como español.
- Adicional: Agreguen un segundo botón en la primer activity que abra la cámara con otro request code y muestre como resultado un diálogo (investigar como se hace el diálogo) diciendo si el usuario tomó la foto con éxito o si canceló la captura.

  Bibliografía:
  - [Manifest](https://developer.android.com/guide/topics/manifest/manifest-intro).
  - [Activities](https://developer.android.com/guide/components/activities).
  - [Activity Lifecycle](https://developer.android.com/guide/components/activities/activity-lifecycle).
  - [Intents](https://developer.android.com/guide/components/intents-filters).


## Segunda Clase
###  Consigna:

- Crear una nueva app para la clase 2, donde la activity principal contendrá una lista con nombres de colores y una preview del color. 
- Al hacer click en una celda se deberá abrir un nuevo activity donde en cada extremo (arriba, abajo, izquierda, derecha) se muestren cuadros con color y en el centro el nombre del color.
- La lista de colores debe contener al menos 10 colores, deben quedar hardcoded en el código, tanto el código de color como también el nombre del color.
- Los nombres de los colores deben estar internacionalizados en español e inglés.
- Al rotar la pantalla se debe mantener en la segunda activity el estado con el color seleccionado.
- En la primera pantalla se debe usar recycler view, view holder, adapter.
- En la segunda pantalla se debe usar relative layout y cada cuadrito de color debe ser un frame layout con tamaño de 20dp cuadrado.

  Bibliografía:
  - [Views, Layouts y ViewGroups](https://developer.android.com/guide/topics/ui/declaring-layout?hl=es-419).  
  - [Recycler View](https://developer.android.com/guide/topics/ui/layout/recyclerview).


## Tercera Clase
#### Temas vistos:
      - Repaso de Activity Lifecycle e Intent, Results.
      - Repaso de Recycler View, ViewHolder y Adapter
      - Tabla con scroll infinito y paginado dinámico al hacer scroll
      - Main thread y brackground threads
      - Async Tasks
      - Mención sobre Services, BroadcastReceivers y Main Thread Looper
      - Llamadas a servicios con Retrofit 
      - Descarga de imágenes con Picasso
        Artículo interesante sobre formas de implementar 
        [Tareas Asíncronas en Android](https://medium.com/mindorks/do-it-asynchronously-but-intelligently-35004312c291). para complementar lo visto.


###  Consigna:

- Hacer un app lector de Reddits o similiar (en Kotlin).
- Opcional: Agregar scroll infinito
- Opcional: Ver imagen full screen al elegir una fila de la tabla.
- Opcional: Implementar Pull to Refresh (a esto no lo vimos pero el que quiera go ahead).

  [API a consumir](https://www.reddit.com/top.json).
  [App de Ejemplo](https://github.com/marcelobusico/reddit-android-app).

  Pantalla principal:


