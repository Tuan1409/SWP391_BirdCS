package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class adminPage_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"en\">\r\n");
      out.write("\r\n");
      out.write("    <head>\r\n");
      out.write("\r\n");
      out.write("        <meta charset=\"utf-8\">\r\n");
      out.write("        <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\r\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n");
      out.write("        <!-- Main CSS-->\r\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"./css/admin.css\">\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://cdn.jsdelivr.net/npm/boxicons@latest/css/boxicons.min.css\">\r\n");
      out.write("        <!-- or -->\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://unpkg.com/boxicons@latest/css/boxicons.min.css\">\r\n");
      out.write("\r\n");
      out.write("        <!-- Font-icon css-->\r\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\"\r\n");
      out.write("              href=\"https://maxcdn.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css\">\r\n");
      out.write("        <script src=\"https://cdnjs.cloudflare.com/ajax/libs/sweetalert/2.1.2/sweetalert.min.js\"></script>\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://use.fontawesome.com/releases/v5.8.2/css/all.css\">\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/jquery-confirm/3.3.2/jquery-confirm.min.css\">\r\n");
      out.write("\r\n");
      out.write("    </head>\r\n");
      out.write("\r\n");
      out.write("    <body onload=\"time()\" class=\"app sidebar-mini rtl\">\r\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "headerAdmin.jsp", out, false);
      out.write("\r\n");
      out.write("        <main class=\"app-content\">\r\n");
      out.write("            <div class=\"app-title\"> \r\n");
      out.write("                <ul class=\"app-breadcrumb breadcrumb side\">\r\n");
      out.write("                    <li class=\"breadcrumb-item active\"><a href=\"#\"><b>Danh sách nhân viên </b></a></li>\r\n");
      out.write("                </ul>\r\n");
      out.write("                <div id=\"clock\"></div>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"row\">\r\n");
      out.write("                <div class=\"col-md-12\">\r\n");
      out.write("                    <div class=\"tile\">\r\n");
      out.write("                        <div class=\"tile-body\">\r\n");
      out.write("                            <div class=\"row element-button\">\r\n");
      out.write("                                <div class=\"col-sm-2\">\r\n");
      out.write("\r\n");
      out.write("                                    <a class=\"btn btn-add btn-sm\" href=\"createuser\" title=\"Thêm\"><i class=\"fas fa-plus\"></i>\r\n");
      out.write("                                        Tạo mới nhân viên</a>\r\n");
      out.write("                                    <!--                                </div>\r\n");
      out.write("                                                                    <div class=\"col-sm-2\">\r\n");
      out.write("                                                                        <a class=\"btn btn-delete btn-sm nhap-tu-file\" type=\"button\" title=\"Nhập\" onclick=\"myFunction(this)\"><i\r\n");
      out.write("                                                                                class=\"fas fa-file-upload\"></i> Tải từ file</a>\r\n");
      out.write("                                                                    </div>\r\n");
      out.write("                                    \r\n");
      out.write("                                                                    <div class=\"col-sm-2\">\r\n");
      out.write("                                                                        <a class=\"btn btn-delete btn-sm print-file\" type=\"button\" title=\"In\" onclick=\"myApp.printTable()\"><i\r\n");
      out.write("                                                                                class=\"fas fa-print\"></i> In dữ liệu</a>\r\n");
      out.write("                                                                    </div>\r\n");
      out.write("                                                                    <div class=\"col-sm-2\">\r\n");
      out.write("                                                                        <a class=\"btn btn-delete btn-sm print-file js-textareacopybtn\" type=\"button\" title=\"Sao chép\"><i\r\n");
      out.write("                                                                                class=\"fas fa-copy\"></i> Sao chép</a>\r\n");
      out.write("                                                                    </div>\r\n");
      out.write("                                    \r\n");
      out.write("                                                                    <div class=\"col-sm-2\">\r\n");
      out.write("                                                                        <a class=\"btn btn-excel btn-sm\" href=\"\" title=\"In\"><i class=\"fas fa-file-excel\"></i> Xuất Excel</a>\r\n");
      out.write("                                                                    </div>\r\n");
      out.write("                                                                    <div class=\"col-sm-2\">\r\n");
      out.write("                                                                        <a class=\"btn btn-delete btn-sm pdf-file\" type=\"button\" title=\"In\" onclick=\"myFunction(this)\"><i\r\n");
      out.write("                                                                                class=\"fas fa-file-pdf\"></i> Xuất PDF</a>\r\n");
      out.write("                                                                    </div>\r\n");
      out.write("                                                                    <div class=\"col-sm-2\">\r\n");
      out.write("                                                                        <a class=\"btn btn-delete btn-sm\" type=\"button\" title=\"Xóa\" onclick=\"myFunction(this)\"><i\r\n");
      out.write("                                                                                class=\"fas fa-trash-alt\"></i> Xóa tất cả </a>\r\n");
      out.write("                                                                    </div>-->\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <table class=\"table table-hover table-bordered\" id=\"sampleTable\">\r\n");
      out.write("                                    <thead>\r\n");
      out.write("                                        <tr>\r\n");
      out.write("                                            <th width=\"10\"><input type=\"checkbox\" id=\"all\"></th>\r\n");
      out.write("                                            <th>ID nhân viên</th>\r\n");
      out.write("                                            <th>Tên nhân viên</th>\r\n");
      out.write("                                            <th>Ảnh</th>\r\n");
      out.write("                                            <th>Địa chỉ</th>\r\n");
      out.write("                                            <th>Ngày Sinh</th>\r\n");
      out.write("                                            <th>Giới tính</th>\r\n");
      out.write("                                            <th>SĐT</th>\r\n");
      out.write("                                            <th>Chức vụ</th>\r\n");
      out.write("                                            <th>Tình Trạng</th>\r\n");
      out.write("                                            <th>Chức năng</th>\r\n");
      out.write("                                        </tr>\r\n");
      out.write("                                    </thead>\r\n");
      out.write("\r\n");
      out.write("                                    <tbody>                                        \r\n");
      out.write("                                        ");
      if (_jspx_meth_c_forEach_0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("                                    </tbody>\r\n");
      out.write("                                </table>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("        </main>\r\n");
      out.write("\r\n");
      out.write("        <!--\r\n");
      out.write("          MODAL\r\n");
      out.write("        -->\r\n");
      out.write("        <div class=\"modal fade\" id=\"ModalUP\" tabindex=\"-1\" role=\"dialog\" aria-hidden=\"true\" data-backdrop=\"static\"\r\n");
      out.write("             data-keyboard=\"false\">\r\n");
      out.write("            <div class=\"modal-dialog modal-dialog-centered\" role=\"document\">\r\n");
      out.write("                <div class=\"modal-content\">\r\n");
      out.write("\r\n");
      out.write("                    <div class=\"modal-body\">\r\n");
      out.write("                        <div class=\"row\">\r\n");
      out.write("                            <div class=\"form-group  col-md-12\">\r\n");
      out.write("                                <span class=\"thong-tin-thanh-toan\">\r\n");
      out.write("                                    <h5>Chỉnh sửa thông tin nhân viên cơ bản</h5>\r\n");
      out.write("                                </span>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("\r\n");
      out.write("                        <form action=\"updateuser\" method=\"POST\" id=\"updateusers\">\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("                        </form>\r\n");
      out.write("\r\n");
      out.write("                        <!-- Essential javascripts for application to work-->\r\n");
      out.write("                        <script src=\"./js/jquery-3.2.1.min.js\"></script>\r\n");
      out.write("                        <script src=\"./js/popper.min.js\"></script>\r\n");
      out.write("                        <script src=\"./js/bootstrap.min.js\"></script>\r\n");
      out.write("                        <script src=\"//ajax.googleapis.com/ajax/libs/jquery/1.11.1/jquery.min.js\"></script>\r\n");
      out.write("                        <script src=\"src/jquery.table2excel.js\"></script>\r\n");
      out.write("                        <script src=\"./js/main.js\"></script>\r\n");
      out.write("                        <!-- The javascript plugin to display page loading on top-->\r\n");
      out.write("                        <script src=\"js/plugins/pace.min.js\"></script>\r\n");
      out.write("                        <!-- Page specific javascripts-->\r\n");
      out.write("                        <script src=\"https://cdnjs.cloudflare.com/ajax/libs/jquery-confirm/3.3.2/jquery-confirm.min.js\"></script>\r\n");
      out.write("                        <!-- Data table plugin-->\r\n");
      out.write("                        <script type=\"text/javascript\" src=\"./js/plugins/jquery.dataTables.min.js\"></script>\r\n");
      out.write("                        <script type=\"text/javascript\" src=\"./js/plugins/dataTables.bootstrap.min.js\"></script>\r\n");
      out.write("                        <script type=\"text/javascript\">\r\n");
      out.write("                                                                $('#sampleTable').DataTable();\r\n");
      out.write("                                                                //Thời Gian\r\n");
      out.write("                                                                function time() {\r\n");
      out.write("                                                                    var today = new Date();\r\n");
      out.write("                                                                    var weekday = new Array(7);\r\n");
      out.write("                                                                    weekday[0] = \"Chủ Nhật\";\r\n");
      out.write("                                                                    weekday[1] = \"Thứ Hai\";\r\n");
      out.write("                                                                    weekday[2] = \"Thứ Ba\";\r\n");
      out.write("                                                                    weekday[3] = \"Thứ Tư\";\r\n");
      out.write("                                                                    weekday[4] = \"Thứ Năm\";\r\n");
      out.write("                                                                    weekday[5] = \"Thứ Sáu\";\r\n");
      out.write("                                                                    weekday[6] = \"Thứ Bảy\";\r\n");
      out.write("                                                                    var day = weekday[today.getDay()];\r\n");
      out.write("                                                                    var dd = today.getDate();\r\n");
      out.write("                                                                    var mm = today.getMonth() + 1;\r\n");
      out.write("                                                                    var yyyy = today.getFullYear();\r\n");
      out.write("                                                                    var h = today.getHours();\r\n");
      out.write("                                                                    var m = today.getMinutes();\r\n");
      out.write("                                                                    var s = today.getSeconds();\r\n");
      out.write("                                                                    m = checkTime(m);\r\n");
      out.write("                                                                    s = checkTime(s);\r\n");
      out.write("                                                                    nowTime = h + \" giờ \" + m + \" phút \" + s + \" giây\";\r\n");
      out.write("                                                                    if (dd < 10) {\r\n");
      out.write("                                                                        dd = '0' + dd\r\n");
      out.write("                                                                    }\r\n");
      out.write("                                                                    if (mm < 10) {\r\n");
      out.write("                                                                        mm = '0' + mm\r\n");
      out.write("                                                                    }\r\n");
      out.write("                                                                    today = day + ', ' + dd + '/' + mm + '/' + yyyy;\r\n");
      out.write("                                                                    tmp = '<span class=\"date\"> ' + today + ' - ' + nowTime +\r\n");
      out.write("                                                                            '</span>';\r\n");
      out.write("                                                                    document.getElementById(\"clock\").innerHTML = tmp;\r\n");
      out.write("                                                                    clocktime = setTimeout(\"time()\", \"1000\", \"Javascript\");\r\n");
      out.write("\r\n");
      out.write("                                                                    function checkTime(i) {\r\n");
      out.write("                                                                        if (i < 10) {\r\n");
      out.write("                                                                            i = \"0\" + i;\r\n");
      out.write("                                                                        }\r\n");
      out.write("                                                                        return i;\r\n");
      out.write("                                                                    }\r\n");
      out.write("                                                                }\r\n");
      out.write("                        </script>\r\n");
      out.write("\r\n");
      out.write("                        <!--Confỉm xóa nhân viên -->\r\n");
      out.write("                        <script>\r\n");
      out.write("                            function confirmDelete(button) {\r\n");
      out.write("                                var employeeID = button.getAttribute(\"data-employeeID\");\r\n");
      out.write("\r\n");
      out.write("                                swal({\r\n");
      out.write("                                    title: \"Cảnh báo\",\r\n");
      out.write("                                    text: \"Bạn có muốn xoá nhân viên này?\",\r\n");
      out.write("                                    buttons: [\"Hủy bỏ\", \"Đồng ý\"],\r\n");
      out.write("                                }).then((willDelete) => {\r\n");
      out.write("                                    if (willDelete) {\r\n");
      out.write("                                        var form = button.closest(\"form\");\r\n");
      out.write("                                        form.action = \"deleteuser?employeeID=\" + employeeID;\r\n");
      out.write("                                        form.submit();\r\n");
      out.write("                                    }\r\n");
      out.write("\r\n");
      out.write("                                });\r\n");
      out.write("                            }\r\n");
      out.write("                        </script>\r\n");
      out.write("\r\n");
      out.write("                        <script>\r\n");
      out.write("                            ");
 if (request.getAttribute("messok") != null) {
      out.write("\r\n");
      out.write("                            swal(\"");
      out.print( request.getAttribute("messok"));
      out.write("\", \"\", \"success\");\r\n");
      out.write("                            ");
 request.removeAttribute("messok"); 
      out.write("\r\n");
      out.write("                            ");
 } 
      out.write("\r\n");
      out.write("                        </script>\r\n");
      out.write("                        <script>\r\n");
      out.write("                            ");
 if (request.getAttribute("messerror") != null) {
      out.write("\r\n");
      out.write("                            swal(\"");
      out.print( request.getAttribute("messerror"));
      out.write("\", \"\", \"error\");\r\n");
      out.write("                            ");
 request.removeAttribute("messerror"); 
      out.write("\r\n");
      out.write("                            ");
 }
      out.write("\r\n");
      out.write("                        </script>\r\n");
      out.write("                        <!--------------------------------------------------------------------------------------------------->\r\n");
      out.write("\r\n");
      out.write("                        <!--Comfirm add nhân viên-->\r\n");
      out.write("                        <script>\r\n");
      out.write("                            function confirmAdd(button) {\r\n");
      out.write("                                var employeeID = button.getAttribute(\"data-employeeID\");\r\n");
      out.write("\r\n");
      out.write("                                swal({\r\n");
      out.write("                                    title: \"Cảnh báo\",\r\n");
      out.write("                                    text: \"Bạn có muốn thêm nhân viên này?\",\r\n");
      out.write("                                    buttons: [\"Hủy bỏ\", \"Đồng ý\"],\r\n");
      out.write("                                }).then((willDelete) => {\r\n");
      out.write("                                    if (willDelete) {\r\n");
      out.write("                                        var form = button.closest(\"form\");\r\n");
      out.write("                                        form.action = \"addemployee?employeeID=\" + employeeID;\r\n");
      out.write("                                        form.submit();\r\n");
      out.write("                                    }\r\n");
      out.write("\r\n");
      out.write("                                });\r\n");
      out.write("                            }\r\n");
      out.write("\r\n");
      out.write("                        </script>\r\n");
      out.write("                        <script>\r\n");
      out.write("                            ");
 if (request.getAttribute("messtrue") != null) {
      out.write("\r\n");
      out.write("                            swal(\"");
      out.print( request.getAttribute("messtrue"));
      out.write("\", \"\", \"success\");\r\n");
      out.write("                            ");
 request.removeAttribute("messtrue"); 
      out.write("\r\n");
      out.write("                            ");
 } 
      out.write("\r\n");
      out.write("                        </script>\r\n");
      out.write("                        <script>\r\n");
      out.write("                            ");
 if (request.getAttribute("messefalse") != null) {
      out.write("\r\n");
      out.write("                            swal(\"");
      out.print( request.getAttribute("messefalse"));
      out.write("\", \"\", \"error\");\r\n");
      out.write("                            ");
 request.removeAttribute("messefalse"); 
      out.write("\r\n");
      out.write("                            ");
 }
      out.write("\r\n");
      out.write("                        </script>\r\n");
      out.write("                        <!--------------------------------------------------------------------------------------------------->\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("                        <script>\r\n");
      out.write("                            oTable = $('#sampleTable').dataTable();\r\n");
      out.write("                            $('#all').click(function (e) {\r\n");
      out.write("                                $('#sampleTable tbody :checkbox').prop('checked', $(this).is(':checked'));\r\n");
      out.write("                                e.stopImmediatePropagation();\r\n");
      out.write("                            });\r\n");
      out.write("\r\n");
      out.write("                            function getData(i) {\r\n");
      out.write("                                $.ajax({\r\n");
      out.write("                                    type: 'Post',\r\n");
      out.write("                                    url: '");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/loadUser',\r\n");
      out.write("                                    data: {\r\n");
      out.write("                                        id: i\r\n");
      out.write("                                    },\r\n");
      out.write("                                    success: function (data, textStatus, jqXHR) {\r\n");
      out.write("                                        $('#updateusers').html(data);\r\n");
      out.write("                                    }\r\n");
      out.write("                                })\r\n");
      out.write("                            }\r\n");
      out.write("                        </script>\r\n");
      out.write("                        </body>\r\n");
      out.write("\r\n");
      out.write("                        </html>\r\n");
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
    _jspx_th_c_forEach_0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${requestScope.listuser}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_c_forEach_0.setVar("i");
    int[] _jspx_push_body_count_c_forEach_0 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_0 = _jspx_th_c_forEach_0.doStartTag();
      if (_jspx_eval_c_forEach_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("                                            <tr>\r\n");
          out.write("                                                <td width=\"10\"><input type=\"checkbox\" name=\"check1\" value=\"1\"></td>\r\n");
          out.write("                                                <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${i.employeeID}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\r\n");
          out.write("                                                <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${i.employeename}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\r\n");
          out.write("                                                <td><img src=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${i.employeeavatar}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" alt=\"\" width=\"100px;\"></td>\r\n");
          out.write("                                                <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${i.employeeaddress}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\r\n");
          out.write("                                                <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${i.birthday}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\r\n");
          out.write("                                                <td>\r\n");
          out.write("                                                    ");
          if (_jspx_meth_c_if_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_0, _jspx_page_context, _jspx_push_body_count_c_forEach_0))
            return true;
          out.write("\r\n");
          out.write("                                                    ");
          if (_jspx_meth_c_if_1((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_0, _jspx_page_context, _jspx_push_body_count_c_forEach_0))
            return true;
          out.write("\r\n");
          out.write("                                                </td>\r\n");
          out.write("                                                <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${i.employeephone}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\r\n");
          out.write("                                                <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${i.emprole.name}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\r\n");
          out.write("                                                <td>\r\n");
          out.write("                                                    ");
          if (_jspx_meth_c_if_2((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_0, _jspx_page_context, _jspx_push_body_count_c_forEach_0))
            return true;
          out.write("\r\n");
          out.write("                                                    ");
          if (_jspx_meth_c_if_3((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_0, _jspx_page_context, _jspx_push_body_count_c_forEach_0))
            return true;
          out.write("\r\n");
          out.write("\r\n");
          out.write("                                                </td>\r\n");
          out.write("                                                <td style=\"display: flex; justify-content: space-left\">\r\n");
          out.write("\r\n");
          out.write("\r\n");
          out.write("                                                    <form action=\"deleteuser\" method=\"Post\" id=\"deleteForm\">\r\n");
          out.write("                                                        <button class=\"btn btn-primary btn-sm trash\" type=\"button\" title=\"Xóa\" onclick=\"confirmDelete(this)\"\r\n");
          out.write("                                                                data-employeeID=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${i.employeeID}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\">\r\n");
          out.write("                                                            <i class=\"fas fa-trash-alt\"></i>\r\n");
          out.write("                                                        </button>\r\n");
          out.write("                                                    </form>\r\n");
          out.write("                                                    <form action=\"addemployee\" method=\"Post\">\r\n");
          out.write("                                                        <button class=\"btn btn-primary btn-sm edit\" type=\"button\" title=\"Thêm nhân viên làm việc\" onclick=\"confirmAdd(this)\"\r\n");
          out.write("                                                                data-employeeID=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${i.employeeID}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\">\r\n");
          out.write("                                                            <i class=\"fas fa-plus\"></i>\r\n");
          out.write("                                                        </button>\r\n");
          out.write("                                                    </form>\r\n");
          out.write("\r\n");
          out.write("\r\n");
          out.write("\r\n");
          out.write("\r\n");
          out.write("\r\n");
          out.write("                                                    <button class=\"btn btn-primary btn-sm edit\" type=\"button\" title=\"Sửa\" id=\"show-emp\" data-toggle=\"modal\"\r\n");
          out.write("                                                            data-target=\"#ModalUP\" onclick=\"getData('");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${i.employeeID}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("')\"><i class=\"fas fa-edit\"></i></button>\r\n");
          out.write("\r\n");
          out.write("                                                </td>\r\n");
          out.write("                                            </tr>\r\n");
          out.write("                                        ");
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
    _jspx_th_c_if_0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${i.employeesex ==1}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_0 = _jspx_th_c_if_0.doStartTag();
    if (_jspx_eval_c_if_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("                                                        <span >Nam</span>\r\n");
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
    _jspx_th_c_if_1.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${i.employeesex ==2}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_1 = _jspx_th_c_if_1.doStartTag();
    if (_jspx_eval_c_if_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("                                                        <span >Nữ</span>\r\n");
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

  private boolean _jspx_meth_c_if_2(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_2 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_2.setPageContext(_jspx_page_context);
    _jspx_th_c_if_2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_0);
    _jspx_th_c_if_2.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${i.employeestatus == true}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_2 = _jspx_th_c_if_2.doStartTag();
    if (_jspx_eval_c_if_2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("                                                        <span class=\"badge bg-success\">Đang làm</span>\r\n");
        out.write("                                                    ");
        int evalDoAfterBody = _jspx_th_c_if_2.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_2);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_2);
    return false;
  }

  private boolean _jspx_meth_c_if_3(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_3 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_3.setPageContext(_jspx_page_context);
    _jspx_th_c_if_3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_0);
    _jspx_th_c_if_3.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${i.employeestatus == false}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_3 = _jspx_th_c_if_3.doStartTag();
    if (_jspx_eval_c_if_3 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\r\n");
        out.write("                                                        <span class=\"badge bg-danger\">Đã nghỉ</span>\r\n");
        out.write("                                                    ");
        int evalDoAfterBody = _jspx_th_c_if_3.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_3);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_3);
    return false;
  }
}
