// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package a4;

import java.util.Collections;
import java.util.Iterator;
import java.util.Arrays;
import Y3.m;
import V3.G;
import V3.h;
import b4.d;
import java.util.ArrayList;
import b4.a;
import d4.n;
import d4.g;
import b4.b;
import java.util.List;

public class j
{
    public final i a;
    public final l b;
    public k c;
    public final List d;
    public final f e;
    
    public j(final i a, final k k) {
        this.a = a;
        final b b = new b(a.c());
        final d j = a.d().j();
        this.b = new l(j);
        final a4.a d = k.d();
        final a4.a c = k.c();
        final d4.i f = d4.i.f(g.W(), a.c());
        this.c = new k(new a4.a(j.f(f, c.a(), null), c.f(), j.d()), new a4.a(b.f(f, d.a(), null), d.f(), b.d()));
        this.d = new ArrayList();
        this.e = new f(a);
    }
    
    public void a(final h h) {
        this.d.add(h);
    }
    
    public a b(final W3.d d, final G g, final n n) {
        final W3.d.a c = d.c();
        final W3.d.a p3 = W3.d.a.p;
        final boolean b = false;
        if (c == p3 && d.b().b() != null) {
            m.g(this.c.b() != null, "We should always have a full cache before handling merges");
            m.g(this.c.a() != null, "Missing event cache, even though we have a server cache");
        }
        final k c2 = this.c;
        final l.c b2 = this.b.b(c2, d, g, n);
        boolean b3 = false;
        Label_0133: {
            if (!b2.a.d().f()) {
                b3 = b;
                if (c2.d().f()) {
                    break Label_0133;
                }
            }
            b3 = true;
        }
        m.g(b3, "Once a server snap is complete, it should never go back");
        final k a = b2.a;
        this.c = a;
        return new a(this.c(b2.b, a.c().a(), null), b2.b);
    }
    
    public final List c(final List list, final d4.i i, final h h) {
        List<h> list2;
        if (h == null) {
            list2 = (List<h>)this.d;
        }
        else {
            list2 = Arrays.asList(h);
        }
        return this.e.d(list, i, list2);
    }
    
    public n d() {
        return this.c.a();
    }
    
    public n e(final V3.k k) {
        final n b = this.c.b();
        if (b != null && (this.a.g() || (!k.isEmpty() && !b.v(k.Z()).isEmpty()))) {
            return b.A(k);
        }
        return null;
    }
    
    public n f() {
        return this.c.c().b();
    }
    
    public List g(final h h) {
        final a4.a c = this.c.c();
        final ArrayList<c> list = new ArrayList<c>();
        for (final d4.m m : c.b()) {
            list.add(a4.c.c(m.c(), m.d()));
        }
        if (c.f()) {
            list.add(a4.c.n(c.a()));
        }
        return this.c(list, c.a(), h);
    }
    
    public i h() {
        return this.a;
    }
    
    public n i() {
        return this.c.d().b();
    }
    
    public boolean j() {
        return this.d.isEmpty();
    }
    
    public List k(h h, final Q3.c c) {
        int i = 0;
        Object emptyList;
        if (c != null) {
            final ArrayList<a4.b> list = new ArrayList<a4.b>();
            m.g(h == null, "A cancel should cancel all event registrations");
            final V3.k e = this.a.e();
            final Iterator iterator = this.d.iterator();
            while (true) {
                emptyList = list;
                if (!iterator.hasNext()) {
                    break;
                }
                list.add(new a4.b(iterator.next(), c, e));
            }
        }
        else {
            emptyList = Collections.emptyList();
        }
        if (h != null) {
            int n = -1;
            while (true) {
                while (i < this.d.size()) {
                    final h h2 = this.d.get(i);
                    if (h2.f(h)) {
                        if (h2.h()) {
                            if (i != -1) {
                                h = (h)this.d.get(i);
                                this.d.remove(i);
                                h.l();
                                return (List)emptyList;
                            }
                            return (List)emptyList;
                        }
                        else {
                            n = i;
                        }
                    }
                    ++i;
                }
                i = n;
                continue;
            }
        }
        final Iterator<h> iterator2 = (Iterator<h>)this.d.iterator();
        while (iterator2.hasNext()) {
            iterator2.next().l();
        }
        this.d.clear();
        return (List)emptyList;
    }
    
    public static class a
    {
        public final List a;
        public final List b;
        
        public a(final List a, final List b) {
            this.a = a;
            this.b = b;
        }
    }
}
