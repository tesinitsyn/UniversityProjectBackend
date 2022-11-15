package com.example.UniversityProject.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Report {
    Date currentYearInstance = new Date();

    private String instituteName;
    private String departmentName;
    private String practiceName;
    private String orderDate;
    private String orderName;
    //private String sessionDate = "hui";
    private String supervisorFN;
    private String currentYear = String.valueOf(currentYearInstance.getYear() + 1900);
    private String courseNum;
    private String groupName;
    private String practicePlaceAndTime;
    private String position;
    private String currentDate;
    private String headOfDFN;
    private String directionName;
    private String profileName;
    private String fileChooser;

}
