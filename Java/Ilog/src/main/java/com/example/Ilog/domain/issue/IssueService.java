package com.example.Ilog.domain.issue;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
class IssueService implements IIssueService {

    private final IIssueRepository issueRepository;

    public Iterable<IssueEntity> findAll(){
        return this.issueRepository.findAll();
    }
}
