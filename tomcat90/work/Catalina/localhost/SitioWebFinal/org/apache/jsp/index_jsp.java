/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.0.M26
 * Generated at: 2020-01-16 19:28:11 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
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

    final java.lang.String _jspx_method = request.getMethod();
    if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method) && !javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET POST or HEAD");
      return;
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
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\n");
      out.write("<!--  0<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">-->\n");
      out.write("\n");
      out.write("\n");
      out.write("<html>\n");
      out.write("<!--  link rel=\"stylesheet\" type=\"text/css\" href=\"docs/css/BackGround.css\" media=\"screen\" -->\n");
      out.write("<!--  script type=\"text/javascript\" src=\"js/scripts.js\"></script -->\n");
      out.write("\t\n");
      out.write("<head>\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=ISO-8859-1\">\n");
      out.write("<title>Web Site</title>\t\n");
      out.write("<link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta.2/css/bootstrap.min.css\">\n");
      out.write("\n");
      out.write("</head>\n");
      out.write("<body class=\"body\">\n");
      out.write("\n");
      out.write("<nav class=\"navbar navbar-expand navbar-dark bg-dark\">\n");
      out.write("      <a  class=\"navbar-brand\" href=\"#\">Web Site</a>\n");
      out.write("      <button class=\"navbar-toggler\" type=\"button\" data-toggle=\"collapse\" data-target=\"#navbarsExample02\" aria-controls=\"navbarsExample02\" aria-expanded=\"false\" aria-label=\"Toggle navigation\">\n");
      out.write("        <span class=\"navbar-toggler-icon\"></span>\n");
      out.write("      </button>\n");
      out.write("\n");
      out.write("      <div class=\"collapse navbar-collapse\" id=\"navbarsExample02\">\n");
      out.write("        <ul class=\"navbar-nav mr-auto\">\n");
      out.write("          <li class=\"nav-item active\">\n");
      out.write("            <a  class=\"nav-link\" href=\"/SitioWebFinal/docs/recoger.jsp\"> Creación de tablas</a>\n");
      out.write("          </li>\n");
      out.write("          <li class=\"nav-item active\">\n");
      out.write("            <a  class=\"nav-link\"href=\"/SitioWebFinal/log.jsp\" > Logs </a>\n");
      out.write("          </li>\n");
      out.write("          <li class=\"nav-item active\">\n");
      out.write("         \t<a  class=\"nav-link\" href=\"https://192.168.1.100:631/\"> Servicio de impresión </a> \n");
      out.write("          </li>\n");
      out.write("          <li class=\"nav-item active\">\n");
      out.write("         \t<a  class=\"nav-link\" href=\"/SitioWebFinal/docs/connection.jsp\"> JMX </a> \n");
      out.write("          </li>\n");
      out.write("        </ul>\n");
      out.write("        <form class=\"form-inline my-2 my-md-0\">\n");
      out.write("          <input class=\"form-control\" type=\"text\" placeholder=\"Search\">\n");
      out.write("        </form>\n");
      out.write("      </div>\n");
      out.write("    </nav>\n");
      out.write("    <p>test jenkins 14</p>\n");
      out.write("<div class=\"container\">\n");
      out.write("  \t<img src=\"http://raspberrypi:8083/\" border=\"0\" width=\"45%\" alt=\"no disponible\"/>\n");
      out.write("\t<a target='_blank' style='font-weight: bold;font-size: 1.20em;' href=\"mailto:misterpremium8@gmail.com\">administrador del portal</a>\n");
      out.write("  <a href=\"https://info.flagcounter.com/VhtH\"><img src=\"https://s04.flagcounter.com/countxl/VhtH/bg_0D0D0D/txt_147AFF/border_CC1A06/columns_8/maxflags_20/viewers_0/labels_0/pageviews_0/flags_0/percent_0/\" alt=\"Flag Counter\" border=\"0\"></a>\n");
      out.write("</div>\n");
      out.write("<div class=\"LI-profile-badge\"  data-version=\"v1\" data-size=\"medium\" data-locale=\"es_ES\" data-type=\"vertical\" data-theme=\"dark\" data-vanity=\"daniel-pardo-martÃ­n\"><a class=\"LI-simple-link\" href='https://es.linkedin.com/in/daniel-pardo-mart%C3%ADn?trk=profile-badge'>Daniel Pardo MartÃ­n</a></div>\n");
      out.write("\n");
      out.write("\n");
      out.write("<script type=\"text/javascript\" src=\"https://platform.linkedin.com/badges/js/profile.js\" async defer></script>\n");
      out.write("<script type='text/javascript' src='http://www.aemet.es/en/eltiempo/prediccion/municipios/launchwidget/madrid-id28079?w=g4p01110001ohmffffffw890z190x0033fft95b6e9r1s8n2'></script>\n");
      out.write("<iframe src=\"https://open.spotify.com/embed/user/11181063161/playlist/34qEeJFkcqJWHUg22PIkzL\" width=\"300\" height=\"380\" frameborder=\"0\" allowtransparency=\"true\" align=\"left\"></iframe>\n");
      out.write("<script src=\"https://code.jquery.com/jquery-3.2.1.slim.min.js\"></script>\n");
      out.write("<script src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.3/umd/popper.min.js\"></script>\n");
      out.write("<script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta.2/js/bootstrap.min.js\"></script>\n");
      out.write("</body>\n");
      out.write("</html>\n");
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