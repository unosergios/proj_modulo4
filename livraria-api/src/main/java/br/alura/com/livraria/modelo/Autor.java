package br.alura.com.livraria.modelo;
	
import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter @Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="autores")
public class Autor {

	    @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;
		private String nome;
		private String email;
		private LocalDate dataNascimento;
		private String miniCurriculum;
		
		
		public Autor(String nome, String email, LocalDate dataNascimento, String miniCurriculum) {
			this.nome = nome;
			this.email = email;
			this.dataNascimento = dataNascimento;
			this.miniCurriculum = miniCurriculum;
		}


		public void atualizarInformacoesDoAutor(String nome, String email, LocalDate dataNascimento,
				String miniCurriculum) {
			this.nome = nome;
			this.email = email;
			this.dataNascimento = dataNascimento;
			this.miniCurriculum = miniCurriculum;

			
		}


}
