<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@include file="../layout/taglib.jsp" %>


<h1>${user.name}</h1>

<c:forEach items="${user.cars}" var="car">

    <h1>${car.mark} </h1>
    <p>${car.model}</p>

    <table>
        <thead>
        <tr>
            <th>Name</th>
            <th>Article</th>
        </tr>
        </thead>
        <tbody>
            <c:forEach items="${car.details}" var="detail">
                <tr>
                    <td>${detail.name}</td>
                    <th>${detail.article}</th>
                </tr>

            </c:forEach>
        </tbody>
    </table>
</c:forEach>