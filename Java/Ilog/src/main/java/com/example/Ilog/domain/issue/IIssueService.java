package com.example.Ilog.domain.issue;

public interface IIssueService {
    Iterable<IssueEntity> findAll();

    void create(String summary, String description);
}
