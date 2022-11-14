package com.example.UniversityProject.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Report {
    private String instituteName;
    private String departmentName;
    private String practiceName;
    private String orderDate;
    private String orderName;
    private String sessionDate;
    private String supervisorFN;
    private String currentYear;
    private String courseNum;
    private String groupName;
    private String practicePlaceAndTime;
    private String position;
    private String currentDate;
    private String headOfDFN;
    private String directionName;
    private String profileName;
    private String pathToExcel;

}
