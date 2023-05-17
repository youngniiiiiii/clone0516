<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="EUC-KR" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<style>
    .leftnav {
        width: 250px;
        height: 100%;
        padding: 15px 0px;
        border-right: 1px solid lightgrey;
    }
    .left-category {
        width: 220px;
        height: 45px;
        border-bottom: 1px solid lightgrey;
        font-size: 13px;
        padding: 15px 0px;
        margin: 0px 15px;
        font-weight: bold;
        text-align: left;
    }
    .left-category:hover {
        background-color: #F2F2F2;
    }
    .left-category-ko {
        color: #222222;
    }
    .left-category-en {
        color: lightgrey;
    }
    .left-category span {
        font-size: 11px;
    }
</style>
<%--leftnav--%>
<div class="col-sm-2 leftnav">
    <div class="left-category">
        <a href="/item/bottom" class="left-category-ko">���� ��ü</a>
        <span class="left-category-en">Bottom</span>
    </div>
    <div class="left-category">
        <a href="/item/jeans" class="left-category-ko">û����</a>
        <span class="left-category-en">Jeans</span>
    </div>
    <div class="left-category">
        <a href="/item/half" class="left-category-ko">�ݹ���</a>
        <span class="left-category-en">Half</span>
    </div>
    <div class="left-category">
        <a href="/item/skirt" class="left-category-ko">ġ��</a>
        <span class="left-category-en">Skirt</span>
    </div>
    <br/><br/>
    <p style="border-bottom: 1px solid lightgrey; padding: 15px"/>
    <div style="margin:15px;height: 150px;text-align: left">
        <h3 class="glyphicon glyphicon-earphone">1544-0000</h3>
        <p style="font-size: 11px;color:darkgrey;">����10��~����5�� � / ��,��,��,���� �޹�</p>
        <div style="border-top: 1px solid lightgrey; font-size: 11px;padding-top: 15px">
            <p>- ��ȭ �� <a href="#">���� ���� ����</a>�� Ȯ���ϼ���.</p>
            <p>- <a href="#">1:1����</a>�� ���ؼ��� ����� �����մϴ�.</p>
            <p>- ��㹮�Ǵ� �� ��ǰ Q&A�� �̿��ϼ���.</p>
        </div>
    </div>s
</div>