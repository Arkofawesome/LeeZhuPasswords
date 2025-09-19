import java.util.ArrayList;

public class LeeZhuPasswords implements LeeZhuIntFace {
    private String password;

    public LeeZhuPasswords() {
        password = "hello";
    }

    public LeeZhuPasswords(String password) {
        this.password = password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int determineStrength() {
        if (!minRequirements()) {
            throw new PasswordFormatException("Does not meet min Requirements");
        }
        int strength;
        strength = passLength() + conseqIndexes();
        return strength;
    }

    //1
    public boolean minRequirements() {
        if (password.length() >= 8 && password.length() <= 20) {
            boolean upper = false;
            boolean lower = false;
            boolean letter = false;
            boolean numerical = false;
            boolean symbol = false;

            for (int i = 0; i < password.length(); i++) {
                if (Character.isUpperCase(password.charAt(i))) {
                    upper = true;
                } else if (Character.isLowerCase(password.charAt(i))) {
                    lower = true;
                } else if (Character.isDigit(password.charAt(i))) {
                    numerical = true;
                } else if (!Character.isLetterOrDigit(password.charAt(i))) {
                    symbol = true;
                }
            }
            // Basically if one letter is uppercase or one letter is lowercase, then there is a letter
            if (upper || lower)
                letter = true;

            if (upper && lower && letter && numerical && symbol) {
                return true;
            }
            System.out.println(upper + "_" + lower + "_" + letter + "_" + numerical + "_" + symbol);
        }
        return false;
    }

    //2
    public int passLength() {
        if (password.length() >= 17) {
            return 3;
        }
        else if (password.length() >= 12) {
            return 2;
        }
        else {
            return 1;
        }
    }

    //3
    public int conseqIndexes() {
        int count = 0;
        for (int i = 1; i < password.length(); i++) {
            // Thinking of brute forcing by finding every possible combo
            if (Character.isLetter(password.charAt(i - 1))) {
                if (Character.isDigit(password.charAt(i)) || !Character.isLetterOrDigit(password.charAt(i))) {
                    count++;
                }
            }
            else if (Character.isDigit(password.charAt(i - 1))) {
                if (Character.isLetter(password.charAt(i)) || !Character.isLetterOrDigit(password.charAt(i))) {
                    count++;
                }
            }
            else if (!Character.isLetterOrDigit(password.charAt(i - 1))) {
                if (Character.isLetterOrDigit(password.charAt(i))) {
                    count++;
                }
            }
        }
        return count;
    }


    //4 increase based on cap or lower cases
//    public int upperLower(String password){
//        int up=0, low=0;
//        for(int i =0; i<password.length();i++){
//            if(new Character(password.charAt(i)).isUpperCase(0)){
//                up++;
//            }
//            else if(new Character(password.charAt(i)).isLowerCase(0)){
//                low++;
//            }
//        }
//
//        if(up>low){//if both zero it wont matter which I return
//            return up;
//        }
//        return low;
//    }
//
//    //5 if consecutive lose strength
//    public int consecutive(String password){
//        int ret=0;
//        Character last=' ', current;
//        for(int i =0; i<password.length(); i++){//use charValue to get value and will compare to last one then swap what the compare is
//            current = password.charAt(i);
//            if(last.charValue() == current.charValue()+1||last.charValue() == current.charValue()-1){
//                ret--;
//            }
//        }
//        return ret;
//    }
//
//    //6 appearances
//    public int appear(String password){
//        int ret=0, counter=0;
//        Character comparer;
//        ArrayList<Character> had = new ArrayList();
//
//        for(int i =0; i<password.length(); i++){//putting all letters into the list
//            had.add(password.charAt(i));
//        }
//
//        //this is the actual checker
//        while(had.size()>0){
//            counter=0;
//            comparer = had.get(0);//gets the first letter and will compare it with the rest of the letters
//            for(int i =had.size(); i>0; i--){//going from reverse so that you wont skip anything
//                if(comparer == had.get(i)){
//                    counter++;
//                    had.remove(i);
//                }
//            }
//            if(counter>2)
//                ret-=counter;
//        }
//        return ret;
//    }
//
//    //7
//    public int recur(String password){//start from end and check the previous character to see if its the same
//                                    //if it is the same then it will subtract from score
//        int ret = 0;
//        for(int i =password.length(); i>0; i--){
//
//        }
//
//    }
}
