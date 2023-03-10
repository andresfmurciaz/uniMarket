package co.edu.uniquindio.proyecto.entidades;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;

@Entity
@Getter
@Setter
@EqualsAndHashCode
@NoArgsConstructor
@ToString
public class Usuario implements Serializable
{
        @Id
        //autoinclementable
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Integer codigo;
        private String nombre;
        private String email;
        private String password;

}
