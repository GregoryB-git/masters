// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package R4;

import x1.j;
import kotlin.jvm.internal.g;
import kotlin.jvm.internal.Intrinsics;

public final class t
{
    public final String a;
    public final String b;
    public final int c;
    public long d;
    public f e;
    public String f;
    
    public t(final String a, final String b, final int c, final long d, final f e, final String f) {
        Intrinsics.checkNotNullParameter(a, "sessionId");
        Intrinsics.checkNotNullParameter(b, "firstSessionId");
        Intrinsics.checkNotNullParameter(e, "dataCollectionStatus");
        Intrinsics.checkNotNullParameter(f, "firebaseInstallationId");
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
    }
    
    public final f a() {
        return this.e;
    }
    
    public final long b() {
        return this.d;
    }
    
    public final String c() {
        return this.f;
    }
    
    public final String d() {
        return this.b;
    }
    
    public final String e() {
        return this.a;
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof t)) {
            return false;
        }
        final t t = (t)o;
        return Intrinsics.a(this.a, t.a) && Intrinsics.a(this.b, t.b) && this.c == t.c && this.d == t.d && Intrinsics.a(this.e, t.e) && Intrinsics.a(this.f, t.f);
    }
    
    public final int f() {
        return this.c;
    }
    
    public final void g(final String f) {
        Intrinsics.checkNotNullParameter(f, "<set-?>");
        this.f = f;
    }
    
    @Override
    public int hashCode() {
        return ((((this.a.hashCode() * 31 + this.b.hashCode()) * 31 + this.c) * 31 + j.a(this.d)) * 31 + this.e.hashCode()) * 31 + this.f.hashCode();
    }
    
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("SessionInfo(sessionId=");
        sb.append(this.a);
        sb.append(", firstSessionId=");
        sb.append(this.b);
        sb.append(", sessionIndex=");
        sb.append(this.c);
        sb.append(", eventTimestampUs=");
        sb.append(this.d);
        sb.append(", dataCollectionStatus=");
        sb.append(this.e);
        sb.append(", firebaseInstallationId=");
        sb.append(this.f);
        sb.append(')');
        return sb.toString();
    }
}
