/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.annotations.SerializedName
 *  java.lang.Double
 *  java.lang.Object
 *  java.lang.String
 *  java.util.List
 *  java.util.Map
 */
package com.twitter.sdk.android.core.models;

import com.google.gson.annotations.SerializedName;
import com.twitter.sdk.android.core.models.ModelUtils;
import java.util.List;
import java.util.Map;

public class Place {
    @SerializedName(value="attributes")
    public final Map<String, String> attributes;
    @SerializedName(value="bounding_box")
    public final BoundingBox boundingBox;
    @SerializedName(value="country")
    public final String country;
    @SerializedName(value="country_code")
    public final String countryCode;
    @SerializedName(value="full_name")
    public final String fullName;
    @SerializedName(value="id")
    public final String id;
    @SerializedName(value="name")
    public final String name;
    @SerializedName(value="place_type")
    public final String placeType;
    @SerializedName(value="url")
    public final String url;

    public Place(Map<String, String> map, BoundingBox boundingBox, String string2, String string3, String string4, String string5, String string6, String string7, String string8) {
        this.attributes = ModelUtils.getSafeMap(map);
        this.boundingBox = boundingBox;
        this.country = string2;
        this.countryCode = string3;
        this.fullName = string4;
        this.id = string5;
        this.name = string6;
        this.placeType = string7;
        this.url = string8;
    }

    public static class BoundingBox {
        @SerializedName(value="coordinates")
        public final List<List<List<Double>>> coordinates;
        @SerializedName(value="type")
        public final String type;

        private BoundingBox() {
            this(null, null);
        }

        public BoundingBox(List<List<List<Double>>> list, String string2) {
            this.coordinates = ModelUtils.getSafeList(list);
            this.type = string2;
        }
    }
}

