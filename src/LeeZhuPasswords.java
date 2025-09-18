import java.util.ArrayList;

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

    //1
    public boolean minRequirements() throws PasswordFormatException {
        if (password.length() >= 8 && password.length() <= 20) {
            boolean Upper;
            boolean lower;
            boolean letter;
            boolean numerical;
            boolean symbol;

            for (int i = 0; i < password.length(); i++) {
                if (Character.isUpperCase(password.charAt(i))) {
                    Upper = true;
                }
                else if (Character.isUpperCase(password.charAt(i))) {
                    lower = true;
                }
                else if (Character.isUpperCase(password.charAt(i))) {
                    Upper = true;
                }
                else if (Character.isUpperCase(password.charAt(i))) {
                    Upper = true;
                }
                else if (Character.isUpperCase(password.charAt(i))) {
                    Upper = true;
                }
            }
        }
    }

    public boolean minRequirements() throws PasswordFormatException {
        if (password.length() >= 8 && password.length() <= 20) {
            boolean Upper;
            boolean lower;
            boolean letter;
            boolean numerical;
            boolean symbol;

            for (int i = 0; i < password.length(); i++) {
                if (Character.isUpperCase(password.charAt(i))) {
                    Upper = true;
                }
                else if (Character.isUpperCase(password.charAt(i))) {
                    lower = true;
                }
                else if (Character.isUpperCase(password.charAt(i))) {
                    Upper = true;
                }
                else if (Character.isUpperCase(password.charAt(i))) {
                    Upper = true;
                }
                else if (Character.isUpperCase(password.charAt(i))) {
                    Upper = true;
                }
            }
        }
    }

    //4 increase based on cap or lower cases
    public int upperLower(String password){
        int up=0, low=0;
        for(int i =0; i<password.length();i++){
            if(new Character(password.charAt(i)).isUpperCase(0)){
                up++;
            }
            else if(new Character(password.charAt(i)).isLowerCase(0)){
                low++;
            }
        }

        if(up>low){//if both zero it wont matter which I return
            return up;
        }
        return low;
    }

    //5 if consecutive lose strength
    public int consecutive(String password){
        int ret=0;
        Character last=' ', current;
        for(int i =0; i<password.length(); i++){//use charValue to get value and will compare to last one then swap what the compare is
            current = password.charAt(i);
            if(last.charValue() == current.charValue()+1||last.charValue() == current.charValue()-1){
                ret--;
            }
        }
        return ret;
    }

    //6 appearances
    public int appear(String password){
        int ret=0, counter=0;
        Character comparer;
        ArrayList<Character> had = new ArrayList();

        for(int i =0; i<password.length(); i++){//putting all letters into the list
            had.add(password.charAt(i));
        }

        //this is the actual checker
        while(had.size()>0){
            counter=0;
            comparer = had.get(0);//gets the first letter and will compare it with the rest of the letters
            for(int i =had.size(); i>0; i--){//going from reverse so that you wont skip anything
                if(comparer == had.get(i)){
                    counter++;
                    had.remove(i);
                }
            }
            if(counter>2)
                ret-=counter;
        }
        return ret;
    }

    //7
    public int recur(String password){//start from end and check the previous character to see if its the same
                                    //if it is the same then it will subtract from score
        int ret = 0;
        for(int i =password.length(); i>0; i--){
            
        }

    }
}
