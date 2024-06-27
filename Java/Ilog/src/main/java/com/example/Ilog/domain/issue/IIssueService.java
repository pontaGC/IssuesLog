package com.example.Ilog.domain.issue;

public interface IIssueService {
    Iterable<IssueEntity> findAll();

    IssueEntity findById(long id);

    void create(String summary, String description);
}
