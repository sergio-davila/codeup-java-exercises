package JavaAdListerPaste;

public class ServletScratch7 {
//    public class DaoFactory {
//    private static Ads adsDao;
//
//    public static Ads getAdsDao() {
//        if (adsDao == null) {
//            adsDao = new ListAdsDao();
//        }
//        return adsDao;
//    }
//}

//import javax.servlet.ServletException;
//import javax.servlet.annotation.WebServlet;
//import javax.servlet.http.HttpServlet;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//import java.io.IOException;
//import java.util.List;
//
//
//@WebServlet(name = "AdsServlet", urlPatterns = "/ads")
//public class AdsServlet extends HttpServlet {
//
//    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
//
//        Ads adList = DaoFactory.getAdsDao();
//
//        List<Ad> showAds = adList.all();
//
//        request.setAttribute("ads", showAds);
//        request.getRequestDispatcher("/ads/index.jsp").forward(request, response);
//    }
//}

//    <%--
//  Created by IntelliJ IDEA.
//  User: sergiodavila
//  Date: 6/1/21
//  Time: 11:08 AM
//  To change this template use File | Settings | File Templates.
//--%>
//<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
//<%@ page contentType="text/html;charset=UTF-8" language="java" %>
//<html>
//<head>
//    <title>Ads</title>
//</head>
//<body>
//
//<c:forEach var="ad" items="${ads}">
//    <div class="ad">
//    <h2>${ad.title}</h2>
//    <p>${ad.description}</p>
//    </div>
//</c:forEach>
//</body>
//</html>
}
