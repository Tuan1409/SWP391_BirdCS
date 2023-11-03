<%-- 
    Document   : LeaveApplication
    Created on : May 28, 2023, 11:36:10 PM
    Author     : DELL
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Đơn xin nghỉ phép</title>
        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <!-- Main CSS -->
        <link rel="stylesheet" type="text/css" href="./css/admin.css">
        <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/boxicons@latest/css/boxicons.min.css">
        <!-- or -->
        <link rel="stylesheet" href="https://unpkg.com/boxicons@latest/css/boxicons.min.css">
        <link rel="stylesheet" type="text/css" href="./css/profile.css">
        <!-- Font-icon CSS -->
        <link rel="stylesheet" type="text/css"
              href="https://maxcdn.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css">
        <script src="https://cdnjs.cloudflare.com/ajax/libs/sweetalert/2.1.2/sweetalert.min.js"></script>
        <link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.8.2/css/all.css">
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/jquery-confirm/3.3.2/jquery-confirm.min.css">
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/jquery-confirm/3.3.2/jquery-confirm.min.css">
        <script src="https://cdnjs.cloudflare.com/ajax/libs/jquery-confirm/3.3.2/jquery-confirm.min.js"></script>


        <style>
            body {
                font-family: 'Roboto', sans-serif;
            }

            h1 {
                text-align: center;
            }

            h6 {
                text-align: center;
            }

            .form-container {
                max-width: 400px;
                margin: 0 auto;
                padding: 20px;
                border: 1px solid #ccc;
                border-radius: 5px;
            }

            .form-container label {
                display: block;
                margin-bottom: 5px;
                font-weight: bold;
            }

            .form-container input[type="text"] {
                width: 100%;
                padding: 5px;
                border: 1px solid #ccc;
                border-radius: 5px;
            }

            .form-container .form-group {
                margin-bottom: 5px;
            }

            .form-container .btn-container {
                text-align: center;
                margin-top: 20px;
            }

            .form-container .btn-container input[type="submit"] {
                padding: 5px 10px;
                background-color: #4CAF50;
                color: #fff;
                border: none;
                border-radius: 5px;
                cursor: pointer;
            }
        </style>
        <style>
            .btn-check-status {
                background-color: #4CAF50; /* Màu nền */
                color: white; /* Màu chữ */
                padding: 5px 10px; /* Kích thước nút */
                border: none; /* Loại bỏ viền */
                border-radius: 5px; /* Bo tròn góc */
                cursor: pointer; /* Hiệu ứng con trỏ */
                font-size: 14px; /* Cỡ chữ */
            }

            .btn-check-status:hover {
                background-color: #45a049; /* Màu nền khi hover */
            }
        </style>
        <jsp:include page="viewprofilepage.jsp"/>
    </head>
    <body>
<!--        <br><br><br><h1>Tài khoản của tôi</h1>
        <div class="form-container">
            <div class="form-group">
                <label for="firstname">Tên đầu: ${sessionScope.userlogin.firstname}</label>
            </div>
            <div class="form-group">
                <label for="lastname">Tên sau: ${sessionScope.userlogin.lastname}</label>
            </div>
            <div class="form-group">
                <label>email: ${sessionScope.userlogin.email}</label>
            </div>
            <div class="form-group">
                <label>ngày sinh: ${sessionScope.userlogin.birthday}</label>
            </div>
            <div class="form-group">
                <label>địa chỉ: ${sessionScope.userlogin.address}</label>
            </div>
            <div class="form-group">
                <label>SĐT: ${sessionScope.userlogin.phone}</label>
            </div> <div class="form-group">
                <img  src="img/${sessionScope.userlogin.image}"</label>
            </div>


        </form>-->


    </div>
    <div class="container emp-profile" style=" margin-top:150px  ; margin-left: 336px;">
        <form method="post">
            <div class="row">
                <div class="col-md-4">
                    <div class="profile-img">
                        <img src="img/${sessionScope.userlogin.image}" alt=""/>
                        <div class="file btn btn-lg btn-primary">
                            Change Photo
                            <input type="file" name="file"/>
                        </div>
                    </div>
                </div>
                <div class="col-md-6">
                    <div class="profile-head">
                        <h5>
                            ${sessionScope.userlogin.firstname} ${sessionScope.userlogin.lastname}
                        </h5>
                        <p class="proile-rating">RANKINGS : <span>8/10</span></p>
                        <ul class="nav nav-tabs" id="myTab" role="tablist">
                            <li class="nav-item">
                                <a class="nav-link active" id="home-tab" data-toggle="tab" href="#home" role="tab" aria-controls="home" aria-selected="true">About</a>
                            </li>
                        </ul>
                    </div>
                </div>
                <div class="col-md-2">
                    <input type="submit" class="profile-edit-btn" name="btnAddMore" value="Edit Profile"/>
                </div>
            </div>
            <div class="row">
                <div class="col-md-4">
<!--                    <div class="profile-work">
                        <p>WORK LINK</p>
                        <a href="">Website Link</a><br/>
                        <a href="">Bootsnipp Profile</a><br/>
                        <a href="">Bootply Profile</a>
                        <p>SKILLS</p>
                        <a href="">Web Designer</a><br/>
                        <a href="">Web Developer</a><br/>
                        <a href="">WordPress</a><br/>
                        <a href="">WooCommerce</a><br/>
                        <a href="">PHP, .Net</a><br/>
                    </div>-->
                </div>
                <div class="col-md-8">
                    <div class="tab-content profile-tab" id="myTabContent">
                        <div class="tab-pane fade show active" id="home" role="tabpanel" aria-labelledby="home-tab">
                            <div class="row">
                                <div class="col-md-6">
                                    <label>Họ :</label>
                                </div>
                                <div class="col-md-6">
                                    <p>${sessionScope.userlogin.firstname}</p>
                                </div>
                            </div>
                            <div class="row">
                                <div class="col-md-6">
                                    <label>Tên : </label>
                                </div>
                                <div class="col-md-6">
                                    <p>${sessionScope.userlogin.lastname}</p>
                                </div>
                            </div>
                            <div class="row">
                                <div class="col-md-6">
                                    <label>Email : </label>
                                </div>
                                <div class="col-md-6">
                                    <p>${sessionScope.userlogin.email}</p>
                                </div>
                            </div>
                                <div class="row">
                                <div class="col-md-6">
                                    <label>Ngày sinh :</label>
                                </div>
                                <div class="col-md-6">
                                    <p>${sessionScope.userlogin.birthday}</p>
                                </div>
                            </div>
                                <div class="row">
                                <div class="col-md-6">
                                    <label>Địa chỉ :</label>
                                </div>
                                <div class="col-md-6">
                                    <p>${sessionScope.userlogin.address}</p>
                                </div>
                            </div>
                            <div class="row">
                                <div class="col-md-6">
                                    <label>Số điện thoại : </label>
                                </div>
                                <div class="col-md-6">
                                    <p>${sessionScope.userlogin.phone}</p>
                                </div>
                            </div>
                            
                        </div>
                    </div>
                </div>
            </div>
        </form>           
    </div>

</body>
</html>