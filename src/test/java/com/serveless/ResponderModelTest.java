package com.serveless;

import com.serverless.ResponderModel;
import org.assertj.core.api.Assertions;
import org.junit.Test;

public class ResponderModelTest {

    @Test
    public void answerWithQuestion() {
        ResponderModel responder = new ResponderModel();
        String pregunta = "1e78950: what is your name";
        String respuesta = responder.answer(pregunta);
        Assertions.assertThat(respuesta).isEqualTo("XtreamCoder");
    }

    @Test
    public void answerWithQuestionPlus() {
        ResponderModel responder = new ResponderModel();
        String pregunta = "6dff3ce0: what is 14 plus 2:";
        String respuesta = responder.answer(pregunta);
        Assertions.assertThat(respuesta).isEqualTo("14");
    }
}
