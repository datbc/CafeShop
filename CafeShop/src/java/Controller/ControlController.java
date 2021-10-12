/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Utilities.CartTotal;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.OrderDetails;

/**
 *
 * @author sa
 */
@WebServlet(name = "Control", urlPatterns = {"/control"})
public class ControlController extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet ControlController</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet ControlController at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String action = request.getParameter("action");
        switch (action) {
            case "plus":
                plus(request, response);
                break;
            case "minus":
                minus(request, response);
                break;
            case "remove":
                remove(request, response);
                break;
        }
    }

    private void plus(HttpServletRequest request, HttpServletResponse response) throws IOException {
        ArrayList<OrderDetails> orders = (ArrayList<OrderDetails>) request.getSession().getAttribute("carts");
        String id = request.getParameter("id");

        for (int i = 0; i < orders.size(); i++) {
            if (Integer.parseInt(id) == orders.get(i).getProduct().getId()) {
                orders.get(i).setQuantity(orders.get(i).getQuantity() + 1);

            }
        }
        request.getSession().setAttribute("carts", orders);
        request.getSession().setAttribute("total", CartTotal.getTotal(orders));
        response.sendRedirect("cart");
    }

    private void minus(HttpServletRequest request, HttpServletResponse response) throws IOException {
        ArrayList<OrderDetails> orders = (ArrayList<OrderDetails>) request.getSession().getAttribute("carts");
        String id = request.getParameter("id");

        for (int i = 0; i < orders.size(); i++) {
            if (Integer.parseInt(id) == orders.get(i).getProduct().getId()) {
                orders.get(i).setQuantity(orders.get(i).getQuantity() - 1);
            }
            if(orders.get(i).getQuantity()==0){
                orders.remove(i);               
            }
        }
        if (orders.size() == 0) {
            request.getSession().setAttribute("carts", null);
        } else {
            request.getSession().setAttribute("carts", orders);
        }
        
        request.getSession().setAttribute("total", CartTotal.getTotal(orders));
        response.sendRedirect("cart");

    }

    public void remove(HttpServletRequest request, HttpServletResponse response) throws IOException {
        ArrayList<OrderDetails> orders = (ArrayList<OrderDetails>) request.getSession().getAttribute("carts");
        String id = request.getParameter("id");
        for (int i = 0; i < orders.size(); i++) {
            if (Integer.parseInt(id) == orders.get(i).getProduct().getId()) {
                orders.remove(i);
            }
        }
        if (orders.size() == 0) {
            request.getSession().setAttribute("carts", null);
        } else {
            request.getSession().setAttribute("carts", orders);
        }
        request.getSession().setAttribute("total", CartTotal.getTotal(orders));
        response.sendRedirect("cart");
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
