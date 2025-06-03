// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package d4;

import Y3.e;
import java.util.Iterator;
import Y3.m;
import java.util.ArrayList;
import java.util.Stack;
import java.util.Collections;
import java.util.List;

public class d
{
    public final List a;
    public final List b;
    
    public d(final List a, final List b) {
        if (a.size() == b.size() - 1) {
            this.a = a;
            this.b = b;
            return;
        }
        throw new IllegalArgumentException("Number of posts need to be n-1 for n hashes in CompoundHash");
    }
    
    public static d b(final n n) {
        return c(n, (d)new c(n));
    }
    
    public static d c(final n n, final d d) {
        if (n.isEmpty()) {
            return new d(Collections.emptyList(), Collections.singletonList(""));
        }
        final b b = new b(d);
        f(n, b);
        b.o();
        return new d(d4.d.b.b(b), d4.d.b.c(b));
    }
    
    public static void f(final n obj, final b b) {
        if (obj.B()) {
            b.p((k)obj);
            return;
        }
        if (obj.isEmpty()) {
            throw new IllegalArgumentException("Can't calculate hash on empty node!");
        }
        if (obj instanceof d4.c) {
            ((d4.c)obj).S((d4.c.c)new d4.c.c() {
                @Override
                public void b(final b b, final n n) {
                    b.q(b);
                    f(n, b);
                    b.l();
                }
            }, true);
            return;
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("Expected children node, but got: ");
        sb.append(obj);
        throw new IllegalStateException(sb.toString());
    }
    
    public List d() {
        return Collections.unmodifiableList((List<?>)this.b);
    }
    
    public List e() {
        return Collections.unmodifiableList((List<?>)this.a);
    }
    
    public static class b
    {
        public StringBuilder a;
        public Stack b;
        public int c;
        public int d;
        public boolean e;
        public final List f;
        public final List g;
        public final d h;
        
        public b(final d h) {
            this.a = null;
            this.b = new Stack();
            this.c = -1;
            this.e = true;
            this.f = new ArrayList();
            this.g = new ArrayList();
            this.h = h;
        }
        
        public static /* synthetic */ List b(final b b) {
            return b.f;
        }
        
        public static /* synthetic */ List c(final b b) {
            return b.g;
        }
        
        public final void g(final StringBuilder sb, final d4.b b) {
            sb.append(m.j(b.e()));
        }
        
        public boolean h() {
            return this.a != null;
        }
        
        public int i() {
            return this.a.length();
        }
        
        public V3.k j() {
            return this.k(this.d);
        }
        
        public final V3.k k(final int n) {
            final d4.b[] array = new d4.b[n];
            for (int i = 0; i < n; ++i) {
                array[i] = (d4.b)this.b.get(i);
            }
            return new V3.k(array);
        }
        
        public final void l() {
            --this.d;
            if (this.h()) {
                this.a.append(")");
            }
            this.e = true;
        }
        
        public final void m() {
            m.g(this.h(), "Can't end range without starting a range!");
            for (int i = 0; i < this.d; ++i) {
                this.a.append(")");
            }
            this.a.append(")");
            final V3.k k = this.k(this.c);
            this.g.add(m.i(this.a.toString()));
            this.f.add(k);
            this.a = null;
        }
        
        public final void n() {
            if (!this.h()) {
                (this.a = new StringBuilder()).append("(");
                final Iterator iterator = this.k(this.d).iterator();
                while (iterator.hasNext()) {
                    this.g(this.a, iterator.next());
                    this.a.append(":(");
                }
                this.e = false;
            }
        }
        
        public final void o() {
            m.g(this.d == 0, "Can't finish hashing in the middle processing a child");
            if (this.h()) {
                this.m();
            }
            this.g.add("");
        }
        
        public final void p(final k k) {
            this.n();
            this.c = this.d;
            this.a.append(k.O(n.b.p));
            this.e = true;
            if (this.h.a(this)) {
                this.m();
            }
        }
        
        public final void q(final d4.b b) {
            this.n();
            if (this.e) {
                this.a.append(",");
            }
            this.g(this.a, b);
            this.a.append(":(");
            if (this.d == this.b.size()) {
                this.b.add(b);
            }
            else {
                this.b.set(this.d, b);
            }
            ++this.d;
            this.e = false;
        }
    }
    
    public static class c implements d
    {
        public final long a;
        
        public c(final n n) {
            this.a = Math.max(512L, (long)Math.sqrt((double)(e.b(n) * 100L)));
        }
        
        @Override
        public boolean a(final b b) {
            return b.i() > this.a && (b.j().isEmpty() || !b.j().X().equals(b.o()));
        }
    }
    
    public interface d
    {
        boolean a(final b p0);
    }
}
