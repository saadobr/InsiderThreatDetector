package com.insider.cli;

import com.insider.logging.AlertLogger;
import com.insider.model.UserActivity;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<UserActivity> activities = new ArrayList<>();

        // Simulation de données initiales pour le test
        activities.add(new UserActivity("EMP001", "LOGIN", 0.0, LocalDateTime.now().minusHours(2)));
        activities.add(new UserActivity("EMP002", "FILE_COPY", 450.5, LocalDateTime.now().minusMinutes(30)));

        boolean running = true;
        System.out.println("==================================================");
        System.out.println("   BIENVENUE SUR L'OUTIL INSIDER THREAT DETECTOR  ");
        System.out.println("   [Module Cyber & Core - Saad]                  ");
        System.out.println("==================================================");

        while (running) {
            System.out.println("\n--- MENU PRINCIPAL ---");
            System.out.println("1. Afficher les activités enregistrées");
            System.out.println("2. Simuler une alerte de sécurité test");
            System.out.println("3. Quitter");
            System.out.print("Choisissez une option : ");

            int choice = -1;
            if (scanner.hasNextInt()) {
                choice = scanner.nextInt();
            } else {
                scanner.next(); // Vider le buffer en cas de saisie invalide
            }

            switch (choice) {
                case 1:
                    System.out.println("\n[INFO] Liste des activités en mémoire :");
                    if (activities.isEmpty()) {
                        System.out.println("Aucune activité enregistrée.");
                    } else {
                        for (UserActivity act : activities) {
                            System.out.println(" -> " + act);
                        }
                    }
                    break;

                case 2:
                    // Test du Logger d'alertes SOC
                    AlertLogger.logAlert("EMP002", "CRITICAL", "Volume de données suspect copié (450.5 Mo en dehors des heures de bureau).");
                    break;

                case 3:
                    running = false;
                    System.out.println("\n[INFO] Fermeture de l'application. À bientôt !");
                    break;

                default:
                    System.out.println("\n[ERREUR] Option invalide. Veuillez réessayer.");
            }
        }
        scanner.close();
    }
}