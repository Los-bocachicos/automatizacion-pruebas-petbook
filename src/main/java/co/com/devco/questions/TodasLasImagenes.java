package co.com.devco.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class TodasLasImagenes implements Question<Boolean> {
    private String algo;

    public TodasLasImagenes(String algo){
        this.algo = algo;
    }

    public static TodasLasImagenes son(String algo){
        return new TodasLasImagenes(algo);
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        return true;
    }
}
