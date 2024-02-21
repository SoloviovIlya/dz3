
package weather;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "Icon",
    "IconPhrase",
    "HasPrecipitation",
    "PrecipitationType",
    "PrecipitationIntensity"
})
public class Day {

    @JsonProperty("Icon")
    private Integer icon;
    @JsonProperty("IconPhrase")
    private String iconPhrase;
    @JsonProperty("HasPrecipitation")
    private Boolean hasPrecipitation;
    @JsonProperty("PrecipitationType")
    private String precipitationType;
    @JsonProperty("PrecipitationIntensity")
    private String precipitationIntensity;

    @JsonProperty("Icon")
    public Integer getIcon() {
        return icon;
    }

    @JsonProperty("Icon")
    public void setIcon(Integer icon) {
        this.icon = icon;
    }

    @JsonProperty("IconPhrase")
    public String getIconPhrase() {
        return iconPhrase;
    }

    @JsonProperty("IconPhrase")
    public void setIconPhrase(String iconPhrase) {
        this.iconPhrase = iconPhrase;
    }

    @JsonProperty("HasPrecipitation")
    public Boolean getHasPrecipitation() {
        return hasPrecipitation;
    }

    @JsonProperty("HasPrecipitation")
    public void setHasPrecipitation(Boolean hasPrecipitation) {
        this.hasPrecipitation = hasPrecipitation;
    }

    @JsonProperty("PrecipitationType")
    public String getPrecipitationType() {
        return precipitationType;
    }

    @JsonProperty("PrecipitationType")
    public void setPrecipitationType(String precipitationType) {
        this.precipitationType = precipitationType;
    }

    @JsonProperty("PrecipitationIntensity")
    public String getPrecipitationIntensity() {
        return precipitationIntensity;
    }

    @JsonProperty("PrecipitationIntensity")
    public void setPrecipitationIntensity(String precipitationIntensity) {
        this.precipitationIntensity = precipitationIntensity;
    }

}
