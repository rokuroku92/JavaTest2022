package com.yid.controller;

import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/elec")
public class ElecServlet extends HttpServlet{

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // 導向 bmiform.jsp 的表單
        RequestDispatcher rd = req.getRequestDispatcher("/WEB-INF/view/elec.jsp");
        rd.forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // 得到 form 表單資料
        doHandler(req, resp);
    }
    
    
    private void doHandler(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // 得到 form 表單資料
        String v = req.getParameter("volt");
        String a = req.getParameter("ampere");
        String uh = req.getParameter("use_hours");
        String p = req.getParameter("price");
        // 由字串 String 轉成 double,int
        int volt = Integer.parseInt(v);
        double ampere = Double.parseDouble(a);
        int use_hours = Integer.parseInt(uh);
        int price = Integer.parseInt(p);
        double ans = volt*ampere/1000.0*use_hours*30*price;
        // 將結果回應(response)給 client 端
        System.out.println(ans);
        
        // 導向 elec.jsp 的表單
        RequestDispatcher rd = req.getRequestDispatcher("/WEB-INF/view/elec.jsp");
        req.setAttribute("volt", volt);
        req.setAttribute("ampere", ampere);
        req.setAttribute("use_hours", use_hours);
        req.setAttribute("price", price);
        req.setAttribute("ans", ans);
        rd.forward(req, resp);
    }

    
    
}
