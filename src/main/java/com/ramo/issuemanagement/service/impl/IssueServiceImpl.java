package com.ramo.issuemanagement.service.impl;

import com.ramo.issuemanagement.dto.IssueDto;
import com.ramo.issuemanagement.entity.Issue;
import com.ramo.issuemanagement.repository.IssueRepository;
import com.ramo.issuemanagement.service.IssueService;
import com.ramo.issuemanagement.util.TPage;
import org.modelmapper.ModelMapper;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;

@Service
//@RequiredArgsConstructor
public class IssueServiceImpl implements IssueService {

    private final IssueRepository issueRepository;
    private final ModelMapper modelMapper;

    public IssueServiceImpl(IssueRepository issueRepository, ModelMapper modelMapper) {
        this.issueRepository = issueRepository;
        this.modelMapper = modelMapper;
    }

    @Override
    public IssueDto save(IssueDto issueDto) {
        if(issueDto.getDate()==null)
        {
            throw new IllegalArgumentException("Issue date cannot be null");
        }
        Issue issue = modelMapper.map(issueDto, Issue.class);
        issue = issueRepository.save(issue);
        return modelMapper.map(issue,IssueDto.class);
    }

    @Override
    public IssueDto getById(Long id) {
        return null;
    }

    @Override
    public TPage<IssueDto> getAllPageable(Pageable pageable) {
        Page<Issue> data = issueRepository.findAll(pageable);
        TPage page = new TPage<IssueDto>();
        IssueDto[] dtos = modelMapper.map(data.getContent(),IssueDto[].class);
        page.setStat(data, Arrays.asList(dtos));
        return page;
    }

    @Override
    public Boolean delete(IssueDto issueDto) {
        return null;
    }
}
