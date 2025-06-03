// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package R4;

import x1.j;
import kotlin.jvm.internal.Intrinsics;

public final class p
{
    public final String a;
    public final String b;
    public final int c;
    public final long d;
    
    public p(final String a, final String b, final int c, final long d) {
        Intrinsics.checkNotNullParameter(a, "sessionId");
        Intrinsics.checkNotNullParameter(b, "firstSessionId");
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }
    
    public final String a() {
        return this.b;
    }
    
    public final String b() {
        return this.a;
    }
    
    public final int c() {
        return this.c;
    }
    
    public final long d() {
        return this.d;
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof p)) {
            return false;
        }
        final p p = (p)o;
        return Intrinsics.a(this.a, p.a) && Intrinsics.a(this.b, p.b) && this.c == p.c && this.d == p.d;
    }
    
    @Override
    public int hashCode() {
        return ((this.a.hashCode() * 31 + this.b.hashCode()) * 31 + this.c) * 31 + j.a(this.d);
    }
    
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("SessionDetails(sessionId=");
        sb.append(this.a);
        sb.append(", firstSessionId=");
        sb.append(this.b);
        sb.append(", sessionIndex=");
        sb.append(this.c);
        sb.append(", sessionStartTimestampUs=");
        sb.append(this.d);
        sb.append(')');
        return sb.toString();
    }
}
