package br.com.Dio.BoardProject.dto;

import br.com.Dio.BoardProject.persistence.entity.BoardColumnKindEnum;

public record BoardColumnDTO(
        Long id,
        String name,
        BoardColumnKindEnum kind,
        int cardsAmount)
){
}
