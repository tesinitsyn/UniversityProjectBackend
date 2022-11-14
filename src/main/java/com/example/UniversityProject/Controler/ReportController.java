package com.example.UniversityProject.Controler;

import com.example.UniversityProject.Entity.Report;
import com.example.UniversityProject.Service.ReportService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/api/test")
public class ReportController {

    @Autowired
    private ReportService service;

    public Report addReport(@RequestBody Report report){
        return service.saveReport(report);
    }

    @GetMapping
    public List<Report> findAllReports(){
        return service.getReport();
    }

}