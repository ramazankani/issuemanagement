package com.ramo.issuemanagement.repository;

import com.ramo.issuemanagement.entity.Project;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * Created by Ramazan Kani on 07.09.2020
 */

public interface ProjectRepository extends JpaRepository<Project,Long> {
    List<Project> getByProjectCode(String projectCode);
    List<Project> getByProjectCodeContains(String projectCode);
    Page<Project> findAll(Pageable pageable);
    List<Project> findAll(Sort sort);
}
