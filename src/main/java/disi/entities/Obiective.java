package disi.entities;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import net.bytebuddy.asm.Advice;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;


@Entity
@Data
@AllArgsConstructor

@NoArgsConstructor

@Table(name = "obiective")
public class Obiective implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(columnDefinition = "serial")
    private int id;

    @Column(name = "numeObiectiv", nullable = false)
    private String nume_obiectiv;

    @Column(name = "descriereText")
    private String descriere_text;

    @Column(name = "descriereAudio")
    private String descriere_audio;


    @Column(name = "pretIntrare")
    private Double pret_intrare;

    @Column(name = "locatie", nullable = false)
    private String locatie;

    @Column(name = "categorie", nullable = false)
    private String categorie;

    @OneToMany(mappedBy = "obiective")
    private List<Wishlist> wishlist;


    @OneToMany(mappedBy="obiective",
            cascade= CascadeType.MERGE)
    private List<Vizita> vizite;

    @OneToMany(mappedBy="obiective",
            cascade= CascadeType.MERGE)
    private List<Oferte> oferte;

    @OneToMany(mappedBy="obiective",
            cascade= CascadeType.MERGE)
    private List<Comentariu> comentarii;


    public Obiective(String nume_obiectiv, String descriere_text, String descriere_audio, Double pret_intrare, String locatie, String categorie) {
        this.nume_obiectiv=nume_obiectiv;
        this.descriere_text=descriere_text;
        this.descriere_audio=descriere_audio;
        this.pret_intrare=pret_intrare;
        this.locatie=locatie;
        this.categorie=categorie;
    }
    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNume_obiectiv() {
        return nume_obiectiv;
    }

    public void setNume_obiectiv(String nume_obiectiv) {
        this.nume_obiectiv = nume_obiectiv;
    }

    public String getDescriere_text() {
        return descriere_text;
    }

    public void setDescriere_text(String descriere_text) {
        this.descriere_text = descriere_text;
    }

    public String getDescriere_audio() {
        return descriere_audio;
    }

    public void setDescriere_audio(String descriere_audio) {
        this.descriere_audio = descriere_audio;
    }

    public Double getPret_intrare() {
        return pret_intrare;
    }

    public void setPret_intrare(Double pret_intrare) {
        this.pret_intrare = pret_intrare;
    }

    public String getLocatie() {
        return locatie;
    }

    public void setLocatie(String locatie) {
        this.locatie = locatie;
    }

    public String getCategorie() {
        return categorie;
    }

    public void setCategorie(String categorie) {
        this.categorie = categorie;
    }

    public List<Wishlist> getWishlist() {
        return wishlist;
    }

    public void setWishlist(List<Wishlist> wishlist) {
        this.wishlist = wishlist;
    }

    public List<Vizita> getVizite() {
        return vizite;
    }

    public void setVizite(List<Vizita> vizite) {
        this.vizite = vizite;
    }

    public List<Oferte> getOferte() {
        return oferte;
    }

    public void setOferte(List<Oferte> oferte) {
        this.oferte = oferte;
    }

    public List<Comentariu> getComentarii() {
        return comentarii;
    }

    public void setComentarii(List<Comentariu> comentarii) {
        this.comentarii = comentarii;
    }
}