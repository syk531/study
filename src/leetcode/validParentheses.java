package leetcode;

public class validParentheses {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public boolean isValid(String s) {
        int length = s.length();
        
        if(length%2 == 1) {
            return false;
        }
        
        String temp1 = "";
        for(int i=0; i<length; i++) {
            String temp2 = String.valueOf(s.charAt(i));
                
            if(temp2.equals("(") || temp2.equals("[") || temp2.equals("{")) {
                temp1 = temp2 + temp1;
            } else if(temp2.equals("}")) {
                if(temp1.length() > 0 && "{".equals(temp1.substring(0,1))){
                    temp1 = temp1.substring(1);    
                } else {
                    return false;
                }
            } else if(temp2.equals("]")) {
                if(temp1.length() > 0 && "[".equals(temp1.substring(0,1))){
                    temp1 = temp1.substring(1);    
                } else {
                    return false;
                }
            } else if(temp2.equals(")")) {
                if(temp1.length() > 0 && "(".equals(temp1.substring(0,1))){
                    temp1 = temp1.substring(1);    
                } else {
                    return false;
                }
            }
        }
        
        if(temp1.length() > 0) {
            return false;
        }
        
        return true;
    }
}
