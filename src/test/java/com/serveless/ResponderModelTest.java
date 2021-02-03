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
}
