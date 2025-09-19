public class App {
    public static void main(String[] args) throws Exception {
        LeeZhuPasswords pass = new LeeZhuPasswords("Abc123&!");
//        System.out.println(pass.determineStrength());
        pass = new LeeZhuPasswords("A!1ba^!!");
        System.out.println(pass.determineStrength());
//        pass = new LeeZhuPasswords("Password12#@");
//        System.out.println(pass.determineStrength());
//        pass = new LeeZhuPasswords("StrongPass123@#%$");
//        System.out.println(pass.determineStrength());
//        pass = new LeeZhuPasswords("NoDigits!");
//        System.out.println(pass.determineStrength());
    }
}
