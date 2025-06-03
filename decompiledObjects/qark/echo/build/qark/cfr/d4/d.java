/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.IllegalArgumentException
 *  java.lang.IllegalStateException
 *  java.lang.Math
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.util.ArrayList
 *  java.util.Collections
 *  java.util.List
 *  java.util.Stack
 */
package d4;

import Y3.e;
import Y3.m;
import d4.c;
import d4.k;
import d4.n;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Stack;

public class d {
    public final List a;
    public final List b;

    public d(List list, List list2) {
        if (list.size() == list2.size() - 1) {
            this.a = list;
            this.b = list2;
            return;
        }
        throw new IllegalArgumentException("Number of posts need to be n-1 for n hashes in CompoundHash");
    }

    public static d b(n n8) {
        return d.c(n8, new c(n8));
    }

    public static d c(n n8, d object) {
        if (n8.isEmpty()) {
            return new d(Collections.emptyList(), Collections.singletonList((Object)""));
        }
        object = new b((d)object);
        d.f(n8, (b)object);
        ((b)object).o();
        return new d(((b)object).f, ((b)object).g);
    }

    public static void f(n n8, b b8) {
        if (n8.B()) {
            b8.p((k)n8);
            return;
        }
        if (!n8.isEmpty()) {
            if (n8 instanceof d4.c) {
                ((d4.c)n8).S(new c.c(){

                    @Override
                    public void b(d4.b b8, n n8) {
                        b.this.q(b8);
                        d.f(n8, b.this);
                        b.this.l();
                    }
                }, true);
                return;
            }
            b8 = new StringBuilder();
            b8.append("Expected children node, but got: ");
            b8.append((Object)n8);
            throw new IllegalStateException(b8.toString());
        }
        throw new IllegalArgumentException("Can't calculate hash on empty node!");
    }

    public List d() {
        return Collections.unmodifiableList((List)this.b);
    }

    public List e() {
        return Collections.unmodifiableList((List)this.a);
    }

    public static class b {
        public StringBuilder a = null;
        public Stack b = new Stack();
        public int c = -1;
        public int d;
        public boolean e = true;
        public final List f = new ArrayList();
        public final List g = new ArrayList();
        public final d h;

        public b(d d8) {
            this.h = d8;
        }

        public final void g(StringBuilder stringBuilder, d4.b b8) {
            stringBuilder.append(m.j(b8.e()));
        }

        public boolean h() {
            if (this.a != null) {
                return true;
            }
            return false;
        }

        public int i() {
            return this.a.length();
        }

        public V3.k j() {
            return this.k(this.d);
        }

        public final V3.k k(int n8) {
            d4.b[] arrb = new d4.b[n8];
            for (int i8 = 0; i8 < n8; ++i8) {
                arrb[i8] = (d4.b)this.b.get(i8);
            }
            return new V3.k(arrb);
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
            for (int i8 = 0; i8 < this.d; ++i8) {
                this.a.append(")");
            }
            this.a.append(")");
            V3.k k8 = this.k(this.c);
            String string2 = m.i(this.a.toString());
            this.g.add((Object)string2);
            this.f.add((Object)k8);
            this.a = null;
        }

        public final void n() {
            if (!this.h()) {
                StringBuilder stringBuilder;
                this.a = stringBuilder = new StringBuilder();
                stringBuilder.append("(");
                for (d4.b b8 : this.k(this.d)) {
                    this.g(this.a, b8);
                    this.a.append(":(");
                }
                this.e = false;
            }
        }

        public final void o() {
            boolean bl = this.d == 0;
            m.g(bl, "Can't finish hashing in the middle processing a child");
            if (this.h()) {
                this.m();
            }
            this.g.add((Object)"");
        }

        public final void p(k k8) {
            this.n();
            this.c = this.d;
            this.a.append(k8.O(n.b.p));
            this.e = true;
            if (this.h.a(this)) {
                this.m();
            }
        }

        public final void q(d4.b b8) {
            this.n();
            if (this.e) {
                this.a.append(",");
            }
            this.g(this.a, b8);
            this.a.append(":(");
            if (this.d == this.b.size()) {
                this.b.add((Object)b8);
            } else {
                this.b.set(this.d, (Object)b8);
            }
            ++this.d;
            this.e = false;
        }
    }

    public static class c
    implements d {
        public final long a;

        public c(n n8) {
            this.a = Math.max((long)512L, (long)((long)Math.sqrt((double)(e.b(n8) * 100L))));
        }

        @Override
        public boolean a(b b8) {
            if ((long)b8.i() > this.a && (b8.j().isEmpty() || !b8.j().X().equals(d4.b.o()))) {
                return true;
            }
            return false;
        }
    }

    public static interface d {
        public boolean a(b var1);
    }

}

