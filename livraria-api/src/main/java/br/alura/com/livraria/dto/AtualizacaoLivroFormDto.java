package br.alura.com.livraria.dto;


import javax.validation.constraints.NotNull;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class AtualizacaoLivroFormDto extends LivroFormDto {

    @NotNull
	private Long id;

}
