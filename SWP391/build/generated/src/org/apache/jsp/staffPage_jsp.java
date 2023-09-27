package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class staffPage_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "headerAdmin.jsp", out, false);
      out.write("\n");
      out.write("        <main class=\"app-content\">\n");
      out.write("            <div class=\"app-title\"> \n");
      out.write("                <ul class=\"app-breadcrumb breadcrumb side\">\n");
      out.write("                    <li class=\"breadcrumb-item active\"><a href=\"#\"><b>Danh sách nhân viên </b></a></li>\n");
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
      out.write("                                    <a class=\"btn btn-add btn-sm\" href=\"createuser\" title=\"Thêm\"><i class=\"fas fa-plus\"></i>\n");
      out.write("                                        Tạo mới nhân viên</a>\n");
      out.write("                                    <!--                                </div>\n");
      out.write("                                                                    <div class=\"col-sm-2\">\n");
      out.write("                                                                        <a class=\"btn btn-delete btn-sm nhap-tu-file\" type=\"button\" title=\"Nhập\" onclick=\"myFunction(this)\"><i\n");
      out.write("                                                                                class=\"fas fa-file-upload\"></i> Tải từ file</a>\n");
      out.write("                                                                    </div>\n");
      out.write("                                    \n");
      out.write("                                                                    <div class=\"col-sm-2\">\n");
      out.write("                                                                        <a class=\"btn btn-delete btn-sm print-file\" type=\"button\" title=\"In\" onclick=\"myApp.printTable()\"><i\n");
      out.write("                                                                                class=\"fas fa-print\"></i> In dữ liệu</a>\n");
      out.write("                                                                    </div>\n");
      out.write("                                                                    <div class=\"col-sm-2\">\n");
      out.write("                                                                        <a class=\"btn btn-delete btn-sm print-file js-textareacopybtn\" type=\"button\" title=\"Sao chép\"><i\n");
      out.write("                                                                                class=\"fas fa-copy\"></i> Sao chép</a>\n");
      out.write("                                                                    </div>\n");
      out.write("                                    \n");
      out.write("                                                                    <div class=\"col-sm-2\">\n");
      out.write("                                                                        <a class=\"btn btn-excel btn-sm\" href=\"\" title=\"In\"><i class=\"fas fa-file-excel\"></i> Xuất Excel</a>\n");
      out.write("                                                                    </div>\n");
      out.write("                                                                    <div class=\"col-sm-2\">\n");
      out.write("                                                                        <a class=\"btn btn-delete btn-sm pdf-file\" type=\"button\" title=\"In\" onclick=\"myFunction(this)\"><i\n");
      out.write("                                                                                class=\"fas fa-file-pdf\"></i> Xuất PDF</a>\n");
      out.write("                                                                    </div>\n");
      out.write("                                                                    <div class=\"col-sm-2\">\n");
      out.write("                                                                        <a class=\"btn btn-delete btn-sm\" type=\"button\" title=\"Xóa\" onclick=\"myFunction(this)\"><i\n");
      out.write("                                                                                class=\"fas fa-trash-alt\"></i> Xóa tất cả </a>\n");
      out.write("                                                                    </div>-->\n");
      out.write("                                </div>\n");
      out.write("                                <table class=\"table table-hover table-bordered\" id=\"sampleTable\">\n");
      out.write("                                    <thead>\n");
      out.write("                                        <tr>\n");
      out.write("                                            <th width=\"10\"><input type=\"checkbox\" id=\"all\"></th>\n");
      out.write("                                            <th>ID đơn hàng </th>\n");
      out.write("                                            <th>Sản Phẩm</th>\n");
      out.write("                                            <th>Ảnh</th>\n");
      out.write("                                            <th>Địa chỉ</th>\n");
      out.write("                                            <th>Tên</th>\n");
      out.write("                                            \n");
      out.write("                                            <th>SĐT</th>\n");
      out.write("                                            <th>Tình Trạng</th>\n");
      out.write("                                           \n");
      out.write("                                        </tr>\n");
      out.write("                                    </thead>\n");
      out.write("\n");
      out.write("                                    \n");
      out.write("                               \n");
      out.write("                                </table>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("        </main>\n");
      out.write("\n");
      out.write("        <!--\n");
      out.write("          MODAL\n");
      out.write("        -->\n");
      out.write("        <div class=\"modal fade\" id=\"ModalUP\" tabindex=\"-1\" role=\"dialog\" aria-hidden=\"true\" data-backdrop=\"static\"\n");
      out.write("             data-keyboard=\"false\">\n");
      out.write("            <div class=\"modal-dialog modal-dialog-centered\" role=\"document\">\n");
      out.write("                <div class=\"modal-content\">\n");
      out.write("\n");
      out.write("                    <div class=\"modal-body\">\n");
      out.write("                        <div class=\"row\">\n");
      out.write("                            <div class=\"form-group  col-md-12\">\n");
      out.write("                                <span class=\"thong-tin-thanh-toan\">\n");
      out.write("                                    <h5>Chỉnh sửa thông tin nhân viên cơ bản</h5>\n");
      out.write("                                </span>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                        <form action=\"updateuser\" method=\"POST\" id=\"updateusers\">\n");
      out.write("\n");
      out.write("\n");
      out.write("                        </form>\n");
      out.write("\n");
      out.write("                        <!-- Essential javascripts for application to work-->\n");
      out.write("                        <script src=\"./js/jquery-3.2.1.min.js\"></script>\n");
      out.write("                        <script src=\"./js/popper.min.js\"></script>\n");
      out.write("                        <script src=\"./js/bootstrap.min.js\"></script>\n");
      out.write("                        <script src=\"//ajax.googleapis.com/ajax/libs/jquery/1.11.1/jquery.min.js\"></script>\n");
      out.write("                        <script src=\"src/jquery.table2excel.js\"></script>\n");
      out.write("                        <script src=\"./js/main.js\"></script>\n");
      out.write("                        <!-- The javascript plugin to display page loading on top-->\n");
      out.write("                        <script src=\"js/plugins/pace.min.js\"></script>\n");
      out.write("                        <!-- Page specific javascripts-->\n");
      out.write("                        <script src=\"https://cdnjs.cloudflare.com/ajax/libs/jquery-confirm/3.3.2/jquery-confirm.min.js\"></script>\n");
      out.write("                        <!-- Data table plugin-->\n");
      out.write("                        <script type=\"text/javascript\" src=\"./js/plugins/jquery.dataTables.min.js\"></script>\n");
      out.write("                        <script type=\"text/javascript\" src=\"./js/plugins/dataTables.bootstrap.min.js\"></script>\n");
      out.write("                        <script type=\"text/javascript\">\n");
      out.write("                                                                $('#sampleTable').DataTable();\n");
      out.write("                                                                //Thời Gian\n");
      out.write("                                                                function time() {\n");
      out.write("                                                                    var today = new Date();\n");
      out.write("                                                                    var weekday = new Array(7);\n");
      out.write("                                                                    weekday[0] = \"Chủ Nhật\";\n");
      out.write("                                                                    weekday[1] = \"Thứ Hai\";\n");
      out.write("                                                                    weekday[2] = \"Thứ Ba\";\n");
      out.write("                                                                    weekday[3] = \"Thứ Tư\";\n");
      out.write("                                                                    weekday[4] = \"Thứ Năm\";\n");
      out.write("                                                                    weekday[5] = \"Thứ Sáu\";\n");
      out.write("                                                                    weekday[6] = \"Thứ Bảy\";\n");
      out.write("                                                                    var day = weekday[today.getDay()];\n");
      out.write("                                                                    var dd = today.getDate();\n");
      out.write("                                                                    var mm = today.getMonth() + 1;\n");
      out.write("                                                                    var yyyy = today.getFullYear();\n");
      out.write("                                                                    var h = today.getHours();\n");
      out.write("                                                                    var m = today.getMinutes();\n");
      out.write("                                                                    var s = today.getSeconds();\n");
      out.write("                                                                    m = checkTime(m);\n");
      out.write("                                                                    s = checkTime(s);\n");
      out.write("                                                                    nowTime = h + \" giờ \" + m + \" phút \" + s + \" giây\";\n");
      out.write("                                                                    if (dd < 10) {\n");
      out.write("                                                                        dd = '0' + dd\n");
      out.write("                                                                    }\n");
      out.write("                                                                    if (mm < 10) {\n");
      out.write("                                                                        mm = '0' + mm\n");
      out.write("                                                                    }\n");
      out.write("                                                                    today = day + ', ' + dd + '/' + mm + '/' + yyyy;\n");
      out.write("                                                                    tmp = '<span class=\"date\"> ' + today + ' - ' + nowTime +\n");
      out.write("                                                                            '</span>';\n");
      out.write("                                                                    document.getElementById(\"clock\").innerHTML = tmp;\n");
      out.write("                                                                    clocktime = setTimeout(\"time()\", \"1000\", \"Javascript\");\n");
      out.write("\n");
      out.write("                                                                    function checkTime(i) {\n");
      out.write("                                                                        if (i < 10) {\n");
      out.write("                                                                            i = \"0\" + i;\n");
      out.write("                                                                        }\n");
      out.write("                                                                        return i;\n");
      out.write("                                                                    }\n");
      out.write("                                                                }\n");
      out.write("                        </script>\n");
      out.write("\n");
      out.write("                        <!--Confỉm xóa nhân viên -->\n");
      out.write("                        <script>\n");
      out.write("                            function confirmDelete(button) {\n");
      out.write("                                var employeeID = button.getAttribute(\"data-employeeID\");\n");
      out.write("\n");
      out.write("                                swal({\n");
      out.write("                                    title: \"Cảnh báo\",\n");
      out.write("                                    text: \"Bạn có muốn xoá nhân viên này?\",\n");
      out.write("                                    buttons: [\"Hủy bỏ\", \"Đồng ý\"],\n");
      out.write("                                }).then((willDelete) => {\n");
      out.write("                                    if (willDelete) {\n");
      out.write("                                        var form = button.closest(\"form\");\n");
      out.write("                                        form.action = \"deleteuser?employeeID=\" + employeeID;\n");
      out.write("                                        form.submit();\n");
      out.write("                                    }\n");
      out.write("\n");
      out.write("                                });\n");
      out.write("                            }\n");
      out.write("                        </script>\n");
      out.write("\n");
      out.write("                        <script>\n");
      out.write("                            ");
 if (request.getAttribute("messok") != null) {
      out.write("\n");
      out.write("                            swal(\"");
      out.print( request.getAttribute("messok"));
      out.write("\", \"\", \"success\");\n");
      out.write("                            ");
 request.removeAttribute("messok"); 
      out.write("\n");
      out.write("                            ");
 } 
      out.write("\n");
      out.write("                        </script>\n");
      out.write("                        <script>\n");
      out.write("                            ");
 if (request.getAttribute("messerror") != null) {
      out.write("\n");
      out.write("                            swal(\"");
      out.print( request.getAttribute("messerror"));
      out.write("\", \"\", \"error\");\n");
      out.write("                            ");
 request.removeAttribute("messerror"); 
      out.write("\n");
      out.write("                            ");
 }
      out.write("\n");
      out.write("                        </script>\n");
      out.write("                        <!--------------------------------------------------------------------------------------------------->\n");
      out.write("\n");
      out.write("                        <!--Comfirm add nhân viên-->\n");
      out.write("                        <script>\n");
      out.write("                            function confirmAdd(button) {\n");
      out.write("                                var employeeID = button.getAttribute(\"data-employeeID\");\n");
      out.write("\n");
      out.write("                                swal({\n");
      out.write("                                    title: \"Cảnh báo\",\n");
      out.write("                                    text: \"Bạn có muốn thêm nhân viên này?\",\n");
      out.write("                                    buttons: [\"Hủy bỏ\", \"Đồng ý\"],\n");
      out.write("                                }).then((willDelete) => {\n");
      out.write("                                    if (willDelete) {\n");
      out.write("                                        var form = button.closest(\"form\");\n");
      out.write("                                        form.action = \"addemployee?employeeID=\" + employeeID;\n");
      out.write("                                        form.submit();\n");
      out.write("                                    }\n");
      out.write("\n");
      out.write("                                });\n");
      out.write("                            }\n");
      out.write("\n");
      out.write("                        </script>\n");
      out.write("                        <script>\n");
      out.write("                            ");
 if (request.getAttribute("messtrue") != null) {
      out.write("\n");
      out.write("                            swal(\"");
      out.print( request.getAttribute("messtrue"));
      out.write("\", \"\", \"success\");\n");
      out.write("                            ");
 request.removeAttribute("messtrue"); 
      out.write("\n");
      out.write("                            ");
 } 
      out.write("\n");
      out.write("                        </script>\n");
      out.write("                        <script>\n");
      out.write("                            ");
 if (request.getAttribute("messefalse") != null) {
      out.write("\n");
      out.write("                            swal(\"");
      out.print( request.getAttribute("messefalse"));
      out.write("\", \"\", \"error\");\n");
      out.write("                            ");
 request.removeAttribute("messefalse"); 
      out.write("\n");
      out.write("                            ");
 }
      out.write("\n");
      out.write("                        </script>\n");
      out.write("                        <!--------------------------------------------------------------------------------------------------->\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                        <script>\n");
      out.write("                            oTable = $('#sampleTable').dataTable();\n");
      out.write("                            $('#all').click(function (e) {\n");
      out.write("                                $('#sampleTable tbody :checkbox').prop('checked', $(this).is(':checked'));\n");
      out.write("                                e.stopImmediatePropagation();\n");
      out.write("                            });\n");
      out.write("\n");
      out.write("                            function getData(i) {\n");
      out.write("                                $.ajax({\n");
      out.write("                                    type: 'Post',\n");
      out.write("                                    url: '");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/loadUser',\n");
      out.write("                                    data: {\n");
      out.write("                                        id: i\n");
      out.write("                                    },\n");
      out.write("                                    success: function (data, textStatus, jqXHR) {\n");
      out.write("                                        $('#updateusers').html(data);\n");
      out.write("                                    }\n");
      out.write("                                })\n");
      out.write("                            }\n");
      out.write("                        </script>\n");
      out.write("                        </body>\n");
      out.write("\n");
      out.write("                        </html>\n");
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
