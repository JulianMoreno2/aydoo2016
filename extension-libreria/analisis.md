Analisis de Extension Libreria:

La caperta que se me proporciona se llama ejercicio_kiosco, el cual carece
de sentido ya que el programa apunta a vender libros y revistas. Un nombre
apropiado seria ejercicio_libreria, como coincidimos varios de mis compañeros.

El codigo tiene buena indentacion y los nombres de los metodos son claros.

El proyecto consta de nueve clases, con sus respectivos test. Esto me hace
pensar que se uso tdd para cumplir con la consigna, lo cual es valorable.
Ademas provoca que el codigo tenga lo justo y necesario para funcionar, a
traves de cada test, crea una funcionalidad diferente.

Como primera impresion, los nombres de los test tienen errores graves, como
por ejemplo, clienteCompra o lapizConIVA, de cierto modo, no expresan lo que
realmente se esta testeando. Estos dos ejemplos se podrian cambiar por
clienteRealizaUnaCompraEnElMes6 y calculaElIVADeUnArticuloDeLibreria
respectivamente. Recorriendo cada metodo de cada clase de test, verifico que
el alumno tiene que leer algun articulo que enseñe como nombrar los test, ya
que no tiene la creatividad para representar en el nombre, lo que quiere
testear.

Voy a analizar el codigo relacionando las clases y sus test.
La clase KioscoTest comienza con el test kioscoAgregaCliente el cual verifica
que el cliente se encuentra en la lista de clientes, y lo realiza con el
metodo esClienteHabitual. Este test tiene sentido si dentro del codigo se
usara dicho metodo, pero no es asi. Entonces este test carece de sentido.

Ademas este test dispara la creacion de un objeto cliente. Para eso, el
alumno creo la clase clienteTest, esta posee 4 test. Uno de ellos,
direccionCliente, esta demas ya que no es necesario crear un metodo para
testear un simple get. El test clienteCompra, verifica que el cliente
contenga la compra en su lista de compras, pero nuevamente utiliza un
metodo exclusivo para este test, en este caso contieneCompraDeterminada(),
lo cual me parece inncesario ya que el objeto List tiene el metodo contains
que devuelve un boolean, el alumno lo utilizo dentro de este metodo. Podria
haber hecho simplemente un metodo que devuelva el list y usarlo. Por otro
lado, el test clienteContieneCompra tiene un nombre muy parecido al test
anterior, un error grave, ademas no hace referencia a que esta testeando el
metodo. Este test deberia llevar el nombre clienteRealizaUnaSegundaCompra para
que represente lo que se testea.
Estos ultimos dos test conllevan a la creacion del objeto Compra. Para testear
esta clase, el alumno creo compraTest. Esta clase posee solo 2 test. 
El pimero se llama mes11, nuevamente el nombre no es claro por lo que no dice 
nada de lo que se esta testeando. Y ademas, solo testea un get, como señale
anteriormente, carece de sentido testear un get.
El segundo se llama contieneLibro el cual testea que se guarde correctamente
un libro el la lista de productos de la compra. Yo me pregunto, ¿como sabe el
alumno que tambien se guardan revistas, articulos de libreria o periodicos?
¿por qué no lo testeo? Si se analiza la clase Compra, se podra observar que
tambien ha creado el metodo getPrecio, el cual recorre la lista de productos
y se retorna la suma del precio de los productos. Este metodo no esta
testeado.

Por otro lado, el ultimo test de la clase ClienteTest se llama
clienteAgregaSuscripcionASuListaDeCompras, este nombre si representa lo que se
esta testeando, pero el concepto de agregar una suscripcion a la compra no es
correcta, ya que la suscripcion se debe aplicar a un producto, y este producto
agregarse a la compra. El alumno introdujo este concepto en pos de señalar que
cuando se agrega una suscripcion como una compra, lo que se hace es agregar un
producto repetidas veces a su lista. Como ultima observacion de este test, 
en el solo se prueba la existencia de esta suscripcion en la lista del
cliente.

Para analizar la clase Suscripcion, primero y principal tengo que hacer
referencia a lo que señale en el parrafo anterior. El alumno utilizo la
herencia para crear el objeto Suscripcion, el cual hereda de la clase Compra.
Desde el punto de vista del alumno puede parecer una manera correcta de
enfocar el problema, pero no es asi. La suscripcion no es una compra, la
suscripcion se aplica a un producto el cual es comprado en todas sus ediciones
a lo largo del periodo que dure la suscripcion. Esta clase la representa en
test con SuscripcionTest que consta de siete test.
El primer test se llama LibrosNOSePuedeAProductos, por un lado el nombre no
cumple el camel case de java y ademas no esta bien redactado. Se tendria que
llamar noPermiteAgregarSuscripcionDeUnLibro para que represente lo que se
desea testear que consiste en agregar una excepcion (sin especificacion)
para que el programa no permita agregar un libro a una suscripcion.
El siguiente test verifica que no se pueda agregar un articulo de libreria a
una suscripcion.
El proximo test se llama controlaTieneSuscripcionRevistaCargada, nuevamente
el nombre del test no tiene coherencia ni cohesion. Interpretando lo testeado,
el test se podria llamar seAgregaSuscripcionAUnaRevista ya que verifica que
el objeto revista se agrega a la lista de la suscripcion.
El siguiente test se llama cargarNroMes12Suscripcion el cual verifica que se
agregue correctamente el mes a la suscripcion como bien señala el nombre del
test. El problema aqui nuevamente es que testea un get.
El siguiente test es suscripcionNoAnualYPrecioRevista verifica que el precio
de la revista se calcule sin aplicarle el descuento que ofrece la libreria por
la suscripcion anual. Cabe aclarar que la periodicidad del periodico o revista
no esta contemplado en los test, esto genera dudas a la hora de leer el codigo
ya que para agregarle peridocidad al periodico o revista, se le settea un int,
interpreto que este numero es la cantidad de veces que se repite a lo largo de
un mes. Un metodo similar se utiliza para testear que se suscriba un diario
pero sin la suscripcion anual.
El siguiente test es suscripcionAnualYPrecioRevista el cual verifica que se
aplique el descuento a la revista por la suscripcion anual mediante un metodo
llamado activarAnualidad el cual se usa en getPrecio.

Finalmente, el Kiosco contiene el metodo calcularMontoACobrar para un cliente
determinado, recorre su lista de compras y retorna el precio.

Como conclusion de este analisis, confirmo que la consigna se resolvio pero sin
prestar atencion especial a los test, ya que muchos de ellos carecen de
sentido y tienen errores. Ademas, como señalo el profesor en clase, al usar
excepciones, se deben crear las propias o en su defecto, heredar de
RunTimeException. Otro punto a destacar es el intento de aplicar la tecnica
tdd para resolver el problema planteado. 

Modificaciones realizadas para la consigna:

A traves del test AlquilerTest hice los correspondientes test para crear las
clases Alquiler, que tiene de hijos a AlquilerDiario, AlquilerMensual y 
AlquilerCuatrimestral. Estas clases sobreescriben el metodo 
estaDentroDelPeriodoCorrecto porque cada alquiler tiene sus propias
restricciones. Ademas en el constructor de cada una, se calcula el precio
correspondiente a traves del metodo setPrecio que heredan de Alquiler.
Y ademas agregue mas comportamientos al Libro.
Tambien agregue tests a la clase KioscoTest para corroborar que los alquileres
de los libros se suman a la compra de un determinado cliente.
