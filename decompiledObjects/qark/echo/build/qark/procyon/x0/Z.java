// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package x0;

import g0.o;
import java.util.Collection;
import W2.g;
import java.util.List;
import X2.E;
import g0.M;
import d0.J;
import X2.v;

public final class Z
{
    public static final Z d;
    public static final String e;
    public final int a;
    public final v b;
    public int c;
    
    static {
        d = new Z(new J[0]);
        e = M.w0(0);
    }
    
    public Z(final J... array) {
        this.b = v.V(array);
        this.a = array.length;
        this.f();
    }
    
    public J b(final int n) {
        return this.b.get(n);
    }
    
    public v c() {
        return v.U(E.k(this.b, new Y()));
    }
    
    public int d(final J j) {
        final int index = this.b.indexOf(j);
        if (index >= 0) {
            return index;
        }
        return -1;
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (o == null) {
            return false;
        }
        if (Z.class != o.getClass()) {
            return false;
        }
        final Z z = (Z)o;
        return this.a == z.a && this.b.equals(z.b);
    }
    
    public final void f() {
        int n;
        for (int i = 0; i < this.b.size(); i = n) {
            int j;
            for (n = (j = i + 1); j < this.b.size(); ++j) {
                if (this.b.get(i).equals(this.b.get(j))) {
                    o.d("TrackGroupArray", "", new IllegalArgumentException("Multiple identical TrackGroups added to one TrackGroupArray."));
                }
            }
        }
    }
    
    @Override
    public int hashCode() {
        if (this.c == 0) {
            this.c = this.b.hashCode();
        }
        return this.c;
    }
}
