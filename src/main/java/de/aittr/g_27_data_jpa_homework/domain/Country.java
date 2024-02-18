package de.aittr.g_27_data_jpa_homework.domain;

import jakarta.persistence.*;

import java.util.Objects;

@Entity
@Table(name = "country")
public class Country {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;
    @Column(name = "name")
    private String name;
    @Column(name = "capital")
    private String capital;
    @Column(name = "language")
    private String language;
    @Column(name = "currency_code")
    private int currencyCode;

    public Country() {
    }

    public Country(int id, String name, String capital, String language, int currencyCode) {
        this.id = id;
        this.name = name;
        this.capital = capital;
        this.language = language;
        this.currencyCode = currencyCode;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCapital() {
        return capital;
    }

    public void setCapital(String capital) {
        this.capital = capital;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public int getCurrencyCode() {
        return currencyCode;
    }

    public void setCurrencyCode(int currencyCode) {
        this.currencyCode = currencyCode;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Country country = (Country) o;
        return id == country.id && currencyCode == country.currencyCode && Objects.equals(name, country.name)
                && Objects.equals(capital, country.capital) && Objects.equals(language, country.language);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, capital, language, currencyCode);
    }

    @Override
    public String toString() {
        return "Country{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", capital='" + capital + '\'' +
                ", language='" + language + '\'' +
                ", currencyCode=" + currencyCode +
                '}';
    }
}