// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package p6;

import kotlin.jvm.internal.Intrinsics;
import g6.l;

public final class A
{
    public final Object a;
    public final l b;
    
    public A(final Object a, final l b) {
        this.a = a;
        this.b = b;
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof A)) {
            return false;
        }
        final A a = (A)o;
        return Intrinsics.a(this.a, a.a) && Intrinsics.a(this.b, a.b);
    }
    
    @Override
    public int hashCode() {
        final Object a = this.a;
        int hashCode;
        if (a == null) {
            hashCode = 0;
        }
        else {
            hashCode = a.hashCode();
        }
        return hashCode * 31 + this.b.hashCode();
    }
    
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("CompletedWithCancellation(result=");
        sb.append(this.a);
        sb.append(", onCancellation=");
        sb.append(this.b);
        sb.append(')');
        return sb.toString();
    }
}
