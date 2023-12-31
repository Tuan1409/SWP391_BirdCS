

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">

    <head>

        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <!-- Main CSS-->
        <link rel="stylesheet" type="text/css" href="./css/admin.css">
        <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/boxicons@latest/css/boxicons.min.css">
        <!-- or -->
        <link rel="stylesheet" href="https://unpkg.com/boxicons@latest/css/boxicons.min.css">

        <!-- Font-icon css-->
        <link rel="stylesheet" type="text/css"
              href="https://maxcdn.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css">
        <script src="https://cdnjs.cloudflare.com/ajax/libs/sweetalert/2.1.2/sweetalert.min.js"></script>
        <link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.8.2/css/all.css">
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/jquery-confirm/3.3.2/jquery-confirm.min.css">

    </head>

    <body onload="time()" class="app sidebar-mini rtl">
        <jsp:include page="headerStaff.jsp"/>
        <main class="app-content">
            <div class="app-title"> 
                <ul class="app-breadcrumb breadcrumb side">
                    <li class="breadcrumb-item active"><a href="#"><b>Danh sách nhân viên </b></a></li>
                </ul>
                <div id="clock"></div>
            </div>
            <div class="row">
                <div class="col-md-12">
                    <div class="tile">
                        <div class="tile-body">
                            <div class="row element-button">
                                <div class="col-sm-2">

                                    <a class="btn btn-add btn-sm" href="createuser" title="Thêm"><i class="fas fa-plus"></i>
                                        Tạo mới nhân viên</a>
                                    <!--                                </div>
                                                                    <div class="col-sm-2">
                                                                        <a class="btn btn-delete btn-sm nhap-tu-file" type="button" title="Nhập" onclick="myFunction(this)"><i
                                                                                class="fas fa-file-upload"></i> Tải từ file</a>
                                                                    </div>
                                    
                                                                    <div class="col-sm-2">
                                                                        <a class="btn btn-delete btn-sm print-file" type="button" title="In" onclick="myApp.printTable()"><i
                                                                                class="fas fa-print"></i> In dữ liệu</a>
                                                                    </div>
                                                                    <div class="col-sm-2">
                                                                        <a class="btn btn-delete btn-sm print-file js-textareacopybtn" type="button" title="Sao chép"><i
                                                                                class="fas fa-copy"></i> Sao chép</a>
                                                                    </div>
                                    
                                                                    <div class="col-sm-2">
                                                                        <a class="btn btn-excel btn-sm" href="" title="In"><i class="fas fa-file-excel"></i> Xuất Excel</a>
                                                                    </div>
                                                                    <div class="col-sm-2">
                                                                        <a class="btn btn-delete btn-sm pdf-file" type="button" title="In" onclick="myFunction(this)"><i
                                                                                class="fas fa-file-pdf"></i> Xuất PDF</a>
                                                                    </div>
                                                                    <div class="col-sm-2">
                                                                        <a class="btn btn-delete btn-sm" type="button" title="Xóa" onclick="myFunction(this)"><i
                                                                                class="fas fa-trash-alt"></i> Xóa tất cả </a>
                                                                    </div>-->
                                </div>
                                <table class="table table-hover table-bordered" id="sampleTable">
                                    <thead>
                                        <tr>
                                            <th width="10"><input type="checkbox" id="all"></th>
                                            <th>ID đơn hàng </th>
                                            <th>Sản Phẩm</th>
                                            <th>Ảnh</th>
                                            <th>Địa chỉ</th>
                                            <th>Tên</th>
                                            
                                            <th>SĐT</th>
                                            <th>Tình Trạng</th>
                                           
                                        </tr>
                                    </thead>

                                    
                               
                                </table>
                            </div>
                        </div>
                    </div>
                </div>
        </main>

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
                                    <h5>Chỉnh sửa thông tin nhân viên cơ bản</h5>
                                </span>
                            </div>
                        </div>

                        <form action="updateuser" method="POST" id="updateusers">


                        </form>

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
                        <script type="text/javascript" src="./js/plugins/jquery.dataTables.min.js"></script>
                        <script type="text/javascript" src="./js/plugins/dataTables.bootstrap.min.js"></script>
                        <script type="text/javascript">
                                                                $('#sampleTable').DataTable();
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

                        <!--Confỉm xóa nhân viên -->
                        <script>
                            function confirmDelete(button) {
                                var employeeID = button.getAttribute("data-employeeID");

                                swal({
                                    title: "Cảnh báo",
                                    text: "Bạn có muốn xoá nhân viên này?",
                                    buttons: ["Hủy bỏ", "Đồng ý"],
                                }).then((willDelete) => {
                                    if (willDelete) {
                                        var form = button.closest("form");
                                        form.action = "deleteuser?employeeID=" + employeeID;
                                        form.submit();
                                    }

                                });
                            }
                        </script>

                        <script>
                            <% if (request.getAttribute("messok") != null) {%>
                            swal("<%= request.getAttribute("messok")%>", "", "success");
                            <% request.removeAttribute("messok"); %>
                            <% } %>
                        </script>
                        <script>
                            <% if (request.getAttribute("messerror") != null) {%>
                            swal("<%= request.getAttribute("messerror")%>", "", "error");
                            <% request.removeAttribute("messerror"); %>
                            <% }%>
                        </script>
                        <!--------------------------------------------------------------------------------------------------->

                        <!--Comfirm add nhân viên-->
                        <script>
                            function confirmAdd(button) {
                                var employeeID = button.getAttribute("data-employeeID");

                                swal({
                                    title: "Cảnh báo",
                                    text: "Bạn có muốn thêm nhân viên này?",
                                    buttons: ["Hủy bỏ", "Đồng ý"],
                                }).then((willDelete) => {
                                    if (willDelete) {
                                        var form = button.closest("form");
                                        form.action = "addemployee?employeeID=" + employeeID;
                                        form.submit();
                                    }

                                });
                            }

                        </script>
                        <script>
                            <% if (request.getAttribute("messtrue") != null) {%>
                            swal("<%= request.getAttribute("messtrue")%>", "", "success");
                            <% request.removeAttribute("messtrue"); %>
                            <% } %>
                        </script>
                        <script>
                            <% if (request.getAttribute("messefalse") != null) {%>
                            swal("<%= request.getAttribute("messefalse")%>", "", "error");
                            <% request.removeAttribute("messefalse"); %>
                            <% }%>
                        </script>
                        <!--------------------------------------------------------------------------------------------------->



                        <script>
                            oTable = $('#sampleTable').dataTable();
                            $('#all').click(function (e) {
                                $('#sampleTable tbody :checkbox').prop('checked', $(this).is(':checked'));
                                e.stopImmediatePropagation();
                            });

                            function getData(i) {
                                $.ajax({
                                    type: 'Post',
                                    url: '${pageContext.request.contextPath}/loadUser',
                                    data: {
                                        id: i
                                    },
                                    success: function (data, textStatus, jqXHR) {
                                        $('#updateusers').html(data);
                                    }
                                })
                            }
                        </script>
                        </body>

                        </html>
