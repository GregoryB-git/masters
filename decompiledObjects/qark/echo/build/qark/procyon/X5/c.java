// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package X5;

import kotlin.jvm.internal.l;
import g6.p;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.Intrinsics;
import java.io.Serializable;

public final class c implements g, Serializable
{
    public final g o;
    public final b p;
    
    public c(final g o, final b p2) {
        Intrinsics.checkNotNullParameter(o, "left");
        Intrinsics.checkNotNullParameter(p2, "element");
        this.o = o;
        this.p = p2;
    }
    
    private final Object writeReplace() {
        final int g = this.g();
        final g[] array = new g[g];
        final t t = new t();
        this.u(V5.t.a, new p() {
            public final void a(final V5.t t, final b b) {
                Intrinsics.checkNotNullParameter(t, "<anonymous parameter 0>");
                Intrinsics.checkNotNullParameter(b, "element");
                array[t.o++] = b;
            }
        });
        if (t.o == g) {
            return new a(array);
        }
        throw new IllegalStateException("Check failed.".toString());
    }
    
    @Override
    public b b(final g.c c) {
        Intrinsics.checkNotNullParameter(c, "key");
        c c2 = this;
        while (true) {
            final b b = c2.p.b(c);
            if (b != null) {
                return b;
            }
            final g o = c2.o;
            if (!(o instanceof c)) {
                return o.b(c);
            }
            c2 = (c)o;
        }
    }
    
    public final boolean d(final b b) {
        return Intrinsics.a(this.b(b.getKey()), b);
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this != o) {
            if (o instanceof c) {
                final c c = (c)o;
                if (c.g() == this.g() && c.f(this)) {
                    return true;
                }
            }
            return false;
        }
        return true;
    }
    
    public final boolean f(c c) {
        while (this.d(c.p)) {
            final g o = c.o;
            if (!(o instanceof c)) {
                Intrinsics.c(o, "null cannot be cast to non-null type kotlin.coroutines.CoroutineContext.Element");
                return this.d((b)o);
            }
            c = (c)o;
        }
        return false;
    }
    
    public final int g() {
        int n = 2;
        c c = this;
        while (true) {
            final g o = c.o;
            if (o instanceof c) {
                c = (c)o;
            }
            else {
                c = null;
            }
            if (c == null) {
                break;
            }
            ++n;
        }
        return n;
    }
    
    @Override
    public int hashCode() {
        return this.o.hashCode() + this.p.hashCode();
    }
    
    @Override
    public g k(final g g) {
        return X5.g.a.a(this, g);
    }
    
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append('[');
        sb.append((String)this.u("", c$b.o));
        sb.append(']');
        return sb.toString();
    }
    
    @Override
    public Object u(final Object o, final p p2) {
        Intrinsics.checkNotNullParameter(p2, "operation");
        return p2.invoke(this.o.u(o, p2), this.p);
    }
    
    @Override
    public g x(final g.c c) {
        Intrinsics.checkNotNullParameter(c, "key");
        if (this.p.b(c) != null) {
            return this.o;
        }
        final g x = this.o.x(c);
        if (x == this.o) {
            return this;
        }
        if (x == h.o) {
            return this.p;
        }
        return new c(x, this.p);
    }
    
    public static final class a implements Serializable
    {
        public static final c.a.a p;
        private static final long serialVersionUID = 0L;
        public final g[] o;
        
        static {
            p = new c.a.a(null);
        }
        
        public a(final g[] o) {
            Intrinsics.checkNotNullParameter(o, "elements");
            this.o = o;
        }
        
        private final Object readResolve() {
            final g[] o = this.o;
            g g = h.o;
            for (int length = o.length, i = 0; i < length; ++i) {
                g = g.k(o[i]);
            }
            return g;
        }
        
        public static final class a
        {
        }
    }
}
