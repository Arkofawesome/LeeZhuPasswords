public class LeeZhuPasswords implements LeeZhuIntFace{
    private String password;

    public LeeZhuPasswords() {
        password = "hello";
    }

    public LeeZhuPasswords(String password) {
        this.password = password;
    }

    public int determineStrength() throws PasswordFormatException {

    }
}
