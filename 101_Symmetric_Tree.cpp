class Solution {
public:
    bool checker(TreeNode* r1,TreeNode* r2)
    {
        if(!r1 && !r2) 
            return true;
        if(r1 && !r2 || !r1 && r2 || r1->val !=r2->val) 
            return false;
        return checker(r1->left,r2->right) && checker(r1->right,r2->left); 
    }
    bool isSymmetric(TreeNode* root) {
        return checker(root,root);
    }
};