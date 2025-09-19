public class App {
    public static void main(String[] args) throws Exception {
        LeeZhuPasswords pass = new LeeZhuPasswords("Abcdef1!");
        System.out.println(pass.determineStrength());
        pass = new LeeZhuPasswords("Abcd1234!@");
        System.out.println(pass.determineStrength());
        pass = new LeeZhuPasswords("Password12#@");
        System.out.println(pass.determineStrength());
        pass = new LeeZhuPasswords("StrongPass123@#%$");
        System.out.println(pass.determineStrength());
        pass = new LeeZhuPasswords("NoDigits!");
        System.out.println(pass.determineStrength());
    }
}
