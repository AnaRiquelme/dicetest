/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package controller;

import Operation.Dado;
import com.google.gson.Gson;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author ana
 */
public class ControlJson extends HttpServlet {

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
        PrintWriter out = response.getWriter();
        Integer num1;
        Integer num2;
        if( request.getParameter("num1")== null){
              if( request.getParameter("num2")== null){
            Gson gson = new Gson();
            Map<String, String> data = new HashMap<>();
            data.put("status", "401");
            data.put("message", "error de autenticación");
            String resultado = gson.toJson(data);
            request.setAttribute("contenido", resultado);
            getServletContext().getRequestDispatcher("/jsp/messageAjax.jsp").forward(request, response);
        }
        
        }else {
             num1 = Integer.parseInt(request.getParameter("num1"));
             num2 = Integer.parseInt(request.getParameter("num2"));
             Integer num = Dado.aleatorio(num1, num2);
             String data = new Gson().toJson(num);
             data = "{\"list\":" + data + "}";
            request.setAttribute("contenido", data);
            getServletContext().getRequestDispatcher("/jsp/messageAjax.jsp").forward(request, response);
        }
        try {
          
            
           
        } finally {
            out.close();
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
        processRequest(request, response);
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
