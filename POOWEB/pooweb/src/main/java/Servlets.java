import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.sound.sampled.Control;

public class Servlets extends HttpServlet{

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {  
       String control=req.getParameter("control");
        System.out.println("control");     
        switch(control){
            case "Rectangulo":
            req.getRequestDispatcher("fig.jsp").forward(req, resp);
            break;
            case "Triangulo":
            req.getRequestDispatcher("fig.jsp").forward(req, resp);
            break;
            case "Pentagono":
            req.getRequestDispatcher("fig.jsp").forward(req, resp);
            break;
            case "Circulo":
            req.getRequestDispatcher("fig.jsp").forward(req, resp);
            break;
        }
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
          String control=req.getParameter("control");
        System.out.println("control"); 
        
        switch(control){
            case "areaTrian":
            Triangulo trian=new Triangulo();
            Double t=Double.parseDouble(req.getParameter("area"));
           req.setAttribute("area",trian.calcularArea());
           req.setAttribute("perimetro",trian.calcularPerimetro());
           req.getRequestDispatcher("perimetro.jsp").forward(req, resp);
            req.getRequestDispatcher("area.jsp").forward(req, resp);
            break;
        }
       
        switch(control){
            case "areaRect":
             Rectangulo rect=new Rectangulo();
             Double t=Double.parseDouble(req.getParameter("area"));
             req.setAttribute("area", rect.calcularArea());
             req.setAttribute("perimetro", rect.calcularPerimetro());
             req.getRequestDispatcher("area.jsp").forward(req, resp);
             req.getRequestDispatcher("perimetro.jsp").forward(req, resp);
             break;
        }

       
        switch(control){
            case "areapent":
             Pentagono pent=new Pentagono();
             Double t=Double.parseDouble(req.getParameter("area"));
             req.setAttribute("area", pent.calcularArea());
              req.setAttribute("perimetro", pent.calcularPerimetro());
             req.getRequestDispatcher("area.jsp").forward(req, resp);
             req.getRequestDispatcher("permetro.jsp").forward(req, resp);
             break;

        }

        switch(control){
            case "areacirc":
             Circulo circ=new Circulo();
             Double t=Double.parseDouble(req.getParameter("area"));
             req.setAttribute("area", circ.calcularArea());
             req.setAttribute("perimetro", circ.calcularPerimetro());
             req.getRequestDispatcher("area.jsp").forward(req, resp);
             req.getRequestDispatcher("perimetro.jsp").forward(req, resp);
             break;
        }


    }



    
    
}
