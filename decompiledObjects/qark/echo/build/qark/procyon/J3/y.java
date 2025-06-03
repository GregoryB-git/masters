// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package J3;

import E3.e;

public final class y extends a
{
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final int e;
    public final e f;
    
    public y(final String a, final String b, final String c, final String d, final int e, final e f) {
        if (a == null) {
            throw new NullPointerException("Null appIdentifier");
        }
        this.a = a;
        if (b == null) {
            throw new NullPointerException("Null versionCode");
        }
        this.b = b;
        if (c == null) {
            throw new NullPointerException("Null versionName");
        }
        this.c = c;
        if (d == null) {
            throw new NullPointerException("Null installUuid");
        }
        this.d = d;
        this.e = e;
        if (f != null) {
            this.f = f;
            return;
        }
        throw new NullPointerException("Null developmentPlatformProvider");
    }
    
    @Override
    public String a() {
        return this.a;
    }
    
    @Override
    public int c() {
        return this.e;
    }
    
    @Override
    public e d() {
        return this.f;
    }
    
    @Override
    public String e() {
        return this.d;
    }
    
    @Override
    public boolean equals(final Object o) {
        if (o == this) {
            return true;
        }
        if (o instanceof a) {
            final a a = (a)o;
            return this.a.equals(a.a()) && this.b.equals(a.f()) && this.c.equals(a.g()) && this.d.equals(a.e()) && this.e == a.c() && this.f.equals(a.d());
        }
        return false;
    }
    
    @Override
    public String f() {
        return this.b;
    }
    
    @Override
    public String g() {
        return this.c;
    }
    
    @Override
    public int hashCode() {
        return (((((this.a.hashCode() ^ 0xF4243) * 1000003 ^ this.b.hashCode()) * 1000003 ^ this.c.hashCode()) * 1000003 ^ this.d.hashCode()) * 1000003 ^ this.e) * 1000003 ^ this.f.hashCode();
    }
    
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("AppData{appIdentifier=");
        sb.append(this.a);
        sb.append(", versionCode=");
        sb.append(this.b);
        sb.append(", versionName=");
        sb.append(this.c);
        sb.append(", installUuid=");
        sb.append(this.d);
        sb.append(", deliveryMechanism=");
        sb.append(this.e);
        sb.append(", developmentPlatformProvider=");
        sb.append(this.f);
        sb.append("}");
        return sb.toString();
    }
}
