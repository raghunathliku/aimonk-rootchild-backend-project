package com.aimonk.RootChildTreeNodeApp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.aimonk.RootChildTreeNodeApp.entites.TreeNode;
import com.aimonk.RootChildTreeNodeApp.services.TreeNodeService;

@RestController
@RequestMapping("/api/tree")
@CrossOrigin("*")
public class TreeNodeController {

    @Autowired
    private TreeNodeService treeNodeService;

    @GetMapping
    public TreeNode getTree() {
        return treeNodeService.getTree();
    }

    @PostMapping
    public TreeNode saveTree(@RequestBody TreeNode treeNode) {
        return treeNodeService.saveTree(treeNode);
    }
}

