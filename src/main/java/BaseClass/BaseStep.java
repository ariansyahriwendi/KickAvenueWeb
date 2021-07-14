package BaseClass;

import Object.Login;
import Object.Register;
import Object.ForgotPassword;
import Object.Checkout;

public class BaseStep {

    public static Login login = new Login();
    public static Register register = new Register();
    public static ForgotPassword  forgotPassword = new ForgotPassword();
    public static Checkout checkout = new Checkout();

}
