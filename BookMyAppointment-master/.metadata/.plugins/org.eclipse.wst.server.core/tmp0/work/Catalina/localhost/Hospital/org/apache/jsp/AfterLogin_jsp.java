/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.33
 * Generated at: 2020-04-09 07:23:24 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.io.*;
import java.util.*;
import java.sql.*;
import javax.servlet.http.*;
import javax.servlet.*;

public final class AfterLogin_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(3);
    _jspx_dependants.put("jar:file:/E:/6thsem/JavaP/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/wtpwebapps/Hospital/WEB-INF/lib/jstl-1.2.jar!/META-INF/c.tld", Long.valueOf(1153365282000L));
    _jspx_dependants.put("/WEB-INF/lib/jstl-1.2.jar", Long.valueOf(1586255585070L));
    _jspx_dependants.put("jar:file:/E:/6thsem/JavaP/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/wtpwebapps/Hospital/WEB-INF/lib/jstl-1.2.jar!/META-INF/sql.tld", Long.valueOf(1153365282000L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("java.sql");
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("java.util");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("java.io");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    if (!javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET, POST or HEAD. Jasper also permits OPTIONS");
        return;
      }
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=ISO-8859-1");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!doctype html>\r\n");
      out.write("<html lang=\"en\">\r\n");
      out.write("\r\n");
      out.write("<head>\r\n");
      out.write("    <meta charset=\"utf-8\">\r\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, shrink-to-fit=no\">\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css\"\r\n");
      out.write("        integrity=\"sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm\" crossorigin=\"anonymous\">\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"style.css\">\r\n");
      out.write("    <title>Appolo</title>\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("    <nav nav class=\"navbar navbar-expand-lg navbar-light\">\r\n");
      out.write("        <span style=\"margin-left:2%;\">\r\n");
      out.write("            <a class=\"navbar-brand\" style=\"text-align: center\" href=\"#\">\r\n");
      out.write("                <img src=\"heart.svg\" width=\"30\" height=\"30\" alt=\"Appolo\"> Appolo\r\n");
      out.write("            </a>\r\n");
      out.write("        </span>\r\n");
      out.write("        <button class=\"navbar-toggler\" type=\"button\" data-toggle=\"collapse\" data-target=\"#navbarNavAltMarkup\"\r\n");
      out.write("            aria-controls=\"navbarNavAltMarkup\" aria-expanded=\"false\" aria-label=\"Toggle navigation\">\r\n");
      out.write("            <span class=\"navbar-toggler-icon\"></span>\r\n");
      out.write("        </button>\r\n");
      out.write("\r\n");
      out.write("        <div class=\"collapse navbar-collapse\" id=\"navbarNavAltMarkup\">\r\n");
      out.write("            <span style=\"margin-left:84%;\">\r\n");
      out.write("                <div class=\"navbar-nav ml-auto\">\r\n");
      out.write("                    <a class=\"nav-item nav-link\" href=\"AfterLogin.jsp\">Home</a>\r\n");
      out.write("                    <a class=\"nav-item nav-link\" href=\"Logout.jsp\">Signout</a>\r\n");
      out.write("                </div>\r\n");
      out.write("            </span>\r\n");
      out.write("        </div>\r\n");
      out.write("    </nav>\r\n");
      out.write("    <div class=\"container\">\r\n");
      out.write("        <div class=\"jumbotron\" style=\"margin-top:8%\">\r\n");
      out.write("            <div class=\"container\">\r\n");
      out.write("                <h1>Doctors List</h1><hr><br>\r\n");
      out.write("                <table border=\"1\" width=\"500\">\r\n");
      out.write("                    <tr bgcolor=\"00FF7F\">\r\n");
      out.write("                        <th><b>ID</b></th>\r\n");
      out.write("                        <th><b>NAME</b></th>\r\n");
      out.write("                        <th><b>SPECIALITY</b></th>\r\n");
      out.write("                    </tr>\r\n");
      out.write("    ");
 
      	try{
		      Class.forName("com.mysql.jdbc.Driver");
		      Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/hospital","root","root");
		      Statement smt = con.createStatement();
		      String query1="select * from doctors";
		      String query2="select * from patients";
		      PreparedStatement ps1=con.prepareStatement(query1);
		      PreparedStatement ps2=con.prepareStatement(query2);
		
		      ResultSet rs1=ps1.executeQuery(query1);
		      ResultSet rs2=ps2.executeQuery(query2);
    
        while(rs1.next()){
        	
     
      out.write("\r\n");
      out.write("                    <tr>\r\n");
      out.write("                        <td>");
      out.print(rs1.getString("docid") );
      out.write("</td>\r\n");
      out.write("                        <td>");
      out.print(rs1.getString("name") );
      out.write("</td>\r\n");
      out.write("                        <td>");
      out.print(rs1.getString("speciality") );
      out.write("</td>\r\n");
      out.write("                    </tr>\r\n");
      out.write("     ");

         } 
      	
     
      out.write("\r\n");
      out.write("                </table><br>\r\n");
      out.write("                <hr /><br>\r\n");
      out.write("                <h1>Patients List</h1><hr><br>\r\n");
      out.write("                <table border=\"1\" width=\"800\">\r\n");
      out.write("                    <tr bgcolor=\"00FF7F\">\r\n");
      out.write("                        <th><b>ID</b></th>\r\n");
      out.write("                        <th><b>FIRST NAME</b></th>\r\n");
      out.write("                        <th><b>LAST NAME</b></th>\r\n");
      out.write("                        <th><b>ADDRESS</b></th>\r\n");
      out.write("                        <th><b>PHONE</b></th>\r\n");
      out.write("                        <th><b>AADHAR</b></th>\r\n");
      out.write("                        <th><b>PROBLEM</b></th>\r\n");
      out.write("                    </tr>\r\n");
      out.write("                    ");
  while(rs2.next()){ 
      out.write("\r\n");
      out.write("                    <tr>\r\n");
      out.write("                        <td>");
      out.print(rs2.getString(1));
      out.write("</td>\r\n");
      out.write("                        <td>");
      out.print(rs2.getString(2));
      out.write("</td>\r\n");
      out.write("                        <td>");
      out.print(rs2.getString(3));
      out.write("</td>\r\n");
      out.write("                        <td>");
      out.print(rs2.getString(4));
      out.write("</td>\r\n");
      out.write("                        <td>");
      out.print(rs2.getString(5));
      out.write("</td>\r\n");
      out.write("                        <td>");
      out.print(rs2.getString(6));
      out.write("</td>\r\n");
      out.write("                        <td>");
      out.print(rs2.getString(7));
      out.write("</td>\r\n");
      out.write("                        \r\n");
      out.write("                    </tr>\r\n");
      out.write("                    ");
 } 
      out.write("\r\n");
      out.write("                </table><br>\r\n");
      out.write("                ");

				}catch(Exception e){
				     System.out.println(e); 		
				      	}
                
      out.write("\r\n");
      out.write("                <hr />\r\n");
      out.write("            </div><br>\r\n");
      out.write("            \r\n");
      out.write("            <form action=\"Check.jsp\" method=\"post\">\r\n");
      out.write("                <label type=\"check\">\r\n");
      out.write("                    <h5>Check Patient Records:</h5>\r\n");
      out.write("                </label>\r\n");
      out.write("                <input type=\"text\" name=\"check\" size=\"10\"><br>\r\n");
      out.write("                    <button type=\" submit\" class=\"btn btn-primary\">Check</button>\r\n");
      out.write("            </form>\r\n");
      out.write("            <br>\r\n");
      out.write("            \r\n");
      out.write("             <form action=\"AddPatient.jsp\">\r\n");
      out.write("                    <button type=\"submit\" class=\" btn btn-primary \">Add Patient</button>\r\n");
      out.write("             </form><br>\r\n");
      out.write("\t\t\t\t");

				
					String msg = "";
					try{
						msg = request.getAttribute("msg").toString();
					}catch(Exception e){
						//System.out.println(e);
					}
					if(msg == null)
						msg = "";
				
				
      out.write("\r\n");
      out.write("            <p>Patient Records Status : <br>");
      out.print(msg );
      out.write("</p>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("            <br>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("\r\n");
      out.write("    <script src=\"https://code.jquery.com/jquery-3.2.1.slim.min.js\"\r\n");
      out.write("        integrity=\"sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN\"\r\n");
      out.write("        crossorigin=\"anonymous\"></script>\r\n");
      out.write("    <script src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js\"\r\n");
      out.write("        integrity=\"sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q\"\r\n");
      out.write("        crossorigin=\"anonymous\"></script>\r\n");
      out.write("    <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js\"\r\n");
      out.write("        integrity=\"sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl\"\r\n");
      out.write("        crossorigin=\"anonymous\"></script>\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
