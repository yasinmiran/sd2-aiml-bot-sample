package dev.yasint.dto;

import java.util.List;


public class WeatherDataResponse {

    public static class Coord {
        public double lon;
        public double lat;
    }

    public static class WeatherDetails {
        public String id;
        public String main;
        public String description;
        public String icon;
    }

    public static class MainWeatherDetails {
        public double temp;
        public double feels_like;
        public double temp_min;
        public double temp_max;
        public double pressure;
        public double humidity;
        public double sea_level;
        public double grnd_level;
    }

    private static class WindData {
        public double speed;
        public double deg;
        public double gust;
    }

    static class Cloud {
        public int all;
    }

    private static class Sys {
        public double type;
        public double id;
        public String country;
        public double sunrise;
        public double sunset;
    }

    private Coord coord;
    private List<WeatherDetails> weather;
    private String base;
    private MainWeatherDetails main;
    private double visibility;
    private WindData wind;
    private Cloud clouds;
    private long dt;
    private Sys sys;
    private int timezone;
    private long id;
    private String name;
    private int cod;

    public Coord getCoord() {
        return coord;
    }

    public void setCoord(Coord coord) {
        this.coord = coord;
    }

    public List<WeatherDetails> getWeather() {
        return weather;
    }

    public void setWeather(List<WeatherDetails> weather) {
        this.weather = weather;
    }

    public String getBase() {
        return base;
    }

    public void setBase(String base) {
        this.base = base;
    }

    public MainWeatherDetails getMain() {
        return main;
    }

    public void setMain(MainWeatherDetails main) {
        this.main = main;
    }

    public double getVisibility() {
        return visibility;
    }

    public void setVisibility(double visibility) {
        this.visibility = visibility;
    }

    public WindData getWind() {
        return wind;
    }

    public void setWind(WindData wind) {
        this.wind = wind;
    }

    public Cloud getClouds() {
        return clouds;
    }

    public void setClouds(Cloud clouds) {
        this.clouds = clouds;
    }

    public long getDt() {
        return dt;
    }

    public void setDt(long dt) {
        this.dt = dt;
    }

    public Sys getSys() {
        return sys;
    }

    public void setSys(Sys sys) {
        this.sys = sys;
    }

    public int getTimezone() {
        return timezone;
    }

    public void setTimezone(int timezone) {
        this.timezone = timezone;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCod() {
        return cod;
    }

    public void setCod(int cod) {
        this.cod = cod;
    }
}
