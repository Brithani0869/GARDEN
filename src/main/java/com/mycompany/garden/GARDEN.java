/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.garden;

/**
 *
 * @author Brith
 */
public class GARDEN {

    public static void main(String[] args) {
       try {
        // Ejecuta esto ANTES de cualquier otra cosa
        com.formdev.flatlaf.FlatLightLaf.setup();
    } catch( Exception ex ) {
        System.err.println( "Error al iniciar FlatLaf: " + ex.getMessage() );
    }

    java.awt.EventQueue.invokeLater(() -> {
        new LOGIN().setVisible(true);
    });
    }
}
