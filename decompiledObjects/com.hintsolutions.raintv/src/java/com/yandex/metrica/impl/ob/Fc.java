/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.annotation.Nullable
 *  java.lang.Float
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 */
package com.yandex.metrica.impl.ob;

import androidx.annotation.Nullable;
import com.yandex.metrica.impl.ob.Qb;
import com.yandex.metrica.impl.ob.Vb;

public class fc {
    public final long a;
    public final float b;
    public final int c;
    public final int d;
    public final long e;
    public final int f;
    public final boolean g;
    public final long h;
    public final boolean i;
    public final boolean j;
    public final boolean k;
    public final boolean l;
    @Nullable
    public final Qb m;
    @Nullable
    public final Qb n;
    @Nullable
    public final Qb o;
    @Nullable
    public final Qb p;
    @Nullable
    public final Vb q;

    public fc(long l5, float f2, int n4, int n5, long l8, int n7, boolean bl, long l9, boolean bl2, boolean bl3, boolean bl4, boolean bl5, @Nullable Qb qb2, @Nullable Qb qb3, @Nullable Qb qb4, @Nullable Qb qb5, @Nullable Vb vb2) {
        this.a = l5;
        this.b = f2;
        this.c = n4;
        this.d = n5;
        this.e = l8;
        this.f = n7;
        this.g = bl;
        this.h = l9;
        this.i = bl2;
        this.j = bl3;
        this.k = bl4;
        this.l = bl5;
        this.m = qb2;
        this.n = qb3;
        this.o = qb4;
        this.p = qb5;
        this.q = vb2;
    }

    public boolean equals(Object object) {
        boolean bl = true;
        if (this == object) {
            return true;
        }
        if (object != null && fc.class == object.getClass()) {
            object = (fc)object;
            if (this.a != ((fc)object).a) {
                return false;
            }
            if (Float.compare((float)((fc)object).b, (float)this.b) != 0) {
                return false;
            }
            if (this.c != ((fc)object).c) {
                return false;
            }
            if (this.d != ((fc)object).d) {
                return false;
            }
            if (this.e != ((fc)object).e) {
                return false;
            }
            if (this.f != ((fc)object).f) {
                return false;
            }
            if (this.g != ((fc)object).g) {
                return false;
            }
            if (this.h != ((fc)object).h) {
                return false;
            }
            if (this.i != ((fc)object).i) {
                return false;
            }
            if (this.j != ((fc)object).j) {
                return false;
            }
            if (this.k != ((fc)object).k) {
                return false;
            }
            if (this.l != ((fc)object).l) {
                return false;
            }
            Object object2 = this.m;
            if (object2 != null ? !((Qb)object2).equals(((fc)object).m) : ((fc)object).m != null) {
                return false;
            }
            object2 = this.n;
            if (object2 != null ? !((Qb)object2).equals(((fc)object).n) : ((fc)object).n != null) {
                return false;
            }
            object2 = this.o;
            if (object2 != null ? !((Qb)object2).equals(((fc)object).o) : ((fc)object).o != null) {
                return false;
            }
            object2 = this.p;
            if (object2 != null ? !((Qb)object2).equals(((fc)object).p) : ((fc)object).p != null) {
                return false;
            }
            object2 = this.q;
            object = ((fc)object).q;
            if (object2 != null) {
                bl = ((Vb)object2).equals(object);
            } else if (object != null) {
                bl = false;
            }
            return bl;
        }
        return false;
    }

    public int hashCode() {
        long l5 = this.a;
        int n4 = (int)(l5 ^ l5 >>> 32);
        float f2 = this.b;
        int n5 = 0;
        int n7 = f2 != 0.0f ? Float.floatToIntBits((float)f2) : 0;
        int n8 = this.c;
        int n9 = this.d;
        l5 = this.e;
        int n10 = (int)(l5 ^ l5 >>> 32);
        int n11 = this.f;
        int n12 = this.g;
        l5 = this.h;
        int n13 = (int)(l5 >>> 32 ^ l5);
        int n14 = this.i;
        int n15 = this.j;
        int n16 = this.k;
        int n17 = this.l;
        Object object = this.m;
        int n18 = object != null ? ((Qb)object).hashCode() : 0;
        object = this.n;
        int n19 = object != null ? ((Qb)object).hashCode() : 0;
        object = this.o;
        int n20 = object != null ? ((Qb)object).hashCode() : 0;
        object = this.p;
        int n21 = object != null ? ((Qb)object).hashCode() : 0;
        object = this.q;
        if (object != null) {
            n5 = ((Vb)object).hashCode();
        }
        return (((((((((((((((n4 * 31 + n7) * 31 + n8) * 31 + n9) * 31 + n10) * 31 + n11) * 31 + n12) * 31 + n13) * 31 + n14) * 31 + n15) * 31 + n16) * 31 + n17) * 31 + n18) * 31 + n19) * 31 + n20) * 31 + n21) * 31 + n5;
    }

    public String toString() {
        StringBuilder stringBuilder = z2.t("LocationArguments{updateTimeInterval=");
        stringBuilder.append(this.a);
        stringBuilder.append(", updateDistanceInterval=");
        stringBuilder.append(this.b);
        stringBuilder.append(", recordsCountToForceFlush=");
        stringBuilder.append(this.c);
        stringBuilder.append(", maxBatchSize=");
        stringBuilder.append(this.d);
        stringBuilder.append(", maxAgeToForceFlush=");
        stringBuilder.append(this.e);
        stringBuilder.append(", maxRecordsToStoreLocally=");
        stringBuilder.append(this.f);
        stringBuilder.append(", collectionEnabled=");
        stringBuilder.append(this.g);
        stringBuilder.append(", lbsUpdateTimeInterval=");
        stringBuilder.append(this.h);
        stringBuilder.append(", lbsCollectionEnabled=");
        stringBuilder.append(this.i);
        stringBuilder.append(", passiveCollectionEnabled=");
        stringBuilder.append(this.j);
        stringBuilder.append(", allCellsCollectingEnabled=");
        stringBuilder.append(this.k);
        stringBuilder.append(", connectedCellCollectingEnabled=");
        stringBuilder.append(this.l);
        stringBuilder.append(", wifiAccessConfig=");
        stringBuilder.append((Object)this.m);
        stringBuilder.append(", lbsAccessConfig=");
        stringBuilder.append((Object)this.n);
        stringBuilder.append(", gpsAccessConfig=");
        stringBuilder.append((Object)this.o);
        stringBuilder.append(", passiveAccessConfig=");
        stringBuilder.append((Object)this.p);
        stringBuilder.append(", gplConfig=");
        stringBuilder.append((Object)this.q);
        stringBuilder.append('}');
        return stringBuilder.toString();
    }
}

