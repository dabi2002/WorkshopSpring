package com.example.Validator;

import java.time.LocalDate;

public class Record {

    // Enum para los tipos de archivo
    public enum FileType {
        CSV, EXCEL
    }

    private String email;
    private LocalDate dob;
    private String jobTitle;
    private String injuryLocation;
    private String reportType;
    private FileType fileType;

    // Constructor
    public Record() {
    }

    // Getters y setters
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public LocalDate getDob() {
        return dob;
    }

    public void setDob(LocalDate dob) {
        this.dob = dob;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public String getInjuryLocation() {
        return injuryLocation;
    }

    public void setInjuryLocation(String injuryLocation) {
        this.injuryLocation = injuryLocation;
    }

    public String getReportType() {
        return reportType;
    }

    public void setReportType(String reportType) {
        this.reportType = reportType;
    }

    public FileType getFileType() {
        return fileType;
    }

    public void setFileType(FileType fileType) {
        this.fileType = fileType;
    }

    // Otros getters y setters

    @Override
    public String toString() {
        return "Record{" +
                "email='" + email + '\'' +
                ", dob=" + dob +
                ", jobTitle='" + jobTitle + '\'' +
                '}';
    }
}
