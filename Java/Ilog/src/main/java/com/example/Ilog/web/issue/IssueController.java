package com.example.Ilog.web.issue;

import com.example.Ilog.domain.issue.IIssueService;
import com.example.Ilog.domain.issue.IssueEntity;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

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
    public String create(@Validated IssueForm form, BindingResult bindingResult, Model model){
        if (bindingResult.hasErrors()){
            // 再入力をしてもらう
            return  this.showCreationForm(form);
        }
        this.issueService.create(form.getSummary(), form.getDescription());
        return "redirect:/issues";
    }

    // Get /issues/{issueId}
    @GetMapping("/{issueId}")
    public String showDetail(@PathVariable("issueId") long issueId, Model model){
        model.addAttribute("issue", this.issueService.findById((issueId)));
        return "issues/detail";
    }

}
