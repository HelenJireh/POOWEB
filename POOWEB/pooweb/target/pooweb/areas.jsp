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
  <input type="text" name="area">
 <button type="submit" name="control" value="areatrian">
   Calcular
  </button>
  <p>El Área de la figura es <%=request.getAttribute("area")%></p>
     </form>

     <form action="Servlets" method="post">
      <label></label>
     <input type="text" name="area">
    <button type="submit" name="control" value="arearect">
      Calcular
     </button>
     <p>El Área de la figura es <%=request.getAttribute("area")%></p>
       </form>


       <form action="Servlets" method="post">
        <label></label>
       <input type="text" name="area">
      <button type="submit" name="control" value="areapent">
        Calcular
       </button>
       <p>El Área de la figura es <%=request.getAttribute("area")%></p>
         </form>
         <form action="Servlets" method="post">
          <label></label>
         <input type="text" name="area">
        <button type="submit" name="control" value="areacirc">
          Calcular
         </button>
         <p>El Área de la figura es <%=request.getAttribute("area")%></p>
           </form>
  </div>
</body>
</html>


  
