

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:choose>
    <c:when test="${logIn != null}">
        <nav aria-label="breadcrumb">
            <ol class="breadcrumb">
                <li class="breadcrumb-item"><a href="<c:url value="/home-page" />">Home Page</a></li>
                <li class="breadcrumb-item"><a href="#">Client</a></li>
                <li class="breadcrumb-item"><a href="#">Produits</a></li>
                <li class="breadcrumb-item"><a href="#">Categories</a></li>
                <li class="breadcrumb-item"><a href="<c:url value="/compte" />">Mon Compte</a></li>
                <li class="breadcrumb-item isDisabled"><a href="<c:url value="/log-in" />">Log In</a></li>
                <li class="breadcrumb-item"><a href="<c:url value="/log-out" />">Log Out</a></li>
                <li class="breadcrumb-item isDisabled"><a href="<c:url value="/inscription" />">Inscription</a></li> 
                
                <li class="breadcrumb-item "><a href="<c:url value="/changeStyle" />?style=jamaique" >  <img src="images/jam.png" alt=""/></a></li> 

                <li class="breadcrumb-item"><a href="<c:url value="/changeStyle" />?style=cuba">  <img src="images/cuba.png" alt=""/></a></li> 

            </ol>
        </nav>
    </c:when>
    <c:otherwise>
        <nav aria-label="breadcrumb">
            <ol class="breadcrumb">
                <li class="breadcrumb-item"><a href="<c:url value="/home-page" />">Home Page</a></li>
                <li class="breadcrumb-item isDisabled"><a href="#">Client</a></li>
                <li class="breadcrumb-item isDisabled"><a href="#">Produits</a></li>
                <li class="breadcrumb-item isDisabled"><a href="#">Categories</a></li>
                <li class="breadcrumb-item isDisabled"><a href="<c:url value="/compte" />">Mon Compte</a></li>
                <li class="breadcrumb-item "><a href="<c:url value="/log-in" />">Log In</a></li>
                <li class="breadcrumb-item isDisabled"><a href="<c:url value="/log-out" />">Log Out</a></li>
                <li class="breadcrumb-item "><a href="<c:url value="/inscription" />">Inscription</a></li> 
             
                <li class="breadcrumb-item "><a href="<c:url value="/changeStyle" />?style=jamaique" >    <img src="images/jam.png" alt=""/></a></li> 

                <li class="breadcrumb-item"><a href="<c:url value="/changeStyle" />?style=cuba">    <img src="images/cuba.png" alt=""/></a></li> 

            </ol>
        </nav>

</c:otherwise>

</c:choose>