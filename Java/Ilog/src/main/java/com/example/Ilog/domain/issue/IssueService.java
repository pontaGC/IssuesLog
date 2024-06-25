package com.example.Ilog.domain.issue;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
class IssueService implements IIssueService {

    private final IIssueRepository issueRepository;

    @Override
    public Iterable<IssueEntity> findAll(){
        return this.issueRepository.findAll();
    }

    @Override
    public void create(String summary, String description) {
        this.issueRepository.insert(summary, description);
    }
}
