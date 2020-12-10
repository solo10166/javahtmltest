/**
 * login
 */
public class login {

    public static void main(String[] args) {
        PageContext pageContext = (PageContext) getJspContext();  
        HttpServletRequest request = (HttpServletRequest) pageContext.getRequest(); 
        String yourValue = request.getParameter("username");
        System.out.println(yourValue);

    }
}