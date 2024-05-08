package A3Unifacs.sd.UnifacsA3;

import A3Unifacs.sd.UnifacsA3.dtos.EstoqueDto;
import A3Unifacs.sd.UnifacsA3.model.Cliente;
import A3Unifacs.sd.UnifacsA3.model.Estoque;
import A3Unifacs.sd.UnifacsA3.model.Produto;
import A3Unifacs.sd.UnifacsA3.repositories.ClienteRepository;
import A3Unifacs.sd.UnifacsA3.repositories.EstoqueRepository;
import A3Unifacs.sd.UnifacsA3.repositories.ProdutoRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;




@SpringBootApplication
public class UnifacsA3Application {

	public static void main(String[] args) {
		SpringApplication.run(UnifacsA3Application.class, args);
	}

}
