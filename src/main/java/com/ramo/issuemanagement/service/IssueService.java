package com.ramo.issuemanagement.service;

import com.ramo.issuemanagement.dto.IssueDto;
import com.ramo.issuemanagement.entity.Issue;
import com.ramo.issuemanagement.util.TPage;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface IssueService {

    IssueDto save(IssueDto issueDto);
    IssueDto getById(Long id);
    TPage<IssueDto> getAllPageable(Pageable pageable);
    Boolean delete(IssueDto issueDto);
}
