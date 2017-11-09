package lectie6;

public class Report {
    private String localDateTime;

    private String country;

    private String location;

    private String eventType;

    private String extrainfo;

    public Report(String localDateTime, String country, String location, String eventType, String extrainfo) {
        this.localDateTime = localDateTime;
        this.country = country;
        this.location = location;
        this.eventType = eventType;
        this.extrainfo = extrainfo;
    }

    public String getLocalDateTime() {
        return localDateTime;
    }

    public String getCountry() {
        return country;
    }

    public String getLocation() {
        return location;
    }

    public String getEventType() {
        return eventType;
    }

    public String getExtrainfo() {
        return extrainfo;
    }

    public void setLocalDateTime(String localDateTime) {
        this.localDateTime = localDateTime;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void setEventType(String eventType) {
        this.eventType = eventType;
    }

    public void setExtrainfo(String extrainfo) {
        this.extrainfo = extrainfo;
    }

    @Override
    public String toString() {
        return "Report{" +
                "localDateTime='" + localDateTime + '\t' +
                ", country='" + country + '\t' +
                ", location='" + location + '\t' +
                ", eventType='" + eventType + '\t' +
                ", extrainfo='" + extrainfo + '\t' +
                ' ' + '\n';
    }
}
