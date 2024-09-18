package com.einstein.ToDoList.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "tasks")
public class ToDoEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "title", nullable = false, unique = true)
    private String title;

    @Column(name = "content", nullable = false)
    private String content;

    @Column(name = "finished", nullable = false)
    private boolean finished;

    public ToDoEntity() {}

    public ToDoEntity(Long id, String title, String content, boolean finished) {
        this.id = id;
        this.title = title;
        this.content = content;
        this.finished = finished;
    }
}
