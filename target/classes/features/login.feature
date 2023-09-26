#language:es
  Característica:
    Escenario: Login correcto
      Dado Que el usuario ingresa al login de la pagina opencart
      Cuando El usuario ingresa email y contraseña validos
      Entonces El usuario se encuentra en la pantalla de su cuenta

    Escenario: Registro correcto
      Dado Que el usuario ingresa al Register de la pagina opencart
      Cuando El usuario completa el formulario
      Entonces Verifica creacion de cuenta con el título "Account"

    Escenario: Agrega favorito
      Dado Que el usuario se loguea en la pagina opencart
      Cuando El usuario se encuentra en la solapa cameras
      Entonces Selecciona la camara a favoritos
      Y Valida el titulo de la camara

    Escenario:
      Dado Se loguea
      Cuando El usuario accede a la solapa cameras
      Entonces Agrega una camara al carro de compras
      Y Valida el titulo de la camara en el carro de compras



