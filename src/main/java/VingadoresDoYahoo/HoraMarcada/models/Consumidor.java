package VingadoresDoYahoo.HoraMarcada.models;

import javax.persistence.*;
//import VingadoresDoYahoo.HoraMarcada.models.*;
//import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@Entity
@Table(name = "Consumidor")
public class Consumidor {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String endereco;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "usuario_id", referencedColumnName = "id")
    private Usuario usuario;





    public Consumidor() {}
    
    public Consumidor(String endereco, Usuario usuario) {
        this.endereco = endereco;
        this.usuario = usuario;
    }

    public String getEndereco() {
        return this.endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public Usuario getUsuario() {
		return this.usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

    @Override
    public String toString() {
        return "Consumidor [endereco=" + endereco + ", id=" + id + ", usuario=" + usuario + "]";
    }
    
}