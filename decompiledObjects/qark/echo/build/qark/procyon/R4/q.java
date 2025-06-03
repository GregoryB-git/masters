// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package R4;

import kotlin.jvm.internal.Intrinsics;

public final class q
{
    public final j a;
    public final t b;
    public final b c;
    
    public q(final j a, final t b, final b c) {
        Intrinsics.checkNotNullParameter(a, "eventType");
        Intrinsics.checkNotNullParameter(b, "sessionData");
        Intrinsics.checkNotNullParameter(c, "applicationInfo");
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public final b a() {
        return this.c;
    }
    
    public final j b() {
        return this.a;
    }
    
    public final t c() {
        return this.b;
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof q)) {
            return false;
        }
        final q q = (q)o;
        return this.a == q.a && Intrinsics.a(this.b, q.b) && Intrinsics.a(this.c, q.c);
    }
    
    @Override
    public int hashCode() {
        return (this.a.hashCode() * 31 + this.b.hashCode()) * 31 + this.c.hashCode();
    }
    
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("SessionEvent(eventType=");
        sb.append(this.a);
        sb.append(", sessionData=");
        sb.append(this.b);
        sb.append(", applicationInfo=");
        sb.append(this.c);
        sb.append(')');
        return sb.toString();
    }
}
