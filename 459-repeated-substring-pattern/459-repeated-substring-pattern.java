class Solution {
    public boolean repeatedSubstringPattern(String s) {
         int end_partition = 1;
        if(s == null || s.length() <= 1) return false;

        while(end_partition <= s.length() - 1) {

            String substring = s.substring(0, end_partition);
            int substring_length = substring.length();

            if(s.length() % substring_length == 0) {

                int susbtring_in_string = s.length() / substring_length;
                StringBuilder sb = new StringBuilder();
                for(int i = 0; i < susbtring_in_string; i++) {
                    sb.append(substring);
                }

                if(s.equals(sb.toString())) {
                    return  true;
                }
            }
            end_partition++;
        }

        return false;
    }
}