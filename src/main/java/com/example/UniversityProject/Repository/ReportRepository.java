package com.example.UniversityProject.Repository;

import com.example.UniversityProject.Entity.Report;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class ReportRepository {
    private List<Report> list = new ArrayList<Report>();


    public void createReport(){
        list = List.of();
    }

    public List<Report> getAllReports(){
        return list;
    }
    public Report save(Report newReport){
        list.add(newReport);

        return newReport;
    }
}
