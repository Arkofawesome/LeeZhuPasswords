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
        strength = passLength() + conseqIndexes() + upperLower() + consecutive() + appear() + recur();
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
//            System.out.println(upper + "_" + lower + "_" + letter + "_" + numerical + "_" + symbol);
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
   public int upperLower(){
       int up=0, low=0;
       for(int i =0; i<password.length();i++){
           if(Character.isUpperCase(password.charAt(i))){
               up++;
           }
           else if(Character.isLowerCase(password.charAt(i))){
               low++;
           }
       }
    //    System.out.println("the uppercase power is"+up);
    //    System.out.println("the lowercase power is"+low);
       if(up>low){//if both zero it wont matter which I return
            //System.out.println("sent low");
            return low;
       }
       return up;
   }

   //5 if consecutive lose strength
   public int consecutive(){
       int ret=0;
       Character last=' ', current;
       for(int i =0; i<password.length(); i++){//use charValue to get value and will compare to last one then swap what the compare is
           current = password.charAt(i);
           if(current.charValue() == last.charValue()+1||current.charValue() == last.charValue()-1){
               ret--;
            //    System.out.println("current: "+current);
            //    System.out.println("last: "+last);
           }
            last = current;
       }
       System.out.println("consecutive strngth: "+ret);
       return ret;
   }

   //6 appearances
   public int appear(){
       int ret=0, counter=0;
       Character comparer;
       ArrayList<Character> had = new ArrayList();

       for(int i =0; i<password.length(); i++){//putting all letters into the list
           had.add(password.charAt(i));
       }
    //    System.out.println("The letters were put into its place correctly");
       
       //this is the actual checker
       while(had.size()>0){
            // System.out.println("letter on now is "+had.get(0));
           counter=0;
           comparer = had.get(0);//gets the first letter and will compare it with the rest of the letters
           for(int i =had.size()-1; i>0; i--){//going from reverse so that you wont skip anything
               if(comparer == had.get(i)){
                   counter++;
                //    System.out.println(had.get(i));
                   had.remove(i);
                }
                    
           }
        //    System.out.println("Counter for "+had.get(0)+"is "+counter);
           if(counter>=2)
               ret-=counter;
            had.remove(0);
       }
       
    //    System.out.println(ret);
    //    System.out.println("This is the end");
       return ret;
   }

   //7
   public int recur(){//start from end and check the previous character to see if its the same
                                   //if it is the same then it will subtract from score
       int ret = 0, counter=0;
       char prev = password.charAt(password.length()-1);
       for(int i =password.length()-1; i>=0; i--){
            // System.out.println("prev is "+prev);
            // System.out.println("Current char is: "+password.charAt(i));
            if(prev == password.charAt(i)){
                counter++;
                // System.out.println("adding to counter gives "+counter);
                if(counter>2&&i == 0){//to subtract from ret when it's at the very end of its run
                    System.out.println("its the last one");
                    ret-=counter-2;
                }
            }
            else{
                // System.out.println("The amount of the previous is: "+counter);
                if(counter>2){//to subtract from ret
                    ret-=counter-2;
                }
                counter =1;//becuase it should count itself
                prev = password.charAt(i);
                

            }
       }

    //    System.out.println("the return is: ");
       return ret;
   }
}
