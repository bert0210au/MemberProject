package filter;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpFilter;
import javax.servlet.http.HttpServletRequest;

@WebFilter("/EncodeFilter")
public class EncodeFilter extends HttpFilter implements Filter {
       
   
    public EncodeFilter() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		// 设定请求编码
	    request.setCharacterEncoding("utf-8");
	    response.setCharacterEncoding("utf-8");

	    // 获取请求路径
	    HttpServletRequest req = (HttpServletRequest) request;
	    String path = req.getServletPath();

	    // 仅对 JSP 或 Servlet 处理 response Content-Type 而不会影响 CSS、JS 或图片等静态资源。
	    if (path.endsWith(".jsp") || path.startsWith("/servlet")) {
	        response.setContentType("text/html; charset=UTF-8");
	    }
		
	    /*
	     方法2 但不太有用
	      	// 设定请求编码
    		request.setCharacterEncoding("utf-8");
    		response.setCharacterEncoding("utf-8");

    		// 仅当 Content-Type 为空或 HTML 时才设定
    		if (response.getContentType() == null || response.getContentType().startsWith("text/html")) {
        	response.setContentType("text/html; charset=UTF-8");
    		}
    		
    		*/
	    
		chain.doFilter(request, response);
	}



}
