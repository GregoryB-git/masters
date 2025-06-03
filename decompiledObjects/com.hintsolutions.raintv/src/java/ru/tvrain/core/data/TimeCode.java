/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.annotations.Expose
 *  com.google.gson.annotations.SerializedName
 *  java.io.Serializable
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 */
package ru.tvrain.core.data;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import java.io.Serializable;

public class TimeCode
implements Serializable {
    @Expose
    @SerializedName(value="hh")
    public int hour;
    @Expose
    @SerializedName(value="mm")
    public int minute;
    @Expose
    @SerializedName(value="name")
    public String name;
    @Expose
    @SerializedName(value="ss")
    public int second;

    public long getPosition() {
        int n3 = this.hour;
        return (this.minute * 60 + n3 * 60 * 60 + this.second) * 1000;
    }

    public String getPositionUrlParamValue() {
        StringBuilder stringBuilder = new StringBuilder();
        int n3 = this.hour;
        if (n3 > 0) {
            stringBuilder.append(n3);
            stringBuilder.append("h");
        }
        if ((n3 = this.minute) > 0) {
            stringBuilder.append(n3);
            stringBuilder.append("m");
        }
        if ((n3 = this.second) > 0) {
            stringBuilder.append(n3);
            stringBuilder.append("s");
        }
        return stringBuilder.toString();
    }

    public String getTimeString() {
        Object object;
        StringBuilder stringBuilder = new StringBuilder();
        int n3 = this.hour;
        if (n3 > 9) {
            object = n3;
        } else {
            object = z2.t("0");
            object.append(this.hour);
            object = object.toString();
        }
        stringBuilder.append(object);
        stringBuilder.append(":");
        n3 = this.minute;
        if (n3 > 9) {
            object = n3;
        } else {
            object = z2.t("0");
            object.append(this.minute);
            object = object.toString();
        }
        stringBuilder.append(object);
        stringBuilder.append(":");
        n3 = this.second;
        if (n3 > 9) {
            object = n3;
        } else {
            object = z2.t("0");
            object.append(this.second);
            object = object.toString();
        }
        stringBuilder.append(object);
        return stringBuilder.toString();
    }
}

