/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.annotation.NonNull
 *  androidx.annotation.Nullable
 *  com.yandex.metrica.impl.ob.tn
 *  com.yandex.metrica.impl.ob.un
 *  com.yandex.metrica.impl.ob.xn
 *  java.lang.Deprecated
 *  java.lang.Double
 *  java.lang.Integer
 *  java.lang.Long
 *  java.lang.Object
 *  java.lang.String
 *  java.util.Currency
 */
package com.yandex.metrica;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.yandex.metrica.impl.ob.tn;
import com.yandex.metrica.impl.ob.un;
import com.yandex.metrica.impl.ob.xn;
import java.util.Currency;

public class Revenue {
    @NonNull
    public final Currency currency;
    @Nullable
    public final String payload;
    @Deprecated
    @Nullable
    public final Double price;
    @Nullable
    public final Long priceMicros;
    @Nullable
    public final String productID;
    @Nullable
    public final Integer quantity;
    @Nullable
    public final Receipt receipt;

    private Revenue(@NonNull Builder builder) {
        this.price = builder.a;
        this.priceMicros = builder.b;
        this.currency = builder.c;
        this.quantity = builder.d;
        this.productID = builder.e;
        this.payload = builder.f;
        this.receipt = builder.g;
    }

    public /* synthetic */ Revenue(Builder builder, a a4) {
        this(builder);
    }

    @Deprecated
    @NonNull
    public static Builder newBuilder(double d2, @NonNull Currency currency) {
        return new Builder(d2, currency);
    }

    @NonNull
    public static Builder newBuilderWithMicros(long l, @NonNull Currency currency) {
        return new Builder(l, currency);
    }

    public static class Builder {
        private static final xn<Currency> h = new un((xn)new tn("revenue currency"));
        @Nullable
        public Double a;
        @Nullable
        public Long b;
        @NonNull
        public Currency c;
        @Nullable
        public Integer d;
        @Nullable
        public String e;
        @Nullable
        public String f;
        @Nullable
        public Receipt g;

        public Builder(double d2, @NonNull Currency currency) {
            ((un)h).a((Object)currency);
            this.a = d2;
            this.c = currency;
        }

        public Builder(long l, @NonNull Currency currency) {
            ((un)h).a((Object)currency);
            this.b = l;
            this.c = currency;
        }

        @NonNull
        public Revenue build() {
            return new Revenue(this, null);
        }

        @NonNull
        public Builder withPayload(@Nullable String string2) {
            this.f = string2;
            return this;
        }

        @NonNull
        public Builder withProductID(@Nullable String string2) {
            this.e = string2;
            return this;
        }

        @NonNull
        public Builder withQuantity(@Nullable Integer n) {
            this.d = n;
            return this;
        }

        @NonNull
        public Builder withReceipt(@Nullable Receipt receipt) {
            this.g = receipt;
            return this;
        }
    }

    public static class Receipt {
        @Nullable
        public final String data;
        @Nullable
        public final String signature;

        private Receipt(@NonNull Builder builder) {
            this.data = builder.a;
            this.signature = builder.b;
        }

        public /* synthetic */ Receipt(Builder builder, a a4) {
            this(builder);
        }

        @NonNull
        public static Builder newBuilder() {
            return new Builder();
        }

        public static class Builder {
            @Nullable
            private String a;
            @Nullable
            private String b;

            @NonNull
            public Receipt build() {
                return new Receipt(this, null);
            }

            @NonNull
            public Builder withData(@Nullable String string2) {
                this.a = string2;
                return this;
            }

            @NonNull
            public Builder withSignature(@Nullable String string2) {
                this.b = string2;
                return this;
            }
        }
    }
}

