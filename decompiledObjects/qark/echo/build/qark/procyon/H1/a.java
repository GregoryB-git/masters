// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package H1;

import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.g;

public final class a
{
    public static final a d;
    public int[] a;
    public int b;
    public float[] c;
    
    static {
        d = new a(null);
    }
    
    public a(final int[] a) {
        Intrinsics.checkNotNullParameter(a, "shape");
        this.a = a;
        final int a2 = H1.a.d.b(a);
        this.b = a2;
        this.c = new float[a2];
    }
    
    public final float[] a() {
        return this.c;
    }
    
    public final int b(final int n) {
        return this.a[n];
    }
    
    public final int c() {
        return this.a.length;
    }
    
    public final void d(final int[] a) {
        Intrinsics.checkNotNullParameter(a, "shape");
        this.a = a;
        final int a2 = a.d.b(a);
        final float[] c = new float[a2];
        System.arraycopy(this.c, 0, c, 0, Math.min(this.b, a2));
        this.c = c;
        this.b = a2;
    }
    
    public static final class a
    {
        public final int b(final int[] array) {
            if (array.length != 0) {
                int n = array[0];
                final int j = W5.g.j(array);
                int n2 = 1;
                int n3 = n;
                if (1 <= j) {
                    while (true) {
                        n = (n3 = n * array[n2]);
                        if (n2 == j) {
                            break;
                        }
                        ++n2;
                    }
                }
                return n3;
            }
            throw new UnsupportedOperationException("Empty array can't be reduced.");
        }
    }
}
