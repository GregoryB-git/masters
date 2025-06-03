// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package p6;

import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.g;
import g6.l;

public final class y
{
    public final Object a;
    public final j b;
    public final l c;
    public final Object d;
    public final Throwable e;
    
    public y(final Object a, final j b, final l c, final Object d, final Throwable e) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
    }
    
    public final y a(final Object o, final j j, final l l, final Object o2, final Throwable t) {
        return new y(o, j, l, o2, t);
    }
    
    public final boolean c() {
        return this.e != null;
    }
    
    public final void d(final m m, final Throwable t) {
        final j b = this.b;
        if (b != null) {
            m.l(b, t);
        }
        final l c = this.c;
        if (c != null) {
            m.m(c, t);
        }
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof y)) {
            return false;
        }
        final y y = (y)o;
        return Intrinsics.a(this.a, y.a) && Intrinsics.a(this.b, y.b) && Intrinsics.a(this.c, y.c) && Intrinsics.a(this.d, y.d) && Intrinsics.a(this.e, y.e);
    }
    
    @Override
    public int hashCode() {
        final Object a = this.a;
        int hashCode = 0;
        int hashCode2;
        if (a == null) {
            hashCode2 = 0;
        }
        else {
            hashCode2 = a.hashCode();
        }
        final j b = this.b;
        int hashCode3;
        if (b == null) {
            hashCode3 = 0;
        }
        else {
            hashCode3 = b.hashCode();
        }
        final l c = this.c;
        int hashCode4;
        if (c == null) {
            hashCode4 = 0;
        }
        else {
            hashCode4 = c.hashCode();
        }
        final Object d = this.d;
        int hashCode5;
        if (d == null) {
            hashCode5 = 0;
        }
        else {
            hashCode5 = d.hashCode();
        }
        final Throwable e = this.e;
        if (e != null) {
            hashCode = e.hashCode();
        }
        return (((hashCode2 * 31 + hashCode3) * 31 + hashCode4) * 31 + hashCode5) * 31 + hashCode;
    }
    
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("CompletedContinuation(result=");
        sb.append(this.a);
        sb.append(", cancelHandler=");
        sb.append(this.b);
        sb.append(", onCancellation=");
        sb.append(this.c);
        sb.append(", idempotentResume=");
        sb.append(this.d);
        sb.append(", cancelCause=");
        sb.append(this.e);
        sb.append(')');
        return sb.toString();
    }
}
