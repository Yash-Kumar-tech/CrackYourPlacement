class Solution {
    public String simplifyPath(String path) {
        Stack<String> folders = new Stack<>();
        path = path.substring(1) ;
        for(String p: path.split("/")) {
            if(p.equals("..")) {
                if(!folders.isEmpty())  folders.pop();
            }
            else if(p.equals(".")) {

            } else if(p.length() > 0) {
                folders.push(p) ;
            }
        }
        String ans = "/" ;
        if(folders.isEmpty())   return "/" ;
        for(String p: folders) {
            ans = ans + p + "/" ;
        }
        ans = ans.substring(0, ans.length() - 1) ;
        return ans ;
    }
}