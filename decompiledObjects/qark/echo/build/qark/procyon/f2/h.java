// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package f2;

import java.util.Arrays;
import c2.b;

public final class h
{
    public final b a;
    public final byte[] b;
    
    public h(final b a, final byte[] b) {
        if (a == null) {
            throw new NullPointerException("encoding is null");
        }
        if (b != null) {
            this.a = a;
            this.b = b;
            return;
        }
        throw new NullPointerException("bytes is null");
    }
    
    public byte[] a() {
        return this.b;
    }
    
    public b b() {
        return this.a;
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof h)) {
            return false;
        }
        final h h = (h)o;
        return this.a.equals(h.a) && Arrays.equals(this.b, h.b);
    }
    
    @Override
    public int hashCode() {
        return (this.a.hashCode() ^ 0xF4243) * 1000003 ^ Arrays.hashCode(this.b);
    }
    
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("EncodedPayload{encoding=");
        sb.append(this.a);
        sb.append(", bytes=[...]}");
        return sb.toString();
    }
}
