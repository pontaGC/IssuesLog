package com.example.Ilog.web.issue;

import com.example.Ilog.domain.issue.IIssueService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

//@RequestMappingは共通のパスを定義

@Controller
@RequestMapping("/issues")
@RequiredArgsConstructor
public class IssueController {

    private  final IIssueService issueService;

    @GetMapping
    public  String showList(Model model){
        model.addAttribute("issueList", this.issueService.findAll());
        return "issues/list";
    }

    // @ModelAttribute -> SFkが自動でmodelにIssueFormを追加 (model.addAttribute("issueForm, new IssueForm())と同意)

    @GetMapping("/creationForm")
    public  String showCreationForm(@ModelAttribute IssueForm form){
        return "issues/creationForm";
    }

    // POST /issues
    @PostMapping
    public String create(IssueForm form, Model model){
        // TODO: リロードボタンん対策
        // TODO: データの永続化
        return this.showList(model);
    }
}
