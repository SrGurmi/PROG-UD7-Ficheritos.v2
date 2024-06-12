# PROG-UD7-Ficheritos

## Estructura del Proyecto

|-PROG-UD7-Ficheritos|
|src/|
|└── com/|
|└── salesianos/|
|├── actividad1/|
|│ └── utils/|
|│ └── GuardarTexto|
|├── actividad2/|
|│ └── util/|
|│ └── RecuperarTexto|
|├── actividad3/|
|│ └── utils/|
|│ └── FusionarFicheros|
|└── actividad4/|
|└── utils/|
|├── Main|
|├── Mesa|
|└── MesaManager|
|└── files/|
|├── actividad1.txt|
|├── actividad2.txt|
|├── actividad3.txt|
|└── actividad4.txt|


## Manual de Trabajo

### Actividad 1: Guardado de texto en un fichero

1. Crea un fichero para usar en esta actividad.
2. Solicita al usuario un texto que al menos tenga una longitud de treinta caracteres. Si el usuario introduce menos, indica cuántos le faltaron y vuelve a solicitar otro texto hasta que tenga la longitud mínima.
3. Formatea el texto introducido para que esté todo en mayúsculas y los espacios sean sustituidos por guiones bajos.
4. Guarda el texto formateado en el fichero.

**Clase principal:** `GuardarTexto.java`

### Actividad 2: Recuperación de texto en un fichero

1. Crea un fichero para esta actividad y escribe en él un texto de cierta longitud.
2. Accede al contenido del fichero y muestra cada carácter acompañado de su representación decimal separados por comas. Por ejemplo, “Hola, pibe.”, sería: `H_72, o_111, l_108, a_97, _32, p_112, i_105, b_98, e_101, ._46`

**Clase principal:** `RecuperarTexto.java`

### Actividad 3: Fusionar contenido de varios ficheros

1. Mediante código, crea un fichero para esta actividad.
2. Realiza un programa que fusione el contenido del fichero de la primera actividad con el contenido del fichero de la segunda actividad. El contenido resultante debe quedar como sigue:
   - Contenido del Fichero Uno: `HOLA_PIBE_QUE_TAL,_TODO_BIEN??`
   - Contenido del Fichero Dos: `Chachoooo... carlosssss!!`
3. Añade un mensaje de firma en el fichero tras la copia de los contenidos.
   -Contenido del mensaje de firma: `Firma: Supervisado por Ale`

**Clase principal:** `FusionarFicheros.java`

### Actividad 4: Persistencia y recuperación de objetos

1. Crea un fichero para esta actividad.
2. Crea una clase `Mesa` con dos atributos: `color` y `número de patas`. Sobreescribe el método de representación del objeto para que muestre un texto formateado.
3. Desarrolla una clase con dos métodos:
   - `guardarMesaEnFichero`
   - `obtenerTodasLasMesas`
4. Implementa un menú con dos opciones:
   - `Nueva mesa`: Solicita al usuario un color y un número de patas, crea una instancia de la clase `Mesa` y la guarda en el fichero.
   - `Mostrar todas las mesas almacenadas`: Muestra todo el listado de mesas almacenadas en el fichero.

**Clases principales:** `Mesa.java`, `MesaManager.java`, `Main.java`


## Nuevo Contenido 
