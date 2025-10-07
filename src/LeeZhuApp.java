public class LeeZhuApp {
    public static void main(String[] args) throws Exception {
//        LeeZhuPasswords pass = new LeeZhuPasswords("Abc123&!!!!!!!!!!!");
//        System.out.println(pass.determineStrength());
//        pass = new LeeZhuPasswords("A!1ba^!!");
//        System.out.println(pass.determineStrength());
        
//         LeeZhuPasswords pass = new LeeZhuPasswords("ABcDe123!");
// //        System.out.println(pass.determineStrength());
//         pass = new LeeZhuPasswords("ABcDe123!");
//         System.out.println(pass.determineStrength());
//        pass = new LeeZhuPasswords("Password12#@");
//        System.out.println(pass.determineStrength());
//        pass = new LeeZhuPasswords("StrongPass123@#%$");
//        System.out.println(pass.determineStrength());
//        pass = new LeeZhuPasswords("NoDigits!");
//        System.out.println(pass.determineStrength());
//        new PasswordApp(new PasswordPannel());
//        LeeZhuPasswords pass5 = new LeeZhuPasswords("zyx78");//to test 5
        new LeeZhuPasswordApp(new LeeZhuPasswordPannel());//make sure this is not commented out
//        System.out.println(pass5.consecutive());
        // LeeZhuPasswords pass6 = new LeeZhuPasswords("axaxaxa");
        // System.out.println(pass6.appear());
        // LeeZhuPasswords pass7 = new LeeZhuPasswords("xaaaaa");
        // System.out.println(pass7.recur());
    }
}
