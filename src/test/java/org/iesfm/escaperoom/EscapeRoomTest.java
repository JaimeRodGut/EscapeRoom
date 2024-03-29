package org.iesfm.escaperoom;

import org.junit.Assert;
import org.junit.Test;

import java.util.LinkedList;
import java.util.List;

public class EscapeRoomTest {


    @Test
    public void currentQuestionTest() {

        List<QuestionAnswer> questions = new LinkedList<>();
        QuestionAnswer question0 = new QuestionAnswer("Cual era el nombre del caballo de Don Quijote?", "Rocinante");
        QuestionAnswer question1 = new QuestionAnswer("Que tipo de animal es una araña?", "Aracnido");
        QuestionAnswer question2 = new QuestionAnswer("Cual es el nombre de nuestra estrella?", "Sol");
        QuestionAnswer question3 = new QuestionAnswer("Que va despues del cuatro?", null);
        QuestionAnswer question4 = new QuestionAnswer("Que representa la marca Apple?", null);


        questions.add(0, question0);
        questions.add(1, question1);
        questions.add(2, question2);
        questions.add(3, question3);
        questions.add(4, question4);

        int questionCounter = 3;

        EscapeRoom escapeRoom = new EscapeRoom("Ramiro", "Bienvenido Ramiro", questions, questionCounter);

        QuestionAnswer indexQuestion = escapeRoom.currentQuestion("Aracnido");

        QuestionAnswer expectedQuestion = new QuestionAnswer("Cual es el nombre de nuestra estrella?", "Sol");

        Assert.assertEquals(expectedQuestion,indexQuestion);




    }


}
