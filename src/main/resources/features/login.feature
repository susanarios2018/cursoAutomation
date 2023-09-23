#language:es
  Característica:
    Escenario: Login correcto
      Dado Que el usuario ingresa al login de la pagina opencart
      Cuando El usuario ingresa email y contraseña validos
      Entonces El usuario se encuentra en la pantalla de su cuenta

    Escenario: Registro exitoso de usuario
      Dado Estoy en la página de inicio
      Cuando Hago clic en Iniciar Sesión
      Y Lleno el formulario de registro con los siguientes datos:
      | Nombre    | Apellido  | Email                  | Teléfono      | Contraseña  | Confirmación Contraseña |
      | Susana    | Rios      | probandosuuuuu@gmail.com| 123456        | probando    | probando                |
      Y Acepto los términos y condiciones
      Y Hago clic en "Continuar"
      Entonces Debería ver la página de cuenta con el título Account
