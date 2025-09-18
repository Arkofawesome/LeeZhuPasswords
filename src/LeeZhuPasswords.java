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
        int ret=0;
        ArrayList had = new ArrayList<char>(password.length());
    }
}
