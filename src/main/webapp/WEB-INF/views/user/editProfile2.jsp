<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<script src="http://code.jquery.com/jquery-1.10.2.min.js"></script>
<script src="http://cdnjs.cloudflare.com/ajax/libs/twitter-bootstrap/2.3.1/js/bootstrap.min.js"></script>

<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css">
<link rel="stylesheet" href="https://bootswatch.com/cosmo/bootstrap.min.css">
<link rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/profile.css">
</head>
<body>

<%--  <form:form action="edit" method="post" commandName="userForm" id="userForm"> --%>
          
<!--           <div class="top-row"> -->
<!--             <div class="field-wrap"> -->
<!--               <label>First Name<span class="req">*</span></label> -->
<%--               <form:input type="text" path="firstName" required="required"/> --%>
<!--             </div> -->
        
<!--             <div class="field-wrap"> -->
<!--               <label>Last Name<span class="req">*</span></label> -->
<%--               <form:input type="text" path="lastName" required="required"/> --%>
<!--             </div> -->
<!--           </div> -->

<!--           <div class="field-wrap"> -->
<!--             <label>Username<span class="req">*</span></label> -->
<%--             <form:input type="text" path="username" required="required"/> --%>
<!--           </div> -->

<!--           <div class="field-wrap"> -->
<!--             <label>Email Address<span class="req">*</span></label> -->
<%--             <form:input type="email" path="mail" required="required"/> --%>
<!--           </div> -->
         
          
<!--           <button type="submit" class="button button-block"/>Get Started</button> -->
          
<%--           </form:form> --%>


<h1>${sessionScope.userSession.getFirstName()}</h1>
<h1>${ userTest.getFirstName() }</h1>

        <form:form class="form-horizontal" action="edit" method="post" commandName="user">
          <label for="First_name">First name</label>
          <form:input type="text" class="form-control" id="First_name" path="firstName" value ="${ userF.getFirstName() }"  placeholder="${ userF.getFirstName() }"/>
          <label for="Last_name">Last name</label>
          <form:input type="text" class="form-control" id="Last_name" path="lastName" value ="${ userF.getLastName() }" placeholder="${userF.getLastName()}"/>

                        <label for="Your_location">Your location</label>
                        <form:input type="text" class="form-control" id="Your_location" path="adresse" />
          
                        <label for="Your_gender">Your gender</label>
                        <form:input type="text" class="form-control" id="Your_gender" path="gender" />
                        <br>
                        <label>Your Birthday</label>
                        <div class="form-inline" id="birth-date">
                            <select id="profile_date_year" name="profile[date][year]" path="birthdate" class="form-control">
                                <option value="${userSession.getBirthdate().getYear()+1900}" selected="selected">Year</option>
                                <option value="2003">2003</option>
                                <option value="2002">2002</option>
                                <option value="2001">2001</option>
                                <option value="2000">2000</option>
                                <option value="1999">1999</option>
                                <option value="1998">1998</option>
                                <option value="1997">1997</option>
                                <option value="1996">1996</option>
                                <option value="1995">1995</option>
                                <option value="1994">1994</option>
                                <option value="1993">1993</option>
                                <option value="1992">1992</option>
                                <option value="1991">1991</option>
                                <option value="1990">1990</option>
                                <option value="1989">1989</option>
                                <option value="1988">1988</option>
                                <option value="1987">1987</option>
                                <option value="1986">1986</option>
                                <option value="1985">1985</option>
                                <option value="1984">1984</option>
                                <option value="1983">1983</option>
                                <option value="1982">1982</option>
                                <option value="1981">1981</option>
                                <option value="1980">1980</option>
                                <option value="1979">1979</option>
                                <option value="1978">1978</option>
                                <option value="1977">1977</option>
                                <option value="1976">1976</option>
                                <option value="1975">1975</option>
                                <option value="1974">1974</option>
                                <option value="1973">1973</option>
                                <option value="1972">1972</option>
                                <option value="1971">1971</option>
                                <option value="1970">1970</option>
                                <option value="1969">1969</option>
                                <option value="1968">1968</option>
                                <option value="1967">1967</option>
                                <option value="1966">1966</option>
                                <option value="1965">1965</option>
                                <option value="1964">1964</option>
                                <option value="1963">1963</option>
                                <option value="1962">1962</option>
                                <option value="1961">1961</option>
                                <option value="1960">1960</option>
                                <option value="1959">1959</option>
                                <option value="1958">1958</option>
                                <option value="1957">1957</option>
                                <option value="1956">1956</option>
                                <option value="1955">1955</option>
                                <option value="1954">1954</option>
                                <option value="1953">1953</option>
                                <option value="1952">1952</option>
                                <option value="1951">1951</option>
                                <option value="1950">1950</option>
                                <option value="1949">1949</option>
                                <option value="1948">1948</option>
                                <option value="1947">1947</option>
                                <option value="1946">1946</option>
                                <option value="1945">1945</option>
                                <option value="1944">1944</option>
                                <option value="1943">1943</option>
                                <option value="1942">1942</option>
                                <option value="1941">1941</option>
                                <option value="1940">1940</option>
                                <option value="1939">1939</option>
                                <option value="1938">1938</option>
                                <option value="1937">1937</option>
                                <option value="1936">1936</option>
                                <option value="1935">1935</option>
                                <option value="1934">1934</option>
                                <option value="1933">1933</option>
                                <option value="1932">1932</option>
                                <option value="1931">1931</option>
                                <option value="1930">1930</option>
                                <option value="1929">1929</option>
                                <option value="1928">1928</option>
                                <option value="1927">1927</option>
                                <option value="1926">1926</option>
                                <option value="1925">1925</option>
                                <option value="1924">1924</option>
                                <option value="1923">1923</option>
                                <option value="1922">1922</option>
                                <option value="1921">1921</option>
                                <option value="1920">1920</option>
                                <option value="1919">1919</option>
                                <option value="1918">1918</option>
                                <option value="1917">1917</option>
                                <option value="1916">1916</option>
                                <option value="1915">1915</option>
                                <option value="1914">1914</option>
                                <option value="1913">1913</option>
                                <option value="1912">1912</option>
                                <option value="1911">1911</option>
                                <option value="1910">1910</option>
                                <option value="1909">1909</option>
                                <option value="1908">1908</option>
                                <option value="1907">1907</option>
                                <option value="1906">1906</option>
                                <option value="1905">1905</option>
                                <option value="1904">1904</option>
                                <option value="1903">1903</option>
                                <option value="1902">1902</option>
                                <option value="1901">1901</option>
                                <option value="1900">1900</option>
                                <option value="1899">1899</option>
                                <option value="1898">1898</option>
                                <option value="1897">1897</option>
                                <option value="1896">1896</option>
                                <option value="1895">1895</option>
                                <option value="1894">1894</option>
                                <option value="1893">1893</option>
                                <option value="1892">1892</option>
                                <option value="1891">1891</option>
                            </select>
                            <select id="profile_date_month" name="profile[date][month]" path="birthdate" class="form-control">
                                <option value="${userSession.getBirthdate().getMonth()+1}" selected="selected">Month</option>
                                <option value="1">January</option>
                                <option value="2">February</option>
                                <option value="3">March</option>
                                <option value="4">April</option>
                                <option value="5">May</option>
                                <option value="6">June</option>
                                <option value="7">July</option>
                                <option value="8">August</option>
                                <option value="9">September</option>
                                <option value="10">October</option>
                                <option value="11">November</option>
                                <option value="12">December</option>
                            </select>
                            <select id="profile_date_day" name="profile[date][day]" path="birthdate" class="form-control">
                                <option value="${userSession.getBirthdate().getDate()}" selected="selected">Day</option>
                                <option value="1">1</option>
                                <option value="2">2</option>
                                <option value="3">3</option>
                                <option value="4">4</option>
                                <option value="5">5</option>
                                <option value="6">6</option>
                                <option value="7">7</option>
                                <option value="8">8</option>
                                <option value="9">9</option>
                                <option value="10">10</option>
                                <option value="11">11</option>
                                <option value="12">12</option>
                                <option value="13">13</option>
                                <option value="14">14</option>
                                <option value="15">15</option>
                                <option value="16">16</option>
                                <option value="17">17</option>
                                <option value="18">18</option>
                                <option value="19">19</option>
                                <option value="20">20</option>
                                <option value="21">21</option>
                                <option value="22">22</option>
                                <option value="23">23</option>
                                <option value="24">24</option>
                                <option value="25">25</option>
                                <option value="26">26</option>
                                <option value="27">27</option>
                                <option value="28">28</option>
                                <option value="29">29</option>
                                <option value="30">30</option>
                                <option value="31">31</option>
                            </select>
                        </div>
                  <button class="btn btn-lg btn-primary btn-block btn-signin" type="submit">Sign in</button>
                        
        </form:form>

</body>
</html>