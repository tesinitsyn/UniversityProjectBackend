package com.example.UniversityProject.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Calendar;
import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Report {
    Date currentDateInstance = new Date();
    Calendar cal = Calendar.getInstance();

    int currentYearInstance;
    int currentMonthInstance = cal.get(Calendar.MONTH);

    private String instituteName;
    private String departmentName;
    private String practiceName;
    private String orderDate;
    private String orderName;
    private String sessionDate = (currentMonthInstance > 6 ? "зимняя" : "летняя");
    private String supervisorFN;
    private String currentYear = String.valueOf(currentYearInstance = cal.get(Calendar.YEAR));
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
