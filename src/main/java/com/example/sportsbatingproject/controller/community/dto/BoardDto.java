package com.example.sportsbatingproject.controller.community.dto;

import com.example.sportsbatingproject.repository.community.entity.Board;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class BoardDto {
    private Long id;
    private String title;
    private String content;
    private Long hit;

    public BoardDto(Board board) {
        this.id = Long.valueOf(board.getId());
        this.title = board.getTitle();
        this.content = board.getContent();
        this.hit = board.getHit();
    }
}