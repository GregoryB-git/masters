// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package kotlin.text;

import kotlin.jvm.internal.Intrinsics;
import l6.c;

public final class d
{
    public final String a;
    public final c b;
    
    public d(final String a, final c b) {
        Intrinsics.checkNotNullParameter(a, "value");
        Intrinsics.checkNotNullParameter(b, "range");
        this.a = a;
        this.b = b;
    }
    
    public final String a() {
        return this.a;
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof d)) {
            return false;
        }
        final d d = (d)o;
        return Intrinsics.a(this.a, d.a) && Intrinsics.a(this.b, d.b);
    }
    
    @Override
    public int hashCode() {
        return this.a.hashCode() * 31 + this.b.hashCode();
    }
    
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("MatchGroup(value=");
        sb.append(this.a);
        sb.append(", range=");
        sb.append(this.b);
        sb.append(')');
        return sb.toString();
    }
}
