// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package c4;

import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public abstract class b implements d
{
    public final Set a;
    public final a b;
    
    public b(final a b, final List c) {
        if (c != null) {
            this.a = new HashSet(c);
        }
        else {
            this.a = null;
        }
        this.b = b;
    }
    
    @Override
    public void a(final a a, final String s, String c, final long n) {
        if (this.g(a, s)) {
            c = this.c(a, s, c, n);
            final int n2 = b$a.a[a.ordinal()];
            if (n2 != 1) {
                if (n2 == 2) {
                    this.h(s, c);
                    return;
                }
                if (n2 == 3) {
                    this.f(s, c);
                    return;
                }
                if (n2 == 4) {
                    this.d(s, c);
                    return;
                }
                throw new RuntimeException("Should not reach here!");
            }
            else {
                this.e(s, c);
            }
        }
    }
    
    @Override
    public a b() {
        return this.b;
    }
    
    public abstract String c(final a p0, final String p1, final String p2, final long p3);
    
    public abstract void d(final String p0, final String p1);
    
    public abstract void e(final String p0, final String p1);
    
    public abstract void f(final String p0, final String p1);
    
    public boolean g(final a a, final String s) {
        return a.ordinal() >= this.b.ordinal() && (this.a == null || a.ordinal() > d.a.o.ordinal() || this.a.contains(s));
    }
    
    public abstract void h(final String p0, final String p1);
}
