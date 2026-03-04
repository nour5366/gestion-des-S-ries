package com.nour.series.entites;

import java.util.List;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Pays {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long codePays;

    private String nomPays;

    private String continent;

    @JsonIgnore
    @OneToMany(mappedBy = "pays")
    private List<Series> series;

    public Pays() {
        super();
    }

    public Pays(String nomPays, String continent, List<Series> series) {
        super();
        this.nomPays = nomPays;
        this.continent = continent;
        this.series = series;
    }

    public Long getCodePays() {
        return codePays;
    }

    public void setCodePays(Long codePays) {
        this.codePays = codePays;
    }

    public String getNomPays() {
        return nomPays;
    }

    public void setNomPays(String nomPays) {
        this.nomPays = nomPays;
    }

    public String getContinent() {
        return continent;
    }

    public void setContinent(String continent) {
        this.continent = continent;
    }

    public List<Series> getSeries() {
        return series;
    }

    public void setSeries(List<Series> series) {
        this.series = series;
    }
}
