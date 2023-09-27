package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class headerPage_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("\n");
      out.write("    <head>\n");
      out.write("\n");
      out.write("        <meta charset=\"utf-8\">\n");
      out.write("        <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("        <!-- Main CSS-->\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"./css/admin.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://cdn.jsdelivr.net/npm/boxicons@latest/css/boxicons.min.css\">\n");
      out.write("        <!-- or -->\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://unpkg.com/boxicons@latest/css/boxicons.min.css\">\n");
      out.write("\n");
      out.write("        <!-- Font-icon css-->\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\"\n");
      out.write("              href=\"https://maxcdn.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css\">\n");
      out.write("        <script src=\"https://cdnjs.cloudflare.com/ajax/libs/sweetalert/2.1.2/sweetalert.min.js\"></script>\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://use.fontawesome.com/releases/v5.8.2/css/all.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/jquery-confirm/3.3.2/jquery-confirm.min.css\">\n");
      out.write("\n");
      out.write("    </head>\n");
      out.write("\n");
      out.write("    <body onload=\"time()\" class=\"app sidebar-mini rtl\">\n");
      out.write("        \n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("        <style>\n");
      out.write("            .rounded {\n");
      out.write("                border-radius: 50%;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        \n");
      out.write("        <!-- Navbar-->\n");
      out.write("        <header class=\"app-header\">\n");
      out.write("            <!-- Sidebar toggle button--><a class=\"app-sidebar__toggle\" href=\"#\" data-toggle=\"sidebar\"\n");
      out.write("                                            aria-label=\"Hide Sidebar\"></a>\n");
      out.write("            <!-- Navbar Right Menu-->\n");
      out.write("            <ul class=\"app-nav\">\n");
      out.write("\n");
      out.write("\n");
      out.write("                <!-- User Menu-->\n");
      out.write("                <li><a class=\"app-nav__item\" href=\"Logout\"><i class='bx bx-log-out bx-rotate-180'></i> </a>\n");
      out.write("\n");
      out.write("                </li>\n");
      out.write("            </ul>\n");
      out.write("        </header>\n");
      out.write("        <!-- Sidebar menu-->\n");
      out.write("        <div class=\"app-sidebar__overlay\" data-toggle=\"sidebar\"></div>\n");
      out.write("        <aside class=\"app-sidebar\">\n");
      out.write("            <div class=\"app-sidebar__user\">\n");
      out.write("                <img style=\" border-radius: 50%; \" class=\"app-sidebar__user-avatar rounded\" src=\"img/6.jpg\" width=\"100px\"  alt=\"User Image\">\n");
      out.write("                <div>\n");
      out.write("                    <p class=\"app-sidebar__user-name\"><b></b></p>\n");
      out.write("                    <p class=\"app-sidebar__user-designation\">\n");
      out.write("                        <font>Nguyen Van Tuan</font>\n");
      out.write("                    </p>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            <hr>\n");
      out.write("            <ul class=\"app-menu\">\n");
      out.write("        \n");
      out.write("                <li><a class=\"app-menu__item\" href=\"revunue\"><i\n");
      out.write("                            class='app-menu__icon bx bx-pie-chart-alt-2'></i><span class=\"app-menu__label\">Báo cáo doanh thu</span></a>\n");
      out.write("                </li>\n");
      out.write("                <li><a class=\"app-menu__item\" href=\"product\"><i\n");
      out.write("                            class='app-menu__icon bx bx-purchase-tag-alt'></i><span class=\"app-menu__label\">Quản lý sản phẩm</span></a>\n");
      out.write("                </li>\n");
      out.write("                <li><a class=\"app-menu__item \" href=\"user\"><i \n");
      out.write("                            class='app-menu__icon bx bx-id-card'></i><span class=\"app-menu__label\">Quản lý nhân viên</span></a>\n");
      out.write("                </li>\n");
      out.write("                  <li><a class=\"app-menu__item \" href=\"WorkSheet_show\">\n");
      out.write("    <i class='app-menu__icon bx bx-id-card'></i>\n");
      out.write("    <span class=\"app-menu__label\">Quản lý lịch làm việc</span>\n");
      out.write("</a>\n");
      out.write("                </li>\n");
      out.write("            \n");
      out.write("\n");
      out.write("                <li>\n");
      out.write("                    <a class=\"app-menu__item\" href=\"OrderServlet\">\n");
      out.write("                        <i class='app-menu__icon bx bx-task'></i>\n");
      out.write("                        <span class=\"app-menu__label\">Quản lý đơn hàng</span>\n");
      out.write("                    </a>\n");
      out.write("                </li>\n");
      out.write("                <li>\n");
      out.write("                    <a class=\"app-menu__item\" href=\"PromotionServlet\">\n");
      out.write("                        <i class='app-menu__icon bx bx-dollar'></i>\n");
      out.write("                        <span class=\"app-menu__label\">Quản lý khuyến mãi</span>\n");
      out.write("                    </a>\n");
      out.write("                </li> \n");
      out.write("                \n");
      out.write("\n");
      out.write("                <li><a class=\"app-menu__item\" href=\"ShowLeaveApplicationServlet\"><i class='app-menu__icon bx bx-calendar-check'></i><span\n");
      out.write("                            class=\"app-menu__label\">Quản lý nghỉ phép</span></a>\n");
      out.write("                </li>\n");
      out.write("                <li><a class=\"app-menu__item\" href=\"ShowPayrollServlet?shiftID1=1&shiftID2=10000\"><i class='app-menu__icon bx bx-calendar-check'></i><span\n");
      out.write("                            class=\"app-menu__label\">Bảng lương</span></a>\n");
      out.write("                </li>\n");
      out.write("                \n");
      out.write("                <li><a class=\"app-menu__item\" href=\"ShowAttendanceReportServlet\"><i class='app-menu__icon bx bx-calendar-check'></i><span\n");
      out.write("                            class=\"app-menu__label\">Báo cáo điểm danh</span></a>\n");
      out.write("                </li>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                <!--<li><a class=\"app-menu__item\" href=\"page-calendar.html\"><i class='app-menu__icon bx bx-calendar-check'></i><span\n");
      out.write("                class=\"app-menu__label\">Lịch công tác </span></a></li>\n");
      out.write("    <li><a class=\"app-menu__item\" href=\"#\"><i class='app-menu__icon bx bx-cog'></i><span class=\"app-menu__label\">Cài\n");
      out.write("                đặt hệ thống</span></a></li>-->\n");
      out.write("            </ul>\n");
      out.write("        </aside>\n");
      out.write("        <script>\n");
      out.write("            document.addEventListener(\"DOMContentLoaded\", function () {\n");
      out.write("                var currentUrl = window.location.href;\n");
      out.write("\n");
      out.write("                // Tìm phần tử li có href tương ứng với URL hiện tại và thêm lớp active\n");
      out.write("                var navItems = document.querySelectorAll(\".app-menu__item\");\n");
      out.write("                navItems.forEach(function (item) {\n");
      out.write("                    if (item.href === currentUrl) {\n");
      out.write("                        item.classList.add(\"active\");\n");
      out.write("                    }\n");
      out.write("                });\n");
      out.write("            });\n");
      out.write("        </script>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write("\n");
      out.write("        \n");
      out.write("\n");
      out.write("                \n");
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
