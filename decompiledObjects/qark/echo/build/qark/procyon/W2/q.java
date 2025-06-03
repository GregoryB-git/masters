// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package W2;

import java.util.Collections;
import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;

public final class q
{
    public final d a;
    public final boolean b;
    public final c c;
    public final int d;
    
    public q(final c c) {
        this(c, false, W2.d.f(), Integer.MAX_VALUE);
    }
    
    public q(final c c, final boolean b, final d a, final int d) {
        this.c = c;
        this.b = b;
        this.a = a;
        this.d = d;
    }
    
    public static /* synthetic */ d a(final q q) {
        return q.a;
    }
    
    public static /* synthetic */ boolean b(final q q) {
        return q.b;
    }
    
    public static /* synthetic */ int c(final q q) {
        return q.d;
    }
    
    public static q d(final char c) {
        return e(d.d(c));
    }
    
    public static q e(final d d) {
        m.j(d);
        return new q((c)new c() {
            public b b(final q q, final CharSequence charSequence) {
                return new b(q, charSequence) {
                    @Override
                    public int g(final int n) {
                        return n + 1;
                    }
                    
                    @Override
                    public int h(final int n) {
                        return d.c(super.q, n);
                    }
                };
            }
        });
    }
    
    public List f(final CharSequence charSequence) {
        m.j(charSequence);
        final Iterator g = this.g(charSequence);
        final ArrayList<String> list = new ArrayList<String>();
        while (g.hasNext()) {
            list.add(g.next());
        }
        return Collections.unmodifiableList((List<?>)list);
    }
    
    public final Iterator g(final CharSequence charSequence) {
        return this.c.a(this, charSequence);
    }
    
    public abstract static class b extends W2.b
    {
        public final CharSequence q;
        public final d r;
        public final boolean s;
        public int t;
        public int u;
        
        public b(final q q, final CharSequence q2) {
            this.t = 0;
            this.r = q.a(q);
            this.s = q.b(q);
            this.u = q.c(q);
            this.q = q2;
        }
        
        public String f() {
            while (true) {
                final int t = this.t;
                int n;
                int i;
                while (true) {
                    final int t2 = this.t;
                    if (t2 == -1) {
                        return (String)this.d();
                    }
                    n = this.h(t2);
                    if (n == -1) {
                        n = this.q.length();
                        this.t = -1;
                    }
                    else {
                        this.t = this.g(n);
                    }
                    final int t3 = this.t;
                    i = t;
                    if (t3 != t) {
                        break;
                    }
                    if ((this.t = t3 + 1) <= this.q.length()) {
                        continue;
                    }
                    this.t = -1;
                }
                int n2;
                while (i < (n2 = n)) {
                    n2 = n;
                    if (!this.r.e(this.q.charAt(i))) {
                        break;
                    }
                    ++i;
                }
                while (n2 > i && this.r.e(this.q.charAt(n2 - 1))) {
                    --n2;
                }
                if (this.s && i == n2) {
                    continue;
                }
                final int u = this.u;
                if (u == 1) {
                    int length = this.q.length();
                    this.t = -1;
                    while (true) {
                        n2 = length;
                        if (length <= i) {
                            break;
                        }
                        n2 = length;
                        if (!this.r.e(this.q.charAt(length - 1))) {
                            break;
                        }
                        --length;
                    }
                }
                else {
                    this.u = u - 1;
                }
                return this.q.subSequence(i, n2).toString();
            }
        }
        
        public abstract int g(final int p0);
        
        public abstract int h(final int p0);
    }
    
    public interface c
    {
        Iterator a(final q p0, final CharSequence p1);
    }
}
