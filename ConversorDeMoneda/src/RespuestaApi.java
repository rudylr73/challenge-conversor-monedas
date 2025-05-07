import com.google.gson.annotations.SerializedName;

public class RespuestaApi {
    @SerializedName("conversion_rates")
    Convertor conversionRates;

    public Convertor getConversionRates(){
        return conversionRates;
    }
}
