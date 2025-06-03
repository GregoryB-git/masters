/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.util.Iterator
 */
package b4;

import V3.k;
import a4.c;
import b4.a;
import b4.d;
import d4.h;
import d4.i;
import d4.m;
import d4.n;
import java.util.Iterator;

public class b
implements d {
    public final h a;

    public b(h h8) {
        this.a = h8;
    }

    @Override
    public i a(i i8, n n8) {
        if (i8.k().isEmpty()) {
            return i8;
        }
        return i8.M(n8);
    }

    @Override
    public d b() {
        return this;
    }

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public i c(i i8, d4.b b8, n n8, k object, d.a object2, a a8) {
        block2 : {
            block5 : {
                n n9;
                block3 : {
                    block4 : {
                        Y3.m.g(i8.s(this.a), "The index must match the filter");
                        object2 = i8.k();
                        n9 = object2.v(b8);
                        if (n9.A((k)object).equals((Object)n8.A((k)object)) && n9.isEmpty() == n8.isEmpty()) {
                            return i8;
                        }
                        if (a8 == null) break block2;
                        if (!n8.isEmpty()) break block3;
                        if (!object2.Q(b8)) break block4;
                        object = c.h(b8, n9);
                        break block5;
                    }
                    Y3.m.g(object2.B(), "A child remove without an old child only makes sense on a leaf node");
                    break block2;
                }
                object = n9.isEmpty() ? c.c(b8, n8) : c.e(b8, n8, n9);
            }
            a8.b((c)object);
        }
        if (object2.B() && n8.isEmpty()) {
            return i8;
        }
        return i8.D(b8, n8);
    }

    @Override
    public boolean d() {
        return false;
    }

    @Override
    public h e() {
        return this.a;
    }

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public i f(i i8, i i9, a a8) {
        Y3.m.g(i9.s(this.a), "Can't use IndexedNode that doesn't have filter's index");
        if (a8 != null) {
            for (m m8 : i8.k()) {
                if (i9.k().Q(m8.c())) continue;
                a8.b(c.h(m8.c(), m8.d()));
            }
            if (!i9.k().B()) {
                m m8;
                m8 = i9.k().iterator();
                while (m8.hasNext()) {
                    Object object = (m)m8.next();
                    if (i8.k().Q(object.c())) {
                        n n8 = i8.k().v(object.c());
                        if (n8.equals((Object)object.d())) continue;
                        object = c.e(object.c(), object.d(), n8);
                    } else {
                        object = c.c(object.c(), object.d());
                    }
                    a8.b((c)object);
                }
            }
        }
        return i9;
    }
}

