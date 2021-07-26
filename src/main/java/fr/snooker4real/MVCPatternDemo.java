package fr.snooker4real;

import fr.snooker4real.controller.StudentController;
import fr.snooker4real.model.Student;
import fr.snooker4real.view.StudentView;

public class MVCPatternDemo {
    public static void main(String[] args) {
        //récupérer le dossier de l'étudiant en fonction de son numéro de rôle dans la base de donnée
        Student model = retriveStudentFromDatabase();

        // Cree une vue : pour écrire les détails sur la console
        StudentView view = new StudentView();

        StudentController controller = new StudentController(model, view);

        controller.updateView();

        // Mise à jour du model de BDD
        controller.setStudentName("Jonathan");
        controller.updateView();
    }

    private static Student retriveStudentFromDatabase() {
        Student student = new Student();
        student.setName("Robert");
        student.setRollNo("1");
        return student;
    }
}