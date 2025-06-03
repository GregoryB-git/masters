// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package d0;

import g0.M;
import g0.a;
import android.util.SparseBooleanArray;

public final class p
{
    public final SparseBooleanArray a;
    
    public p(final SparseBooleanArray a) {
        this.a = a;
    }
    
    public boolean a(final int n) {
        return this.a.get(n);
    }
    
    public int b(final int n) {
        g0.a.c(n, 0, this.c());
        return this.a.keyAt(n);
    }
    
    public int c() {
        return this.a.size();
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof p)) {
            return false;
        }
        final p p = (p)o;
        if (M.a >= 24) {
            return this.a.equals((Object)p.a);
        }
        if (this.c() != p.c()) {
            return false;
        }
        for (int i = 0; i < this.c(); ++i) {
            if (this.b(i) != p.b(i)) {
                return false;
            }
        }
        return true;
    }
    
    @Override
    public int hashCode() {
        if (M.a < 24) {
            int c = this.c();
            for (int i = 0; i < this.c(); ++i) {
                c = c * 31 + this.b(i);
            }
            return c;
        }
        return this.a.hashCode();
    }
    
    public static final class b
    {
        public final SparseBooleanArray a;
        public boolean b;
        
        public b() {
            this.a = new SparseBooleanArray();
        }
        
        public b a(final int n) {
            g0.a.f(this.b ^ true);
            this.a.append(n, true);
            return this;
        }
        
        public b b(final p p) {
            for (int i = 0; i < p.c(); ++i) {
                this.a(p.b(i));
            }
            return this;
        }
        
        public b c(final int... array) {
            for (int length = array.length, i = 0; i < length; ++i) {
                this.a(array[i]);
            }
            return this;
        }
        
        public b d(final int n, final boolean b) {
            if (b) {
                return this.a(n);
            }
            return this;
        }
        
        public p e() {
            g0.a.f(this.b ^ true);
            this.b = true;
            return new p(this.a, null);
        }
    }
}
