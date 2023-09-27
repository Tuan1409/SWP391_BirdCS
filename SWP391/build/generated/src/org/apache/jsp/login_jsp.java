package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class login_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_set_var_value_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_if_test;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_set_var_value_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_if_test = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_set_var_value_nobody.release();
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta charset=\"UTF-8\">\n");
      out.write("        <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("        <title>Login</title>\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css\">\n");
      out.write("        <link rel=\"preconnect\" href=\"https://fonts.gstatic.com\">\n");
      out.write("        <link href=\"https://fonts.googleapis.com/css2?family=Roboto:wght@400;500;700&display=swap\" rel=\"stylesheet\">  \n");
      out.write("        <link href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.10.0/css/all.min.css\" rel=\"stylesheet\">\n");
      out.write("        <link href=\"lib/animate/animate.min.css\" rel=\"stylesheet\">\n");
      out.write("        <link href=\"lib/owlcarousel/assets/owl.carousel.min.css\" rel=\"stylesheet\">\n");
      out.write("        <link href=\"css/style.css\" rel=\"stylesheet\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.3.0/css/all.min.css\"\n");
      out.write("              integrity=\"sha512-SzlrxWUlpfuzQ+pcUCosxcglQRNAq/DZjVsC0lE40xsADsfeQoEypE+enwcOiGjk/bSuGGKHEyjSoQ1zVisanQ==\"\n");
      out.write("              crossorigin=\"anonymous\" referrerpolicy=\"no-referrer\" />\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.css\" integrity=\"sha512-5A8nwdMOWrSz20fDsjczgUidUBR8liPYU+WymTZP1lmY9G6Oc7HlZv156XqnsgNUzTyMefFTcsFH/tnJE/+xBg==\" crossorigin=\"anonymous\" />\n");
      out.write("        <style>\n");
      out.write("            @import url('https://fonts.googleapis.com/css2?family=Roboto:ital,wght@0,100;0,300;0,400;0,500;0,700;0,900;1,100;1,300;1,400;1,500;1,700;1,900&display=swap');\n");
      out.write("\n");
      out.write("            body {\n");
      out.write("                margin: 0;\n");
      out.write("                padding: 0;\n");
      out.write("                background-color: #f7f8f9;\n");
      out.write("                font-family: 'Roboto', sans-serif;\n");
      out.write("                font-size: 14px;\n");
      out.write("            }\n");
      out.write("            header {\n");
      out.write("                position: relative;\n");
      out.write("                z-index: 9999;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .auth-container {\n");
      out.write("                position: fixed;\n");
      out.write("                top: 74px;\n");
      out.write("                left: 0;\n");
      out.write("                width: 100%;\n");
      out.write("                height: 100%;\n");
      out.write("                z-index: 1;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .auth-image {\n");
      out.write("                overflow: hidden;\n");
      out.write("            }\n");
      out.write("            .auth-image-container {\n");
      out.write("                height: 100%;\n");
      out.write("                display: flex;\n");
      out.write("                align-items: center;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .auth-image img {\n");
      out.write("                width: 100%;\n");
      out.write("                height: 100vh;\n");
      out.write("            }\n");
      out.write("            .auth-action-right {\n");
      out.write("                width: 320px;\n");
      out.write("            }\n");
      out.write("            .auth-action-left {\n");
      out.write("                flex: 2;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .auth-form-outer {\n");
      out.write("                padding: 2rem 4rem;\n");
      out.write("                display: block;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            h1.auth-form-title {\n");
      out.write("                text-align: center;\n");
      out.write("                color: #fd5353;\n");
      out.write("                font-size: 2.3rem;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .auth-form-outer input {\n");
      out.write("                border: 1px solid #56aef485;\n");
      out.write("                margin-bottom: 1rem;\n");
      out.write("                width: 100%;\n");
      out.write("                padding: 13px;\n");
      out.write("                border-radius: 5px;\n");
      out.write("                box-sizing: border-box;\n");
      out.write("                background: #f7f8f97a;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .auth-form-outer input:hover,\n");
      out.write("            .auth-form-outer input:focus {\n");
      out.write("                outline: none;\n");
      out.write("                box-shadow: none;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .auth-form-outer input:focus {\n");
      out.write("                background-color: #fff;\n");
      out.write("                border: 1px solid #fd5353;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("\n");
      out.write("            input.auth-form-input::placeholder {\n");
      out.write("                color: #0f82dd4d;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("            input[type=\"checkbox\"] {\n");
      out.write("                display: none;\n");
      out.write("            }\n");
      out.write("            label input[type=\"checkbox\"] ~ i.fa.fa-square-o{\n");
      out.write("                color: #fd5353;    display: inline;\n");
      out.write("            }\n");
      out.write("            label input[type=\"checkbox\"] ~ i.fa.fa-check-square-o{\n");
      out.write("                display: none;\n");
      out.write("            }\n");
      out.write("            label input[type=\"checkbox\"]:checked ~ i.fa.fa-square-o{\n");
      out.write("                display: none;\n");
      out.write("            }\n");
      out.write("            label input[type=\"checkbox\"]:checked ~ i.fa.fa-check-square-o{\n");
      out.write("                color: #fd5353;    display: inline;\n");
      out.write("            }\n");
      out.write("            label:hover input[type=\"checkbox\"] ~ i.fa {\n");
      out.write("                color: #fd5353;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            div[data-toggle=\"buttons\"] label.active{\n");
      out.write("                color: #fd5353;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .auth-wrapper a {\n");
      out.write("                text-decoration: none;\n");
      out.write("                color: #fd5353;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            a.auth-btn-direct {\n");
      out.write("                flex: 1;\n");
      out.write("                border: 1px solid #fd5353;\n");
      out.write("                text-align: center;\n");
      out.write("                height: 40px;\n");
      out.write("                border-radius: 5px;\n");
      out.write("                line-height: 40px;\n");
      out.write("                font-weight: 500;\n");
      out.write("                margin-left: 5px;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            input.auth-submit {\n");
      out.write("                background: #fe5454;\n");
      out.write("                border: none;\n");
      out.write("                width: auto;\n");
      out.write("                color: #fff;\n");
      out.write("                font-weight: 500;\n");
      out.write("                border-radius: 5px!important;\n");
      out.write("                flex: 1;\n");
      out.write("                margin-right: 5px;\n");
      out.write("                cursor: pointer;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            input.auth-submit:focus {\n");
      out.write("                background: #fe5454;\n");
      out.write("                color: #fff;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            input.auth-submit:hover {\n");
      out.write("                box-shadow: 3px 3px 7px 2px #f443362b;\n");
      out.write("            }\n");
      out.write("            a.auth-btn-direct:hover {\n");
      out.write("                box-shadow: -2px 3px 0px 0px #F44336;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .auth-external-list ul li a:hover {\n");
      out.write("                color: #fd5353;\n");
      out.write("                border-color: #fd5353;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .footer-action {\n");
      out.write("                display: flex;\n");
      out.write("                width: 100%;\n");
      out.write("                margin-top: 2rem;\n");
      out.write("                box-sizing: border-box;\n");
      out.write("                overflow: hidden;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .auth-external-list ul {\n");
      out.write("                margin: 0;\n");
      out.write("                padding: 0;\n");
      out.write("                list-style-type: none;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .auth-external-list ul li {\n");
      out.write("                float: left;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .auth-external-list {\n");
      out.write("                display: flex;\n");
      out.write("                justify-content: center;\n");
      out.write("                margin-bottom: 1rem;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .auth-external-list ul li a {\n");
      out.write("                width: 26px;\n");
      out.write("                height: 26px;\n");
      out.write("                margin: 7px;\n");
      out.write("                display: block;\n");
      out.write("                text-align: center;\n");
      out.write("                line-height: 27px;\n");
      out.write("                border-radius: 50%;\n");
      out.write("                border: 1px solid #00000078;\n");
      out.write("                color: #555;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            p.auth-sgt {\n");
      out.write("                text-align: center;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .auth-forgot-password a {\n");
      out.write("                text-align: center;\n");
      out.write("                display: block;\n");
      out.write("                border-top: 1px dashed #f4433633;\n");
      out.write("                padding: 20px;\n");
      out.write("                margin-top: 20px;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("\n");
      out.write("            .input-icon {\n");
      out.write("                position: relative;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .input-icon input {\n");
      out.write("                padding-right: 4rem;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .input-icon i {\n");
      out.write("                position: absolute;\n");
      out.write("                top: 38%;\n");
      out.write("                right: 1.2rem;\n");
      out.write("                transform: translateY(-50%);\n");
      out.write("                color: #2196f3b5;\n");
      out.write("                cursor: pointer;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            /* responsive */\n");
      out.write("            @media screen and (max-width: 720px) {\n");
      out.write("                body {\n");
      out.write("                    background-color: #fff;\n");
      out.write("                }\n");
      out.write("                .auth-container {\n");
      out.write("                    max-width: 100%;\n");
      out.write("                    max-height: 100vh;\n");
      out.write("                    margin: 0 auto;\n");
      out.write("                    background: #fff;\n");
      out.write("                    border-radius: 0;\n");
      out.write("                    box-shadow: none;\n");
      out.write("                    display: block;\n");
      out.write("                    margin-top: 0;\n");
      out.write("                }\n");
      out.write("                .auth-action-left {\n");
      out.write("                    width: 100%;\n");
      out.write("                }\n");
      out.write("\n");
      out.write("                .auth-action-right {\n");
      out.write("                    display: none;\n");
      out.write("                }\n");
      out.write("            }\n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <header>\n");
      out.write("            <nav class=\"navbar navbar-expand-lg navbar-light bg-light\">\n");
      out.write("                <a class=\"navbar-brand\" href=\"ShowProductsServlet\">\n");
      out.write("                    <span class=\"h1 text-uppercase text-primary bg-dark px-2\">LỒNG</span>\n");
      out.write("                    <span class=\"h1 text-uppercase text-dark bg-primary px-2 ml-n1\">CHIMVN</span>\n");
      out.write("                </a>\n");
      out.write("            </nav>\n");
      out.write("        </header>\n");
      out.write("        <div class=\"auth-wrapper\">\n");
      out.write("            <div class=\"auth-container row\">\n");
      out.write("                <div class=\"auth-action-left col-3\">\n");
      out.write("                    <div class=\"auth-form-outer\">\n");
      out.write("                        <h1 class=\"auth-form-title\">\n");
      out.write("                            Đăng nhập\n");
      out.write("                        </h1><br>\n");
      out.write("                        <form action=\"UserServlet?action=login\" method=\"POST\" id=\"form\"  class=\"login-form\">\n");
      out.write("                            ");
      if (_jspx_meth_c_set_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                            <input class=\"auth-form-input\" type=\"text\" name=\"email\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${param.email}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" id=\"email\" placeholder=\"Nhập email\"/>\n");
      out.write("                            ");
      if (_jspx_meth_c_if_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\n");
      out.write("                            <div class=\"input-icon\">\n");
      out.write("                                <input class=\"auth-form-input\" type=\"password\" name=\"password\" id=\"password\" placeholder=\"Nhập mật khẩu\"/>\n");
      out.write("                                <i class=\"fa fa-eye show-password\"></i>\n");
      out.write("                            </div>\n");
      out.write("                            ");
      if (_jspx_meth_c_if_1(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                            ");
      if (_jspx_meth_c_if_2(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                            <div class=\"g-recaptcha\" data-sitekey=\"6LdO3P4mAAAAAH8CBTo8PalbHgQC3ePdpXZpc6s2\"></div>\n");
      out.write("                            <div id =\"error\"></div>\n");
      out.write("                            <div class=\"footer-action\">\n");
      out.write("                                <input type=\"submit\" value=\"Đăng nhập\" class=\"auth-submit\"/>\n");
      out.write("                            </div>\n");
      out.write("                            <p>Tạo tài khoản mới?<a href=\"UserServlet?action=showSignupForm\">Đăng ký</a></p>\n");
      out.write("                        </form>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"auth-action-right col-9\">\n");
      out.write("                    <div class=\"auth-image\">\n");
      out.write("                        <img src=\"img/anh_nen_3.jpg\" alt=\"login\">\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("    <script src=\"js/common.js\"></script>\n");
      out.write("    <script src=\"https://www.google.com/recaptcha/api.js\" async defer></script>\n");
      out.write("    <script src=\"https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js\"></script>\n");
      out.write("    <script>\n");
      out.write("        window.onload = function () {\n");
      out.write("            let isValid = false;\n");
      out.write("            const form = document.getElementById(\"form\");\n");
      out.write("            const error = document.getElementById(\"error\");\n");
      out.write("\n");
      out.write("            form.addEventListener(\"submit\", function (event) {\n");
      out.write("                const response = grecaptcha.getResponse();\n");
      out.write("                if (!response) {\n");
      out.write("                    event.preventDefault(); // Ngăn chặn việc gửi form khi captcha không hợp lệ\n");
      out.write("                    error.innerHTML = \"Check Recaptcha Please!\";\n");
      out.write("                }\n");
      out.write("            });\n");
      out.write("        }\n");
      out.write("    </script>\n");
      out.write("</body>\n");
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

  private boolean _jspx_meth_c_set_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:set
    org.apache.taglibs.standard.tag.rt.core.SetTag _jspx_th_c_set_0 = (org.apache.taglibs.standard.tag.rt.core.SetTag) _jspx_tagPool_c_set_var_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.SetTag.class);
    _jspx_th_c_set_0.setPageContext(_jspx_page_context);
    _jspx_th_c_set_0.setParent(null);
    _jspx_th_c_set_0.setVar("errors");
    _jspx_th_c_set_0.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${requestScope.CREATE_ERROR}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_set_0 = _jspx_th_c_set_0.doStartTag();
    if (_jspx_th_c_set_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_set_var_value_nobody.reuse(_jspx_th_c_set_0);
      return true;
    }
    _jspx_tagPool_c_set_var_value_nobody.reuse(_jspx_th_c_set_0);
    return false;
  }

  private boolean _jspx_meth_c_if_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_0 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_0.setPageContext(_jspx_page_context);
    _jspx_th_c_if_0.setParent(null);
    _jspx_th_c_if_0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${not empty errors.usernameBlankError}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_0 = _jspx_th_c_if_0.doStartTag();
    if (_jspx_eval_c_if_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                                <p class=\"error-message\">\n");
        out.write("                                    ");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${errors.usernameBlankError}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("\n");
        out.write("                                </p>\n");
        out.write("                            ");
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
    _jspx_th_c_if_1.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${not empty errors.passwordBlankError}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_1 = _jspx_th_c_if_1.doStartTag();
    if (_jspx_eval_c_if_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                                <p class=\"error-message\">\n");
        out.write("                                    ");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${errors.passwordBlankError}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("\n");
        out.write("                                </p>\n");
        out.write("                            ");
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

  private boolean _jspx_meth_c_if_2(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_2 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_2.setPageContext(_jspx_page_context);
    _jspx_th_c_if_2.setParent(null);
    _jspx_th_c_if_2.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${not empty errors.wrongPasswordError}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_2 = _jspx_th_c_if_2.doStartTag();
    if (_jspx_eval_c_if_2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                                <p class=\"error-message\">\n");
        out.write("                                    ");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${errors.wrongPasswordError}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("\n");
        out.write("                                </p>\n");
        out.write("                            ");
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
}
