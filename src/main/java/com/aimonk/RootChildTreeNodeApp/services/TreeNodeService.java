package com.aimonk.RootChildTreeNodeApp.services;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aimonk.RootChildTreeNodeApp.entites.TreeNode;
import com.aimonk.RootChildTreeNodeApp.repositories.TreeNodeRepository;

@Service
public class TreeNodeService {

    @Autowired
    private TreeNodeRepository treeNodeRepository;

    public TreeNode getTree() {
        return treeNodeRepository.findById(1L).orElse(null); 
    }

    public TreeNode saveTree(TreeNode treeNode) {
        return treeNodeRepository.save(treeNode);
    }
}
