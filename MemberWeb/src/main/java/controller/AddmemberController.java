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


@WebServlet("/AddmemberController")
public class AddmemberController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
 
    public AddmemberController() {
        super();
       
    }

	

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		String username = null;
		String password = null;
		
		username = request.getParameter("username");
		password = request.getParameter("password");
		
		boolean findbyMemberUserName=new MemberDaoImpl().findByMemberUsername(username);
		
		HttpSession session=request.getSession();
		
		if(username == null || username.trim().isEmpty() || 
		   password == null || password.trim().isEmpty() || 
		   findbyMemberUserName)
		{
			response.sendRedirect("addMemberError.jsp");
			return;
		}
		else
		{
			String name = request.getParameter("name");
			String address = request.getParameter("address");
			String phone = request.getParameter("phone");
			String mobile = request.getParameter("mobile");
			
			Member member=new Member(name,username,password,address,phone,mobile);
			
			new MemberDaoImpl().addMember(member);
			session.setAttribute("MemberSession", member);
			response.sendRedirect("member/loginSuccess.jsp");
		}
	}

}
