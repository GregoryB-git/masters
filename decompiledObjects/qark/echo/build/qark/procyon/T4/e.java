// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package T4;

import kotlin.jvm.internal.Intrinsics;

public final class e
{
    public final Boolean a;
    public final Double b;
    public final Integer c;
    public final Integer d;
    public final Long e;
    
    public e(final Boolean a, final Double b, final Integer c, final Integer d, final Long e) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
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
    
    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof e)) {
            return false;
        }
        final e e = (e)o;
        return Intrinsics.a(this.a, e.a) && Intrinsics.a(this.b, e.b) && Intrinsics.a(this.c, e.c) && Intrinsics.a(this.d, e.d) && Intrinsics.a(this.e, e.e);
    }
    
    @Override
    public int hashCode() {
        final Boolean a = this.a;
        int hashCode = 0;
        int hashCode2;
        if (a == null) {
            hashCode2 = 0;
        }
        else {
            hashCode2 = a.hashCode();
        }
        final Double b = this.b;
        int hashCode3;
        if (b == null) {
            hashCode3 = 0;
        }
        else {
            hashCode3 = b.hashCode();
        }
        final Integer c = this.c;
        int hashCode4;
        if (c == null) {
            hashCode4 = 0;
        }
        else {
            hashCode4 = c.hashCode();
        }
        final Integer d = this.d;
        int hashCode5;
        if (d == null) {
            hashCode5 = 0;
        }
        else {
            hashCode5 = d.hashCode();
        }
        final Long e = this.e;
        if (e != null) {
            hashCode = e.hashCode();
        }
        return (((hashCode2 * 31 + hashCode3) * 31 + hashCode4) * 31 + hashCode5) * 31 + hashCode;
    }
    
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("SessionConfigs(sessionEnabled=");
        sb.append(this.a);
        sb.append(", sessionSamplingRate=");
        sb.append(this.b);
        sb.append(", sessionRestartTimeout=");
        sb.append(this.c);
        sb.append(", cacheDuration=");
        sb.append(this.d);
        sb.append(", cacheUpdatedTime=");
        sb.append(this.e);
        sb.append(')');
        return sb.toString();
    }
}
