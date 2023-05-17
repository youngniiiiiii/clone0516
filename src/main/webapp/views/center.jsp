<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="EUC-KR" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>

<%--<script>--%>
<%--    let item_get = {--%>
<%--        init: function () {--%>
<%--            $('#cart_btn').click(function () {--%>
<%--                let cust_id = $('#cust_id').val();--%>
<%--                let item_id = $('#item_id').val();--%>
<%--                let cnt = null;--%>
<%--                $.ajax({--%>
<%--                    url: '/addcart',--%>
<%--                    data: {cust_id: cust_id, item_id: item_id, cnt: 1},--%>
<%--                    success: function () {--%>
<%--                        alert("����")--%>
<%--                        //$('#myModal').modal();--%>
<%--                    },--%>
<%--                    error:()=>{--%>
<%--                        alert("tlfvo")--%>
<%--                    }--%>
<%--                });--%>

<%--                // $('#cart_form').attr({--%>
<%--                //     method: 'get',--%>
<%--                //     action: '/addcart'--%>
<%--                // });--%>
<%--                // $('#cart_form').submit();--%>
<%--            });--%>
<%--        }--%>
<%--    };--%>
<%--    $(function () {--%>
<%--        item_get.init();--%>
<%--    });--%>
<%--</script>--%>

<div class="col-sm-8 text-center">

    <!-- Section-->
    <section class="py-5">
        <div class="container px-4 px-lg-5 mt-5">
            <div class="row gx-4 gx-lg-5 row-cols-2 row-cols-md-3 row-cols-xl-4 justify-content-center">

                <c:forEach var="obj" items="${allitem}">
                <div class="col mb-5">
                    <div class="card h-100">
                        <!-- Product image-->
                        <img class="card-img-top" src="/uimg/${obj.imgname}" alt="..." />
                        <!-- Product details-->
                        <div class="card-body p-4">
                            <div class="text-center">
                                <!-- Product name-->
                                <h5 class="fw-bolder">${obj.name}</h5>
                                <!-- Product reviews-->
                                <div class="d-flex justify-content-center small text-warning mb-2">
                                    <div class="bi-star-fill"></div>
                                    <div class="bi-star-fill"></div>
                                    <div class="bi-star-fill"></div>
                                    <div class="bi-star-fill"></div>
                                    <div class="bi-star-fill"></div>
                                </div>
                                <!-- Product price-->
<%--                                <input type="hidden" id="cust_id" value="${logincust.id}">--%>
<%--                                <input type="hidden" id="item_id" value="${obj.id}">--%>
                                <fmt:formatNumber value="${obj.price}" pattern="###,###��"/>
                            </div>
                        </div>
                        <!-- Product actions-->
                        <div class="card-footer p-4 pt-0 border-top-0 bg-transparent">
                            <div class="text-center"><button type="button" id="cart_btn" class="btn btn-outline-dark mt-auto" >Add to cart</button></div>
                        </div>
                    </div>
                  </div>
                </c:forEach>
<%--                <jsp:include page="page.jsp"/>--%>
            </div>
        </div>
    </section>
</div>