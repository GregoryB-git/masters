// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package V5;

import kotlin.jvm.internal.Intrinsics;
import java.io.Serializable;

public final class m implements Serializable
{
    public final Object o;
    public final Object p;
    
    public m(final Object o, final Object p2) {
        this.o = o;
        this.p = p2;
    }
    
    public final Object a() {
        return this.o;
    }
    
    public final Object b() {
        return this.p;
    }
    
    public final Object c() {
        return this.o;
    }
    
    public final Object d() {
        return this.p;
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof m)) {
            return false;
        }
        final m m = (m)o;
        return Intrinsics.a(this.o, m.o) && Intrinsics.a(this.p, m.p);
    }
    
    @Override
    public int hashCode() {
        final Object o = this.o;
        int hashCode = 0;
        int hashCode2;
        if (o == null) {
            hashCode2 = 0;
        }
        else {
            hashCode2 = o.hashCode();
        }
        final Object p = this.p;
        if (p != null) {
            hashCode = p.hashCode();
        }
        return hashCode2 * 31 + hashCode;
    }
    
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append('(');
        sb.append(this.o);
        sb.append(", ");
        sb.append(this.p);
        sb.append(')');
        return sb.toString();
    }
}
