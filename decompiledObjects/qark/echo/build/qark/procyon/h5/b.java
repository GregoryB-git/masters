// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package h5;

import java.util.Arrays;
import java.lang.reflect.Array;

public final class b
{
    public final byte[][] a;
    public final int b;
    public final int c;
    
    public b(final int b, final int c) {
        this.a = (byte[][])Array.newInstance(Byte.TYPE, c, b);
        this.b = b;
        this.c = c;
    }
    
    public void a(final byte val) {
        final byte[][] a = this.a;
        for (int length = a.length, i = 0; i < length; ++i) {
            Arrays.fill(a[i], val);
        }
    }
    
    public byte b(final int n, final int n2) {
        return this.a[n2][n];
    }
    
    public byte[][] c() {
        return this.a;
    }
    
    public int d() {
        return this.c;
    }
    
    public int e() {
        return this.b;
    }
    
    public void f(final int n, final int n2, final int n3) {
        this.a[n2][n] = (byte)n3;
    }
    
    public void g(final int n, final int n2, final boolean b) {
        this.a[n2][n] = (byte)(b ? 1 : 0);
    }
    
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder(this.b * 2 * this.c + 2);
        for (int i = 0; i < this.c; ++i) {
            final byte[] array = this.a[i];
            for (int j = 0; j < this.b; ++j) {
                final byte b = array[j];
                String str;
                if (b != 0) {
                    if (b != 1) {
                        str = "  ";
                    }
                    else {
                        str = " 1";
                    }
                }
                else {
                    str = " 0";
                }
                sb.append(str);
            }
            sb.append('\n');
        }
        return sb.toString();
    }
}
