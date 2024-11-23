package ing.presentacion.app.service;

import jakarta.servlet.http.HttpSession;

/**
 *
 * @author FENIX
 */
public class LogoutService {

    public LogoutService() {
    }
    
    public void logout(HttpSession httpSession) {
        httpSession.removeAttribute("iduser");
    }
    
}
