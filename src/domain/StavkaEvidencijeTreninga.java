package domain;


import java.time.LocalDateTime;
import java.time.LocalTime;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Aleksa
 */
public class StavkaEvidencijeTreninga {
    private Long rb;
    private EvidencijaTreninga evidencijaTreninga;
    private Long ocena;
    private LocalTime vremeOd;
    private LocalTime vremeDo;
    private Long cena;
    private Termin termin;

    public StavkaEvidencijeTreninga() {
    }

    public StavkaEvidencijeTreninga(Long rb, EvidencijaTreninga evidencijaTreninga, Long ocena, LocalTime vremeOd, LocalTime vremeDo, Long cena, Termin termin) {
        this.rb = rb;
        this.evidencijaTreninga = evidencijaTreninga;
        this.ocena = ocena;
        this.vremeOd = vremeOd;
        this.vremeDo = vremeDo;
        this.cena = cena;
        this.termin = termin;
    }

    public Long getRb() {
        return rb;
    }

    public StavkaEvidencijeTreninga(Long rb, Long ocena, LocalTime vremeOd, LocalTime vremeDo, Long cena, Termin termin) {
        this.rb = rb;
        this.ocena = ocena;
        this.vremeOd = vremeOd;
        this.vremeDo = vremeDo;
        this.cena = cena;
        this.termin = termin;
    }

    public EvidencijaTreninga getEvidencijaTreninga() {
        return evidencijaTreninga;
    }

    public Long getOcena() {
        return ocena;
    }

    public LocalTime getVremeOd() {
        return vremeOd;
    }

    public LocalTime getVremeDo() {
        return vremeDo;
    }

    public Long getCena() {
        return cena;
    }

    public Termin getTermin() {
        return termin;
    }

    public void setRb(Long rb) {
        this.rb = rb;
    }

    public void setEvidencijaTreninga(EvidencijaTreninga evidencijaTreninga) {
        this.evidencijaTreninga = evidencijaTreninga;
    }

    public void setOcena(Long ocena) {
        this.ocena = ocena;
    }

    public void setVremeOd(LocalTime vremeOd) {
        this.vremeOd = vremeOd;
    }

    public void setVremeDo(LocalTime vremeDo) {
        this.vremeDo = vremeDo;
    }

    public void setCena(Long cena) {
        this.cena = cena;
    }

    public void setTermin(Termin termin) {
        this.termin = termin;
    }

    @Override
    public String toString() {
        return "StavkaEvidencijeTreninga{" + "rb=" + rb + ", evidencijaTreninga=" + evidencijaTreninga + ", ocena=" + ocena + ", vremeOd=" + vremeOd + ", vremeDo=" + vremeDo + ", cena=" + cena + ", termin=" + termin + '}';
    }
    
    
}
