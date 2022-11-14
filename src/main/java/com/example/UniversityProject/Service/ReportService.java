package com.example.UniversityProject.Service;

import com.example.UniversityProject.Entity.Report;
import com.example.UniversityProject.Repository.ReportRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReportService {

    @Autowired
    private ReportRepository repository;

    public Report saveReport(Report report){
        return repository.save(report);
    }

    public List<Report> getReport(){
        return repository.getAllReports();
    }
}
