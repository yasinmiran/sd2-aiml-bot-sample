package dev.yasint.dto;

import java.util.Arrays;

public class GeoDataAPIResponse {

    private GeoData[] data;

    public GeoData[] getData() {
        return data;
    }

    public void setData(GeoData[] data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "GeoDataAPIResponse{" +
                "data=" + Arrays.toString(data) +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof GeoDataAPIResponse that)) return false;
        return Arrays.equals(getData(), that.getData());
    }

    @Override
    public int hashCode() {
        return Arrays.hashCode(getData());
    }
}
