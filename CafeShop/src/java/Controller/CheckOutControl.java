///*
// * To change this license header, choose License Headers in Project Properties.
// * To change this template file, choose Tools | Templates
// * and open the template in the editor.
// */
//package Controller;
//
//import DAO.OrderDAO;
//import DAO.ProductDAO;
//import java.io.IOException;
//import java.io.PrintWriter;
//import java.util.ArrayList;
//import java.util.List;
//import javax.servlet.ServletException;
//import javax.servlet.annotation.WebServlet;
//import javax.servlet.http.HttpServlet;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//import model.Order;
//import model.OrderDetails;
//import model.Product;
//
///**
// *
// * @author sa
// */
//@WebServlet(name = "CheckOutControl", urlPatterns = {"/checkout"})
//public class CheckOutControl extends HttpServlet {
//
//    /**
//     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
//     * methods.
//     *
//     * @param request servlet request
//     * @param response servlet response
//     * @throws ServletException if a servlet-specific error occurs
//     * @throws IOException if an I/O error occurs
//     */
//    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
//            throws ServletException, IOException {
//        response.setContentType("text/html;charset=UTF-8");
//        try (PrintWriter out = response.getWriter()) {
//            /* TODO output your page here. You may use following sample code. */
//            out.println("<!DOCTYPE html>");
//            out.println("<html>");
//            out.println("<head>");
//            out.println("<title>Servlet CheckOutControl</title>");
//            out.println("</head>");
//            out.println("<body>");
//            out.println("<h1>Servlet CheckOutControl at " + request.getContextPath() + "</h1>");
//            out.println("</body>");
//            out.println("</html>");
//        }
//    }
//
//    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
//    /**
//     * Handles the HTTP <code>GET</code> method.
//     *
//     * @param request servlet request
//     * @param response servlet response
//     * @throws ServletException if a servlet-specific error occurs
//     * @throws IOException if an I/O error occurs
//     */
//    @Override
//    protected void doGet(HttpServletRequest request, HttpServletResponse response)
//            throws ServletException, IOException {
//        processRequest(request, response);
//    }
//
//    /**
//     * Handles the HTTP <code>POST</code> method.
//     *
//     * @param request servlet request
//     * @param response servlet response
//     * @throws ServletException if a servlet-specific error occurs
//     * @throws IOException if an I/O error occurs
//     */
//    @Override
//    protected void doPost(HttpServletRequest request, HttpServletResponse response)
//            throws ServletException, IOException {
//        String name = request.getParameter("name");
//        String phoneNumber = request.getParameter("phoneNumber");
//        String address = request.getParameter("address");
//        String gmail = request.getParameter("gmail");
//        String in4 = request.getParameter("information");
//        int accountID = Integer.parseInt(request.getSession().getAttribute("accountID").toString());
//        double total = Double.parseDouble(request.getSession().getAttribute("total").toString());
//        int id = OrderDAO.addOrder(new Order(total, name, phoneNumber, address, gmail, in4, accountID));
//        
//        ArrayList<OrderDetails> carts = (ArrayList<OrderDetails>) request.getSession().getAttribute("carts");
//        for (int i = 0; i < carts.size(); i++) {
//            carts.get(i).setOrderID(id);
//            OrderDAO.addOrderDetails(carts.get(i));
//        }
//        List<Product> listProducts = new ProductDAO().getAllProduct();
//        int quantity = 0;
//        for (int i = 0; i < carts.size(); i++) {
//            for (int j = 0; j < listProducts.size(); j++) {
//                if (carts.get(i).getProductID() == listProducts.get(j).getId()) {
//                    quantity = listProducts.get(j).getQuantity() - carts.get(i).getQuantity();
//                    new ProductDAO().updateProductQuantity(quantity, listProducts.get(j).getId());
//                }
//            }
//        }
//
//        List<Product> listProductSold = new ProductDAO().getAllProduct();
//        for (int i = 0; i < carts.size(); i++) {
//            for (int j = 0; j < listProductSold.size(); j++) {
//                int sold = 0;
//                if (carts.get(i).getProductID() == listProductSold.get(j).getId()) {
//                    sold = listProductSold.get(j).getSold() + carts.get(i).getQuantity();
//                    new ProductDAO().updateProductSold(sold, listProductSold.get(j).getId());
//                }
//            }
//        }
//        request.getSession().setAttribute("total", null);
//        request.getSession().setAttribute("carts", null);
//        response.sendRedirect("thanks");
//    }
//
//    /**
//     * Returns a short description of the servlet.
//     *
//     * @return a String containing servlet description
//     */
//    @Override
//    public String getServletInfo() {
//        return "Short description";
//    }// </editor-fold>
//
//}
