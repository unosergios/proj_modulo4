package br.alura.com.livraria.dto;

import java.time.LocalDate;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.PastOrPresent;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class LivroFormDto {

	@NotNull
	@Size(min = 10)
	private String titulo;

	@NotNull
	@PastOrPresent
	@JsonFormat(pattern="dd/MM/yyyy")
	private LocalDate dataDeLancamento;

	@Min(value=100 , message ="Quantidade de paginas de ser no minimo {value}")
	private int numeroDePaginas;

	@JsonAlias("autor_id")
	private Long autorId;
	


}
