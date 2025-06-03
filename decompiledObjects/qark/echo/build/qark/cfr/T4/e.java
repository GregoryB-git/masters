/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Boolean
 *  java.lang.Double
 *  java.lang.Integer
 *  java.lang.Long
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 */
package T4;

import kotlin.jvm.internal.Intrinsics;

public final class e {
    public final Boolean a;
    public final Double b;
    public final Integer c;
    public final Integer d;
    public final Long e;

    public e(Boolean bl, Double d8, Integer n8, Integer n9, Long l8) {
        this.a = bl;
        this.b = d8;
        this.c = n8;
        this.d = n9;
        this.e = l8;
    }

    public final Integer a() {
        return this.d;
    }

    public final Long b() {
        return this.e;
    }

    public final Boolean c() {
        return this.a;
    }

    public final Integer d() {
        return this.c;
    }

    public final Double e() {
        return this.b;
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof e)) {
            return false;
        }
        object = (e)object;
        if (!Intrinsics.a((Object)this.a, (Object)object.a)) {
            return false;
        }
        if (!Intrinsics.a((Object)this.b, (Object)object.b)) {
            return false;
        }
        if (!Intrinsics.a((Object)this.c, (Object)object.c)) {
            return false;
        }
        if (!Intrinsics.a((Object)this.d, (Object)object.d)) {
            return false;
        }
        if (!Intrinsics.a((Object)this.e, (Object)object.e)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        Boolean bl = this.a;
        int n8 = 0;
        int n9 = bl == null ? 0 : bl.hashCode();
        bl = this.b;
        int n10 = bl == null ? 0 : bl.hashCode();
        bl = this.c;
        int n11 = bl == null ? 0 : bl.hashCode();
        bl = this.d;
        int n12 = bl == null ? 0 : bl.hashCode();
        bl = this.e;
        if (bl != null) {
            n8 = bl.hashCode();
        }
        return (((n9 * 31 + n10) * 31 + n11) * 31 + n12) * 31 + n8;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("SessionConfigs(sessionEnabled=");
        stringBuilder.append((Object)this.a);
        stringBuilder.append(", sessionSamplingRate=");
        stringBuilder.append((Object)this.b);
        stringBuilder.append(", sessionRestartTimeout=");
        stringBuilder.append((Object)this.c);
        stringBuilder.append(", cacheDuration=");
        stringBuilder.append((Object)this.d);
        stringBuilder.append(", cacheUpdatedTime=");
        stringBuilder.append((Object)this.e);
        stringBuilder.append(')');
        return stringBuilder.toString();
    }
}

