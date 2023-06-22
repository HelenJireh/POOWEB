<html>
<body>
<h2>Prueba incluir expresiones</h2>
<%--Expresiones--%>
<p><%= new String("Helen").toUpperCase() %></p>
<%--Scriptlets--%>
<p><%
    for(int i=0;i<4;i++){
        out.println("<BR>Iteracion"+i);
    }
    %></p>

    <%--Daclaraciones--%>
    <p><%!
        private int res;

        public int sumar(int n1,int n2){
            res=n1+n2;
            return res;
        }
        %></p>
      <p>el resultado de la suma es:<%= sumar(15,25)%></p>  
</body>
</html>
