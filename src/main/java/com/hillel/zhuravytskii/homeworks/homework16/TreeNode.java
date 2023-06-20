package com.hillel.zhuravytskii.homeworks.homework16;

import java.util.ArrayList;
import java.util.List;

class TreeNode {
    private int value;
    private List<TreeNode> children;

    public TreeNode(int value) {
        this.value = value;
        this.children = new ArrayList<>();
    }

    public int getValue() {
        return value;
    }

    public List<TreeNode> getChildren() {
        return children;
    }

    public void addChild(TreeNode child) {
        children.add(child);
    }
}