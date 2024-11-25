package com.uade.adoo.mri;

import com.uade.adoo.mri.domain.entities.Hospital;

public class Main {
    public static void main(String[] args) {
        Hospital hospital = new Hospital();
        System.out.println(hospital.ingresarPaciente());
    }
}