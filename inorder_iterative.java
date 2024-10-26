class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> arr = new ArrayList<>();
        TreeNode cur=root;
        Stack<TreeNode> st=new Stack<>();
        while(true){
            if(cur!=null){
                st.push(cur);
                cur=cur.left;
            }
            else{
                if(st.isEmpty()){
                    break;
                }
                else{
                    cur=st.pop();
                    arr.add(cur.val);
                    cur=cur.right;
                }
            }
        }
        return arr;
    }
}
