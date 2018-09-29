<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ include file = "../jsp/common/taglib.jsp" %>


<html>
    <head>
        <title>welcome</title>

        <c:import url="../jsp/common/css.jsp" />

        <style>
            .error {
                color: red;
            }
        </style>

    </head>
    <body>
        <c:set var="sample" value="tae" />

        <c:if test="${not empty success}">
            <h1>${success}</h1>
        </c:if>

        <form:form method="POST"
                   action="/login" modelAttribute="cat">
            <table>
                <tr>
                    <td><form:label path="name">Name</form:label></td>
                    <td><form:input path="name"/></td>
                    <td><form:errors path="name" cssClass="error" /></td>
                </tr>
                <tr>
                    <td><input type="submit" value="Submit"/></td>
                </tr>
            </table>
        </form:form>

        <c:import url="../jsp/common/js.jsp" />


    </body>
</html>
