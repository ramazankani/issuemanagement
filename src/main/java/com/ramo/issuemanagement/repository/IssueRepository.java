package com.ramo.issuemanagement.repository;

import com.ramo.issuemanagement.entity.Issue;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by Ramazan Kani on 07.09.2020
 */

public interface IssueRepository extends JpaRepository<Issue,Long> {
}
