// https://leetcode.com/problems/binary-tree-inorder-traversal

/**
 * Definition for a binary tree node.
 * function TreeNode(val, left, right) {
 *     this.val = (val===undefined ? 0 : val)
 *     this.left = (left===undefined ? null : left)
 *     this.right = (right===undefined ? null : right)
 * }
 */
/**
 * @param {TreeNode} root
 * @return {number[]}
 */
var inorderTraversal = function(root) {
    let nodes = [];
    traversal(nodes, root);
    return nodes;
};

traversal = (nodes, root) => {
    if (root !== null) {
        traversal(nodes, root.left);
        nodes.push(root.val);
        traversal(nodes, root.right);
    }
}