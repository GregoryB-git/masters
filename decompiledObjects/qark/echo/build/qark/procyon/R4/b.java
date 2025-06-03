// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package R4;

import kotlin.jvm.internal.Intrinsics;

public final class b
{
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final n e;
    public final a f;
    
    public b(final String a, final String b, final String c, final String d, final n e, final a f) {
        Intrinsics.checkNotNullParameter(a, "appId");
        Intrinsics.checkNotNullParameter(b, "deviceModel");
        Intrinsics.checkNotNullParameter(c, "sessionSdkVersion");
        Intrinsics.checkNotNullParameter(d, "osVersion");
        Intrinsics.checkNotNullParameter(e, "logEnvironment");
        Intrinsics.checkNotNullParameter(f, "androidAppInfo");
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
    }
    
    public final a a() {
        return this.f;
    }
    
    public final String b() {
        return this.a;
    }
    
    public final String c() {
        return this.b;
    }
    
    public final n d() {
        return this.e;
    }
    
    public final String e() {
        return this.d;
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof b)) {
            return false;
        }
        final b b = (b)o;
        return Intrinsics.a(this.a, b.a) && Intrinsics.a(this.b, b.b) && Intrinsics.a(this.c, b.c) && Intrinsics.a(this.d, b.d) && this.e == b.e && Intrinsics.a(this.f, b.f);
    }
    
    public final String f() {
        return this.c;
    }
    
    @Override
    public int hashCode() {
        return ((((this.a.hashCode() * 31 + this.b.hashCode()) * 31 + this.c.hashCode()) * 31 + this.d.hashCode()) * 31 + this.e.hashCode()) * 31 + this.f.hashCode();
    }
    
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("ApplicationInfo(appId=");
        sb.append(this.a);
        sb.append(", deviceModel=");
        sb.append(this.b);
        sb.append(", sessionSdkVersion=");
        sb.append(this.c);
        sb.append(", osVersion=");
        sb.append(this.d);
        sb.append(", logEnvironment=");
        sb.append(this.e);
        sb.append(", androidAppInfo=");
        sb.append(this.f);
        sb.append(')');
        return sb.toString();
    }
}
