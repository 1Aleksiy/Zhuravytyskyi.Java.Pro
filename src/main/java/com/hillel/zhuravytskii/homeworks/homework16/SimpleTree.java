package com.hillel.zhuravytskii.homeworks.homework16;


import java.util.List;

class SimpleTree {
    private TreeNode root;

    public SimpleTree() {
        this.root = null;
    }

    public void add(int value) {
        if (root == null) {
            root = new TreeNode(value);
        } else {
            addRecursive(root, value);
        }
    }

    private void addRecursive(TreeNode current, int value) {
        List<TreeNode> children = current.getChildren();
        if (children.isEmpty()) {
            TreeNode newNode = new TreeNode(value);
            current.addChild(newNode);
        } else {
            for (TreeNode child : children) {
                addRecursive(child, value);
            }
        }
    }

    public void traverse() {
        if (root == null) {
            System.out.println("The tree is empty.");
        } else {
            traverseRecursive(root);
        }
    }

    private void traverseRecursive(TreeNode current) {
        System.out.println(current.getValue());
        List<TreeNode> children = current.getChildren();
        for (TreeNode child : children) {
            traverseRecursive(child);
        }
    }
}
