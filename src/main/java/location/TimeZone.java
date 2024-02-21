
package location;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "Code",
    "Name",
    "GmtOffset",
    "IsDaylightSaving",
    "NextOffsetChange"
})
public class TimeZone {

    @JsonProperty("Code")
    private String code;
    @JsonProperty("Name")
    private String name;
    @JsonProperty("GmtOffset")
    private Double gmtOffset;
    @JsonProperty("IsDaylightSaving")
    private Boolean isDaylightSaving;
    @JsonProperty("NextOffsetChange")
    private String nextOffsetChange;

    @JsonProperty("Code")
    public String getCode() {
        return code;
    }

    @JsonProperty("Code")
    public void setCode(String code) {
        this.code = code;
    }

    @JsonProperty("Name")
    public String getName() {
        return name;
    }

    @JsonProperty("Name")
    public void setName(String name) {
        this.name = name;
    }

    @JsonProperty("GmtOffset")
    public Double getGmtOffset() {
        return gmtOffset;
    }

    @JsonProperty("GmtOffset")
    public void setGmtOffset(Double gmtOffset) {
        this.gmtOffset = gmtOffset;
    }

    @JsonProperty("IsDaylightSaving")
    public Boolean getIsDaylightSaving() {
        return isDaylightSaving;
    }

    @JsonProperty("IsDaylightSaving")
    public void setIsDaylightSaving(Boolean isDaylightSaving) {
        this.isDaylightSaving = isDaylightSaving;
    }

    @JsonProperty("NextOffsetChange")
    public String getNextOffsetChange() {
        return nextOffsetChange;
    }

    @JsonProperty("NextOffsetChange")
    public void setNextOffsetChange(String nextOffsetChange) {
        this.nextOffsetChange = nextOffsetChange;
    }

}
