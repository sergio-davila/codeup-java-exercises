package JavaAdListerPaste;

public class ServletScratch3 {
    //guess.jsp below
//    <%@ page contentType="text/html;charset=UTF-8" language="java" %>
//<html>
//<head>
//    <title>Guess</title>
//</head>
//<body>
//
//    <h1>Hello user. Guess between 1 and 3. Your life depends on it. Choose wisely.</h1>
//    <form method="POST" action="/guess">
//        <label for="guess"></label>
//        <input id="guess" name="guess" type="number" min="1" max="3">
//        <button type="submit" formmethod="post">Submit</button>
//    </form>
//</body>
//</html>


    //guess controller servlet
//import javax.servlet.ServletException;
//import javax.servlet.annotation.WebServlet;
//import javax.servlet.http.HttpServlet;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//import java.io.IOException;
//import java.util.Random;
//
//@WebServlet(name = "ControllerServlet", urlPatterns = "/guess")
//public class ControllerServlet extends HttpServlet {
//
//    @Override
//    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//        Random random = new Random();
//        int randomNum = random.nextInt(3 + 1) + 1;
//        String randomNumString = Integer.toString(randomNum);
//        String guess = request.getParameter("guess");
//
//        if(guess.equals(randomNumString)) {
//            response.sendRedirect("/correct.jsp");
//        } else {
//            response.sendRedirect("/incorrect.jsp");
//        }
//
//    }
//
//    @Override
//    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//        response.sendRedirect("/guess.jsp");
//    }
//}
}
