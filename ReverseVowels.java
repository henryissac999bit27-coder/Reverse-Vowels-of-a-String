class Solution {
    public String reverseVowels(String s) {
        int i=0,j=s.length()-1;
        char[] str=s.toCharArray();
        while(i<j){
            while(i<j && !vowel(str[i])){
                i++;
            }
            while(i<j && !vowel(str[j])){
                j--;
            }
            char temp=str[i];
            str[i]=str[j];
            str[j]=temp;
            i++;
            j--;
        }
        return new String(str);
    }
    boolean vowel(char a){
        return(a=='a'||a=='e'||a=='i'||a=='o'||a=='u'||
        a=='A'||a=='E'||a=='I'||a=='O'||a=='U');
    }
}
