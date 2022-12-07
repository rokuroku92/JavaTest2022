package com.yid.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/yid")
public class YidServlet extends HttpServlet{
    
    private List<String[]> ctList = new ArrayList<>();
    
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // 導向 form.jsp 的表單
        RequestDispatcher rd = req.getRequestDispatcher("/WEB-INF/view/yid.jsp");
        rd.forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // 得到 form 表單資料
        doHandler(req, resp);
    }
    
    private void doHandler(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // 得到 form 表單資料
        req.setCharacterEncoding("UTF-8");
        String company = req.getParameter("company");
        String name = req.getParameter("name");
        String tel = req.getParameter("tel");
        String tel2 = req.getParameter("tel2");
        String email = req.getParameter("email");
        String content = req.getParameter("content");
        // 遍歷
        System.out.println("company: "+company);
        System.out.println("name: "+name);
        System.out.println("tel: "+tel);
        System.out.println("tel2: "+tel2);
        System.out.println("email: "+email);
        System.out.println("content: "+content);
        String[] ctArray = new String[6];
        ctArray[0] = company;
        ctArray[1] = name;
        ctArray[2] = tel;
        ctArray[3] = tel2;
        ctArray[4] = email;
        ctArray[5] = content;
        ctList.add(ctArray);
        // 導向 elec.jsp 的表單
        RequestDispatcher rd = req.getRequestDispatcher("/WEB-INF/view/yid.jsp");
        req.setAttribute("company", company);
        req.setAttribute("name", name);
        req.setAttribute("tel", tel);
        req.setAttribute("tel2", tel2);
        req.setAttribute("email", email);
        req.setAttribute("content", content);
        req.setAttribute("ctList", ctList);
        rd.forward(req, resp);
    }

}
