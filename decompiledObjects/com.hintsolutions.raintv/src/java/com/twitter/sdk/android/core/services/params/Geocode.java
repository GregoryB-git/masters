/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Enum
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 */
package com.twitter.sdk.android.core.services.params;

public class Geocode {
    public final Distance distance;
    public final double latitude;
    public final double longitude;
    public final int radius;

    public Geocode(double d, double d2, int n, Distance distance) {
        this.latitude = d;
        this.longitude = d2;
        this.radius = n;
        this.distance = distance;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.latitude);
        stringBuilder.append(",");
        stringBuilder.append(this.longitude);
        stringBuilder.append(",");
        stringBuilder.append(this.radius);
        stringBuilder.append(this.distance.identifier);
        return stringBuilder.toString();
    }

    public static final class Distance
    extends Enum<Distance> {
        private static final Distance[] $VALUES;
        public static final /* enum */ Distance KILOMETERS;
        public static final /* enum */ Distance MILES;
        public final String identifier;

        static {
            Distance distance;
            Distance distance2;
            MILES = distance2 = new Distance("mi");
            KILOMETERS = distance = new Distance("km");
            $VALUES = new Distance[]{distance2, distance};
        }

        private Distance(String string3) {
            this.identifier = string3;
        }

        public static Distance valueOf(String string2) {
            return (Distance)Enum.valueOf(Distance.class, (String)string2);
        }

        public static Distance[] values() {
            return (Distance[])$VALUES.clone();
        }
    }
}

