package com.example.flighttracker.Model;

import lombok.AllArgsConstructor;
import lombok.Data;

import javax.persistence.*;

@Data

@Entity
@Table(name = "vol")
public class Vol {


    @Id
    private String icao24;
    private String callsign;
    private String origin_Country;
    private String time_position;
    private String last_contact;
    private String longitude;
    private String lattitude;
    private String baro_altitude;
    private String on_ground;
    private String velocity;
    private String true_track;
    private String vertical_rate;
    private String sensors;
    private String geo_altitude;
    private String sqwuak;
    private String spi;
    private String position_source;


    public Vol(String icao24,String callsign, String origin_Country, String time_position, String last_contact, String longitude, String lattitude,String baro_altitude, String on_ground, String velocity, String true_track,String vertical_rate, String sensors, String geo_altitude, String sqwuak, String spi, String position_source) {
        this.icao24 = icao24;
        this.callsign=callsign;
        this.origin_Country=origin_Country;
        this.time_position=time_position;
        this.last_contact=last_contact;
        this.longitude=longitude;
        this.lattitude=lattitude;
        this.baro_altitude=baro_altitude;
        this.on_ground=on_ground;
        this.velocity=velocity;
        this.true_track=true_track;
        this.vertical_rate=vertical_rate;
        this.sensors=sensors;
        this.geo_altitude=geo_altitude;
        this.sqwuak=sqwuak;
        this.spi=spi;
        this.position_source=position_source;
    }

    public Vol() {

    }


    public String getPosition_source() {
        return position_source;
    }

    public void setPosition_source(String position_source) {
        this.position_source = position_source;
    }

    public String getSpi() {
        return spi;
    }

    public void setSpi(String spi) {
        this.spi = spi;
    }

    public String getSqwuak() {
        return sqwuak;
    }

    public void setSqwuak(String sqwuak) {
        this.sqwuak = sqwuak;
    }

    public String getGeo_altitude() {
        return geo_altitude;
    }

    public void setGeo_altitude(String geo_altitude) {
        this.geo_altitude = geo_altitude;
    }

    public String getSensors() {
        return sensors;
    }

    public void setSensors(String sensors) {
        this.sensors = sensors;
    }

    public String getVertical_rate() {
        return vertical_rate;
    }

    public void setVertical_rate(String vertical_rate) {
        this.vertical_rate = vertical_rate;
    }

    public String getTrue_track() {
        return true_track;
    }

    public void setTrue_track(String true_track) {
        this.true_track = true_track;
    }

    public String getVelocity() {
        return velocity;
    }

    public void setVelocity(String velocity) {
        this.velocity = velocity;
    }

    public String getOn_ground() {
        return on_ground;
    }

    public void setOn_ground(String on_ground) {
        this.on_ground = on_ground;
    }

    public String getBaro_altitude() {
        return baro_altitude;
    }

    public void setBaro_altitude(String baro_altitude) {
        this.baro_altitude = baro_altitude;
    }

    public String getLattitude() {
        return lattitude;
    }

    public void setLattitude(String lattitude) {
        this.lattitude = lattitude;
    }

    public String getLongitude() {
        return longitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

    public String getLast_contact() {
        return last_contact;
    }

    public void setLast_contact(String last_contact) {
        this.last_contact = last_contact;
    }

    public String getTime_position() {
        return time_position;
    }

    public void setTime_position(String time_position) {
        this.time_position = time_position;
    }

    public String getOrigin_Country() {
        return origin_Country;
    }

    public void setOrigin_Country(String origin_Country) {
        this.origin_Country = origin_Country;
    }

    public String getCallsign() {
        return callsign;
    }

    public void setCallsign(String callsign) {
        this.callsign = callsign;
    }

    public String getIcao24() {
        return icao24;
    }

    public void setIcao24(String icao24) {
        this.icao24 = icao24;
    }
}
