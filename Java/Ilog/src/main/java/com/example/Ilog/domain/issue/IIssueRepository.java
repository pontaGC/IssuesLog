package com.example.Ilog.domain.issue;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

//@MapperはMy Batis Frameworkを介してDBに接続できる
@Mapper
public interface IIssueRepository {

    // 戻り値の型がIterable<T>の場合、DBデータ取得に失敗した
    @Select("select * from issues")
    List<IssueEntity> findAll();

    // #{}はメソッド引数と対応
    @Insert("insert into issues (summary, description) values (#{summary}, #{description})")
    void insert(String summary, String description);
}
