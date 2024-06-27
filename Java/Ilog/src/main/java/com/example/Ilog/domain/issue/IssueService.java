package com.example.Ilog.domain.issue;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

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
    public IssueEntity findById(long id) {
        return this.issueRepository.findById(id);
    }

    // @Transactional ->　失敗した場合はロールバック、成功した場合はコミットしてくれる

    @Override
    @Transactional
    public void create(String summary, String description) {
        this.issueRepository.insert(summary, description);
    }
}
