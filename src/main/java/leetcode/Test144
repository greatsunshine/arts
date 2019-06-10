class Solution {
    public List<Integer> preorderTraversal(TreeNode root) {
        Stack<TreeNode> stack = new Stack<>();
        List<Integer> list = new LinkedList<>();
        if(root == null){
            return list;
        }
        //第一步是将根节点压入栈中
        stack.push(root);
        //当栈不为空时，出栈的元素插入list尾部。
        while(!stack.isEmpty()){
            root = stack.pop();
            list.add(root.val);
            if(root.right != null) stack.push(root.right);
            if(root.left != null) stack.push(root.left);
        }
        return list;
    }
}
