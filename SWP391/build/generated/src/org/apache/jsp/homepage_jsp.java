package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class homepage_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_forEach_var_items_end;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_if_test;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_forEach_var_items_end = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_if_test = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_forEach_var_items_end.release();
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

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html >\n");
      out.write("    <head>\n");
      out.write("        <meta charset=\"utf-8\">\n");
      out.write("        <link rel=\"png\" href=\"logo.png\" type=\"img/logo.png\">\n");
      out.write("        <title>LồngChimVN</title>      \n");
      out.write("        <meta content=\"width=device-width, initial-scale=1.0\" name=\"viewport\">\n");
      out.write("        <meta content=\"Free HTML Templates\" name=\"keywords\">\n");
      out.write("        <meta content=\"Free HTML Templates\" name=\"description\">\n");
      out.write("\n");
      out.write("        <!-- Favicon -->\n");
      out.write("        <link href=\"img/favicon.ico\" rel=\"icon\">\n");
      out.write("\n");
      out.write("        <!-- Google Web Fonts -->\n");
      out.write("        <link rel=\"preconnect\" href=\"https://fonts.gstatic.com\">\n");
      out.write("        <link href=\"https://fonts.googleapis.com/css2?family=Roboto:wght@400;500;700&display=swap\" rel=\"stylesheet\">  \n");
      out.write("\n");
      out.write("        <!-- Font Awesome -->\n");
      out.write("        <link href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.10.0/css/all.min.css\" rel=\"stylesheet\">\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"https://cdn.datatables.net/1.11.3/css/jquery.dataTables.min.css\">\n");
      out.write("        <!-- Libraries Stylesheet -->\n");
      out.write("        <link href=\"lib/animate/animate.min.css\" rel=\"stylesheet\">\n");
      out.write("        <link href=\"lib/owlcarousel/assets/owl.carousel.min.css\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("        <!-- Customized Bootstrap Stylesheet -->\n");
      out.write("\n");
      out.write("        <link href=\"css/style.css\" rel=\"stylesheet\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://cdn.datatables.net/1.11.1/css/jquery.dataTables.min.css\">\n");
      out.write("    </head>\n");
      out.write("\n");
      out.write("    <body> \n");
      out.write("        <!-- Topbar Start -->\n");
      out.write("        <div class=\"container-fluid\">\n");
      out.write("            <div class=\"row bg-secondary py-1 px-xl-5\">\n");
      out.write("                <div class=\"col-lg-6 d-none d-lg-block\">\n");
      out.write("                    <div class=\"d-inline-flex align-items-center h-100\">\n");
      out.write("\n");
      out.write("                        <!--<a class=\"text-body mr-3\" href=\"\">Contact</a>\n");
      out.write("                            <a class=\"text-body mr-3\" href=\"\">Help</a>-->\n");
      out.write("\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-lg-6 text-center text-lg-right\">\n");
      out.write("                    <div class=\"d-inline-flex align-items-center\">\n");
      out.write("                        <!--                        <div class=\"btn-group\">\n");
      out.write("                                                    <button type=\"button\" class=\"btn btn-sm btn-light dropdown-toggle\" data-toggle=\"dropdown\">My Account</button>\n");
      out.write("                                                    <div class=\"dropdown-menu dropdown-menu-right\">\n");
      out.write("                                                        <button class=\"dropdown-item\" onclick=\"location.href = 'UserServlet?action=showLoginForm';\" type=\"button\">Sign in</button>\n");
      out.write("                                                        <button class=\"dropdown-item\" onclick=\"location.href = 'UserServlet?action=showSignupForm';\" type=\"button\">Sign up</button>\n");
      out.write("                                                    </div>\n");
      out.write("                                                </div>-->\n");
      out.write("                        ");
      if (_jspx_meth_c_if_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                        ");
      if (_jspx_meth_c_if_1(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                        <div class=\"btn-group mx-2\">\n");
      out.write("                            <!--                            <button type=\"button\" class=\"btn btn-sm btn-light dropdown-toggle\" data-toggle=\"dropdown\">USD</button>\n");
      out.write("                                                        <div class=\"dropdown-menu dropdown-menu-right\">\n");
      out.write("                                                            <button class=\"dropdown-item\" type=\"button\">EUR</button>\n");
      out.write("                                                            <button class=\"dropdown-item\" type=\"button\">GBP</button>\n");
      out.write("                                                            <button class=\"dropdown-item\" type=\"button\">CAD</button>\n");
      out.write("                                                        </div>-->\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"btn-group\">\n");
      out.write("                            <!--                            <button type=\"button\" class=\"btn btn-sm btn-light dropdown-toggle\" data-toggle=\"dropdown\">EN</button>\n");
      out.write("                                                        <div class=\"dropdown-menu dropdown-menu-right\">\n");
      out.write("                                                            <button class=\"dropdown-item\" type=\"button\">FR</button>\n");
      out.write("                                                            <button class=\"dropdown-item\" type=\"button\">AR</button>\n");
      out.write("                                                            <button class=\"dropdown-item\" type=\"button\">RU</button>\n");
      out.write("                                                        </div>-->\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"d-inline-flex align-items-center d-block d-lg-none\">\n");
      out.write("                        <a href=\"\" class=\"btn px-0 ml-2\">\n");
      out.write("                            <i class=\"fas fa-heart text-dark\"></i>\n");
      out.write("                            <span class=\"badge text-dark border border-dark rounded-circle\" style=\"padding-bottom: 2px;\">0</span>\n");
      out.write("                        </a>\n");
      out.write("                        <a href=\"\" class=\"btn px-0 ml-2\">\n");
      out.write("                            <i class=\"fas fa-shopping-cart text-dark\"></i>\n");
      out.write("                            <span class=\"badge text-dark border border-dark rounded-circle\" style=\"padding-bottom: 2px;\">0</span>\n");
      out.write("                        </a>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"row align-items-center bg-light py-3 px-xl-5 d-none d-lg-flex\">\n");
      out.write("                <div class=\"col-lg-4\">\n");
      out.write("                    <a href=\"ShowProductsServlet\" class=\"text-decoration-none\">\n");
      out.write("                        <span class=\"h1 text-uppercase text-primary bg-dark px-2\">Lồng</span>\n");
      out.write("                        <span class=\"h1 text-uppercase text-dark bg-primary px-2 ml-n1\">ChimVN</span>\n");
      out.write("                    </a>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-lg-4 col-6 text-left\">\n");
      out.write("\n");
      out.write("\n");
      out.write("                    <form action=\"ProductSearchServlet\" method=\"GET\">\n");
      out.write("                        <div class=\"input-group\">\n");
      out.write("                            <input type=\"hidden\" name=\"action\" value=\"searchByName\">\n");
      out.write("                            <label for=\"productName\"></label>\n");
      out.write("                            <input type=\"text\" class=\"form-control\" name=\"productName\" placeholder=\"Tìm Sản Phẩm\"> \n");
      out.write("\n");
      out.write("                            <div class=\"input-group-append\">\n");
      out.write("                                <input  class=\"input-group-text bg-transparent text-primary\" required=\"\" type=\"submit\" value=\"Tìm Kiếm\">\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </form>\n");
      out.write("\n");
      out.write("\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-lg-4 col-6 text-right\">\n");
      out.write("                    <!--                    <p class=\"m-0\">Customer Service</p>\n");
      out.write("                                        <h5 class=\"m-0\">+012 345 6789</h5>-->\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <!-- Topbar End -->\n");
      out.write("\n");
      out.write("\n");
      out.write("        <!-- Navbar Start -->\n");
      out.write("        <div class=\"container-fluid bg-dark mb-30\">\n");
      out.write("            <div class=\"row px-xl-5\">\n");
      out.write("                <div class=\"col-lg-3 d-none d-lg-block\">\n");
      out.write("                    <a class=\"btn d-flex align-items-center justify-content-between bg-primary w-100\" data-toggle=\"collapse\" href=\"#navbar-vertical\" style=\"height: 65px; padding: 0 30px;\">\n");
      out.write("                        <h6 class=\"text-dark m-0\"><i class=\"fa fa-bars mr-2\"></i>Mục lục</h6>\n");
      out.write("                        <i class=\"fa fa-angle-down text-dark\"></i>\n");
      out.write("                    </a>\n");
      out.write("                    <nav class=\"collapse position-absolute navbar navbar-vertical navbar-light align-items-start p-0 bg-light\" id=\"navbar-vertical\" style=\"width: calc(100% - 30px); z-index: 999;\">\n");
      out.write("                        <div class=\"navbar-nav w-100\">\n");
      out.write("\n");
      out.write("                            \n");
      out.write("                            <div class=\"nav-item dropdown dropright\">\n");
      out.write("                                <a href=\"#\" class=\"nav-link dropdown-toggle\" data-toggle=\"dropdown\">Lồng Chào Mào   <i class=\"fa fa-angle-right float-right mt-1\"></i></a>\n");
      out.write("                                <div class=\"dropdown-menu position-absolute rounded-0 border-0 m-0\">\n");
      out.write("\n");
      out.write("                                    <form action=\"ProductSearchServlet\" method=\"GET\">\n");
      out.write("                                        <input type=\"hidden\" name=\"action\" value=\"searchByName\"> \n");
      out.write("                                        <button type=\"submit\" name=\"productName\" value=\"Lồng tre\" class=\"dropdown-item\">Lồng chào mào Huế </button>\n");
      out.write("                                    </form>\n");
      out.write("                                    <form action=\"ProductSearchServlet\" method=\"GET\">\n");
      out.write("                                        <input type=\"hidden\" name=\"action\" value=\"searchByName\"> \n");
      out.write("                                        <button type=\"submit\" name=\"productName\" value=\"Lồng gỗ\" class=\"dropdown-item\">Lồng chào mào Tròn</button>\n");
      out.write("                                    </form>\n");
      out.write("                                    <form action=\"ProductSearchServlet\" method=\"GET\">\n");
      out.write("                                        <input type=\"hidden\" name=\"action\" value=\"searchByName\"> \n");
      out.write("                                        <button type=\"submit\" name=\"productName\" value=\"Lồng inox\" class=\"dropdown-item\">Lồng chào mào Tre Già</button>\n");
      out.write("                                    </form>\n");
      out.write("\n");
      out.write("\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                            \n");
      out.write("                        </div>\n");
      out.write("                    </nav>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-lg-9\">\n");
      out.write("                    <nav class=\"navbar navbar-expand-lg bg-dark navbar-dark py-3 py-lg-0 px-0\">\n");
      out.write("                        <a href=\"\" class=\"text-decoration-none d-block d-lg-none\">\n");
      out.write("                            <span class=\"h1 text-uppercase text-dark bg-light px-2\">Lồng</span>\n");
      out.write("                            <span class=\"h1 text-uppercase text-light bg-primary px-2 ml-n1\">ChimVN</span>\n");
      out.write("                        </a>\n");
      out.write("                        <button type=\"button\" class=\"navbar-toggler\" data-toggle=\"collapse\" data-target=\"#navbarCollapse\">\n");
      out.write("                            <span class=\"navbar-toggler-icon\"></span>\n");
      out.write("                        </button>\n");
      out.write("                        <div class=\"collapse navbar-collapse justify-content-between\" id=\"navbarCollapse\">\n");
      out.write("                            <div class=\"navbar-nav mr-auto py-0\">\n");
      out.write("                                <a href=\"homePage.jsp\" class=\"nav-item nav-link active\">Trang chủ</a>\n");
      out.write("                                <a href=\"ProductSearchServlet?action=searchByCategory&categoryName=Lồng\" class=\"nav-item nav-link\">Lồng Đặc Biệt</a>\n");
      out.write("                                <a href=\"ProductSearchServlet?action=searchByCategory&categoryName=Food\" class=\"nav-item nav-link\">Chất Liệu</a>\n");
      out.write("                                <a href=\"ProductSearchServlet?action=searchByCategory&categoryName=Lồng cage\" class=\"nav-item nav-link\">Đặt lồng chim</a>\n");
      out.write("                                <a href=\"ProductSearchServlet?action=searchByCategory&categoryName=Accessory\" class=\"nav-item nav-link\">Lồng chim khác  </a>\n");
      out.write("                                <!--                                <div class=\"nav-item dropdown\">\n");
      out.write("                                                                    <a href=\"#\" class=\"nav-link dropdown-toggle\" data-toggle=\"dropdown\">Pages <i class=\"fa fa-angle-down mt-1\"></i></a>\n");
      out.write("                                                                    <div class=\"dropdown-menu bg-primary rounded-0 border-0 m-0\">\n");
      out.write("                                                                        <a href=\"cart.html\" class=\"dropdown-item\">Shopping Cart</a>\n");
      out.write("                                                                        <a href=\"checkout.html\" class=\"dropdown-item\">Checkout</a>\n");
      out.write("                                                                    </div>\n");
      out.write("                                                                </div>\n");
      out.write("                                                                <a href=\"contact.html\" class=\"nav-item nav-link\">Contact</a>-->\n");
      out.write("                            </div>\n");
      out.write("\n");
      out.write("                            <!--search store-->\n");
      out.write("                            <div class=\"col-lg-4 col-6 text-left\">\n");
      out.write("                                <form action=\"ShopSearchServlet\" method=\"GET\">\n");
      out.write("                                    <div class=\"input-group\">\n");
      out.write("                                        <input type=\"hidden\" name=\"action\" value=\"searchStoreByName\">\n");
      out.write("                                        <label for=\"storeName\"></label>\n");
      out.write("                                        <input type=\"text\" class=\"form-control input-sm\" name=\"storeName\" placeholder=\"Tìm Cửa Hàng\">\n");
      out.write("\n");
      out.write("                                        <div class=\"input-group-append\">\n");
      out.write("                                            <input class=\"input-group-text bg-transparent text-primary btn-sm\" type=\"submit\" value=\"Tìm Kiếm\">\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("                                </form>\n");
      out.write("                            </div>\n");
      out.write("                            <!--search end-->\n");
      out.write("\n");
      out.write("                            <!--cart-->\n");
      out.write("                            <div class=\"navbar-nav ml-auto py-0 d-none d-lg-block\">\n");
      out.write("                                <a href=\"CartServlet?action=view\" class=\"btn px-0 ml-3\">\n");
      out.write("                                    <i class=\"fas fa-shopping-cart text-primary\"></i>\n");
      out.write("                                    <span class=\"badge text-secondary border border-secondary rounded-circle\" style=\"padding-bottom: 2px;\"></span>\n");
      out.write("                                </a>\n");
      out.write("                            </div>\n");
      out.write("                            <!--end-->\n");
      out.write("\n");
      out.write("\n");
      out.write("                        </div>\n");
      out.write("                    </nav>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <!-- Navbar End -->\n");
      out.write("\n");
      out.write("\n");
      out.write("        <!-- Carousel Start -->\n");
      out.write("        <div class=\"container-fluid mb-3\">\n");
      out.write("            <div class=\"row px-xl-5\">\n");
      out.write("                <div class=\"col-lg-8\">\n");
      out.write("                    <div id=\"header-carousel\" class=\"carousel slide carousel-fade mb-30 mb-lg-0\" data-ride=\"carousel\">\n");
      out.write("                        <ol class=\"carousel-indicators\">\n");
      out.write("                            <li data-target=\"#header-carousel\" data-slide-to=\"0\" class=\"active\"></li>\n");
      out.write("                            <li data-target=\"#header-carousel\" data-slide-to=\"1\"></li>\n");
      out.write("                            <li data-target=\"#header-carousel\" data-slide-to=\"2\"></li>\n");
      out.write("                        </ol>\n");
      out.write("                        <div class=\"carousel-inner\">\n");
      out.write("                            <div class=\"carousel-item position-relative active\" style=\" height: 430px;\">\n");
      out.write("                                <img class=\"position-absolute w-100 h-100\" src=\"img/long-chao-mao-sin-tre-gia-1.jpg\" style=\"object-fit: cover;\">\n");
      out.write("                                <div class=\"carousel-caption d-flex flex-column align-items-center justify-content-center\">\n");
      out.write("                                    <div class=\"p-3\" style=\"max-width: 700px;\">\n");
      out.write("                                        <h1 class=\"display-4 text-white mb-3 animate__animated animate__fadeInDown\">Lồng chim sáo</h1>\n");
      out.write("                                        <p class=\"mx-md-5 px-5 animate__animated animate__bounceIn\">Nơi bán những lồng chim cảnh đẹp, độc lạ và giá cả phù hợp nhất trên thị trường.</p>\n");
      out.write("                                        <a class=\"btn btn-outline-light py-2 px-4 mt-3 animate__animated animate__fadeInUp\"\n");
      out.write("                                           href=\"ProductSearchServlet?action=searchByCategory&categoryName=Lồng\">Lồng Shop</a>\n");
      out.write("\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"carousel-item position-relative\" style=\"height: 430px;\">\n");
      out.write("                                <img class=\"position-absolute w-100 h-100\" src=\"img/long-chao-mao-sin-tre-gia-1.jpg\" style=\"object-fit: cover;\">\n");
      out.write("                                <div class=\"carousel-caption d-flex flex-column align-items-center justify-content-center\">\n");
      out.write("                                    <div class=\"p-3\" style=\"max-width: 700px;\">\n");
      out.write("                                        <h1 class=\"display-4 text-white mb-3 animate__animated animate__fadeInDown\">Lồng chim vành khuyên</h1>\n");
      out.write("                                        <p class=\"mx-md-5 px-5 animate__animated animate__bounceIn\">Những lồng chim đến từ những nhà cung cấp uy tín.</p>\n");
      out.write("\n");
      out.write("                                        <a class=\"btn btn-outline-light py-2 px-4 mt-3 animate__animated animate__fadeInUp\" \n");
      out.write("                                           href=\"ProductSearchServlet?action=searchByCategory&categoryName=Food\">Lồng Shop</a>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"carousel-item position-relative\" style=\"height: 430px;\">\n");
      out.write("                                <img class=\"position-absolute w-100 h-100\" src=\"img/long-cu-gay-duc-song-long-noi-1.jpg\" style=\"object-fit: cover;\">\n");
      out.write("                                <div class=\"carousel-caption d-flex flex-column align-items-center justify-content-center\">\n");
      out.write("                                    <div class=\"p-3\" style=\"max-width: 700px;\">\n");
      out.write("                                        <h1 class=\"display-4 text-white mb-3 animate__animated animate__fadeInDown\">Lồng Chim chào mào </h1>\n");
      out.write("                                        <p class=\"mx-md-5 px-5 animate__animated animate__bounceIn\">Nơi có những lồng chim đẹp đầy nghệ thuật trên cả thế giới, tạo nên vè đẹp sang trọng quý tộc.</p>\n");
      out.write("\n");
      out.write("                                        <a class=\"btn btn-outline-light py-2 px-4 mt-3 animate__animated animate__fadeInUp\"\n");
      out.write("                                           href=\"ProductSearchServlet?action=searchByCategory&categoryName=Lồng cage\">Lồng Shop</a>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-lg-4\">\n");
      out.write("                    <div class=\"product-offer mb-30\" style=\"height: 200px;\">\n");
      out.write("                        <img class=\"img-fluid\" src=\"img/long-hoa-mi-56-60-nan-full-set-2.jpg\" alt=\"\">\n");
      out.write("                        <div class=\"offer-text\">\n");
      out.write("                            <h6 class=\"text-white text-uppercase\">Lồng bằng gỗ trắc</h6>\n");
      out.write("                            <h3 class=\"text-white mb-3\"></h3>\n");
      out.write("                            <a  class=\"btn btn-primary\"\n");
      out.write("                                href=\"ProductSearchServlet?action=searchByCategory&categoryName=Food\">Lồng Shop</a>\n");
      out.write("\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"product-offer mb-30\" style=\"height: 200px;\">\n");
      out.write("                        <img class=\"img-fluid\" src=\"img/long-mun-cham-hoa-mai-1.jpg\" alt=\"\">\n");
      out.write("                        <div class=\"offer-text\">\n");
      out.write("                            <h6 class=\"text-white text-uppercase\">Lồng bằng gỗ mít</h6>\n");
      out.write("                            <h3 class=\"text-white mb-3\"></h3>\n");
      out.write("                            <a class=\"btn btn-primary\" href=\"ProductSearchServlet?action=searchByCategory&categoryName=Accessory\">Lồng Shop</a>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <!-- Carousel End -->\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("        <!-- Categories Start -->\n");
      out.write("        <div class=\"container-fluid pt-5\">\n");
      out.write("            <h2 class=\"section-title position-relative text-uppercase mx-xl-5 mb-4\"><span class=\"bg-secondary pr-3\">Danh Mục</span></h2>\n");
      out.write("            <div class=\"row px-xl-5 pb-3\">\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                <div class=\"col-lg-3 col-md-4 col-sm-6 pb-1\">                                            \n");
      out.write("                    <a class=\"text-decoration-none\" href=\"ProductSearchServlet?action=searchByCategory&categoryName=Lồng\">\n");
      out.write("                        <div class=\"cat-item d-flex align-items-center mb-4\">\n");
      out.write("                            <div class=\"overflow-hidden\" style=\"width: 100px; height: 100px;\">\n");
      out.write("                                <img class=\"img-fluid\" src=\"img/long-cu-gay-duc-song-long-noi-1.jpg\" alt=\"\" style=\"width: 100px; height: 100px \">\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"flex-fill pl-3\">\n");
      out.write("                                <h6>Chim sáo </h6>\n");
      out.write("                                <small class=\"text-body\">100 Products</small>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </a>                                    \n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-lg-3 col-md-4 col-sm-6 pb-1\">\n");
      out.write("                    <a class=\"text-decoration-none\" href=\"ProductSearchServlet?action=searchByCategory&categoryName=Food\">\n");
      out.write("                        <div class=\"cat-item img-zoom d-flex align-items-center mb-4\">\n");
      out.write("                            <div class=\"overflow-hidden\" style=\"width: 100px; height: 100px;\">\n");
      out.write("                                <img class=\"img-fluid\" src=\"img/long-hoa-mi-56-60-nan-full-set-2.jpg\" alt=\"\" style=\"width: 100px; height: 100px;\">\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"flex-fill pl-3\">\n");
      out.write("                                <h6>Chim cu gáy</h6>\n");
      out.write("                                <small class=\"text-body\">100 Products</small>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </a>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-lg-3 col-md-4 col-sm-6 pb-1\">\n");
      out.write("                    <a class=\"text-decoration-none\" href=\"ProductSearchServlet?action=searchByCategory&categoryName=Lồng cage\">\n");
      out.write("                        <div class=\"cat-item img-zoom d-flex align-items-center mb-4\">\n");
      out.write("                            <div class=\"overflow-hidden\" style=\"width: 100px; height: 100px;\">\n");
      out.write("                                <img class=\"img-fluid\" src=\"img/long-luc-chao-mao.jpg\" alt=\"\" style=\"width: 100px; height: 100px;\">\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"flex-fill pl-3\">\n");
      out.write("                                <h6>Lồng đặc biệt</h6>\n");
      out.write("                                <small class=\"text-body\">100 Products</small>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </a>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-lg-3 col-md-4 col-sm-6 pb-1\">\n");
      out.write("                    <a class=\"text-decoration-none\" href=\"ProductSearchServlet?action=searchByCategory&categoryName=Accessory\">\n");
      out.write("                        <div class=\"cat-item img-zoom d-flex align-items-center mb-4\">\n");
      out.write("                            <div class=\"overflow-hidden\" style=\"width: 100px; height: 100px;\">\n");
      out.write("                                <img class=\"img-fluid\" src=\"img/long-luc-1m2.jpg\" alt=\"\" style=\"width: 100px; height: 100px;\">\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"flex-fill pl-3\">\n");
      out.write("                                <h6>Phụ kiện</h6>\n");
      out.write("                                <small class=\"text-body\">100 Products</small>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </a>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <!-- Categories End -->\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("        <!--Products Start--> \n");
      out.write("        <div class=\"container-fluid pt-5 pb-3\">\n");
      out.write("            <h2 class=\"section-title position-relative text-uppercase mx-xl-5 mb-4\"><span class=\"bg-secondary pr-3\">Những Sản Phẩm Nổi Bật</span></h2>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("            <div class=\"row px-xl-5\"  >\n");
      out.write("                <!--<table id=\"productTable\">-->\n");
      out.write("                <table id=\"example-table\" >\n");
      out.write("\n");
      out.write("                    ");
      if (_jspx_meth_c_forEach_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                </table>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("        <!--Products End--> \n");
      out.write("\n");
      out.write("\n");
      out.write("        <!--            <nav aria-label=\"Page navigation\">\n");
      out.write("                        <ul class=\"pagination justify-content-center\">\n");
      out.write("                            <li class=\"page-item disabled\">\n");
      out.write("                                <a class=\"page-link\" href=\"#\" tabindex=\"-1\" aria-disabled=\"true\">Previous</a>\n");
      out.write("                            </li>\n");
      out.write("                            <li class=\"page-item active\" aria-current=\"page\">\n");
      out.write("                                <a class=\"page-link\" href=\"#\">1 <span class=\"sr-only\">(current)</span></a>\n");
      out.write("                            </li>\n");
      out.write("                            <li class=\"page-item\"><a class=\"page-link\" href=\"#\">2</a></li>\n");
      out.write("                            <li class=\"page-item\"><a class=\"page-link\" href=\"#\">3</a></li>\n");
      out.write("                            <li class=\"page-item\">\n");
      out.write("                                <a class=\"page-link\" href=\"#\">Next</a>\n");
      out.write("                            </li>\n");
      out.write("                        </ul>\n");
      out.write("                    </nav>-->\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("        <!-- Footer Start -->\n");
      out.write("        <div class=\"container-fluid bg-dark text-secondary mt-5 pt-5\">\n");
      out.write("            <div class=\"row px-xl-5 pt-5\">\n");
      out.write("                <div class=\"col-lg-4 col-md-12 mb-5 pr-3 pr-xl-5\">\n");
      out.write("                    <h5 class=\"text-secondary text-uppercase mb-4\">Thông tin liên lạc</h5>\n");
      out.write("                    <p class=\"mb-4\">Chuyên cung cấp các loại chim</p>\n");
      out.write("                    <p class=\"mb-2\"><i class=\"fa fa-map-marker-alt text-primary mr-3\"></i>Tp.Hồ Chí Minh</p>\n");
      out.write("                    <p class=\"mb-2\"><i class=\"fa fa-envelope text-primary mr-3\"></i>binhdxse160***@fpt.edu.vn</p>\n");
      out.write("                    <p class=\"mb-0\"><i class=\"fa fa-phone-alt text-primary mr-3\"></i>+84999999999</p>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-lg-8 col-md-12\">\n");
      out.write("                    <div class=\"row\">\n");
      out.write("                        <div class=\"col-md-4 mb-5\">\n");
      out.write("                            <h5 class=\"text-secondary text-uppercase mb-4\">Lồng Shop</h5>\n");
      out.write("                            <div class=\"d-flex flex-column justify-content-start\">\n");
      out.write("                                <a class=\"text-secondary mb-2\" href=\"homePage.jsp\"><i class=\"fa fa-angle-right mr-2\"></i>Trang chủ</a>\n");
      out.write("                                <a class=\"text-secondary mb-2\" href=\"#\"><i class=\"fa fa-angle-right mr-2\"></i>Kênh bán hàng</a>\n");
      out.write("                                <a class=\"text-secondary mb-2\" href=\"#\"><i class=\"fa fa-angle-right mr-2\"></i>Của hàng</a>                               \n");
      out.write("                                <a class=\"text-secondary\" href=\"#\"><i class=\"fa fa-angle-right mr-2\"></i>Liên lạc với chúng tôi</a>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"col-md-4 mb-5\">\n");
      out.write("                            <h5 class=\"text-secondary text-uppercase mb-4\">Tài khoản của tôi</h5>\n");
      out.write("                            <div class=\"d-flex flex-column justify-content-start\">\n");
      out.write("                                <a class=\"text-secondary mb-2\" href=\"#\"><i class=\"fa fa-angle-right mr-2\"></i>Hồ sơ</a>\n");
      out.write("                                <a class=\"text-secondary mb-2\" href=\"#\"><i class=\"fa fa-angle-right mr-2\"></i>Giỏ hàng</a>\n");
      out.write("                                <a class=\"text-secondary mb-2\" href=\"#\"><i class=\"fa fa-angle-right mr-2\"></i>Đơn hàng</a>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"col-md-4 mb-5\">\n");
      out.write("                            <h6 class=\"text-secondary text-uppercase mt-4 mb-3\">Theo dõi chúng tôi</h6>\n");
      out.write("                            <div class=\"d-flex\">\n");
      out.write("                                <a class=\"btn btn-primary btn-square mr-2\" href=\"#\"><i class=\"fab fa-twitter\"></i></a>\n");
      out.write("                                <a class=\"btn btn-primary btn-square mr-2\" href=\"#\"><i class=\"fab fa-facebook-f\"></i></a>\n");
      out.write("                                <a class=\"btn btn-primary btn-square mr-2\" href=\"#\"><i class=\"fab fa-linkedin-in\"></i></a>\n");
      out.write("                                <a class=\"btn btn-primary btn-square\" href=\"#\"><i class=\"fab fa-instagram\"></i></a>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <!-- Footer End -->\n");
      out.write("\n");
      out.write("\n");
      out.write("        <!-- Back to Top -->\n");
      out.write("        <a href=\"#\" class=\"btn btn-primary back-to-top\"><i class=\"fa fa-angle-double-up\"></i></a>\n");
      out.write("\n");
      out.write("\n");
      out.write("        <!-- JavaScript Libraries -->\n");
      out.write("        <script src=\"https://code.jquery.com/jquery-3.4.1.min.js\"></script>\n");
      out.write("        <script src=\"https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.bundle.min.js\"></script>\n");
      out.write("        <script src=\"lib/easing/easing.min.js\"></script>\n");
      out.write("        <script src=\"lib/owlcarousel/owl.carousel.min.js\"></script>\n");
      out.write("\n");
      out.write("        <!-- Contact Javascript File -->\n");
      out.write("        <script src=\"mail/jqBootstrapValidation.min.js\"></script>\n");
      out.write("        <script src=\"mail/contact.js\"></script>\n");
      out.write("\n");
      out.write("        <!-- Template Javascript -->\n");
      out.write("        <script src=\"js/main.js\"></script>\n");
      out.write("\n");
      out.write("\n");
      out.write("        <script src=\"https://code.jquery.com/jquery-3.6.0.min.js\"></script>\n");
      out.write("        <script src=\"https://cdn.datatables.net/1.11.3/js/jquery.dataTables.min.js\"></script>\n");
      out.write("        <script>\n");
      out.write("                                        $(document).ready(function () {\n");
      out.write("                                            $('#productTable').DataTable({\n");
      out.write("                                                \"paging\": true,\n");
      out.write("                                                \"pageLength\": 20,\n");
      out.write("                                                \"lengthMenu\": [20, 50, 100],\n");
      out.write("                                                \"language\": {\n");
      out.write("                                                    \"lengthMenu\": \"Display _MENU_ products per page\",\n");
      out.write("                                                    \"zeroRecords\": \"No products found\",\n");
      out.write("                                                    \"info\": \"Showing page _PAGE_ of _PAGES_\",\n");
      out.write("                                                    \"infoEmpty\": \"No products available\",\n");
      out.write("                                                    \"infoFiltered\": \"(filtered from _MAX_ total products)\"\n");
      out.write("                                                }\n");
      out.write("                                            });\n");
      out.write("                                        });\n");
      out.write("        </script>\n");
      out.write("\n");
      out.write("\n");
      out.write("        <script>\n");
      out.write("            function addToCart(productId, productName, price, quantity, imageUrl) {\n");
      out.write("                var xhr = new XMLHttpRequest();\n");
      out.write("                xhr.open(\"POST\", \"CartServlet\", true);\n");
      out.write("                xhr.setRequestHeader(\"Content-Type\", \"application/x-www-form-urlencoded\");\n");
      out.write("                xhr.onreadystatechange = function () {\n");
      out.write("                    if (xhr.readyState === XMLHttpRequest.DONE && xhr.status === 200) {\n");
      out.write("                        // Xử lý phản hồi thành công\n");
      out.write("                        window.location.reload(); // Tải lại trang để cập nhật giỏ hàng\n");
      out.write("                    }\n");
      out.write("                };\n");
      out.write("                xhr.send(\"action=add&productId=\" + encodeURIComponent(productId) +\n");
      out.write("                        \"&productName=\" + encodeURIComponent(productName) +\n");
      out.write("                        \"&price=\" + encodeURIComponent(price) +\n");
      out.write("                        \"&quantity=\" + encodeURIComponent(quantity) +\n");
      out.write("                        \"&imageUrl=\" + encodeURIComponent(imageUrl));\n");
      out.write("            }\n");
      out.write("        </script>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("        <script type=\"text/javascript\">\n");
      out.write("            $(function () {\n");
      out.write("                $('#example-table').DataTable({\n");
      out.write("                    pageLength: 10,\n");
      out.write("                    //\"ajax\": './assets/demo/data/table_data.json',\n");
      out.write("                    /*\"columns\": [\n");
      out.write("                     { \"data\": \"name\" },\n");
      out.write("                     { \"data\": \"office\" },\n");
      out.write("                     { \"data\": \"extn\" },\n");
      out.write("                     { \"data\": \"start_date\" },\n");
      out.write("                     { \"data\": \"salary\" }\n");
      out.write("                     ]*/\n");
      out.write("                });\n");
      out.write("            })\n");
      out.write("        </script>\n");
      out.write("\n");
      out.write("\n");
      out.write("    </body>\n");
      out.write("\n");
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

  private boolean _jspx_meth_c_if_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_0 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_0.setPageContext(_jspx_page_context);
    _jspx_th_c_if_0.setParent(null);
    _jspx_th_c_if_0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${empty userlogin}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_0 = _jspx_th_c_if_0.doStartTag();
    if (_jspx_eval_c_if_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                            <div class=\"btn-group\">\n");
        out.write("                                <button type=\"button\" class=\"btn btn-sm btn-light dropdown-toggle\" data-toggle=\"dropdown\">Tài Khoản Của Tôi</button>\n");
        out.write("                                <div class=\"dropdown-menu dropdown-menu-right\">\n");
        out.write("                                    <button class=\"dropdown-item\" onclick=\"location.href = 'UserServlet?action=showLoginForm';\" type=\"button\">Đăng Nhập</button>\n");
        out.write("                                    <button class=\"dropdown-item\" onclick=\"location.href = 'UserServlet?action=showSignupForm';\" type=\"button\">Đăng Ký</button>\n");
        out.write("                                </div>\n");
        out.write("                            </div>\n");
        out.write("                        ");
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

  private boolean _jspx_meth_c_if_1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_1 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_1.setPageContext(_jspx_page_context);
    _jspx_th_c_if_1.setParent(null);
    _jspx_th_c_if_1.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${not empty userlogin}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_1 = _jspx_th_c_if_1.doStartTag();
    if (_jspx_eval_c_if_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                            <div class=\"btn-group\">\n");
        out.write("                                <button type=\"button\" class=\"btn btn-sm btn-light dropdown-toggle\" data-toggle=\"dropdown\">");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${userlogin.username}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("</button>\n");
        out.write("                                <div class=\"dropdown-menu dropdown-menu-right\">\n");
        out.write("                                    <button class=\"dropdown-item\" onclick=\"location.href = 'UserServlet?action=profile';\" type=\"button\">Tài Khoản Của Tôi</button>\n");
        out.write("\n");
        out.write("                                    ");
        if (_jspx_meth_c_if_2((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_1, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("                                    ");
        if (_jspx_meth_c_if_3((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_1, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("                                    <button class=\"dropdown-item\" onclick=\"location.href = 'UserServlet?action=logout';\" type=\"button\">Đăng Xuất</button>\n");
        out.write("                                </div>\n");
        out.write("                            </div>\n");
        out.write("                        ");
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

  private boolean _jspx_meth_c_if_2(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_2 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_2.setPageContext(_jspx_page_context);
    _jspx_th_c_if_2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_1);
    _jspx_th_c_if_2.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${userlogin != null && userlogin.role eq 'User'}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_2 = _jspx_th_c_if_2.doStartTag();
    if (_jspx_eval_c_if_2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                                        <a class=\"dropdown-item\" href=\"storeRegister.jsp\">Đăng Ký Cửa Hàng</a>\n");
        out.write("                                    ");
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

  private boolean _jspx_meth_c_if_3(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_3 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_3.setPageContext(_jspx_page_context);
    _jspx_th_c_if_3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_1);
    _jspx_th_c_if_3.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${userlogin != null && userlogin.role eq 'Store Manager'}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_3 = _jspx_th_c_if_3.doStartTag();
    if (_jspx_eval_c_if_3 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                                        <a class=\"dropdown-item\" href=\"StoreHomeServlet\">Cửa Hàng Của Tôi</a>\n");
        out.write("                                    ");
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

  private boolean _jspx_meth_c_forEach_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items_end.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_0.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_0.setParent(null);
    _jspx_th_c_forEach_0.setVar("product");
    _jspx_th_c_forEach_0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${products}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_c_forEach_0.setEnd(15);
    int[] _jspx_push_body_count_c_forEach_0 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_0 = _jspx_th_c_forEach_0.doStartTag();
      if (_jspx_eval_c_forEach_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("                        <div class=\"col-lg-3 col-md-4 col-sm-6 pb-1\">\n");
          out.write("                            <div class=\"product-item bg-light mb-4\">\n");
          out.write("                                <div class=\"product-img position-relative overflow-hidden\">                             \n");
          out.write("                                    <img class=\"img-fluid w-100\" src=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${product.image}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" alt=\"\" style=\"width: 150px; height: 250px\">                          \n");
          out.write("                                    <div class=\"product-action\">\n");
          out.write("\n");
          out.write("                                        <a class=\"btn btn-outline-dark btn-square\"\n");
          out.write("                                           href=\"CartServlet?action=add&sttPt=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${product.sttPT}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("&productName=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${product.productName}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("&price=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${product.price}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("&quantity=1&imageUrl=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${product.image}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("&storeid=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${product.storeId}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\">\n");
          out.write("                                            <i class=\"fa fa-shopping-cart\"></i></a>\n");
          out.write("                                        <a class=\"btn btn-outline-dark btn-square\" href=\"ProductDetailServlet?productId=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${product.productId}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\"><i class=\"fa fa-search\"></i></a>\n");
          out.write("                                    </div>\n");
          out.write("                                </div>\n");
          out.write("                                <div class=\"text-center py-4\">\n");
          out.write("                                    <a class=\"h6 text-decoration-none text-truncate\" href=\"ProductDetailServlet?productId=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${product.productId}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write('"');
          out.write('>');
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${product.productName}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</a>\n");
          out.write("                                    <div class=\"d-flex align-items-center justify-content-center mt-2\">\n");
          out.write("                                        <h5 style=\"color: red\">₫");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${product.price}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</h5><h6 class=\"text-muted ml-2\"><del></del></h6>\n");
          out.write("                                    </div>\n");
          out.write("                                    <div class=\"d-flex align-items-center justify-content-center mb-1\">\n");
          out.write("\n");
          out.write("                                        <small>Số Lượng: ");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${product.quantity}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</small>\n");
          out.write("                                    </div>\n");
          out.write("                                </div>\n");
          out.write("                            </div>\n");
          out.write("                        </div>   \n");
          out.write("\n");
          out.write("                    ");
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
      _jspx_tagPool_c_forEach_var_items_end.reuse(_jspx_th_c_forEach_0);
    }
    return false;
  }
}
