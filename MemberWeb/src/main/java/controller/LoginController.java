package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import dao.Impl.MemberDaoImpl;
import modle.Member;


@WebServlet("/LoginController")
public class LoginController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public LoginController() {
        super();
        
    }

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		/*
		 * 1.接收-->request-->username,password
		 * 2.findByUsernameAndPassword判斷-->!null->true/false
		 * 3.true-->LoginSuccess.jsp
		 * 4.false-->LoginError.jsp
		 */
		
		String username=request.getParameter("username");
		String password=request.getParameter("password");
		
		Member member=new MemberDaoImpl().selectMember(username, password);
		HttpSession session=request.getSession();
		if(member!=null)
		{
			session.setAttribute("MemberSession",member );
			response.sendRedirect("member/loginSuccess.jsp");
			
		}
		else
		{
			response.sendRedirect("loginError.jsp");
		}
		
		
		
		
	}

}
