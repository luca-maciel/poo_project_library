
import java.time.LocalDate;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Teste {
    public static void main(String[] args) {

        Emprestimo e1 = new Emprestimo(
                "A Hipotese do Amor",
                1,
                "Maria do Carmo",
                LocalDate.now(),
                LocalDate.now().plusDays(14),
                false
        );


        e1.status();
    }
}