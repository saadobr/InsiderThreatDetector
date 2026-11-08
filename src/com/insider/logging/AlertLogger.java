package com.insider.logging;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class AlertLogger {

    private static final DateTimeFormatter FORMATTER = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

    // Méthode pour afficher une alerte formatée dans la console
    public static void logAlert(String employeeId, String severity, String message) {
        String timestamp = LocalDateTime.now().format(FORMATTER);
        
        // Affichage stylisé type SOC / Cybersécurité
        System.out.println("[" + timestamp + "] [" + severity.toUpperCase() + "] [EMP:" + employeeId + "] " + message);
    }
}