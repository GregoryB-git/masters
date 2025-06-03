// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package B0;

import java.util.List;
import java.util.Collections;
import java.util.ArrayList;
import java.util.Comparator;

public class s
{
    public static final Comparator h;
    public static final Comparator i;
    public final int a;
    public final ArrayList b;
    public final b[] c;
    public int d;
    public int e;
    public int f;
    public int g;
    
    static {
        h = new q();
        i = new r();
    }
    
    public s(final int a) {
        this.a = a;
        this.c = new b[5];
        this.b = new ArrayList();
        this.d = -1;
    }
    
    public void c(int n, final float c) {
        this.d();
        final int g = this.g;
        b e;
        if (g > 0) {
            final b[] c2 = this.c;
            final int g2 = g - 1;
            this.g = g2;
            e = c2[g2];
        }
        else {
            e = new b(null);
        }
        e.a = this.e++;
        e.b = n;
        e.c = c;
        this.b.add(e);
        n += this.f;
    Label_0211:
        while (true) {
            this.f = n;
            while (true) {
                n = this.f;
                final int a = this.a;
                if (n <= a) {
                    break Label_0211;
                }
                n -= a;
                final b b = this.b.get(0);
                final int b2 = b.b;
                if (b2 > n) {
                    b.b = b2 - n;
                    n = this.f - n;
                    break;
                }
                this.f -= b2;
                this.b.remove(0);
                n = this.g;
                if (n >= 5) {
                    continue;
                }
                final b[] c3 = this.c;
                this.g = n + 1;
                c3[n] = b;
            }
        }
    }
    
    public final void d() {
        if (this.d != 1) {
            Collections.sort((List<Object>)this.b, s.h);
            this.d = 1;
        }
    }
    
    public final void e() {
        if (this.d != 0) {
            Collections.sort((List<Object>)this.b, s.i);
            this.d = 0;
        }
    }
    
    public float f(final float n) {
        this.e();
        final float n2 = (float)this.f;
        int i = 0;
        int n3 = 0;
        while (i < this.b.size()) {
            final b b = this.b.get(i);
            n3 += b.b;
            if (n3 >= n * n2) {
                return b.c;
            }
            ++i;
        }
        if (this.b.isEmpty()) {
            return Float.NaN;
        }
        final ArrayList b2 = this.b;
        return b2.get(b2.size() - 1).c;
    }
    
    public void i() {
        this.b.clear();
        this.d = -1;
        this.e = 0;
        this.f = 0;
    }
    
    public static class b
    {
        public int a;
        public int b;
        public float c;
    }
}
