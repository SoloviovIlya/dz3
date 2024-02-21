
package location;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "Version",
    "Key",
    "Type",
    "Rank",
    "LocalizedName",
    "EnglishName",
    "PrimaryPostalCode",
    "Region",
    "Country",
    "AdministrativeArea",
    "TimeZone",
    "GeoPosition",
    "IsAlias",
    "SupplementalAdminAreas",
    "DataSets"
})
public class Location {

    @JsonProperty("Version")
    private Integer version;
    @JsonProperty("Key")
    private String key;
    @JsonProperty("Type")
    private String type;
    @JsonProperty("Rank")
    private Integer rank;
    @JsonProperty("LocalizedName")
    private String localizedName;
    @JsonProperty("EnglishName")
    private String englishName;
    @JsonProperty("PrimaryPostalCode")
    private String primaryPostalCode;
    @JsonProperty("Region")
    private Region region;
    @JsonProperty("Country")
    private Country country;
    @JsonProperty("AdministrativeArea")
    private AdministrativeArea administrativeArea;
    @JsonProperty("TimeZone")
    private TimeZone timeZone;
    @JsonProperty("GeoPosition")
    private GeoPosition geoPosition;
    @JsonProperty("IsAlias")
    private Boolean isAlias;
    @JsonProperty("SupplementalAdminAreas")
    private List<SupplementalAdminArea> supplementalAdminAreas;
    @JsonProperty("DataSets")
    private List<String> dataSets;

    @JsonProperty("Version")
    public Integer getVersion() {
        return version;
    }

    @JsonProperty("Version")
    public void setVersion(Integer version) {
        this.version = version;
    }

    @JsonProperty("Key")
    public String getKey() {
        return key;
    }

    @JsonProperty("Key")
    public void setKey(String key) {
        this.key = key;
    }

    @JsonProperty("Type")
    public String getType() {
        return type;
    }

    @JsonProperty("Type")
    public void setType(String type) {
        this.type = type;
    }

    @JsonProperty("Rank")
    public Integer getRank() {
        return rank;
    }

    @JsonProperty("Rank")
    public void setRank(Integer rank) {
        this.rank = rank;
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

    @JsonProperty("PrimaryPostalCode")
    public String getPrimaryPostalCode() {
        return primaryPostalCode;
    }

    @JsonProperty("PrimaryPostalCode")
    public void setPrimaryPostalCode(String primaryPostalCode) {
        this.primaryPostalCode = primaryPostalCode;
    }

    @JsonProperty("Region")
    public Region getRegion() {
        return region;
    }

    @JsonProperty("Region")
    public void setRegion(Region region) {
        this.region = region;
    }

    @JsonProperty("Country")
    public Country getCountry() {
        return country;
    }

    @JsonProperty("Country")
    public void setCountry(Country country) {
        this.country = country;
    }

    @JsonProperty("AdministrativeArea")
    public AdministrativeArea getAdministrativeArea() {
        return administrativeArea;
    }

    @JsonProperty("AdministrativeArea")
    public void setAdministrativeArea(AdministrativeArea administrativeArea) {
        this.administrativeArea = administrativeArea;
    }

    @JsonProperty("TimeZone")
    public TimeZone getTimeZone() {
        return timeZone;
    }

    @JsonProperty("TimeZone")
    public void setTimeZone(TimeZone timeZone) {
        this.timeZone = timeZone;
    }

    @JsonProperty("GeoPosition")
    public GeoPosition getGeoPosition() {
        return geoPosition;
    }

    @JsonProperty("GeoPosition")
    public void setGeoPosition(GeoPosition geoPosition) {
        this.geoPosition = geoPosition;
    }

    @JsonProperty("IsAlias")
    public Boolean getIsAlias() {
        return isAlias;
    }

    @JsonProperty("IsAlias")
    public void setIsAlias(Boolean isAlias) {
        this.isAlias = isAlias;
    }

    @JsonProperty("SupplementalAdminAreas")
    public List<SupplementalAdminArea> getSupplementalAdminAreas() {
        return supplementalAdminAreas;
    }

    @JsonProperty("SupplementalAdminAreas")
    public void setSupplementalAdminAreas(List<SupplementalAdminArea> supplementalAdminAreas) {
        this.supplementalAdminAreas = supplementalAdminAreas;
    }

    @JsonProperty("DataSets")
    public List<String> getDataSets() {
        return dataSets;
    }

    @JsonProperty("DataSets")
    public void setDataSets(List<String> dataSets) {
        this.dataSets = dataSets;
    }

}
