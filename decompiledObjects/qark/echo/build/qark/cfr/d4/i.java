/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.IllegalArgumentException
 *  java.lang.Iterable
 *  java.lang.Object
 *  java.lang.String
 *  java.util.ArrayList
 *  java.util.Collections
 *  java.util.Comparator
 *  java.util.Iterator
 *  java.util.List
 */
package d4;

import S3.e;
import d4.b;
import d4.c;
import d4.h;
import d4.j;
import d4.m;
import d4.n;
import d4.q;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class i
implements Iterable {
    public static final e r = new e(Collections.emptyList(), null);
    public final n o;
    public e p;
    public final h q;

    public i(n n8, h h8) {
        this.q = h8;
        this.o = n8;
        this.p = null;
    }

    public i(n n8, h h8, e e8) {
        this.q = h8;
        this.o = n8;
        this.p = e8;
    }

    public static i d(n n8) {
        return new i(n8, q.j());
    }

    public static i f(n n8, h h8) {
        return new i(n8, h8);
    }

    public i D(b b8, n n8) {
        n n9 = this.o.N(b8, n8);
        e e8 = this.p;
        Object object = r;
        if (A2.m.a(e8, object) && !this.q.e(n8)) {
            return new i(n9, this.q, (e)object);
        }
        e8 = this.p;
        if (e8 != null && !A2.m.a(e8, object)) {
            object = this.o.v(b8);
            object = e8 = this.p.i(new m(b8, (n)object));
            if (!n8.isEmpty()) {
                object = e8.g(new m(b8, n8));
            }
            return new i(n9, this.q, (e)object);
        }
        return new i(n9, this.q, null);
    }

    public i M(n n8) {
        return new i(this.o.J(n8), this.q, this.p);
    }

    public Iterator P() {
        this.a();
        if (A2.m.a(this.p, r)) {
            return this.o.P();
        }
        return this.p.P();
    }

    /*
     * Enabled aggressive block sorting
     */
    public final void a() {
        if (this.p != null) {
            return;
        }
        if (!this.q.equals((Object)j.j())) {
            ArrayList arrayList = new ArrayList();
            Iterator iterator = this.o.iterator();
            boolean bl = false;
            while (iterator.hasNext()) {
                m m8 = (m)iterator.next();
                bl = bl || this.q.e(m8.d());
                arrayList.add((Object)new m(m8.c(), m8.d()));
            }
        }
        this.p = r;
    }

    public m g() {
        if (!(this.o instanceof c)) {
            return null;
        }
        this.a();
        if (A2.m.a(this.p, r)) {
            b b8 = ((c)this.o).T();
            return new m(b8, this.o.v(b8));
        }
        return (m)this.p.d();
    }

    public m i() {
        if (!(this.o instanceof c)) {
            return null;
        }
        this.a();
        if (A2.m.a(this.p, r)) {
            b b8 = ((c)this.o).U();
            return new m(b8, this.o.v(b8));
        }
        return (m)this.p.a();
    }

    public Iterator iterator() {
        this.a();
        if (A2.m.a(this.p, r)) {
            return this.o.iterator();
        }
        return this.p.iterator();
    }

    public n k() {
        return this.o;
    }

    public b q(b object, n n8, h h8) {
        if (!this.q.equals((Object)j.j()) && !this.q.equals((Object)h8)) {
            throw new IllegalArgumentException("Index not available in IndexedNode!");
        }
        this.a();
        if (A2.m.a(this.p, r)) {
            return this.o.I((b)object);
        }
        if ((object = (m)this.p.f(new m((b)object, n8))) != null) {
            return object.c();
        }
        return null;
    }

    public boolean s(h h8) {
        if (this.q == h8) {
            return true;
        }
        return false;
    }
}

