package com.Model;

import javax.persistence.*;
import javax.transaction.Transactional;

@Entity
@Table(name="marksstatistics")
public class MarkModel {

    @Id
    @GeneratedValue
    private int id;

    @Column(name="projectName")
    private String projectName;

    @Column(name="markMax")
    private float markMax;

    @Column(name="markMin")
    private float markMin;

    @Column(name = "markFinal")
    private float markFinal;

    public MarkModel() {
    }

    public MarkModel(String projectName, float markMax, float markMin, float markFinal) {
        this.projectName = projectName;
        this.markMax = markMax;
        this.markMin = markMin;
        this.markFinal = markFinal;
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public float getMarkMax() {
        return markMax;
    }

    public void setMarkMax(float markMax) {
        this.markMax = markMax;
    }

    public float getMarkMin() {
        return markMin;
    }

    public void setMarkMin(float markMin) {
        this.markMin = markMin;
    }

    public float getMarkFinal() {
        return markFinal;
    }

    public void setMarkFinal(float markFinal) {
        this.markFinal = markFinal;
    }

    @Transactional
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

}
