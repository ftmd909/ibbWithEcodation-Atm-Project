package dto;

public class KdvDTO {
    private double tutar;
    private double oran;

    public KdvDTO(double tutar, double oran) {
        this.tutar = tutar;
        this.oran = oran;
    }

    public double getTutar() { return tutar; }
    public double getOran() { return oran; }

    public void setTutar(double tutar) { this.tutar = tutar; }
    public void setOran(double oran) { this.oran = oran; }
}
