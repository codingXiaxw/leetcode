import javax.swing.tree.TreeNode;

/**
 * Created by codingBoy on 17/2/8.
 */
public class sameTree
{
    /**
     * Given two binary trees, write a function to check if they are equal or not.
     * Two binary trees are considered equal if they are structurally identical and the nodes have the same value.
     * @param args
     *
     * 给定两个二叉树，写出一个函数来检验它们是否相等。
     * 两个二叉树在结构上相同，节点具有相同的值。
     *
     *   public boolean isSameTree(TreeNode p, TreeNode q) {
    if(p == null && q == null) return true;
    if(p == null || q == null) return false;
    if(p.val == q.val)
    return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
    return false;
    }
     */

}
