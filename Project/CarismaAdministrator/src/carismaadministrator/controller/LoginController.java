package carismaadministrator.controller;

import carismainterface.server.UserService;
import java.rmi.RemoteException;

/**
 *
 * @author K-MiL Caster
 */
public class LoginController {

    private String userName;
    private String password;
    private UserService user;

    public LoginController(UserService login, String userName, String password) {
        this.user = login;
        this.userName = userName;
        this.password = password;
    }

    public LoginController(UserService login, String userName) {
        this.user = login;
        this.userName = userName;
    }

    public boolean logIn() throws RemoteException {
        boolean success = user.userLogIn(userName, password, "staff");
        if (success) {
            user.updateLastLogIn(userName);
        }
        return success;
    }

    public void logOut() throws RemoteException {
        user.userLogOut(this.userName, "staff");
    }
}
