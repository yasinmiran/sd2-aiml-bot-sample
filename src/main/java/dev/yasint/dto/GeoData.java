package dev.yasint.dto;

import java.util.Objects;

public class GeoData {

    private String latitude;
    private String longitude;
    private String type;
    private String name;
    private String number;
    private String postal_code;
    private String street;
    private String confidence;
    private String region;
    private String region_code;
    private String county;
    private String locality;
    private String administrative_area;
    private String neighbourhood;
    private String country;
    private String country_code;
    private String continent;
    private String label;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof GeoData geoData)) return false;
        return Objects.equals(getLatitude(), geoData.getLatitude()) && Objects.equals(getLongitude(), geoData.getLongitude()) && Objects.equals(getType(), geoData.getType()) && Objects.equals(getName(), geoData.getName()) && Objects.equals(getNumber(), geoData.getNumber()) && Objects.equals(getPostal_code(), geoData.getPostal_code()) && Objects.equals(getStreet(), geoData.getStreet()) && Objects.equals(getConfidence(), geoData.getConfidence()) && Objects.equals(getRegion(), geoData.getRegion()) && Objects.equals(getRegion_code(), geoData.getRegion_code()) && Objects.equals(getCounty(), geoData.getCounty()) && Objects.equals(getLocality(), geoData.getLocality()) && Objects.equals(getAdministrative_area(), geoData.getAdministrative_area()) && Objects.equals(getNeighbourhood(), geoData.getNeighbourhood()) && Objects.equals(getCountry(), geoData.getCountry()) && Objects.equals(getCountry_code(), geoData.getCountry_code()) && Objects.equals(getContinent(), geoData.getContinent()) && Objects.equals(getLabel(), geoData.getLabel());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getLatitude(), getLongitude(), getType(), getName(), getNumber(), getPostal_code(), getStreet(), getConfidence(), getRegion(), getRegion_code(), getCounty(), getLocality(), getAdministrative_area(), getNeighbourhood(), getCountry(), getCountry_code(), getContinent(), getLabel());
    }

    @Override
    public String toString() {
        return "GeoData{" +
                "latitude='" + latitude + '\'' +
                ", longitude='" + longitude + '\'' +
                ", type='" + type + '\'' +
                ", name='" + name + '\'' +
                ", number='" + number + '\'' +
                ", postal_code='" + postal_code + '\'' +
                ", street='" + street + '\'' +
                ", confidence='" + confidence + '\'' +
                ", region='" + region + '\'' +
                ", region_code='" + region_code + '\'' +
                ", county='" + county + '\'' +
                ", locality='" + locality + '\'' +
                ", administrative_area='" + administrative_area + '\'' +
                ", neighbourhood='" + neighbourhood + '\'' +
                ", country='" + country + '\'' +
                ", country_code='" + country_code + '\'' +
                ", continent='" + continent + '\'' +
                ", label='" + label + '\'' +
                '}';
    }

    public String getLatitude() {
        return latitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    public String getLongitude() {
        return longitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getPostal_code() {
        return postal_code;
    }

    public void setPostal_code(String postal_code) {
        this.postal_code = postal_code;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getConfidence() {
        return confidence;
    }

    public void setConfidence(String confidence) {
        this.confidence = confidence;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getRegion_code() {
        return region_code;
    }

    public void setRegion_code(String region_code) {
        this.region_code = region_code;
    }

    public String getCounty() {
        return county;
    }

    public void setCounty(String county) {
        this.county = county;
    }

    public String getLocality() {
        return locality;
    }

    public void setLocality(String locality) {
        this.locality = locality;
    }

    public String getAdministrative_area() {
        return administrative_area;
    }

    public void setAdministrative_area(String administrative_area) {
        this.administrative_area = administrative_area;
    }

    public String getNeighbourhood() {
        return neighbourhood;
    }

    public void setNeighbourhood(String neighbourhood) {
        this.neighbourhood = neighbourhood;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCountry_code() {
        return country_code;
    }

    public void setCountry_code(String country_code) {
        this.country_code = country_code;
    }

    public String getContinent() {
        return continent;
    }

    public void setContinent(String continent) {
        this.continent = continent;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }
}
