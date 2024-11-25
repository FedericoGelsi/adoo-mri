package com.uade.adoo.mri.domain.entities;

import org.junit.jupiter.api.Test;

public class HospitalTest {

    @Test
    void testIngresarPaciente() {
        // Arrange
        String expected = "Paciente ingresado";
        Hospital hospital = new Hospital();

        // Act
        String actual = hospital.ingresarPaciente();

        // Assert
        assert actual.equals(expected);
    }
}
