package rest;

/**
 * Created by Asia on 2016-04-27.
 */
public class SpecialGreeting extends Greeting {

    private String wishes;
    public SpecialGreeting(long id, String content, String wishes) {
        super(id, content);
        this.wishes  = wishes;


    }

    public String getWishes() {
        return wishes;
    }

    public void setWishes(String wishes) {
        this.wishes = wishes;
    }
}
