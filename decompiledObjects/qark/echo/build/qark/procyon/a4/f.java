// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package a4;

import java.util.Collections;
import java.util.Iterator;
import java.util.ArrayList;
import java.util.List;
import Y3.m;
import java.util.Comparator;
import d4.h;

public class f
{
    public final i a;
    public final h b;
    
    public f(final i a) {
        this.a = a;
        this.b = a.c();
    }
    
    public static /* synthetic */ h a(final f f) {
        return f.b;
    }
    
    public final Comparator b() {
        return new Comparator() {
            public int a(final c c, final c c2) {
                m.f(c.i() != null && c2.i() != null);
                return f.a(f.this).compare(new d4.m(c.i(), c.k().k()), new d4.m(c2.i(), c2.k().k()));
            }
        };
    }
    
    public final d c(final c c, final V3.h h, final d4.i i) {
        c a = c;
        if (!c.j().equals(e.a.s)) {
            if (c.j().equals(e.a.o)) {
                a = c;
            }
            else {
                a = c.a(i.q(c.i(), c.k().k(), this.b));
            }
        }
        return h.b(a, this.a);
    }
    
    public List d(final List list, final d4.i i, final List list2) {
        final ArrayList list3 = new ArrayList();
        final ArrayList<c> list4 = new ArrayList<c>();
        for (final c c : list) {
            if (c.j().equals(e.a.r) && this.b.d(c.l().k(), c.k().k())) {
                list4.add(c.f(c.i(), c.k()));
            }
        }
        this.e(list3, e.a.o, list, list2, i);
        this.e(list3, e.a.p, list, list2, i);
        this.e(list3, e.a.q, list4, list2, i);
        this.e(list3, e.a.r, list, list2, i);
        this.e(list3, e.a.s, list, list2, i);
        return list3;
    }
    
    public final void e(final List list, final e.a obj, final List list2, final List list3, final d4.i i) {
        final ArrayList<c> list4 = new ArrayList<c>();
        for (final c c : list2) {
            if (c.j().equals(obj)) {
                list4.add(c);
            }
        }
        Collections.sort((List<Object>)list4, this.b());
        for (final c c2 : list4) {
            for (final V3.h h : list3) {
                if (h.i(obj)) {
                    list.add(this.c(c2, h, i));
                }
            }
        }
    }
}
