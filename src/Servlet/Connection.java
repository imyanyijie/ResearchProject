package Servlet;

import java.io.IOException;
import java.text.MessageFormat;

import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Model.Answer;
import Model.Question;

/**
 * Servlet implementation class Connection
 */
@WebServlet("/Connection")
public class Connection extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static Question Question = null;

    /**
     * Default constructor. 
     */
    public Connection() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
    public void service(ServletRequest req, ServletResponse res)
    	    throws ServletException, IOException
    	{
    	    HttpServletRequest  request;
    	    HttpServletResponse response;

    	    if (!(req instanceof HttpServletRequest &&
    	            res instanceof HttpServletResponse)) {
    	        throw new ServletException("non-HTTP request or response");
    	    }

    	    request = (HttpServletRequest) req;
    	    response = (HttpServletResponse) res;

    	    service(request, response);
    	}
    
   protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
       String method = req.getMethod();

   if (method.equals(METHOD_GET)) {
       long lastModified = getLastModified(req);
       if (lastModified == -1) {
           // servlet doesn't support if-modified-since, no reason
           // to go through further expensive logic
           doGet(req, resp);
       } else {
           long ifModifiedSince = req.getDateHeader(HEADER_IFMODSINCE);
           if (ifModifiedSince < (lastModified / 1000 * 1000)) {
               // If the servlet mod time is later, call doGet()
               // Round down to the nearest second for a proper compare
               // A ifModifiedSince of -1 will always be less
               maybeSetLastModified(resp, lastModified);
               doGet(req, resp);
           } else {
               resp.setStatus(HttpServletResponse.SC_NOT_MODIFIED);
           }
       }

   }else if (method.equals(METHOD_POST)) {
       doPost(req, resp);

   } else if (method.equals(METHOD_PUT)) {
       doPut(req, resp);

   } else if (method.equals(METHOD_DELETE)) {
       doDelete(req, resp);

   } else if (method.equals(METHOD_OPTIONS)) {
       doOptions(req, resp);

   }  
   else if (method.equals(METHOD_HELP)) {
       doHelp(req, resp);

   }else {
       //
       // Note that this means NO servlet supports whatever
       // method was requested, anywhere on this server.
       //

       String errMsg = lStrings.getString("http.method_not_implemented");
       Object[] errArgs = new Object[1];
       errArgs[0] = method;
       errMsg = MessageFormat.format(errMsg, errArgs);

       resp.sendError(HttpServletResponse.SC_NOT_IMPLEMENTED, errMsg);
   }
}
    
    
	protected void doHelp(HttpServletRequest req, HttpServletResponse resp) {
	// TODO Auto-generated method stub
	
}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		Persistence_API api =Persistence_Impl.getInstance();
		int QuestionID = 0;
		String Answer = null;
		api.addAnswer(Question q);
		//this will add answer to a list in lower layer throught Persistence_Impl
		api.getQuestion();
		//this will return a list of question.
		
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
//Establish connection in this servelet