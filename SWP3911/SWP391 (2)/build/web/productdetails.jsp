<%-- 
    Document   : detail
    Created on : Jun 8, 2023, 9:14:43 PM
    Author     : ASUS
--%>
<%@page import="Model.Account"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html lang="en">

    <head>
        <meta charset="utf-8">
        <title>Bird Trading</title>
        <meta content="width=device-width, initial-scale=1.0" name="viewport">
        <meta content="Free HTML Templates" name="keywords">
        <meta content="Free HTML Templates" name="description">

        <!-- Favicon -->
        <link href="img/favicon.ico" rel="icon">

        <!-- Google Web Fonts -->
        <link rel="preconnect" href="https://fonts.gstatic.com">
        <link href="https://fonts.googleapis.com/css2?family=Roboto:wght@400;500;700&display=swap" rel="stylesheet">  

        <!-- Font Awesome -->
        <link href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.10.0/css/all.min.css" rel="stylesheet">

        <!-- Libraries Stylesheet -->
        <link href="lib/animate/animate.min.css" rel="stylesheet">
        <link href="lib/owlcarousel/assets/owl.carousel.min.css" rel="stylesheet">

        <!-- Customized Bootstrap Stylesheet -->
        <link href="css/style.css" rel="stylesheet">
    </head>

    <body onload="time()" class="app sidebar-mini rtl">
        <jsp:include page="headerUser.jsp"/>
        <%
            Account user = ((Account) session.getAttribute("userlogin"));
            int userID = 0;
            if(user!=null){
                    userID = user.getId();
            }else request.getRequestDispatcher("Unauthorized.jsp").forward(request, response);
        %>
        <!-- Breadcrumb Start -->
        <div class="container-fluid">
            <div class="row px-xl-5">
                <div class="col-12">
                    <!--                    <nav class="breadcrumb bg-light mb-30">
                                            <a class="breadcrumb-item text-dark" href="#">Home</a>
                                            <a class="breadcrumb-item text-dark" href="#">Shop</a>
                                            <span class="breadcrumb-item active">Shop Detail</span>
                                        </nav>-->
                </div>
            </div>
        </div>
        <!-- Breadcrumb End -->


        <!-- Shop Detail Start -->
        <div class="container-fluid pb-5">
            <div class="row px-xl-5">
                <div class="col-lg-5 mb-30">
                    <div id="product-carousel" class="carousel slide" data-ride="carousel">
                        <div class="carousel-inner bg-light">
                            <div class="carousel-item active">
                                <c:forEach items="${productList}" var="product">
                                    <img style="width: 600px; height: 400px" src="img/${product.image}" alt="Image" >                                    
                                </c:forEach>
                            </div>
                            
                        </div>
                        <!--                        <a class="carousel-control-prev" href="#product-carousel" data-slide="prev">
                                                    <i class="fa fa-2x fa-angle-left text-dark"></i>
                                                </a>
                                                <a class="carousel-control-next" href="#product-carousel" data-slide="next">
                                                    <i class="fa fa-2x fa-angle-right text-dark"></i>
                                                </a>-->
                    </div>
                </div>

                <div class="col-lg-7 h-auto mb-30">
                    <table class="table table-hover table-bordered" id="sampleTable">
                         <thead>
                                    <tr>
                                        <th>Tên sản phẩm</th>
                                        <th>Hiện giảm giá</th>
                                        <th>Tình trạng</th>
                                        <th>Giá tiền</th>
                                        <th>Hình dáng và kích cỡ</th>
                                        <th>Danh mục</th>
                                    </tr>
                        </thead>                                                        
                        <tbody>
                                <c:forEach items="${productList}" var="i">
                                    <tr>
                                        <c:set var="productID" value="${i.productID}" scope="page" />
                                        <td>${i.name}</td>
                                        <td>${i.discount}%</td>
                                        <c:if test="${i.stock gt 0}">
                                            <td><span class="badge bg-success">Còn hàng</span></td>
                                        </c:if>
                                        <c:if test="${i.stock le 0}">
                                            <td><span class="badge bg-danger">Hết hàng</span></td> 
                                        </c:if>
                                        <td>${i.price}VNĐ</td>
                                        <td>${i.size}</td>
                                        <td>${i.category.name}</td>
                                        <td><button class="btn btn-primary btn-sm trash" type="button" 
                                            data-toggle="modal" data-target="#ModalUP" onclick="getData('${i.category.id}', '${i.productID}')"
                                                                                >
                                           So sánh 
                                            </button>
                                            <button class="btn btn-primary btn-sm edit" type="button" title="Sửa" id="show-emp" data-toggle="modal"
                                                    data-target="#ModalUP" onclick="getData('${i.productID}')">
                                            Mua hàng
                                            </button>
                                        </td>
                                    </tr> 
                                </c:forEach>
                        </tbody>
                    </table>
                    

                </div>
            </div>


            <div class="row px-xl-5">
                <div class="col">
                    <div class="bg-light p-30">
                        <div style="display: flex; align-items: center;">

                            <a style="color: blue" href="ShopDetailServlet?storeId=${store.store_id}">  
                                <img style="width: 200px; height: 100px" src="${store.image}" alt="Image" ></a>  
                            <div style="margin-left: 10px;">
                                <a style="color: blue" href="ShopDetailServlet?storeId=${store.store_id}">${store.store_name}</a>                             
                            </div>

                        </div>

                        <h6>
                            Số điện thoại: ${store.phone_number}
                        </h6>
                        <h6>Địa chỉ: ${store.address}</h6>

                    </div>
                </div>
            </div>





            <div class="row px-xl-5">
                <div class="col">
                    <div class="bg-light p-30">
                        <div class="nav nav-tabs mb-4">
                            <a class="nav-item nav-link text-dark" data-toggle="tab" href="#tab-pane-2" role="tab">Reviews (${count})</a>
                        </div>
                        <form action="CreateComment" method="POST">
                            <div class="">
                                <div class="rating-container">
                                    <div class="stars" id="star-rating">
                                        <i class="far fa-star" data-rating="1"></i>
                                        <i class="far fa-star" data-rating="2"></i>
                                        <i class="far fa-star" data-rating="3"></i>
                                        <i class="far fa-star" data-rating="4"></i>
                                        <i class="far fa-star" data-rating="5"></i>
                                    </div>
                                    <input type="hidden" name="rate" id="selected-rating" value="0">
                                </div>

                                <div class="form-group">
                                    <input type="text" class="form-control" name="content" placeholder="Review cho sản phẩm"> 
                                    <input type="hidden" class="form-control" name="userID" value="<%= userID%>"> 
                                    <input type="hidden" class="form-control" name="productID" value="${productID}"> 
                                </div>

                                <div class="form-group">
                                    <input type="submit" class="btn btn-primary" value="Đánh giá">
                                </div>

                            </div>
                        </form>
                        <div class="tab-content">
                            <div class="" id="tab-pane-2">
                                <div class="row">
                                    <div>
                                        <c:forEach var="feedback" items="${feedbacks}">
                                            <div class="media mb-4">
                                                <img src="${feedback.account.image}" alt="Image" class="img-fluid mr-3 mt-1" style="width: 45px;">
                                                <div class="media-body">
                                                    <c:set var="isFirst" value="true" />
                                                    <%--<c:forEach var="user" items="${users}">--%>
                                                        <%--<c:if test="${user.userId == feedback.userId}">--%>
                                                            <%--<c:if test="${isFirst}">--%>
                                                                <h6><c:out value="${feedback.account.firstname}" /><small> - <i><c:out value="${feedback.commentDate}" /></i></small></h6>
                                                                <c:set var="isFirst" value="false" />
                                                            <%--</c:if>--%>
                                                        <%--</c:if>--%>
                                                    <%--</c:forEach>--%>
                                                    <div class="text-primary mb-2">
                                                        <!-- Hiển thị đánh giá dưới dạng các ngôi sao -->
                                                        <c:forEach var="i" begin="1" end="${feedback.rate}">
                                                            <i class="fas fa-star"></i>
                                                        </c:forEach>
                                                        <c:if test="${feedback.rate % 1 != 0}">
                                                            <i class="fas fa-star-half-alt"></i>
                                                        </c:if>
                                                        <c:forEach var="i" begin="${Math.ceil(feedback.rate)+1}" end="5">
                                                            <i class="far fa-star"></i>
                                                        </c:forEach>
                                                    </div>
                                                    <p><c:out value="${feedback.content}" /></p>
                                                </div>
                                                <h3>${sessionScope.userlogin.roleid.name}</h3>
                                                    <c:if test="${sessionScope.userlogin.roleid.name eq 'manager'}">
                                                        <a href="HideComment?commentID=${feedback.id}&productID=${productID}">Ẩn bình luận này</a>
                                                    </c:if>
                                            </div>
                                        </c:forEach>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>


        </div>
        <!-- Shop Detail End -->






    <!-- Shop Detail End -->




    <!-- San pham cung shop -->
    <div class="container-fluid py-5">
        <h2 class="section-title position-relative text-uppercase mx-xl-5 mb-4"><span class="bg-secondary pr-3">CÁC SẢN PHẨM KHÁC CỦA SHOP</span></h2>
        <div class="row px-xl-5">
            <div class="col">
                <div class="owl-carousel related-carousel">


                    <c:forEach items="${pro}" var="product">
                        <div class="product-item bg-light">
                            <div class="product-img position-relative overflow-hidden">
                                <img class="img-fluid w-100" src="${product.image}" alt="" style="width: 50px; height: 180px">
                                <div class="product-action">
                                    <a class="btn btn-outline-dark btn-square"
                                       href="CartServlet?action=add&sttPt=${product.sttPT}&productName=${product.productName}&price=${product.price}&quantity=1&imageUrl=${product.image}&storeid=${product.storeId}">
                                        <i class="fa fa-shopping-cart"></i></a>
                                    <a class="btn btn-outline-dark btn-square" href="ProductDetailServlet?productId=${product.productId}"><i class="fa fa-search"></i></a>
                                </div>
                            </div>
                            <div class="text-center py-4">
                                <a class="h6 text-decoration-none text-truncate" href="ProductDetailServlet?productId=${product.productId}">${product.productName}</a>
                                <div class="d-flex align-items-center justify-content-center mt-2">
                                    <h5 style="color: red">₫${product.price}</h5><h6 class="text-muted ml-2"><del></del></h6>
                                </div>
                                <div class="d-flex align-items-center justify-content-center mb-1">

                                    <small>Số Lượng: ${product.quantity}</small>
                                </div>
                            </div>
                        </div>
                    </c:forEach>

                </div>
            </div>
        </div>
    </div>
    <!-- Products End -->



    <!-- San pham  cung loai -->
    <div class="container-fluid py-5">
        <h2 class="section-title position-relative text-uppercase mx-xl-5 mb-4"><span class="bg-secondary pr-3">Sản Phẩm Cùng Loại</span></h2>
        <div class="row px-xl-5">
            <div class="col">
                <div class="owl-carousel related-carousel">


                    <c:forEach items="${productCategory}" var="product">
                        <div class="product-item bg-light">
                            <div class="product-img position-relative overflow-hidden">
                                <img class="img-fluid w-100" src="${product.image}" alt="" style="width: 50px; height: 180px">
                                <div class="product-action">
                                    <a class="btn btn-outline-dark btn-square"
                                       href="CartServlet?action=add&sttPt=${product.sttPT}&productName=${product.productName}&price=${product.price}&quantity=1&imageUrl=${product.image}&storeid=${product.storeId}">
                                        <i class="fa fa-shopping-cart"></i></a>
                                    <a class="btn btn-outline-dark btn-square" href="ProductDetailServlet?productId=${product.productId}"><i class="fa fa-search"></i></a>
                                </div>
                            </div>
                            <div class="text-center py-4">
                                <a class="h6 text-decoration-none text-truncate" href="ProductDetailServlet?productId=${product.productId}">${product.productName}</a>
                                <div class="d-flex align-items-center justify-content-center mt-2">
                                    <h5 style="color: red">₫${product.price}</h5><h6 class="text-muted ml-2"><del></del></h6>
                                </div>
                                <div class="d-flex align-items-center justify-content-center mb-1">

                                    <small>Số Lượng: ${product.quantity}</small>
                                </div>
                            </div>
                        </div>
                    </c:forEach>

                </div>
            </div>
        </div>
    </div>
    <!-- Products End -->




    <!-- Footer Start -->
    <div class="container-fluid bg-dark text-secondary mt-5 pt-5">
        <div class="row px-xl-5 pt-5">
            <div class="col-lg-4 col-md-12 mb-5 pr-3 pr-xl-5">
                <h5 class="text-secondary text-uppercase mb-4">Thông tin liên lạc</h5>
                <p class="mb-4">Chuyên cung cấp các loại chim</p>
                <p class="mb-2"><i class="fa fa-map-marker-alt text-primary mr-3"></i>Tp.Hồ Chí Minh</p>
                <p class="mb-2"><i class="fa fa-envelope text-primary mr-3"></i>binhdxse160***@fpt.edu.vn</p>
                <p class="mb-0"><i class="fa fa-phone-alt text-primary mr-3"></i>+84999999999</p>
            </div>
            <div class="col-lg-8 col-md-12">
                <div class="row">
                    <div class="col-md-4 mb-5">
                        <h5 class="text-secondary text-uppercase mb-4">Bird Shop</h5>
                        <div class="d-flex flex-column justify-content-start">
                            <a class="text-secondary mb-2" href="homePage.jsp"><i class="fa fa-angle-right mr-2"></i>Trang chủ</a>
                            <a class="text-secondary mb-2" href="#"><i class="fa fa-angle-right mr-2"></i>Kênh bán hàng</a>
                            <a class="text-secondary mb-2" href="#"><i class="fa fa-angle-right mr-2"></i>Của hàng</a>                               
                            <a class="text-secondary" href="#"><i class="fa fa-angle-right mr-2"></i>Liên lạc với chúng tôi</a>
                        </div>
                    </div>
                    <div class="col-md-4 mb-5">
                        <h5 class="text-secondary text-uppercase mb-4">Tài khoản của tôi</h5>
                        <div class="d-flex flex-column justify-content-start">
                            <a class="text-secondary mb-2" href="#"><i class="fa fa-angle-right mr-2"></i>Hồ sơ</a>
                            <a class="text-secondary mb-2" href="#"><i class="fa fa-angle-right mr-2"></i>Giỏ hàng</a>
                            <a class="text-secondary mb-2" href="#"><i class="fa fa-angle-right mr-2"></i>Đơn hàng</a>
                        </div>
                    </div>
                    <div class="col-md-4 mb-5">
                        <h6 class="text-secondary text-uppercase mt-4 mb-3">Theo dõi chúng tôi</h6>
                        <div class="d-flex">
                            <a class="btn btn-primary btn-square mr-2" href="#"><i class="fab fa-twitter"></i></a>
                            <a class="btn btn-primary btn-square mr-2" href="#"><i class="fab fa-facebook-f"></i></a>
                            <a class="btn btn-primary btn-square mr-2" href="#"><i class="fab fa-linkedin-in"></i></a>
                            <a class="btn btn-primary btn-square" href="#"><i class="fab fa-instagram"></i></a>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>
    <!-- Footer End -->


    <!-- Back to Top -->
    <a href="#" class="btn btn-primary back-to-top"><i class="fa fa-angle-double-up"></i></a>
    
    
                                                        
        <!--
          MODAL
        -->
        <div class="modal fade" id="ModalUP" tabindex="-1" role="dialog" aria-hidden="true" data-backdrop="static"
             data-keyboard="false">
            <div class="modal-dialog modal-dialog-centered" role="document">
                <div class="modal-content">

                    <div class="modal-body">
                        <div class="row">
                            <div class="form-group  col-md-12">
                                <span class="thong-tin-thanh-toan">
                                    <h5>Chọn sản phẩm để so sánh</h5>
                                </span>
                            </div>
                        </div>
                        <form action="update" method="POST" id="updatesp">
                            

                        </form>
                    </div>
                    <div class="modal-footer">
                    </div>
                </div>
            </div>
        </div>
        <!--
        MODAL
        -->


        <!-- Essential javascripts for application to work-->
        <script src="./js/jquery-3.2.1.min.js"></script>
        <script src="./js/popper.min.js"></script>
        <script src="./js/bootstrap.min.js"></script>
        <script src="//ajax.googleapis.com/ajax/libs/jquery/1.11.1/jquery.min.js"></script>
        <script src="src/jquery.table2excel.js"></script>
        <script src="./js/main.js"></script>
        <!-- The javascript plugin to display page loading on top-->
        <script src="js/plugins/pace.min.js"></script>
        <!-- Page specific javascripts-->
        <script src="https://cdnjs.cloudflare.com/ajax/libs/jquery-confirm/3.3.2/jquery-confirm.min.js"></script>
        <!-- Data table plugin-->
        <script type="text/javascript" src="https://cdn.datatables.net/1.10.16/js/jquery.dataTables.min.js"></script>
        <script type="text/javascript" src="./js/plugins/dataTables.bootstrap.min.js"></script>
        <script type="text/javascript">
                                                            var table;
                                                            var list = ['checbox', 'productID',
                                                                'productName', 'image',
                                                                'productQuantity',
                                                                'status',
                                                                'productPrice',
                                                                'category'];
                                                            $(document).ready(function () {
                                                                $('#sampleTable thead tr').clone(true)
                                                                        .addClass('filters')
                                                                        .appendTo('#sampleTable thead');
                                                                table = $('#sampleTable').DataTable(
                                                                        {
                                                                            "bDestroy": true,
                                                                            orderCellsTop: true,
                                                                            fixedHeader: true,
                                                                            initComplete: function () {
                                                                                var api = this.api();
                                                                                api
                                                                                        .columns()
                                                                                        .eq(0)
                                                                                        .each(function (colIdx) {
                                                                                            // Set the header cell to contain the input element
                                                                                            if (colIdx === 0 || colIdx === 3) {
                                                                                                var cell = $('.filters th').eq(
                                                                                                        $(api.column(colIdx).header()).index()
                                                                                                        );
                                                                                                $(cell).html('');
                                                                                            }
                                                                                            if (colIdx > 0 && colIdx !== 3)
                                                                                            {
                                                                                                var cell = $('.filters th').eq(
                                                                                                        $(api.column(colIdx).header()).index()
                                                                                                        );
                                                                                                var title = $(cell).text();
                                                                                                $(cell).html('<input type="text" placeholder="' + title + '" \n\
                                                                                                id="' + list[colIdx] + '" style="width: 100px" onchange="searchProduct()"/>');
                                                                                                if (colIdx === 2) {
                                                                                                    $(cell).html('<input type="text" placeholder="' + title + '" \n\
                                                                                                id="' + list[colIdx] + '" style="width: 200px" onchange="searchProduct()"/>');
                                                                                                }
                                                                                                if (colIdx === 5) {
                                                                                                    $(cell).html('<select style="width: 100px; height: 28px" onchange="searchProduct()" id="status"> \n' +
                                                                                                            '<option selected></option>' +
                                                                                                            '<option value="1">Còn hàng</option>' +
                                                                                                            '<option value="2">Hết hàng</option>' +
                                                                                                            '</select>'
                                                                                                            );
                                                                                                }
                                                                                                if (colIdx === 7) {
                                                                                                    var listJson = ${requestScope.listCate};
                                                                                                    var txt = '<select style="width: 100px;height: 28px" onchange="searchProduct()" id="category"> \n';
                                                                                                    txt += '<option selected></option> \n';
                                                                                                    for (let j = 0; j < listJson.length; j++) {
                                                                                                        txt += '<option value="' + listJson[j].id + '">' + listJson[j].name + '</option> \n';
                                                                                                    }
                                                                                                    txt += '</select>';
                                                                                                    $(cell).html(txt);
                                                                                                }
                                                                                                if (colIdx === 8) {
                                                                                                    $(cell).html('<a href="product" style="text-align: center">Đặt lại</a>');
                                                                                                }
                                                                                            }
                                                                                        });
                                                                            }
                                                                        }
                                                                )
                                                            });
                                                            //Thời Gian
                                                            function time() {
                                                                var today = new Date();
                                                                var weekday = new Array(7);
                                                                weekday[0] = "Chủ Nhật";
                                                                weekday[1] = "Thứ Hai";
                                                                weekday[2] = "Thứ Ba";
                                                                weekday[3] = "Thứ Tư";
                                                                weekday[4] = "Thứ Năm";
                                                                weekday[5] = "Thứ Sáu";
                                                                weekday[6] = "Thứ Bảy";
                                                                var day = weekday[today.getDay()];
                                                                var dd = today.getDate();
                                                                var mm = today.getMonth() + 1;
                                                                var yyyy = today.getFullYear();
                                                                var h = today.getHours();
                                                                var m = today.getMinutes();
                                                                var s = today.getSeconds();
                                                                m = checkTime(m);
                                                                s = checkTime(s);
                                                                nowTime = h + " giờ " + m + " phút " + s + " giây";
                                                                if (dd < 10) {
                                                                    dd = '0' + dd
                                                                }
                                                                if (mm < 10) {
                                                                    mm = '0' + mm
                                                                }
                                                                today = day + ', ' + dd + '/' + mm + '/' + yyyy;
                                                                tmp = '<span class="date"> ' + today + ' - ' + nowTime +
                                                                        '</span>';
                                                                document.getElementById("clock").innerHTML = tmp;
                                                                clocktime = setTimeout("time()", "1000", "Javascript");
                                                                function checkTime(i) {
                                                                    if (i < 10) {
                                                                        i = "0" + i;
                                                                    }
                                                                    return i;
                                                                }
                                                            }
        </script>
        <script>
            document.addEventListener("DOMContentLoaded", function() {
                const starsContainer = document.getElementById("star-rating");
                const selectedRatingInput = document.getElementById("selected-rating");

                starsContainer.addEventListener("click", function(e) {
                    if (e.target.tagName === "I") {
                        const selectedRating = parseInt(e.target.getAttribute("data-rating"));
                        highlightStars(selectedRating);
                        selectedRatingInput.value = selectedRating;
                    }
                });

                function highlightStars(rating) {
                    const stars = starsContainer.querySelectorAll("i");
                    stars.forEach(star => {
                        const starRating = parseInt(star.getAttribute("data-rating"));
                        if (starRating <= rating) {
                            star.classList.remove("far");
                            star.classList.add("fas");
                        } else {
                            star.classList.remove("fas");
                            star.classList.add("far");
                        }
                    });
                }
            });
        </script>
        <script>
            function deleteRow(r) {
                var i = r.parentNode.parentNode.rowIndex;
                document.getElementById("myTable").deleteRow(i);
            }
            function isDelete(i) {
                var check = confirm('Do you want to delete product with id = ' + i);
                if (check) {
                    window.window.location.href = '${pageContext.request.contextPath}/deleteProduct?id=' + i;
                }
            }
            oTable = $('#sampleTable').dataTable();
            $('#all').click(function (e) {
                $('#sampleTable tbody :checkbox').prop('checked', $(this).is(':checked'));
                e.stopImmediatePropagation();
            });
            function getData(categoryid, id) {
                 console.log("ID:", id); // Log the value of id
                $.ajax({
                    type: 'GET',
                    url: '${pageContext.request.contextPath}/choose',
                    data: {
                        id: id,
                        categoryID: categoryid
                    },
                    success: function (data, textStatus, jqXHR) {
                        $('#updatesp').html(data);
                    }
                })
            }

            var format = function (num) {
                var str = num.toString().replace("$", ""), parts = false, output = [], i = 1, formatted = null;
                if (str.indexOf(".") > 0) {
                    parts = str.split(".");
                    str = parts[0];
                }
                str = str.split("").reverse();
                for (var j = 0, len = str.length; j < len; j++) {
                    if (str[j] != ",") {
                        output.push(str[j]);
                        if (i % 3 == 0 && j < (len - 1)) {
                            output.push(",");
                        }
                        i++;
                    }
                }
                formatted = output.reverse().join("");
                return("$" + formatted + ((parts) ? "." + parts[1].substr(0, 2) : ""));
            };

            function searchProduct() {
                var id = $('#productID').val();
                var name = $('#productName').val();
                var quantity = $('#productQuantity').val();
                var status = $('#status').val();
                var price = $('#productPrice').val();
                var categoryID = $('#category').val();
                $.ajax({
                    type: 'POST',
                    url: '${pageContext.request.contextPath}/product',
                    data: {
                        id: id,
                        name: name,
                        quantity: quantity,
                        status: status,
                        price: price,
                        categoryID: categoryID
                    },
                    dataType: "json",
                    success: function (data, textStatus, jqXHR) {
                        table.clear();
                        for (let idx = 0; idx < data.length; idx++) {
                            table.row.add({
                                0: '<input type="checkbox" name="check1" >',
                                1: data[idx].productID,
                                2: data[idx].productName,
                                3: '<img src="img/' + data[idx].productLink + '" alt="" width="100px;">',
                                
                                4: data[idx].quantity,
                                5: '<span class=\"badge bg-success\">' + (data[idx].quantity > 0 ? 'Còn hàng' : 'Hết hàng') + '</span>',
                                6: format(data[idx].productPrice),
                                7: data[idx].category.name,
                                8: '<button class="btn btn-primary btn-sm trash" type="button" onclick="isDelete(' + data[idx].productID + ')" title="Xóa"><i class="fas fa-trash-alt"></i> ' +
                                        '</button>' +
                                        '<button class="btn btn-primary btn-sm edit" type="button" title="Sửa" id="show-emp" data-toggle="modal" data-target="#ModalUP" onclick="getData(' + data[idx].productID + ')"><i class="fas fa-edit"></i></button>'
                            })
                        }
                        table.draw(false)
                    }
                })
            }
        </script>
        
    </body>

</html>