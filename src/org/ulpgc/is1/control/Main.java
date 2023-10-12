package org.ulpgc.is1.control;

import org.ulpgc.is1.model.Contact;
import org.ulpgc.is1.model.Group;
import org.ulpgc.is1.model.Agenda;
import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {
        Agenda agenda = new Agenda();

        // Crear dos contactos en la agenda de tipo Person
        agenda.addPerson("John", "Doe", "123-456-7890", "john@example.com", "123 Main St", 1, 0, "City1");
        agenda.addPerson("Jane", "Smith", "987-654-3210", "jane@example.com", "456 Elm St", 2, 1, "City2");

        // Crear un grupo en la agenda
        Group trabajo = new Group("Trabajo");
        agenda.addGroup(trabajo);

        // Añadir el primer contacto creado al grupo "Trabajo"
        Contact contact1 = agenda.getContactList().get(0);
        trabajo.addContact(contact1);

        // Imprimir el número de contactos en la agenda
        System.out.println("Número de contactos en la agenda: " + agenda.getContactCount());

        // Imprimir el número de contactos en el grupo "Trabajo"
        System.out.println("Número de contactos en el grupo 'Trabajo': " + trabajo.getContactCount());

        // Borrar el primer contacto del grupo "Trabajo"
        trabajo.removeContact(contact1);

        // Volver a imprimir el número de contactos en el grupo "Trabajo"
        System.out.println("Número de contactos en el grupo 'Trabajo' después de eliminar un contacto: " + trabajo.getContactCount());
    }
}
