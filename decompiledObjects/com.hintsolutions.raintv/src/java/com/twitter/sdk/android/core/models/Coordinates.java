/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.annotations.SerializedName
 *  java.lang.Double
 *  java.lang.Object
 *  java.lang.String
 *  java.util.ArrayList
 *  java.util.List
 */
package com.twitter.sdk.android.core.models;

import com.google.gson.annotations.SerializedName;
import com.twitter.sdk.android.core.models.ModelUtils;
import java.util.ArrayList;
import java.util.List;

public class Coordinates {
    public static final int INDEX_LATITUDE = 1;
    public static final int INDEX_LONGITUDE = 0;
    @SerializedName(value="coordinates")
    public final List<Double> coordinates;
    @SerializedName(value="type")
    public final String type;

    public Coordinates(Double d, Double d2, String string2) {
        ArrayList arrayList = new ArrayList(2);
        arrayList.add(0, (Object)d);
        arrayList.add(1, (Object)d2);
        this.coordinates = ModelUtils.getSafeList(arrayList);
        this.type = string2;
    }

    public Double getLatitude() {
        return (Double)this.coordinates.get(1);
    }

    public Double getLongitude() {
        return (Double)this.coordinates.get(0);
    }
}

