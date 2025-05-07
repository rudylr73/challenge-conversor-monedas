import com.google.gson.annotations.SerializedName;

public class Convertor {
    @SerializedName("ARS")
    double pesoArgentino;
    @SerializedName("DLS")
    double dolar;
    @SerializedName("COP")
    double pesoColombiano;
    @SerializedName("BRL")
    double realBrasileño;

    public double getPesoArgentino() {
        return pesoArgentino;
    }

    public double getDolar() {
        return dolar;
    }

    public double getReal() {
        return realBrasileño;
    }

    public double getPesoColombiano() {
        return pesoColombiano;
    }
}
