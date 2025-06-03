// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package l6;

import kotlin.jvm.internal.g;

public final class c extends l6.a
{
    public static final a s;
    public static final c t;
    
    static {
        s = new a(null);
        t = new c(1, 0);
    }
    
    public c(final int n, final int n2) {
        super(n, n2, 1);
    }
    
    public static final /* synthetic */ c i() {
        return c.t;
    }
    
    @Override
    public boolean equals(final Object o) {
        if (o instanceof c) {
            if (!this.isEmpty() || !((c)o).isEmpty()) {
                final int a = this.a();
                final c c = (c)o;
                if (a != c.a() || this.d() != c.d()) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }
    
    @Override
    public int hashCode() {
        if (this.isEmpty()) {
            return -1;
        }
        return this.a() * 31 + this.d();
    }
    
    @Override
    public boolean isEmpty() {
        return this.a() > this.d();
    }
    
    public Integer k() {
        return this.d();
    }
    
    public Integer q() {
        return this.a();
    }
    
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append(this.a());
        sb.append("..");
        sb.append(this.d());
        return sb.toString();
    }
    
    public static final class a
    {
        public final c a() {
            return c.i();
        }
    }
}
