/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.annotation.NonNull
 *  androidx.annotation.Nullable
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 */
package com.yandex.metrica.billing_interface;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.yandex.metrica.billing_interface.c;
import com.yandex.metrica.billing_interface.e;

public class d {
    @NonNull
    public final e a;
    @NonNull
    public final String b;
    public final int c;
    public final long d;
    @NonNull
    public final String e;
    public final long f;
    @Nullable
    public final c g;
    public final int h;
    @Nullable
    public final c i;
    @NonNull
    public final String j;
    @NonNull
    public final String k;
    public final long l;
    public final boolean m;
    @NonNull
    public final String n;

    public d(@NonNull e e2, @NonNull String string2, int n, long l2, @NonNull String string3, long l3, @Nullable c c3, int n3, @Nullable c c4, @NonNull String string4, @NonNull String string5, long l4, boolean bl, @NonNull String string6) {
        this.a = e2;
        this.b = string2;
        this.c = n;
        this.d = l2;
        this.e = string3;
        this.f = l3;
        this.g = c3;
        this.h = n3;
        this.i = c4;
        this.j = string4;
        this.k = string5;
        this.l = l4;
        this.m = bl;
        this.n = string6;
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object != null && d.class == object.getClass()) {
            object = (d)object;
            if (this.c != ((d)object).c) {
                return false;
            }
            if (this.d != ((d)object).d) {
                return false;
            }
            if (this.f != ((d)object).f) {
                return false;
            }
            if (this.h != ((d)object).h) {
                return false;
            }
            if (this.l != ((d)object).l) {
                return false;
            }
            if (this.m != ((d)object).m) {
                return false;
            }
            if (this.a != ((d)object).a) {
                return false;
            }
            if (!this.b.equals((Object)((d)object).b)) {
                return false;
            }
            if (!this.e.equals((Object)((d)object).e)) {
                return false;
            }
            c c3 = this.g;
            if (c3 != null ? !c3.equals(((d)object).g) : ((d)object).g != null) {
                return false;
            }
            c3 = this.i;
            if (c3 != null ? !c3.equals(((d)object).i) : ((d)object).i != null) {
                return false;
            }
            if (!this.j.equals((Object)((d)object).j)) {
                return false;
            }
            if (!this.k.equals((Object)((d)object).k)) {
                return false;
            }
            return this.n.equals((Object)((d)object).n);
        }
        return false;
    }

    public int hashCode() {
        int n = this.a.hashCode();
        int n3 = z2.c(this.b, n * 31, 31);
        int n4 = this.c;
        long l2 = this.d;
        n = (int)(l2 ^ l2 >>> 32);
        int n5 = z2.c(this.e, ((n3 + n4) * 31 + n) * 31, 31);
        l2 = this.f;
        n4 = (int)(l2 ^ l2 >>> 32);
        c c3 = this.g;
        n3 = 0;
        n = c3 != null ? c3.hashCode() : 0;
        int n6 = this.h;
        c3 = this.i;
        if (c3 != null) {
            n3 = c3.hashCode();
        }
        n = z2.c(this.j, ((((n5 + n4) * 31 + n) * 31 + n6) * 31 + n3) * 31, 31);
        n4 = z2.c(this.k, n, 31);
        l2 = this.l;
        n = (int)(l2 ^ l2 >>> 32);
        n3 = this.m ? 1 : 0;
        return this.n.hashCode() + ((n4 + n) * 31 + n3) * 31;
    }

    @NonNull
    public String toString() {
        StringBuilder stringBuilder = z2.t("ProductInfo{type=");
        stringBuilder.append((Object)this.a);
        stringBuilder.append(", sku='");
        a.B(stringBuilder, this.b, '\'', ", quantity=");
        stringBuilder.append(this.c);
        stringBuilder.append(", priceMicros=");
        stringBuilder.append(this.d);
        stringBuilder.append(", priceCurrency='");
        a.B(stringBuilder, this.e, '\'', ", introductoryPriceMicros=");
        stringBuilder.append(this.f);
        stringBuilder.append(", introductoryPricePeriod=");
        stringBuilder.append((Object)this.g);
        stringBuilder.append(", introductoryPriceCycles=");
        stringBuilder.append(this.h);
        stringBuilder.append(", subscriptionPeriod=");
        stringBuilder.append((Object)this.i);
        stringBuilder.append(", signature='");
        a.B(stringBuilder, this.j, '\'', ", purchaseToken='");
        a.B(stringBuilder, this.k, '\'', ", purchaseTime=");
        stringBuilder.append(this.l);
        stringBuilder.append(", autoRenewing=");
        stringBuilder.append(this.m);
        stringBuilder.append(", purchaseOriginalJson='");
        stringBuilder.append(this.n);
        stringBuilder.append('\'');
        stringBuilder.append('}');
        return stringBuilder.toString();
    }
}

