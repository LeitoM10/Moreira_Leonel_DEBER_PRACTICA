#Herencia

La herencia es un principio de la programación orientada a objetos que permite que una clase herede atributos y métodos de otra.

En este proyecto, la clase Empleado actúa como clase base, mientras que Medico y Administrativo son clases derivadas. Estas reutilizan atributos comunes como cédula, nombre y edad, evitando duplicación de código.

#Encapsulamiento

El encapsulamiento consiste en proteger los datos de una clase mediante atributos privados y controlar su acceso a través de métodos.

En el sistema, los atributos de Empleado son privados y se accede a ellos mediante métodos como getCedula(), lo que garantiza mayor seguridad y control sobre la información.

#Polimorfismo

El polimorfismo permite tratar diferentes objetos de manera uniforme, aunque cada uno tenga su propia implementación.

Se utiliza un ArrayList<Empleado> que almacena tanto objetos Medico como Administrativo. Cada uno implementa el método calcularPago() de forma diferente, pero se accede a través del mismo tipo base.

#Excepciones

Las excepciones son errores que ocurren durante la ejecución del programa.

En el proyecto se utiliza try-catch para manejar errores como el ingreso de datos inválidos en el menú o conversiones incorrectas, evitando que el programa se detenga inesperadamente.

#Conversiones

Las conversiones permiten transformar datos de un tipo a otro.

Se utilizan métodos como:

Integer.parseInt() para convertir texto a entero
Double.parseDouble() para convertir texto a decimal

Estas conversiones son necesarias para procesar correctamente la información ingresada por el usuario.

#Validaciones

Las validaciones aseguran que los datos ingresados sean correctos antes de ser utilizados.

En el sistema se validan aspectos como:

Campos no vacíos
Formato correcto de correo
Teléfono solo con números
Evitar cédulas duplicadas

Esto garantiza la integridad y calidad de los datos.
