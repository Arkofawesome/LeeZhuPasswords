public class LeeZhuApp {
    public static void main(String[] args) throws Exception {
        //running the proj
        //new LeeZhuPasswordApp(new LeeZhuPasswordPannel());//make sure this is not commented out

        

        // //for minRequirements (prob 1)
        // LeeZhuPasswords pass1 = new LeeZhuPasswords("12345!Jl");//to test 5
        // System.out.println(pass1.minRequirements());
        // pass1 = new LeeZhuPasswords("123456789");
        // System.out.println(pass1.minRequirements());

        // //for passLength (prob 2)
        // LeeZhuPasswords pass2 = new LeeZhuPasswords("123456789");//9 characters 
        // System.out.println(pass2.passLength());
        // pass2 = new LeeZhuPasswords("12345678912345");//14 characters
        // System.out.println(pass2.passLength());
        // pass2 = new LeeZhuPasswords("123456789123456789");//18 characters
        // System.out.println(pass2.passLength());

        // //for conseqIndexes (prob 3)
        // LeeZhuPasswords pass3 = new LeeZhuPasswords("abc123&");
        // System.out.println(pass3.conseqIndexes());
        // pass3 = new LeeZhuPasswords("a!1ba^");
        // System.out.println(pass3.conseqIndexes());
        
        // //for upperLower (prob 4)
        // LeeZhuPasswords pass4 = new LeeZhuPasswords("ABcDe123!");
        // System.out.println(pass4.upperLower());
        
        // //for consecutive (prob 5)
        // LeeZhuPasswords pass5 = new LeeZhuPasswords("zyx78");//to test 5
        // System.out.println(pass5.consecutive());
        // pass5 = new LeeZhuPasswords("abcde");
        // System.out.println(pass5.consecutive());
        // pass5 = new LeeZhuPasswords("abc4321");
        // System.out.println(pass5.consecutive());
        // //to check the between cases from symbols to letters/numbers
        // pass5 = new LeeZhuPasswords("?@A");
        // System.out.println(pass5.consecutive());

        // //for appearances (prob 6)
        // LeeZhuPasswords pass6 = new LeeZhuPasswords("xaxbxc");
        // System.out.println(pass6.appear());
        // pass6 = new LeeZhuPasswords("xaxbc");
        // System.out.println(pass6.appear());
        // pass6 = new LeeZhuPasswords("axaxaxa");
        // System.out.println(pass6.appear());

        // //for recur (prob 7)
        // LeeZhuPasswords pass7 = new LeeZhuPasswords("xa");
        // System.out.println(pass7.recur());
        // pass7 = new LeeZhuPasswords("aa");
        // System.out.println(pass7.recur());
        // pass7 = new LeeZhuPasswords("aaa");
        // System.out.println(pass7.recur());
        // pass7 = new LeeZhuPasswords("aaaa");
        // System.out.println(pass7.recur());

        // //All together now (everybody do your share)
        // LeeZhuPasswords pass8 = new LeeZhuPasswords("Abcde123@");
        // System.out.println("Abcde123@ is " + pass8.determineStrength());//should be -1

        // pass8 = new LeeZhuPasswords("Password1&");
        // System.out.println("Password1& is " + pass8.determineStrength());//should be +4

        // pass8 = new LeeZhuPasswords("Apple92&");
        // System.out.println("Apple92& is " + pass8.determineStrength());//should be +4

        // pass8 = new LeeZhuPasswords("Apple98&");
        // System.out.println("Apple98& is " + pass8.determineStrength());//should be +3

        // pass8 = new LeeZhuPasswords("banaNa12&");
        // System.out.println("banaNa12& is " + pass8.determineStrength());//should be +1

        // pass8 = new LeeZhuPasswords("@Cheese1!a@cc");
        // System.out.println("@Cheese1!a@cc is " + pass8.determineStrength());//should be +8

        // pass8 = new LeeZhuPasswords("@Cheese1!a@ccc");
        // System.out.println("@Cheese1!a@ccc is " + pass8.determineStrength());//should be +6

        // pass8 = new LeeZhuPasswords("@Cheeese1!a@ccc");
        // System.out.println("@Cheeese1!a@ccc is " + pass8.determineStrength());//should be +4

        // pass8 = new LeeZhuPasswords("@CheESe1!a@cc");
        // System.out.println("@CheESe1!a@cc is " + pass8.determineStrength());//should be +11

        // pass8 = new LeeZhuPasswords("hello");
        // System.out.println("hello is " + pass8.determineStrength());//should throw a PasswordFormatException
        
        // pass8 = new LeeZhuPasswords("abcdefghijk1234987896876!@#!%@!#");
        // System.out.println("abcdefghijk1234987896876!@#!%@!# is " + pass8.determineStrength());//should throw a PasswordFormatException

        // pass8 = new LeeZhuPasswords("Password1");
        // System.out.println("Password1 is " + pass8.determineStrength());//should throw a PasswordFormatException

        // pass8 = new LeeZhuPasswords("Password1&");
        // System.out.println("Password1& is " + pass8.determineStrength());//should throw a PasswordFormatException

        // pass8 = new LeeZhuPasswords("Password&");
        // System.out.println("Password& is " + pass8.determineStrength());//should throw a PasswordFormatException
   
    }
}
