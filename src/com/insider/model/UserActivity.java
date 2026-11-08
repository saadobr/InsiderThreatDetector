package com.insider.model;

import java.time.LocalDateTime;

public class UserActivity {
    private String employeeId;
    private String actionType; // Ex: LOGIN, FILE_COPY, SENSITIVE_ACCESS
    private double dataVolumeMb; // Volume de données en Mo
    private LocalDateTime timestamp;

    // Constructeur
    public UserActivity(String employeeId, String actionType, double dataVolumeMb, LocalDateTime timestamp) {
        this.employeeId = employeeId;
        this.actionType = actionType;
        this.dataVolumeMb = dataVolumeMb;
        this.timestamp = timestamp;
    }

    // Getters et Setters
    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public String getActionType() {
        return actionType;
    }

    public void setActionType(String actionType) {
        this.actionType = actionType;
    }

    public double getDataVolumeMb() {
        return dataVolumeMb;
    }

    public void setDataVolumeMb(double dataVolumeMb) {
        this.dataVolumeMb = dataVolumeMb;
    }

    public LocalDateTime getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(LocalDateTime timestamp) {
        this.timestamp = timestamp;
    }

    @Override
    public String toString() {
        return "UserActivity [Emp=" + employeeId + 
               ", Action=" + actionType + 
               ", Volume=" + dataVolumeMb + "MB, Time=" + timestamp + "]";
    }
}