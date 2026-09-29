class Solution {
    private final String[] map;
    public Solution(){
        map=new String []{"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
    }
    public void possible(String digits,List<String>ans,int idx,String curr){

        if(idx==digits.length()){
            ans.add(curr);
            return;
        }

        String s=map[digits.charAt(idx)-'0'];

        for(int i=0;i<s.length();i++){
            possible(digits,ans,idx+1,curr+s.charAt(i));
        }



    }
    public List<String> letterCombinations(String digits) {
        List<String>ans=new ArrayList<>();

        if(digits.length()==0){
            return ans;
        }

        possible(digits,ans,0,"");
        return ans;

        
    }
}