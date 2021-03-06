/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import DAO.DiscountProductDAO;
import DAO.ProductDAO;
import Utilities.CartTotal;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import model.OrderDetails;
import model.Product;

/**
 *
 * @author sa
 */
@WebServlet(name = "CartControl", urlPatterns = {"/cart"})
public class CartControl extends HttpServlet {

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
        request.getRequestDispatcher("cart.jsp").forward(request, response);
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
        String productID = request.getParameter("id");
        String count = request.getParameter("count");
        HttpSession session = request.getSession();
        boolean isExit = false;
        Product pro = new ProductDAO().getProductById(productID);
        
        ArrayList<OrderDetails> list = new ArrayList<>();

        if(session.getAttribute("carts") == null){
            OrderDetails details = new OrderDetails(Integer.parseInt(productID), Integer.parseInt(count));
            try {
                details.setProduct(pro);
            
            } catch (Exception e) {
            }
            list.add(details);
            session.setAttribute("carts", list);
        }else{
            list = (ArrayList<OrderDetails>) session.getAttribute("carts");
            for (OrderDetails o : list) {               
                if(o.getProductID()== Integer.parseInt(productID)){
                    isExit = true;
                    o.setQuantity(o.getQuantity()+ Integer.parseInt(count));
                    break;
                }
            }
            if(!isExit){
                OrderDetails details = new OrderDetails(Integer.parseInt(productID), Integer.parseInt(count));
                try {
                    details.setProduct(pro);
                    
                } catch (Exception e) {
                }
                list.add(details);
            }
        }          
        session.setAttribute("total", CartTotal.getTotal(list));
        response.sendRedirect("home");        
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
