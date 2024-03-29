package com.healAssist.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.healAssist.DAO.NotificationDAO;

/**
 * Servlet implementation class UpdNotifications
 */
@WebServlet("/UpdNotifications")
public class UpdNotifications extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UpdNotifications() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("Get Notifications GET");
		String userId = request.getParameter("userId");
		String notificationId = request.getParameter("notificationId");
		String notifications = "[]";
		response.setContentType("text/json");

		NotificationDAO nDao = new NotificationDAO();
		
		if(notificationId != null)
			nDao.updNotification(notificationId);
		
		if(userId != null){
			notifications = nDao.getUserNotifications(userId);
		}
		response.getWriter().write(notifications);
//		PrintWriter pw = response.getWriter();
//		pw.write(notifications);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
