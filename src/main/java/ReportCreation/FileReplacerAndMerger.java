package ReportCreation;

import com.example.UniversityProject.Entity.Report;
import com.spire.doc.Document;
import com.spire.doc.FileFormat;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class FileReplacerAndMerger {
    //change path
    final static String  pathToTitleList = "src/main/resources/WordAndExcelFiles/TitleLists.docx";

    public static void fileReplacerAndMerger(Report report) throws IOException {
        List<String> students = ExcelParsing.pushToArrayList(report.getFileChooser());
                //"src/main/resources/WordAndExcelFiles/Пример таблицы.xlsx");

        ArrayList<String> replaceableNames = new ArrayList<>(){{
            add("studentFullName");
            add("studentFN");
            add("instituteName");
            add("departmentName");
            add("practiceName");
            add("orderDate");
            add("orderName");
            add("sessionDate");
            add("supervisorFN");
            add("currentYear");
            add("courseNum");
            add("groupName");
            add("practicePlaceAndTime");
            add("position");
            add("currentDate");
            add("headOfDFN");
            add("directionName");
            add("profileName");
        }};
        //change path
        String inputPath = "src/main/resources/WordAndExcelFiles/mainWordFile.docx";
        String outputPath = "src/main/resources/WordAndExcelFiles/fileForTesting.docx";
        DocumentBuilder.clearDoc(pathToTitleList);
        for (String studentName: students) {
            Template template = new Template(replaceableNames, studentName);
            for (String replaceableName : replaceableNames) {
                switch (replaceableName) {
                    case "instituteName" -> template.setField("instituteName", report.getInstituteName());//objUpdateWord.updateDocument(inputPath, outputPath, "${instituteName}", (String) instituteName.getValue());
                    case "departmentName" -> template.setField("departmentName",report.getDepartmentName());//objUpdateWord.updateDocument(inputPath, outputPath, "${departmentName}", (String) departmentName.getValue());
                    case "practiceName" -> template.setField("practiceName",report.getPracticeName());//objUpdateWord.updateDocument(inputPath, outputPath, "${practiceName}", (String) practiceName.getValue());
                    case "orderDate" -> template.setField("orderDate",report.getOrderDate());//objUpdateWord.updateDocument(inputPath, outputPath, "${orderDate}", String.valueOf(orderDate.getValue()));
                    case "orderName" -> template.setField("orderName", report.getOrderName());//objUpdateWord.updateDocument(inputPath, outputPath, "${orderName}", orderName.getText());
                    case "sessionDate" -> template.setField("sessionDate",report.getSessionDate());//objUpdateWord.updateDocument(inputPath, outputPath, "${sessionDate}", String.valueOf(sessionDate.getValue()));
                    case "supervisorFN" -> template.setField("supervisorFN",report.getSupervisorFN());//objUpdateWord.updateDocument(inputPath, outputPath, "${supervisorFN}", supervisorFN.getText());
                    case "currentYear" -> template.setField("currentYear",report.getCurrentYear());//objUpdateWord.updateDocument(inputPath, outputPath, "${currentYear}", String.valueOf(currentYear));
                    case "courseNum" -> template.setField("courseNum",report.getCourseNum());//objUpdateWord.updateDocument(inputPath, outputPath, "${courseNum}", (String) courseNum.getValue());
                    case "groupName" -> template.setField("groupName", report.getGroupName());//objUpdateWord.updateDocument(inputPath, outputPath, "${groupName}", groupName.getText());
                    case "practicePlaceAndTime" -> template.setField("practicePlaceAndTime",report.getPracticePlaceAndTime());//objUpdateWord.updateDocument(inputPath, outputPath, "${practicePlaceAndTime}", practicePlaceAndTime.getText());
                    case "position" -> template.setField("position",report.getPosition());//objUpdateWord.updateDocument(inputPath, outputPath, "${position}", position.getText());
                    case "currentDate" -> template.setField("currentDate",report.getCurrentDate());//objUpdateWord.updateDocument(inputPath, outputPath, "${currentDate}", String.valueOf(currentDate.getValue()));
                    case "headOfDFN" -> template.setField("headOfDFN",report.getHeadOfDFN()); //objUpdateWord.updateDocument(inputPath, outputPath, "${headOfDFN}", headOfDFN.getText());
                    case "directionName" -> template.setField("directionName", report.getDirectionName());//objUpdateWord.updateDocument(inputPath, outputPath, "${directionName}", (String) directionName.getValue());
                    case "profileName" -> template.setField("profileName", report.getProfileName());//objUpdateWord.updateDocument(inputPath, outputPath, "${profileName}", profileName.getText());
                    default -> {
                    }
                }
            }
            template.createMap();

            DocumentBuilder documentBuilder = new DocumentBuilder(template, outputPath, inputPath);
            documentBuilder.buildDoc();
            documentBuilder.saveDoc();
            Document document = new Document(pathToTitleList);
            document.insertTextFromFile(outputPath, FileFormat.Docx_2013);
            document.saveToFile(pathToTitleList, FileFormat.Docx_2013);
            DocumentBuilder.clearDoc(outputPath);
        }
        DocumentBuilder.deleteWM(pathToTitleList,"Evaluation Warning: The document was created with Spire.Doc for JAVA.");
        ResultPusher.pushFile(pathToTitleList);
    }
}
