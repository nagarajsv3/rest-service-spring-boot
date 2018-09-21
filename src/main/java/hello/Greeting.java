package hello;

import lombok.Data;

@Data
public class Greeting {
    private Long id;
    private String message;

    public Greeting(Long id, String message) {
        this.id = id;
        this.message = message;
    }
}
