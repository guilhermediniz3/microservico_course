package com.ead.course.models;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;


import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.UUID;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
@Entity
@Table(name="TB_MODULES")
public class ModuleModel implements Serializable {

    private  static final Long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID moduleId;
    @Column(nullable=false,length=150)
    private String title;
    @Column(nullable=false,length=250)
    private String description;
    @Column(nullable=false)
    @JsonFormat(shape = JsonFormat.Shape.STRING,pattern = "dd-MM-YYYY HH:mm:ss")
    private LocalDateTime creationDate;
}
