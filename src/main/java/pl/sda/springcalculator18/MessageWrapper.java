package pl.sda.springcalculator18;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class MessageWrapper {

    @Id
    @GeneratedValue
    private Integer id;

    private String inputText;

    public MessageWrapper(String inputText) {
        this.inputText = inputText;
    }
}
