// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package R4;

import kotlin.jvm.internal.Intrinsics;

public final class a
{
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    
    public a(final String a, final String b, final String c, final String d) {
        Intrinsics.checkNotNullParameter(a, "packageName");
        Intrinsics.checkNotNullParameter(b, "versionName");
        Intrinsics.checkNotNullParameter(c, "appBuildVersion");
        Intrinsics.checkNotNullParameter(d, "deviceManufacturer");
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }
    
    public final String a() {
        return this.c;
    }
    
    public final String b() {
        return this.d;
    }
    
    public final String c() {
        return this.a;
    }
    
    public final String d() {
        return this.b;
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof a)) {
            return false;
        }
        final a a = (a)o;
        return Intrinsics.a(this.a, a.a) && Intrinsics.a(this.b, a.b) && Intrinsics.a(this.c, a.c) && Intrinsics.a(this.d, a.d);
    }
    
    @Override
    public int hashCode() {
        return ((this.a.hashCode() * 31 + this.b.hashCode()) * 31 + this.c.hashCode()) * 31 + this.d.hashCode();
    }
    
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("AndroidApplicationInfo(packageName=");
        sb.append(this.a);
        sb.append(", versionName=");
        sb.append(this.b);
        sb.append(", appBuildVersion=");
        sb.append(this.c);
        sb.append(", deviceManufacturer=");
        sb.append(this.d);
        sb.append(')');
        return sb.toString();
    }
}
