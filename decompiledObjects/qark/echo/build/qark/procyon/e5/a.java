// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package e5;

import java.lang.reflect.Array;

public final class a
{
    public final b[] a;
    public int b;
    public final int c;
    public final int d;
    
    public a(final int c, final int n) {
        final b[] a = new b[c];
        this.a = a;
        for (int length = a.length, i = 0; i < length; ++i) {
            this.a[i] = new b((n + 4) * 17 + 1);
        }
        this.d = n * 17;
        this.c = c;
        this.b = -1;
    }
    
    public b a() {
        return this.a[this.b];
    }
    
    public byte[][] b(final int n, final int n2) {
        final byte[][] array = (byte[][])Array.newInstance(Byte.TYPE, this.c * n2, this.d * n);
        for (int n3 = this.c * n2, i = 0; i < n3; ++i) {
            array[n3 - i - 1] = this.a[i / n2].b(n);
        }
        return array;
    }
    
    public void c() {
        ++this.b;
    }
}
