// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package n2;

import f2.i;
import f2.p;

public final class b extends k
{
    public final long a;
    public final p b;
    public final i c;
    
    public b(final long a, final p b, final i c) {
        this.a = a;
        if (b == null) {
            throw new NullPointerException("Null transportContext");
        }
        this.b = b;
        if (c != null) {
            this.c = c;
            return;
        }
        throw new NullPointerException("Null event");
    }
    
    @Override
    public i b() {
        return this.c;
    }
    
    @Override
    public long c() {
        return this.a;
    }
    
    @Override
    public p d() {
        return this.b;
    }
    
    @Override
    public boolean equals(final Object o) {
        if (o == this) {
            return true;
        }
        if (o instanceof k) {
            final k k = (k)o;
            return this.a == k.c() && this.b.equals(k.d()) && this.c.equals(k.b());
        }
        return false;
    }
    
    @Override
    public int hashCode() {
        final long a = this.a;
        return (((int)(a ^ a >>> 32) ^ 0xF4243) * 1000003 ^ this.b.hashCode()) * 1000003 ^ this.c.hashCode();
    }
    
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("PersistedEvent{id=");
        sb.append(this.a);
        sb.append(", transportContext=");
        sb.append(this.b);
        sb.append(", event=");
        sb.append(this.c);
        sb.append("}");
        return sb.toString();
    }
}
