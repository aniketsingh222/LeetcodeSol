class Solution {
public:
    int as(TreeNode* root,int& ans){
        if(root==NULL) return 0;
        int l=as(root->left,ans);
        if(l<0) l=0;
        int r=as(root->right,ans);
        if(r<0) r=0;
        ans=max(ans,root->val+l+r);
        return root->val+max(l,r);
    }
    int maxPathSum(TreeNode* root) {
        int ans=INT_MIN;
        as(root,ans);
        return ans;
    }
};