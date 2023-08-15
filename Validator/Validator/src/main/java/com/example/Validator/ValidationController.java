package com.example.Validator;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.util.Arrays;

@RestController
public class ValidationController {

    // Endpoint para validar un registro
    @PostMapping("/validate")
    public boolean validateRecord(@RequestBody Record record) {
        boolean isValid = true;

        // Verifica si el archivo es de tipo CSV o Excel
        if (record.getFileType() == Record.FileType.CSV) {
            isValid = validateCSVRecord(record); // Realiza validaciones específicas para CSV
        } else if (record.getFileType() == Record.FileType.EXCEL) {
            isValid = validateExcelRecord(record); // Realiza validaciones específicas para Excel
        }

        return isValid;
    }

    // Valida un registro de tipo CSV
    private boolean validateCSVRecord(Record record) {
        // Valida el correo electrónico con una expresión regular
        boolean isValidEmail = record.getEmail().matches("^[A-Za-z0-9+_.-]+@(.+)$");

        // Valida la fecha de nacimiento
        boolean isValidDOB = record.getDob().isAfter(LocalDate.of(1980, 1, 1));

        // Valida el título del trabajo
        boolean isValidJobTitle = Arrays.asList("Haematologist", "Phytotherapist", "Building surveyor",
                        "Insurance account manager", "Educational psychologist")
                .contains(record.getJobTitle());

        // Retorna true si todas las validaciones son exitosas
        return isValidEmail && isValidDOB && isValidJobTitle;
    }

    // Valida un registro de tipo Excel
    private boolean validateExcelRecord(Record record) {
        // Valida la ubicación de la lesión
        boolean isValidInjuryLocation = !record.getInjuryLocation().equalsIgnoreCase("N/A");

        // Valida el tipo de reporte
        boolean isValidReportType = Arrays.asList("Near Miss", "Lost Time", "First Aid")
                .contains(record.getReportType());

        // Retorna true si todas las validaciones son exitosas
        return isValidInjuryLocation && isValidReportType;
    }
}


