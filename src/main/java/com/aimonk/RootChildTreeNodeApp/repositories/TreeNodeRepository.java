package com.aimonk.RootChildTreeNodeApp.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.aimonk.RootChildTreeNodeApp.entites.TreeNode;

public interface TreeNodeRepository extends JpaRepository<TreeNode, Long> {
    // Custom queries if needed
}
