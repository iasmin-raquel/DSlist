package com.devsuperior.dslist.dto;

import com.devsuperior.dslist.entities.Game;
import lombok.Getter;

// anotation que gera os getters do código de maneira mais simples
@Getter
// vai utilizar as infomações necessárias da classe game para o estabelicimento de regras de negócios
public class GameMinDTO {
    private Long id;
    private String title;
    private Integer year;
    private String imgUrl;
    private String shortDescription;

    public GameMinDTO() {
    }

    public GameMinDTO(Game entity) {
        this.id = entity.getId();
        this.title = entity.getTitle();
        this.year = entity.getYear();
        this.imgUrl = entity.getImgUrl();
        this.shortDescription = entity.getShortDescription();
    }
}
