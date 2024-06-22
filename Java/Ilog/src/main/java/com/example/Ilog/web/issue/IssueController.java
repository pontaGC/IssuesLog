package com.example.Ilog.web.issue;

import com.example.Ilog.domain.issue.IssueService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class IssueController {

    private  final IssueService issueService = new IssueService();

    @GetMapping("/issues")
    public  String showList(Model model){
        model.addAttribute("issueList", this.issueService.findAll());
        return "issues/list";
    }
}
