package br.com.Dio.BoardProject.dto;

public record BoardColumnInfoDto(
        Long id, int order, BoardColumnKindEnum kid) {
}
