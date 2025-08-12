package br.com.Dio.BoardProject.dto;

import java.util.List;

public record BoardDetailsDTO( Long id, String name, List<BoardColumnDTO columns>) {
}
