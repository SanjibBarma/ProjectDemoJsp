package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class owner_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("  <head>\n");
      out.write("\n");
      out.write("    <meta charset=\"utf-8\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, shrink-to-fit=no\">\n");
      out.write("    <meta name=\"description\" content=\"\">\n");
      out.write("    <meta name=\"author\" content=\"\">\n");
      out.write("\n");
      out.write("    <title>Verify Me</title>\n");
      out.write("\n");
      out.write("    <!-- Bootstrap core CSS -->\n");
      out.write("    <link href=\"vendor/bootstrap/css/bootstrap.min.css\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("    <!-- Custom fonts for this template -->\n");
      out.write("    <link href=\"vendor/font-awesome/css/font-awesome.min.css\" rel=\"stylesheet\" type=\"text/css\">\n");
      out.write("    <link href=\"https://fonts.googleapis.com/css?family=Montserrat:400,700\" rel=\"stylesheet\" type=\"text/css\">\n");
      out.write("    <link href=\"https://fonts.googleapis.com/css?family=Lato:400,700,400italic,700italic\" rel=\"stylesheet\" type=\"text/css\">\n");
      out.write("\n");
      out.write("    <!-- Plugin CSS -->\n");
      out.write("    <link href=\"vendor/magnific-popup/magnific-popup.css\" rel=\"stylesheet\" type=\"text/css\">\n");
      out.write("\n");
      out.write("    <!-- Custom styles for this template -->\n");
      out.write("    <link href=\"css/freelancer.min.css\" rel=\"stylesheet\">\n");
      out.write("    <link href=\"css/custom.css\" rel=\"stylesheet\">\n");
      out.write("    <link href=\"css/main.css\" rel=\"stylesheet\">\n");
      out.write("    \n");
      out.write("    <link href='http://fonts.googleapis.com/css?family=Open+Sans+Condensed:300' rel='stylesheet' type='text/css'>\n");
      out.write("\n");
      out.write("\n");
      out.write("  </head>\n");
      out.write("\n");
      out.write("  <body id=\"page-top\" background=\"images/bgfull.png\">\n");
      out.write("      \n");
      out.write("      <!-- Navigation -->\n");
      out.write("    <nav class=\"navbar navbar-expand-lg bg-secondary fixed-top text-uppercase\" id=\"mainNav\">\n");
      out.write("      <div class=\"container\">\n");
      out.write("        <a class=\"navbar-brand js-scroll-trigger\" href=\"index.jsp\">Police verification</a>\n");
      out.write("        <button class=\"navbar-toggler navbar-toggler-right text-uppercase bg-primary text-white rounded\" type=\"button\" data-toggle=\"collapse\" data-target=\"#navbarResponsive\" aria-controls=\"navbarResponsive\" aria-expanded=\"false\" aria-label=\"Toggle navigation\">\n");
      out.write("          Menu\n");
      out.write("          <i class=\"fa fa-bars\"></i>\n");
      out.write("        </button>\n");
      out.write("        <div class=\"collapse navbar-collapse\" id=\"navbarResponsive\">\n");
      out.write("          <ul class=\"navbar-nav ml-auto\">\n");
      out.write("            <li class=\"nav-item mx-0 mx-lg-1\">\n");
      out.write("              <a class=\"nav-link py-3 px-0 px-lg-3 rounded js-scroll-trigger\" href=\"#portfolio\">Emergency</a>\n");
      out.write("            </li>\n");
      out.write("            <li class=\"nav-item mx-0 mx-lg-1\">\n");
      out.write("              <a class=\"nav-link py-3 px-0 px-lg-3 rounded js-scroll-trigger\" href=\"#about\">About</a>\n");
      out.write("            </li>\n");
      out.write("            <li class=\"nav-item mx-0 mx-lg-1\">\n");
      out.write("              <a class=\"nav-link py-3 px-0 px-lg-3 rounded js-scroll-trigger\" href=\"#contact\">Contact</a>\n");
      out.write("            </li>\n");
      out.write("            <li class=\"dropdown nav-item mx-0 mx-lg-1\" id=\"navFilter\">\n");
      out.write("              <div class=\"dropdown\">\n");
      out.write("                <a class=\"nav-link py-3 px-0 px-lg-3 rounded js-scroll-trigger dropbtn\">Join</a>\n");
      out.write("                <div class=\"dropdown-content\">\n");
      out.write("                  <a href=\"owner.jsp\">Homeowner</a>\n");
      out.write("                  <a href=\"#\">Tenant</a>\n");
      out.write("                </div>\n");
      out.write("              </div>\n");
      out.write("            </li>\n");
      out.write("          </ul>\n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("    </nav>\n");
      out.write("\n");
      out.write("     <!-- bootstrap login and register -->\n");
      out.write("     <section class=\"form\" style=\"margin-top: 20px\">\n");
      out.write("       <div class=\"container\">\n");
      out.write("         <div class=\"row\">\n");
      out.write("           <div class=\"col-md-3\"></div>\n");
      out.write("           <div class=\"col-md-6\" style=\"box-shadow:\">\n");
      out.write("\n");
      out.write("             <ul class=\"nav nav-tabs\" id=\"myTab\" role=\"tablist\">\n");
      out.write("                <li class=\"nav-item\">\n");
      out.write("                  <a class=\"nav-link active\" id=\"home-tab\" data-toggle=\"tab\" href=\"#home\" role=\"tab\" aria-controls=\"home\" aria-selected=\"true\">Log In</a>\n");
      out.write("                </li>\n");
      out.write("                <li class=\"nav-item\">\n");
      out.write("                  <a class=\"nav-link\" id=\"profile-tab\" data-toggle=\"tab\" href=\"#profile\" role=\"tab\" aria-controls=\"profile\" aria-selected=\"false\">Registration</a>\n");
      out.write("                </li>\n");
      out.write("              </ul>\n");
      out.write("\n");
      out.write("              <hr>\n");
      out.write("              <div class=\"tab-content\" id=\"myTabContent\">\n");
      out.write("                <div class=\"tab-pane fade show active\" id=\"home\" role=\"tabpanel\" aria-labelledby=\"home-tab\">\n");
      out.write("\n");
      out.write("                  <form>\n");
      out.write("                    <div class=\"form-group\">\n");
      out.write("                      <label for=\"exampleInputEmail1\">Email address</label>\n");
      out.write("                      <input type=\"email\" class=\"form-control\" id=\"exampleInputEmail1\" aria-describedby=\"emailHelp\" placeholder=\"Enter email\">\n");
      out.write("                      <small id=\"emailHelp\" class=\"form-text text-muted\">We'll never share your email with anyone else.</small>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"form-group\">\n");
      out.write("                      <label for=\"exampleInputPassword1\">Password</label>\n");
      out.write("                      <input type=\"password\" class=\"form-control\" id=\"exampleInputPassword1\" placeholder=\"Password\">\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"form-check\">\n");
      out.write("                      <input type=\"checkbox\" class=\"form-check-input\" id=\"exampleCheck1\">\n");
      out.write("                      <label class=\"form-check-label\" for=\"exampleCheck1\">Check me out</label>\n");
      out.write("                    </div>\n");
      out.write("                    <hr>\n");
      out.write("                    <button type=\"submit\" class=\"btn btn-primary\">Submit</button>\n");
      out.write("                  </form>\n");
      out.write("\n");
      out.write("                </div>\n");
      out.write("                <div class=\"tab-pane fade\" id=\"profile\" role=\"tabpanel\" aria-labelledby=\"profile-tab\">\n");
      out.write("                  <form>\n");
      out.write("                    <div class=\"form-group\">\n");
      out.write("                      <label for=\"exampleInputEmail1\">Name</label>\n");
      out.write("                      <input type=\"email\" class=\"form-control\" id=\"exampleInputEmail1\" aria-describedby=\"emailHelp\" placeholder=\"Enter email\">\n");
      out.write("                      <small id=\"emailHelp\" class=\"form-text text-muted\">We'll never share your email with anyone else.</small>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                    <div class=\"form-group\">\n");
      out.write("                      <label for=\"exampleInputEmail1\">Email address</label>\n");
      out.write("                      <input type=\"name\" class=\"form-control\" id=\"exampleInputEmail1\" aria-describedby=\"emailHelp\" placeholder=\"Enter email\">\n");
      out.write("                      <small id=\"emailHelp\" class=\"form-text text-muted\">We'll never share your email with anyone else.</small>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"form-group\">\n");
      out.write("                      <label for=\"exampleInputPassword1\">Password</label>\n");
      out.write("                      <input type=\"password\" class=\"form-control\" id=\"exampleInputPassword1\" placeholder=\"Password\">\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"form-group\">\n");
      out.write("                      <label for=\"exampleInputPassword1\">Confirm Password</label>\n");
      out.write("                      <input type=\"password\" class=\"form-control\" id=\"exampleInputPassword1\" placeholder=\"Password\">\n");
      out.write("                    </div>\n");
      out.write("                    <hr>\n");
      out.write("                    <button type=\"submit\" class=\"btn btn-primary\">Submit</button>\n");
      out.write("                  </form>\n");
      out.write("                </div>\n");
      out.write("              </div>\n");
      out.write("           </div>\n");
      out.write("           <div class=\"col-md-3\"></div>\n");
      out.write("         </div>\n");
      out.write("       </div>\n");
      out.write("     </section>\n");
      out.write("\n");
      out.write("      \n");
      out.write("    <footer class=\"footer text-center\">\n");
      out.write("      <div class=\"container\">\n");
      out.write("        <div class=\"row\">\n");
      out.write("          <div class=\"col-md-6 mb-5 mb-lg-0\">\n");
      out.write("            <h4 class=\"text-uppercase mb-4\">Location</h4>\n");
      out.write("            <p class=\"lead mb-0\" style=\"color: white;\">Dhanmondi 4/A\n");
      out.write("              <br>House #41 Block NULL</p>\n");
      out.write("          </div>\n");
      out.write("          <div class=\"col-md-6 mb-5 mb-lg-0\">\n");
      out.write("            <h4 class=\"text-uppercase mb-4\">Around the Web</h4>\n");
      out.write("            <ul class=\"list-inline mb-0\">\n");
      out.write("              <li class=\"list-inline-item\">\n");
      out.write("                <a class=\"btn btn-outline-light btn-social text-center rounded-circle\" href=\"#\">\n");
      out.write("                  <i class=\"fa fa-fw fa-facebook\"></i>\n");
      out.write("                </a>\n");
      out.write("              </li>\n");
      out.write("              <li class=\"list-inline-item\">\n");
      out.write("                <a class=\"btn btn-outline-light btn-social text-center rounded-circle\" href=\"#\">\n");
      out.write("                  <i class=\"fa fa-fw fa-google-plus\"></i>\n");
      out.write("                </a>\n");
      out.write("              </li>\n");
      out.write("              <li class=\"list-inline-item\">\n");
      out.write("                <a class=\"btn btn-outline-light btn-social text-center rounded-circle\" href=\"#\">\n");
      out.write("                  <i class=\"fa fa-fw fa-twitter\"></i>\n");
      out.write("                </a>\n");
      out.write("              </li>\n");
      out.write("              <li class=\"list-inline-item\">\n");
      out.write("                <a class=\"btn btn-outline-light btn-social text-center rounded-circle\" href=\"#\">\n");
      out.write("                  <i class=\"fa fa-fw fa-linkedin\"></i>\n");
      out.write("                </a>\n");
      out.write("              </li>\n");
      out.write("              <li class=\"list-inline-item\">\n");
      out.write("                <a class=\"btn btn-outline-light btn-social text-center rounded-circle\" href=\"#\">\n");
      out.write("                  <i class=\"fa fa-fw fa-dribbble\"></i>\n");
      out.write("                </a>\n");
      out.write("              </li>\n");
      out.write("            </ul>\n");
      out.write("          </div>\n");
      out.write("          \n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("    </footer>\n");
      out.write("\n");
      out.write("    <div class=\"copyright py-4 text-center text-white\">\n");
      out.write("      <div class=\"container\">\n");
      out.write("        <small>Copyright &copy; BD Police 2018</small>\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("      \n");
      out.write("      \n");
      out.write("    <!-- Bootstrap core JavaScript -->\n");
      out.write("    <script src=\"vendor/jquery/jquery.min.js\"></script>\n");
      out.write("    <script src=\"vendor/bootstrap/js/bootstrap.bundle.min.js\"></script>\n");
      out.write("\n");
      out.write("    <!-- Plugin JavaScript -->\n");
      out.write("    <script src=\"vendor/jquery-easing/jquery.easing.min.js\"></script>\n");
      out.write("    <script src=\"vendor/magnific-popup/jquery.magnific-popup.min.js\"></script>\n");
      out.write("\n");
      out.write("    <!-- Contact Form JavaScript -->\n");
      out.write("    <script src=\"js/jqBootstrapValidation.js\"></script>\n");
      out.write("    <script src=\"js/contact_me.js\"></script>\n");
      out.write("\n");
      out.write("    <!-- Custom scripts for this template -->\n");
      out.write("    <script src=\"js/freelancer.min.js\"></script>\n");
      out.write("  </body>\n");
      out.write("<script type=\"text/javascript\">\n");
      out.write("//auto expand textarea\n");
      out.write("function adjust_textarea(h) {\n");
      out.write("    h.style.height = \"20px\";\n");
      out.write("    h.style.height = (h.scrollHeight)+\"px\";\n");
      out.write("}\n");
      out.write("</script>\n");
      out.write("</html>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
