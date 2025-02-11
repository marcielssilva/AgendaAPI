import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Cliente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;
    private String telefone;
    
    @Enumerated(EnumType.STRING)
    private Procedimento procedimento;

    private LocalDateTime horario;
    private String email;
}

public enum Procedimento {
    CORTE, TRANCA, DREADLOCKS;
}


