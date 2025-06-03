// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package o0;

import g0.M;
import java.util.Collection;
import d0.H;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Collections;
import java.util.List;
import android.net.Uri;
import v0.a;

public class c implements a
{
    public final long a;
    public final long b;
    public final long c;
    public final boolean d;
    public final long e;
    public final long f;
    public final long g;
    public final long h;
    public final o i;
    public final l j;
    public final Uri k;
    public final h l;
    public final List m;
    
    public c(final long a, final long b, final long c, final boolean d, final long e, final long f, final long g, final long h, final h l, final o i, final l j, final Uri k, List emptyList) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
        this.g = g;
        this.h = h;
        this.l = l;
        this.i = i;
        this.k = k;
        this.j = j;
        if (emptyList == null) {
            emptyList = Collections.emptyList();
        }
        this.m = emptyList;
    }
    
    public static ArrayList c(final List list, final LinkedList list2) {
        H h = list2.poll();
        final int o = h.o;
        final ArrayList<o0.a> list3 = new ArrayList<o0.a>();
        H e;
        do {
            final int p2 = h.p;
            final o0.a a = list.get(p2);
            final List c = a.c;
            final ArrayList<j> list4 = new ArrayList<j>();
            do {
                list4.add(c.get(h.q));
                e = list2.poll();
                if (e.o != o) {
                    break;
                }
                h = e;
            } while (e.p == p2);
            list3.add(new o0.a(a.a, a.b, list4, a.d, a.e, a.f));
            h = e;
        } while (e.o == o);
        list2.addFirst(e);
        return list3;
    }
    
    public final c b(final List c) {
        final LinkedList<H> list = (LinkedList<H>)new LinkedList<Comparable>(c);
        Collections.sort((List<Comparable>)list);
        list.add(new H(-1, -1, -1));
        final ArrayList<g> list2 = new ArrayList<g>();
        long n = 0L;
        int n2 = 0;
        long n3;
        while (true) {
            final int e = this.e();
            n3 = -9223372036854775807L;
            if (n2 >= e) {
                break;
            }
            long n4;
            if (list.peek().o != n2) {
                final long f = this.f(n2);
                n4 = n;
                if (f != -9223372036854775807L) {
                    n4 = n + f;
                }
            }
            else {
                final g d = this.d(n2);
                list2.add(new g(d.a, d.b - n, c(d.c, list), d.d));
                n4 = n;
            }
            ++n2;
            n = n4;
        }
        final long b = this.b;
        if (b != -9223372036854775807L) {
            n3 = b - n;
        }
        return new c(this.a, n3, this.c, this.d, this.e, this.f, this.g, this.h, this.l, this.i, this.j, this.k, list2);
    }
    
    public final g d(final int n) {
        return this.m.get(n);
    }
    
    public final int e() {
        return this.m.size();
    }
    
    public final long f(final int n) {
        long n2;
        if (n == this.m.size() - 1) {
            if ((n2 = this.b) == -9223372036854775807L) {
                return -9223372036854775807L;
            }
        }
        else {
            n2 = this.m.get(n + 1).b;
        }
        return n2 - this.m.get(n).b;
    }
    
    public final long g(final int n) {
        return M.J0(this.f(n));
    }
}
