package com.yago.cardapio.food;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.aspectj.weaver.GeneratedReferenceTypeDelegate;

@Table(name = "foods") // define o nome da tabela
@Entity(name = "foods")//define o nome da entidade
@Getter//gera todos os metodos Getters
@NoArgsConstructor//declara o constructor sem argumentos
@AllArgsConstructor//declara o constructor com todos os argumentos
@EqualsAndHashCode(of = "id")// indica que o id é representação unica

//Define as colunas id, title, image e price no bd
public class Food {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY) // define o id como chave primaria e é gerada automaticamente
    private long id;
    private String title;

    private String image;

    private Integer price;

    //
    public Food(FoodRequestDTO data){
        this.image = data.image();
        this.price = data.price();
        this.title = data.title();

    }

}
