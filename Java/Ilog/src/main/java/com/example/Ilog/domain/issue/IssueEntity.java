package com.example.Ilog.domain.issue;

import lombok.AllArgsConstructor;
import lombok.Data;

/*
 Lombokのアノテーションの詳細は以下サイト参照
 https://projectlombok.org/features/
 構造ウィンドウ (「Alt + 7」)でコンストラクタとgetter/setterなどが自動生成されていることが確認できる
*/

@AllArgsConstructor
@Data
public class IssueEntity {
    private long id;
    private String summary;
    private  String description;
}
