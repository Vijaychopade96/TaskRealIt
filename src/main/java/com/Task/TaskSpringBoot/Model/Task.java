package com.Task.TaskSpringBoot.Model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Task {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(columnDefinition = "TEXT")
    private String jsonModel;

    public String toJson() {
        return this.jsonModel;
    }

    public void fromJson(String jsonModel) {
        this.jsonModel = jsonModel;
    }
}