public class Main {
    public static void main(String[] args) {
        try {
            CredentialsValidator.validateCredentials("java_skypro", "123_Password", "123_Password");
            System.out.println(("Validation successful."));
        } catch (WrongLoginException | WrongPasswordException e) {
            System.out.println("Validation error: " + e.getMessage());
        }
    }
}