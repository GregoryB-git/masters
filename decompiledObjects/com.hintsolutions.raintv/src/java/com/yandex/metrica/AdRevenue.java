/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.annotation.NonNull
 *  androidx.annotation.Nullable
 *  com.yandex.metrica.impl.ob.A2
 *  java.lang.Object
 *  java.lang.String
 *  java.math.BigDecimal
 *  java.util.Currency
 *  java.util.HashMap
 *  java.util.Map
 */
package com.yandex.metrica;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.yandex.metrica.AdType;
import com.yandex.metrica.impl.ob.A2;
import java.math.BigDecimal;
import java.util.Currency;
import java.util.HashMap;
import java.util.Map;

public class AdRevenue {
    @Nullable
    public final String adNetwork;
    @Nullable
    public final String adPlacementId;
    @Nullable
    public final String adPlacementName;
    @NonNull
    public final BigDecimal adRevenue;
    @Nullable
    public final AdType adType;
    @Nullable
    public final String adUnitId;
    @Nullable
    public final String adUnitName;
    @NonNull
    public final Currency currency;
    @Nullable
    public final Map<String, String> payload;
    @Nullable
    public final String precision;

    private AdRevenue(@NonNull BigDecimal object, @NonNull Currency currency, @Nullable AdType adType, @Nullable String string2, @Nullable String string3, @Nullable String string4, @Nullable String string5, @Nullable String string6, @Nullable String string7, @Nullable Map<String, String> map) {
        this.adRevenue = object;
        this.currency = currency;
        this.adType = adType;
        this.adNetwork = string2;
        this.adUnitId = string3;
        this.adUnitName = string4;
        this.adPlacementId = string5;
        this.adPlacementName = string6;
        this.precision = string7;
        object = map == null ? null : A2.d(map);
        this.payload = object;
    }

    public /* synthetic */ AdRevenue(BigDecimal bigDecimal, Currency currency, AdType adType, String string2, String string3, String string4, String string5, String string6, String string7, Map map, a a4) {
        this(bigDecimal, currency, adType, string2, string3, string4, string5, string6, string7, (Map<String, String>)map);
    }

    public static Builder newBuilder(double d2, @NonNull Currency currency) {
        return new Builder(new BigDecimal(A2.a((double)d2, (double)0.0)), currency, null);
    }

    public static Builder newBuilder(long l, @NonNull Currency currency) {
        return new Builder(A2.a((long)l), currency, null);
    }

    public static Builder newBuilder(@NonNull BigDecimal bigDecimal, @NonNull Currency currency) {
        return new Builder(bigDecimal, currency, null);
    }

    public static class Builder {
        @NonNull
        private final BigDecimal a;
        @NonNull
        private final Currency b;
        @Nullable
        private AdType c;
        @Nullable
        private String d;
        @Nullable
        private String e;
        @Nullable
        private String f;
        @Nullable
        private String g;
        @Nullable
        private String h;
        @Nullable
        private String i;
        @Nullable
        private Map<String, String> j;

        private Builder(@NonNull BigDecimal bigDecimal, @NonNull Currency currency) {
            this.a = bigDecimal;
            this.b = currency;
        }

        public /* synthetic */ Builder(BigDecimal bigDecimal, Currency currency, a a4) {
            this(bigDecimal, currency);
        }

        public AdRevenue build() {
            return new AdRevenue(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, null);
        }

        public Builder withAdNetwork(@Nullable String string2) {
            this.d = string2;
            return this;
        }

        public Builder withAdPlacementId(@Nullable String string2) {
            this.g = string2;
            return this;
        }

        public Builder withAdPlacementName(@Nullable String string2) {
            this.h = string2;
            return this;
        }

        public Builder withAdType(@Nullable AdType adType) {
            this.c = adType;
            return this;
        }

        public Builder withAdUnitId(@Nullable String string2) {
            this.e = string2;
            return this;
        }

        public Builder withAdUnitName(@Nullable String string2) {
            this.f = string2;
            return this;
        }

        public Builder withPayload(@Nullable Map<String, String> object) {
            object = object == null || A2.b(object) ? null : new HashMap(object);
            this.j = object;
            return this;
        }

        public Builder withPrecision(@Nullable String string2) {
            this.i = string2;
            return this;
        }
    }
}

