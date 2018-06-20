<head>
    <meta charset="utf-8">
    <title>..::Login::..</title>
    <link rel="icon" type="image/png" href="imagenes/2.png" />
    <link rel="stylesheet" href="estilos.css">
    <link rel="stylesheet" href="fonts.css">
    <link href="https://fonts.googleapis.com/css?family=Josefin+Sans|Montez|Pathway+Gothic+One" rel="stylesheet">
    <script type="text/JavaScript" src="Alertas.js"></script>

  </head>
  <body>
    <div class="contenedor">

      <header>
        <h1 class="title">Vicalisepase Games    </h1>
        <a href="registrarse.jsp" align="right">Registrarse</a>
        
      </header>
      <div class="login">
        <article class="fondo">
          <h3>Inicio de Sesión</h3>
          <form class="" action="validar.jsp" method="post" onsubmit="return Inicio(this)" id="formulario">
            <input class="inp" type="text" name="user" value=""><br>
            <input class="inp" type="password" name="pass" value=""><br>
            <input class="boton" type="submit" name="inicio" value="Iniciar Sesión" >
          </form>
        </article>
      </div>

    </div>
  </body>