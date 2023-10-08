package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import Model.Account;

public final class managePromotion_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_forEach_var_items;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_if_test;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_forEach_var_items = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_if_test = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_forEach_var_items.release();
    _jspx_tagPool_c_if_test.release();
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

      out.write('\n');
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Quản lý khuyến mãi</title>\n");
      out.write("        <meta charset=\"utf-8\">\n");
      out.write("        <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("        <!-- Main CSS-->\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"css/view.css\">\n");
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
      out.write("    </head>\n");
      out.write("    <body onload=\"time()\" class=\"app sidebar-mini rtl\">\n");
      out.write("        <!--Check login-->\n");
      out.write("\n");
      out.write("\n");
      out.write("        <!-- Navbar-->\n");
      out.write("\n");
      out.write("        <header class=\"app-header\">\n");
      out.write("            <!-- Sidebar toggle button--><a class=\"app-sidebar__toggle\" href=\"#\" data-toggle=\"sidebar\"\n");
      out.write("                                            aria-label=\"Hide Sidebar\"></a>\n");
      out.write("            <!-- Navbar Right Menu-->\n");
      out.write("            <ul class=\"app-nav\">\n");
      out.write("\n");
      out.write("\n");
      out.write("                <!-- User Menu-->\n");
      out.write("                <li><a class=\"app-nav__item\" href=\"/index.html\"><i class='bx bx-log-out bx-rotate-180'></i> </a>\n");
      out.write("\n");
      out.write("                </li>\n");
      out.write("            </ul>\n");
      out.write("        </header>\n");
      out.write("        <!-- Sidebar menu-->\n");
      out.write("        <div class=\"app-sidebar__overlay\" data-toggle=\"sidebar\"></div>\n");
      out.write("\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "headerAdmin.jsp", out, false);
      out.write("\n");
      out.write("        <main class=\"app-content\">\n");
      out.write("            <div class=\"app-title\">\n");
      out.write("                <ul class=\"app-breadcrumb breadcrumb side\">\n");
      out.write("                    <li class=\"breadcrumb-item\"><a href=\"OrderServlet\">Danh sách khuyến mãi</a></li>\n");
      out.write("                </ul>\n");
      out.write("                <div id=\"clock\"></div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div class=\"col-md-12\">\n");
      out.write("                    <div class=\"tile\">\n");
      out.write("                        <div class=\"tile-body\">\n");
      out.write("                            <div class=\"row element-button\">\n");
      out.write("                                <div class=\"col-sm-2\">\n");
      out.write("\n");
      out.write("                                    <a class=\"btn btn-add btn-sm\" href=\"AddPromotionServlet\" title=\"Thêm\"><i class=\"fas fa-plus\"></i>\n");
      out.write("                                        Tạo mới khuyến mãi</a>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"col-sm-2\" style=\"display: flex; align-items: center;\">\n");
      out.write("                                    <form style=\"display: flex;\">\n");
      out.write("                                        <label style=\"margin-right: 5px;\" for=\"startDate\">Từ:</label>\n");
      out.write("                                        <input type=\"date\" id=\"startDate\" class=\"form-control\" placeholder=\"Ngày bắt đầu\">\n");
      out.write("                                        <label style=\"margin-right: 5px;\" for=\"endDate\">Đến:</label>\n");
      out.write("                                        <input type=\"date\" id=\"endDate\" class=\"form-control\" placeholder=\"Ngày kết thúc\">\n");
      out.write("                                        <button style=\"margin-left: 5px;\" class=\"btn btn-primary btn-sm\" type=\"button\" onclick=\"filterByDate()\" title=\"Tìm kiếm\">\n");
      out.write("                                            <i class=\"fas fa-search\"></i> Tìm kiếm\n");
      out.write("                                        </button>\n");
      out.write("                                    </form>\n");
      out.write("                                </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("                            </div>\n");
      out.write("\n");
      out.write("                            <table class=\"table table-hover table-bordered\" id=\"sampleTable\">\n");
      out.write("                                <thead>\n");
      out.write("                                    <tr>\n");
      out.write("\n");
      out.write("                                        <th>ID khuyến mãi</th>\n");
      out.write("                                        <th>Tên khuyến mãi</th>\n");
      out.write("                                        <th>Ngày bắt đầu</th>\n");
      out.write("                                        <th>Ngày kết thúc</th>\n");
      out.write("                                        <th>Trạng thái</th>\n");
      out.write("                                        <th>Giá trị giảm</th>                                        \n");
      out.write("                                        <th>Nhân viên tạo</th>\n");
      out.write("                                        <th>Tính năng</th>\n");
      out.write("\n");
      out.write("                                    </tr>\n");
      out.write("                                </thead>\n");
      out.write("                                <tbody>\n");
      out.write("                                    ");
      if (_jspx_meth_c_forEach_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                                </tbody>\n");
      out.write("                            </table>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </main>\n");
      out.write("        <!-- Essential javascripts for application to work-->\n");
      out.write("        <script src=\"js/jquery-3.2.1.min.js\"></script>\n");
      out.write("        <script src=\"js/popper.min.js\"></script>\n");
      out.write("        <script src=\"js/bootstrap.min.js\"></script>\n");
      out.write("        <script src=\"//ajax.googleapis.com/ajax/libs/jquery/1.11.1/jquery.min.js\"></script>\n");
      out.write("        <script src=\"src/jquery.table2excel.js\"></script>\n");
      out.write("        <script src=\"js/main.js\"></script>\n");
      out.write("        <!-- The javascript plugin to display page loading on top-->\n");
      out.write("        <script src=\"js/plugins/pace.min.js\"></script>\n");
      out.write("        <!-- Page specific javascripts-->\n");
      out.write("        <script src=\"https://cdnjs.cloudflare.com/ajax/libs/jquery-confirm/3.3.2/jquery-confirm.min.js\"></script>\n");
      out.write("        <!-- Data table plugin-->\n");
      out.write("        <script type=\"text/javascript\" src=\"js/plugins/jquery.dataTables.min.js\"></script>\n");
      out.write("        <script type=\"text/javascript\" src=\"js/plugins/dataTables.bootstrap.min.js\"></script>\n");
      out.write("        <script type=\"text/javascript\">$('#sampleTable').DataTable();</script>\n");
      out.write("        <script>\n");
      out.write("            function confirmDelete() {\n");
      out.write("                var result = confirm(\"Bạn có chắc chắn muốn xóa khuyến mãi này?\");\n");
      out.write("                if (!result) {\n");
      out.write("                    event.preventDefault();\n");
      out.write("                }\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            var messUpdatePromotion = \"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${messUpdatePromotion}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\";\n");
      out.write("\n");
      out.write("\n");
      out.write("            if (messUpdatePromotion !== \"\") {\n");
      out.write("                alert(messUpdatePromotion);\n");
      out.write("            }\n");
      out.write("\n");
      out.write("\n");
      out.write("            var messAddPromotion = \"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${messAddPromotion}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\";\n");
      out.write("\n");
      out.write("\n");
      out.write("            if (messAddPromotion !== \"\") {\n");
      out.write("                alert(messAddPromotion);\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            var messDeletePromotion = \"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${messDeletePromotion}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\";\n");
      out.write("\n");
      out.write("\n");
      out.write("            if (messDeletePromotion !== \"\") {\n");
      out.write("                alert(messDeletePromotion);\n");
      out.write("            }\n");
      out.write("        </script>\n");
      out.write("        <script>\n");
      out.write("            function filterByDate() {\n");
      out.write("                var startDate = document.getElementById(\"startDate\").value;\n");
      out.write("                var endDate = document.getElementById(\"endDate\").value;\n");
      out.write("\n");
      out.write("                var tableRows = document.querySelectorAll(\"#sampleTable tbody tr\");\n");
      out.write("\n");
      out.write("                for (var i = 0; i < tableRows.length; i++) {\n");
      out.write("                    var row = tableRows[i];\n");
      out.write("                    var promotionStartDate = row.cells[2].textContent;\n");
      out.write("                    var promotionEndDate = row.cells[3].textContent;\n");
      out.write("\n");
      out.write("                    if (promotionStartDate >= startDate && promotionEndDate <= endDate) {\n");
      out.write("                        row.style.display = \"table-row\";\n");
      out.write("                    } else {\n");
      out.write("                        row.style.display = \"none\";\n");
      out.write("                    }\n");
      out.write("                }\n");
      out.write("            }\n");
      out.write("        </script>\n");
      out.write("\n");
      out.write("    </body>\n");
      out.write("</html>\n");
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

  private boolean _jspx_meth_c_forEach_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_0.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_0.setParent(null);
    _jspx_th_c_forEach_0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${listPromotion}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_c_forEach_0.setVar("v");
    int[] _jspx_push_body_count_c_forEach_0 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_0 = _jspx_th_c_forEach_0.doStartTag();
      if (_jspx_eval_c_forEach_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("                                        ");
          out.write("\n");
          out.write("                                            <tr> \n");
          out.write("\n");
          out.write("                                                <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${v.getId()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td> \n");
          out.write("                                                <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${v.getName()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>  \n");
          out.write("                                                <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${v.getDateStart()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>   \n");
          out.write("                                                <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${v.getDateEnd()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>   \n");
          out.write("                                                <td>\n");
          out.write("                                                    ");
          if (_jspx_meth_c_if_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_0, _jspx_page_context, _jspx_push_body_count_c_forEach_0))
            return true;
          out.write("\n");
          out.write("                                                    ");
          if (_jspx_meth_c_if_1((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_0, _jspx_page_context, _jspx_push_body_count_c_forEach_0))
            return true;
          out.write("\n");
          out.write("                                                </td>\n");
          out.write("                                                <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${v.getValue()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("%</td> \n");
          out.write("                                                <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${v.getAccount().getLastname()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td> \n");
          out.write("                                                <td style=\"display: flex\">\n");
          out.write("\n");
          out.write("                                                    <form style=\"width: 35px\" id=\"deleteForm\" action=\"DeletePromotionServlet?promotionID=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${v.getPromotionID()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" method=\"post\">\n");
          out.write("                                                        <button style=\"height: 29.5px;\" class=\"btn btn-primary btn-sm trash\" type=\"submit\" title=\"Xóa\" onclick=\"confirmDelete();\">\n");
          out.write("                                                            <i class=\"fas fa-trash-alt\"></i>\n");
          out.write("                                                        </button>\n");
          out.write("                                                    </form>\n");
          out.write("\n");
          out.write("                                                    <form style=\"width: 35px\" action=\"UpdatePromotionServlet\" method=\"post\">\n");
          out.write("                                                        <input type=\"hidden\" name=\"promotionID\" value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${v.getId()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\">\n");
          out.write("                                                        <input type=\"hidden\" name=\"promotionName\" value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${v.getName()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\">\n");
          out.write("                                                        <input type=\"hidden\" name=\"dateStart\" value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${v.getDateStart()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\">\n");
          out.write("                                                        <input type=\"hidden\" name=\"dateEnd\" value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${v.getDateEnd()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\">\n");
          out.write("                                                        <input type=\"hidden\" name=\"promotionStatus\" value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${v.isStatus()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\">\n");
          out.write("                                                        <input type=\"hidden\" name=\"value\" value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${v.getValue()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\">\n");
          out.write("                                                        <input type=\"hidden\" name=\"employeeID\" value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${v.getAccount().getId()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\">\n");
          out.write("                                                        <input type=\"hidden\" name=\"employeeName\" value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${v.getAccount().getLastname()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\">\n");
          out.write("                                                        <button style=\"height: 29.5px;\" class=\"btn btn-primary btn-sm edit\" type=\"submit\" title=\"Sửa\">\n");
          out.write("                                                            <i class=\"fas fa-edit\"></i>\n");
          out.write("                                                        </button>\n");
          out.write("                                                    </form>\n");
          out.write("\n");
          out.write("\n");
          out.write("                                                </td>    \n");
          out.write("\n");
          out.write("                                            </tr>\n");
          out.write("                                        ");
          out.write("\n");
          out.write("\n");
          out.write("\n");
          out.write("\n");
          out.write("                                    ");
          int evalDoAfterBody = _jspx_th_c_forEach_0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_0.doFinally();
      _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_0);
    }
    return false;
  }

  private boolean _jspx_meth_c_if_0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_0 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_0.setPageContext(_jspx_page_context);
    _jspx_th_c_if_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_0);
    _jspx_th_c_if_0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${v.isStatus()}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_0 = _jspx_th_c_if_0.doStartTag();
    if (_jspx_eval_c_if_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                                                        ON\n");
        out.write("                                                    ");
        int evalDoAfterBody = _jspx_th_c_if_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_0);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_0);
    return false;
  }

  private boolean _jspx_meth_c_if_1(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_1 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_1.setPageContext(_jspx_page_context);
    _jspx_th_c_if_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_0);
    _jspx_th_c_if_1.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${!v.isStatus()}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_1 = _jspx_th_c_if_1.doStartTag();
    if (_jspx_eval_c_if_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                                                        OFF\n");
        out.write("                                                    ");
        int evalDoAfterBody = _jspx_th_c_if_1.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_1);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_1);
    return false;
  }
}
