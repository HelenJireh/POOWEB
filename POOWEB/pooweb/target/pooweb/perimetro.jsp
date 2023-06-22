<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Formulario</title>
    <link rel="stylesheet" href="stilo.css">
</head>
<body>
  <form action="Servlets" method="post">
   <label></label>
  <input type="text" name="perimetro">
 <button type="submit" name="control" value="perime">
   Calcular
  </button>
  <p>El Área de la figura es <%=request.getAttribute("perimetro")%></p>
     </form>

     <form action="Servlets" method="post">
      <label></label>
     <input type="text" name="perimetro">
    <button type="submit" name="control" value="perimerec">
      Calcular
     </button>
     <p>El Área de la figura es <%=request.getAttribute("perimetro")%></p>
       </form>


       <form action="Servlets" method="post">
        <label></label>
       <input type="text" name="perimetro">
      <button type="submit" name="control" value="perimepen">
        Calcular
       </button>
       <p>El Área de la figura es <%=request.getAttribute("perimetro")%></p>
         </form>
         <form action="Servlets" method="post">
          <label></label>
         <input type="text" name="perimetro">
        <button type="submit" name="control" value="perimecir">
          Calcular
         </button>
         <p>El Área de la figura es <%=request.getAttribute("perimetro")%></p>
           </form>
  </div>
</body>
</html>
