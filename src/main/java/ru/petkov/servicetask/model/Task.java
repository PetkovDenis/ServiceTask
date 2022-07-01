package ru.petkov.servicetask.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "tasks")
@NoArgsConstructor
@Getter
@Setter
public class Task {
    @Id()
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;
    @Column(name = "name")
    private String name;
    @Column(name = "description")
    private String description;

    public Task(Long id,String name, String description) {
        this.name = name;
        this.description = description;
    }
}
