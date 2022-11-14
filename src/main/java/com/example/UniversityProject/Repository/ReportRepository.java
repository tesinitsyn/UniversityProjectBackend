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
    public Report save(Report p){
        Report report = new Report();
        report.setInstituteName(p.getInstituteName());
        report.setDepartmentName(p.getDepartmentName());
        report.setPracticeName(p.getPracticeName());
        report.setOrderDate(p.getOrderDate());
        report.setOrderName(p.getOrderName());
        report.setSessionDate(p.getSessionDate());
        report.setSupervisorFN(p.getSupervisorFN());
        report.setCurrentYear(p.getCurrentYear());
        report.setCourseNum(p.getCourseNum());
        report.setGroupName(p.getGroupName());
        report.setPracticePlaceAndTime(p.getPracticePlaceAndTime());
        report.setPosition(p.getPosition());
        report.setCurrentDate(p.getCurrentDate());
        report.setHeadOfDFN(p.getHeadOfDFN());
        report.setDirectionName(p.getDirectionName());
        report.setProfileName(p.getProfileName());
        report.setPathToExcel(p.getPathToExcel());
        list.add(report);
        return report;
    }
}
