// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package e5;

public final class b
{
    public final byte[] a;
    public int b;
    
    public b(final int n) {
        this.a = new byte[n];
        this.b = 0;
    }
    
    public void a(final boolean b, final int n) {
        for (int i = 0; i < n; ++i) {
            this.c(this.b++, b);
        }
    }
    
    public byte[] b(final int n) {
        final int n2 = this.a.length * n;
        final byte[] array = new byte[n2];
        for (int i = 0; i < n2; ++i) {
            array[i] = this.a[i / n];
        }
        return array;
    }
    
    public final void c(final int n, final boolean b) {
        this.a[n] = (byte)(b ? 1 : 0);
    }
}
