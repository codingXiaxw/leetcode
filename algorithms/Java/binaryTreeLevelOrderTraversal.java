import javax.swing.tree.TreeNode;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * Created by codingBoy on 17/2/10.
 */
public class binaryTreeLevelOrderTraversal
{
    /**
     * Given a binary tree, return the bottom-up level order traversal of its nodes' values. (ie, from left to right, level by level from leaf to root).
     */

//    public List<List<Integer>> levelOrderBottom(TreeNode root) {
//
//        List<List<Integer>> result = new ArrayList<>();
//        if(root==null) return result;
//        Queue<TreeNode> q = new LinkedList<>();
//        q.add(root);
//        while(q.size()>0){
//            List<Integer> list = new ArrayList<>();
//            int size = q.size();
//            for(int i=0; i<size; i++){
//                TreeNode node = q.poll();
//                list.add(node.val);
//                if(node.left!=null) q.add(node.left);
//                if(node.right!=null) q.add(node.right);
//            }
//            result.add(0,list);
//        }
//        return result;
//
//    }
}
