package com.example.Ilog.domain.issue;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
class IssueService implements IIssueService {

    public Iterable<IssueEntity> findAll(){
        return List.of(
                new IssueEntity(1, "概要1", "説明1"),
                new IssueEntity(2, "概要2", "説明2"),
                new IssueEntity(3, "概要3", "説明3")
        );
    }
}
