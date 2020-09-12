package com.ramo.issuemanagement.repository;

import com.ramo.issuemanagement.entity.IssueHistory;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by Ramazan Kani on 07.09.2020
 */

public interface IssueHistoryRepository extends JpaRepository<IssueHistory,Long> {
}
