# Imagen-Jlabel

PROGRAMA EN JAVA QUE AL PRESIONAR UN BOTÓN PUEDA INSERTAR UNA IMAGEN DE FONDO A UN JLABEL

##Explicación de código fuente

El siguiente programa como su nombre lo dice que se insertará una imagen de fondo al presionar un botón, para este ejercicio, el programa fue hecho en el entorno de programación (IDE) de NetBeans, asimismo para su compilación y ejecución se utilizó la interfaz que ya trae incorporado este programa.
A continuación, se presenta el código en donde se importan las librerías necesarias para poder utilizar algunas clases que se implementaron en este programa.

![imagen](https://user-images.githubusercontent.com/71055467/108906406-79b89580-75e6-11eb-9716-f739c082bdad.png)

El siguiente paso es crear una clase principal, es decir, en donde implementará la función main, esto es necesario porque en todo programa al ejecutarse comienza con este método.
En esta misma clase se instancia una clase llamada Window, la cual nos servirá para crear el marco del programa, y para que se pueda ver en la siguiente línea se hace visible con el método setVisible.

![imagen](https://user-images.githubusercontent.com/71055467/108906434-82a96700-75e6-11eb-8a85-bb44759e0299.png)

Ahora lo que sigue es programar la ventana, como agregar el panel necesario para que a partir de aquí se pueda agregar el botón y la imagen, es aquí donde se encuentra la mayor parte del código fuente del programa.
La clase window se declara como se muestra en seguida, esta hereda de la clase JPanel, ya que es ella la que sirve para crear marcos.

![imagen](https://user-images.githubusercontent.com/71055467/108906474-8ccb6580-75e6-11eb-8d53-b8fc50e23e94.png)

Lo primero que se encuentra adentro de la clase Window es la declaración de variables que se ocuparán más adelante.

![imagen](https://user-images.githubusercontent.com/71055467/108906503-9523a080-75e6-11eb-93fb-624c7aa576ae.png)

Después de esto, se crea una clase necesario para la creación de una lámina, una vez declarado la clase, se procede a crear un constructor de la clase, es decir se establecerá un estado inicial a la ventana, en este caso se establece el tamaño del panel.
En líneas siguientes se muestra el código del método que servirá para agregar la imagen y que se ponga a la escucha para que cuando sea llamada, esta ejecuta lo que contiene.
Este método recibe datos por parámetros, en este caso recibirá un objeto de tipo Graphics necesario para crear la imagen.
Se establecen dimensiones, después se señala en donde se encuentra el archivo a mostrar, y una vez listo la imagen se establecen las dimensiones de acho y largo y por último se pinta la imagen para que se pueda ver en la pantalla. Eso sería todo lo que contiene esta clase.

![imagen](https://user-images.githubusercontent.com/71055467/108906540-9ead0880-75e6-11eb-9cdd-eebe320d1a7e.png)

Así como se agregó un constructor a la clase Imagen se hace lo mismo para la clase Window, lo que contiene en esta parte es las configuraciones para que el marco del programa aparezca en el centro de la pantalla de cualquier computadora, ya que se establecen ciertos métodos para que se adapte a la computadora a la que se encuentra y se presente el marco centrado.
 
![imagen](https://user-images.githubusercontent.com/71055467/108906590-ad93bb00-75e6-11eb-904c-171f3d645bfd.png)

Lo que se presenta a continuación es el código fuente en donde se crea el botón, el panel y los diferentes componentes, para esta parte del código utilizamos las herramientas que nos ofrece NetBeans, estas son las herramientas para crear la interfaz gráfica de manera más sencilla, simplemente se selecciona los componentes que se necesitan y se agregan al panel que anteriormente ya se haya creado. Es por ello que se hará una breve descripción comentando en el código como se muestra ahora;

![imagen](https://user-images.githubusercontent.com/71055467/108906625-b5ebf600-75e6-11eb-96b0-284f25b5cdad.png)
![imagen](https://user-images.githubusercontent.com/71055467/108906646-bb494080-75e6-11eb-8d6d-071f378945c6.png)

El método que aparece mas adelante es para que se ponga a la escucha en caso de que es invocado, el método presentado ya está predefinido en la API de java, este método se utiliza cuando necesitamos que reaccione al tipo de evento ACTION_EVENT y el componente generador en este caso es el botón, en esta sección del código es donde agregará la imagen al panel una vez que el usuario le ha dado click.

![imagen](https://user-images.githubusercontent.com/71055467/108906692-c69c6c00-75e6-11eb-9098-2f9197bfa215.png)

Por último, el código mostrado es el que ha creado el propio NetBeans este sirve para que una clase llamada Nimbus utiliza gráficos vectoriales Java 2D para dibujar la interfaz de usuario (IU), y es gracias a esto que nos muestra una apariencia como el que veremos en el apartado de ejecución.

![imagen](https://user-images.githubusercontent.com/71055467/108906715-cd2ae380-75e6-11eb-8c41-f781453688da.png)

Eso es todo el código fuente del primer programa, ahora veremos la ejecución del programa adjuntando un screenshot para evidenciar de que efectivamente no tiene algún problema el código.



Ejecución del programa 1


	Cuando le damos en la opción de compilar y ejecutar en NetBeans nos mostrará la siguiente ventana y en su interior podremos ver un botón con el nombre” Imagen”, por el momento no se muestra la imagen porque con un click que le haremos al botón es cuando mostrará la imagen.

![imagen](https://user-images.githubusercontent.com/71055467/108906764-db78ff80-75e6-11eb-8b29-7e75d27305c1.png)

Ahora si le hacemos click en el botón, vemos como nos aparece la imagen siguiente y lo que sucede es que en el momento de que el usuario da click sobre el botón este lo detecta e invoca al método ActionPerformed y se ejecuta la línea de código que contiene.


![imagen](https://user-images.githubusercontent.com/71055467/108906801-e7fd5800-75e6-11eb-95e1-ff56150f7730.png)



