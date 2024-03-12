public class CredentialsValidator {
    public static void validateCredentials(String login, String password, String confirmPassword) throws WrongLoginException, WrongPasswordException {
        if (login == null || login.length() > 20 || !login.matches("[A-Za-z0-9_]+")) {
            throw new WrongLoginException("Login is invalid.");
        }
        if (password == null || confirmPassword == null || !password.equals(confirmPassword) || password.length() > 20 || !password.matches("[A-Za-z0-9_]+")) {
            throw new WrongPasswordException("Невалидный пароль.");
        }
    }
}
