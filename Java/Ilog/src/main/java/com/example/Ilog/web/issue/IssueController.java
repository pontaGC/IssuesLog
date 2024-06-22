package com.example.Ilog.web.issue;

import com.example.Ilog.domain.issue.IIssueService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
@RequiredArgsConstructor
public class IssueController {

    private  final IIssueService issueService;

    @GetMapping("/issues")
    public  String showList(Model model){
        model.addAttribute("issueList", this.issueService.findAll());
        return "issues/list";
    }
}
