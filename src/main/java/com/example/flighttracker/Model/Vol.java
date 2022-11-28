package com.example.flighttracker.Model;

import lombok.AllArgsConstructor;
import lombok.Data;

import javax.persistence.*;

@Data
@AllArgsConstructor
@Entity
@Table(name = "vol")
public class Vol {


    @Id
    private String icao24;
    private String callsign;
    private String origin_Country;
    private int time_position;
    private int last_contact;
    private float longitude;
    private float lattitude;
    private float baro_altitude;
    private boolean on_ground;
    private float velocity;
    private float true_track;
    private float vertical_rate;
   // private int[] sensors;
    private float geo_altitude;
    private String sqwuak;
    private boolean spi;
    private int position_source;
    private int category;

    public Vol() {

    }


    public int getCategory() {
        return category;
    }

    public void setCategory(int category) {
        this.category = category;
    }

    public int getPosition_source() {
        return position_source;
    }

    public void setPosition_source(int position_source) {
        this.position_source = position_source;
    }

    public boolean isSpi() {
        return spi;
    }

    public void setSpi(boolean spi) {
        this.spi = spi;
    }

    public String getSqwuak() {
        return sqwuak;
    }

    public void setSqwuak(String sqwuak) {
        this.sqwuak = sqwuak;
    }

    public float getGeo_altitude() {
        return geo_altitude;
    }

    public void setGeo_altitude(float geo_altitude) {
        this.geo_altitude = geo_altitude;
    }

   /* public int[] getSensors() {
        return sensors;
    }

    public void setSensors(int[] sensors) {
        this.sensors = sensors;
    }*/

    public float getVertical_rate() {
        return vertical_rate;
    }

    public void setVertical_rate(float vertical_rate) {
        this.vertical_rate = vertical_rate;
    }

    public float getTrue_track() {
        return true_track;
    }

    public void setTrue_track(float true_track) {
        this.true_track = true_track;
    }

    public float getVelocity() {
        return velocity;
    }

    public void setVelocity(float velocity) {
        this.velocity = velocity;
    }

    public boolean isOn_ground() {
        return on_ground;
    }

    public void setOn_ground(boolean on_ground) {
        this.on_ground = on_ground;
    }

    public float getBaro_altitude() {
        return baro_altitude;
    }

    public void setBaro_altitude(float baro_altitude) {
        this.baro_altitude = baro_altitude;
    }

    public float getLattitude() {
        return lattitude;
    }

    public void setLattitude(float lattitude) {
        this.lattitude = lattitude;
    }

    public float getLongitude() {
        return longitude;
    }

    public void setLongitude(float longitude) {
        this.longitude = longitude;
    }

    public int getLast_contact() {
        return last_contact;
    }

    public void setLast_contact(int last_contact) {
        this.last_contact = last_contact;
    }

    public int getTime_position() {
        return time_position;
    }

    public void setTime_position(int time_position) {
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
