// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package r3;

import q3.k;
import java.util.Arrays;

public final class a
{
    public final byte[] a;
    
    public a(final byte[] array, final int n, final int n2) {
        System.arraycopy(array, n, this.a = new byte[n2], 0, n2);
    }
    
    public static a a(final byte[] array) {
        if (array != null) {
            return b(array, 0, array.length);
        }
        throw new NullPointerException("data must be non-null");
    }
    
    public static a b(final byte[] array, final int n, final int n2) {
        if (array != null) {
            return new a(array, n, n2);
        }
        throw new NullPointerException("data must be non-null");
    }
    
    public int c() {
        return this.a.length;
    }
    
    @Override
    public boolean equals(final Object o) {
        return o instanceof a && Arrays.equals(((a)o).a, this.a);
    }
    
    @Override
    public int hashCode() {
        return Arrays.hashCode(this.a);
    }
    
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("Bytes(");
        sb.append(k.b(this.a));
        sb.append(")");
        return sb.toString();
    }
}
