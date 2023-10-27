<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html >
    <head>
        <meta charset="utf-8">
        <link rel="png" href="logo.png" type="img/logo.png">
        <title>LồngChimVN</title>      
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
        <link rel="stylesheet" type="text/css" href="https://cdn.datatables.net/1.11.3/css/jquery.dataTables.min.css">
        <!-- Libraries Stylesheet -->
        <link href="lib/animate/animate.min.css" rel="stylesheet">
        <link href="lib/owlcarousel/assets/owl.carousel.min.css" rel="stylesheet">

        <!-- Customized Bootstrap Stylesheet -->

        <link href="css/style.css" rel="stylesheet">
        <link rel="stylesheet" href="https://cdn.datatables.net/1.11.1/css/jquery.dataTables.min.css">
    </head>

    <body> 
        <jsp:include page="headerUser.jsp"/>
        <!--Products Start--> 
        <div class="container-fluid pt-5 pb-3">
            <h2 class="section-title position-relative text-uppercase mx-xl-5 mb-4"><span class="bg-secondary pr-3">Thanh Toán</span></h2>



            <div class="row px-xl-5"  >
                <!--<table id="productTable">-->

                <c:if test="${sessionScope.cart != null && sessionScope.cart.size() > 0}">
                    <table id="example-table" >
                        <thead>
                            <tr>
                                <td>ID</td>
                                <td>Name</td>
                                <td>Quality</td>
                                <td colspan="2">Action</td>
                            </tr>
                        </thead>
                        <tbody>
                            <c:forEach items="${sessionScope.cart}" var="item">
                                <tr>
                            <form action="CartServlet" method="post">
                                <input type="hidden" name="action" value="update" />
                                <input type="hidden" name="pid" value="${item.key.getProductID()}" />
                                <td></td>
                                <td>${item.key.getName()}</td>
                                <td><input type="number" name="num" value="${item.value}"></td>
                                <td><input type="submit" value="Update"/></td>
                                <td><a href="${pageContext.request.contextPath}/delete">Delete</a></td>
                            </form>
                            </tr>
                        </c:forEach>
                        </tbody>
                    </table>
                    <c:if test="${p != null}">
                        <div>
                            Promotion :${p.name} - ${p.value}
                        </div>
                        <br>
                    </c:if>
                    <div>
                        Total Price : ${requestScope.totalPrice}                                       
                    </div>
                    <br>
                    <c:if  test="${p != null}">
                        <div>
                            Discount Price : ${requestScope.totalPrice * (100 - p.value) / 100}
                        </div>
                    </c:if>        
                    <a href="checkout">Checkout</a>
                </c:if>
                <c:if test="${sessionScope.cart == null || sessionScope.cart.size() == 0}">
                    <div>No data</div>
                </c:if>
            </div>

        </div>
        <!--Products End--> 


        <!--            <nav aria-label="Page navigation">
                        <ul class="pagination justify-content-center">
                            <li class="page-item disabled">
                                <a class="page-link" href="#" tabindex="-1" aria-disabled="true">Previous</a>
                            </li>
                            <li class="page-item active" aria-current="page">
                                <a class="page-link" href="#">1 <span class="sr-only">(current)</span></a>
                            </li>
                            <li class="page-item"><a class="page-link" href="#">2</a></li>
                            <li class="page-item"><a class="page-link" href="#">3</a></li>
                            <li class="page-item">
                                <a class="page-link" href="#">Next</a>
                            </li>
                        </ul>
                    </nav>-->









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
                            <h5 class="text-secondary text-uppercase mb-4">Lồng Shop</h5>
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


        <!-- JavaScript Libraries -->
        <script src="https://code.jquery.com/jquery-3.4.1.min.js"></script>
        <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.bundle.min.js"></script>
        <script src="lib/easing/easing.min.js"></script>
        <script src="lib/owlcarousel/owl.carousel.min.js"></script>

        <!-- Contact Javascript File -->
        <script src="mail/jqBootstrapValidation.min.js"></script>
        <script src="mail/contact.js"></script>

        <!-- Template Javascript -->
        <script src="js/main.js"></script>


        <script src="https://code.jquery.com/jquery-3.6.0.min.js"></script>
        <script src="https://cdn.datatables.net/1.11.3/js/jquery.dataTables.min.js"></script>
        <script>
            $(document).ready(function () {
                $('#productTable').DataTable({
                    "paging": true,
                    "pageLength": 20,
                    "lengthMenu": [20, 50, 100],
                    "language": {
                        "lengthMenu": "Display _MENU_ products per page",
                        "zeroRecords": "No products found",
                        "info": "Showing page _PAGE_ of _PAGES_",
                        "infoEmpty": "No products available",
                        "infoFiltered": "(filtered from _MAX_ total products)"
                    }
                });
            });
        </script>


        <script>
            function addToCart(productId, productName, price, quantity, imageUrl) {
                var xhr = new XMLHttpRequest();
                xhr.open("POST", "CartServlet", true);
                xhr.setRequestHeader("Content-Type", "application/x-www-form-urlencoded");
                xhr.onreadystatechange = function () {
                    if (xhr.readyState === XMLHttpRequest.DONE && xhr.status === 200) {
                        // Xử lý phản hồi thành công
                        window.location.reload(); // Tải lại trang để cập nhật giỏ hàng
                    }
                };
                xhr.send("action=add&productId=" + encodeURIComponent(productId) +
                        "&productName=" + encodeURIComponent(productName) +
                        "&price=" + encodeURIComponent(price) +
                        "&quantity=" + encodeURIComponent(quantity) +
                        "&imageUrl=" + encodeURIComponent(imageUrl));
            }
        </script>




        <script type="text/javascript">
            $(function () {
                $('#example-table').DataTable({
                    pageLength: 10,
                    //"ajax": './assets/demo/data/table_data.json',
                    /*"columns": [
                     { "data": "name" },
                     { "data": "office" },
                     { "data": "extn" },
                     { "data": "start_date" },
                     { "data": "salary" }
                     ]*/
                });
            })
        </script>


    </body>

</html>