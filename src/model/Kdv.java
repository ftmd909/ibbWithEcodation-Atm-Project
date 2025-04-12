package model;

public class Kdv {
    private int id;
    private double tutar;
    private double oran;
    private String tarih;
    private String aciklama;
    private String fisNo;

    public Kdv() {}

    public Kdv(int id, double tutar, double oran, String tarih, String aciklama, String fisNo) {
        this.id = id;
        this.tutar = tutar;
        this.oran = oran;
        this.tarih = tarih;
        this.aciklama = aciklama;
        this.fisNo = fisNo;
    }

    public int getId() { return id; }
    public double getTutar() { return tutar; }
    public double getOran() { return oran; }
    public String getTarih() { return tarih; }
    public String getAciklama() { return aciklama; }
    public String getFisNo() { return fisNo; }

    public void setId(int id) { this.id = id; }
    public void setTutar(double tutar) { this.tutar = tutar; }
    public void setOran(double oran) { this.oran = oran; }
    public void setTarih(String tarih) { this.tarih = tarih; }
    public void setAciklama(String aciklama) { this.aciklama = aciklama; }
    public void setFisNo(String fisNo) { this.fisNo = fisNo; }
}
