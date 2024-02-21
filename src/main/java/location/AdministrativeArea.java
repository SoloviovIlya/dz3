
package location;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "ID",
    "LocalizedName",
    "EnglishName",
    "Level",
    "LocalizedType",
    "EnglishType",
    "CountryID"
})
public class AdministrativeArea {

    @JsonProperty("ID")
    private String id;
    @JsonProperty("LocalizedName")
    private String localizedName;
    @JsonProperty("EnglishName")
    private String englishName;
    @JsonProperty("Level")
    private Integer level;
    @JsonProperty("LocalizedType")
    private String localizedType;
    @JsonProperty("EnglishType")
    private String englishType;
    @JsonProperty("CountryID")
    private String countryID;

    @JsonProperty("ID")
    public String getId() {
        return id;
    }

    @JsonProperty("ID")
    public void setId(String id) {
        this.id = id;
    }

    @JsonProperty("LocalizedName")
    public String getLocalizedName() {
        return localizedName;
    }

    @JsonProperty("LocalizedName")
    public void setLocalizedName(String localizedName) {
        this.localizedName = localizedName;
    }

    @JsonProperty("EnglishName")
    public String getEnglishName() {
        return englishName;
    }

    @JsonProperty("EnglishName")
    public void setEnglishName(String englishName) {
        this.englishName = englishName;
    }

    @JsonProperty("Level")
    public Integer getLevel() {
        return level;
    }

    @JsonProperty("Level")
    public void setLevel(Integer level) {
        this.level = level;
    }

    @JsonProperty("LocalizedType")
    public String getLocalizedType() {
        return localizedType;
    }

    @JsonProperty("LocalizedType")
    public void setLocalizedType(String localizedType) {
        this.localizedType = localizedType;
    }

    @JsonProperty("EnglishType")
    public String getEnglishType() {
        return englishType;
    }

    @JsonProperty("EnglishType")
    public void setEnglishType(String englishType) {
        this.englishType = englishType;
    }

    @JsonProperty("CountryID")
    public String getCountryID() {
        return countryID;
    }

    @JsonProperty("CountryID")
    public void setCountryID(String countryID) {
        this.countryID = countryID;
    }

}
