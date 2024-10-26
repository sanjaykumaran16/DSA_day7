class Solution {
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> arr = new ArrayList<>();
        if(root==null) return arr;
        Stack<TreeNode> st=new Stack<>();
        TreeNode cur=root;
        TreeNode temp=null;
        while(cur!=null||!st.isEmpty()){
            if(cur!=null){
                st.push(cur);
                cur=cur.left;
            }
            else{
                temp=(st.peek()).right;
                if(temp==null){
                    temp=st.peek();
                    st.pop();
                    arr.add(temp.val);
                    while(!st.isEmpty() && temp==st.peek().right){
                        temp=st.peek();
                        st.pop();
                        arr.add(temp.val);
                    }
                }
                else{
                    cur=temp;
                }
            }
        }
        return arr;
    }
}
