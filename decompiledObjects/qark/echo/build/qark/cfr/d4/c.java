/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.IllegalArgumentException
 *  java.lang.IllegalStateException
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.util.ArrayList
 *  java.util.Collections
 *  java.util.Comparator
 *  java.util.HashMap
 *  java.util.Iterator
 *  java.util.List
 *  java.util.Map
 *  java.util.Map$Entry
 */
package d4;

import S3.c;
import S3.h;
import V3.k;
import d4.b;
import d4.g;
import d4.m;
import d4.n;
import d4.q;
import d4.r;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class c
implements n {
    public static Comparator r = new Comparator(){

        public int a(b b8, b b9) {
            return b8.h(b9);
        }
    };
    public final S3.c o;
    public final n p;
    public String q = null;

    public c() {
        this.o = c.a.c(r);
        this.p = r.a();
    }

    public c(S3.c c8, n n8) {
        if (c8.isEmpty() && !n8.isEmpty()) {
            throw new IllegalArgumentException("Can't create empty ChildrenNode with priority!");
        }
        this.p = n8;
        this.o = c8;
    }

    public static void s(StringBuilder stringBuilder, int n8) {
        for (int i8 = 0; i8 < n8; ++i8) {
            stringBuilder.append(" ");
        }
    }

    @Override
    public n A(k k8) {
        b b8 = k8.Z();
        if (b8 == null) {
            return this;
        }
        return this.v(b8).A(k8.c0());
    }

    @Override
    public boolean B() {
        return false;
    }

    public int D(n n8) {
        if (this.isEmpty()) {
            if (n8.isEmpty()) {
                return 0;
            }
            return -1;
        }
        if (n8.B()) {
            return 1;
        }
        if (n8.isEmpty()) {
            return 1;
        }
        if (n8 == n.l) {
            return -1;
        }
        return 0;
    }

    @Override
    public int E() {
        return this.o.size();
    }

    @Override
    public b I(b b8) {
        return (b)this.o.k(b8);
    }

    @Override
    public n J(n n8) {
        if (this.o.isEmpty()) {
            return g.W();
        }
        return new c(this.o, n8);
    }

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public Object L(boolean bl) {
        int n8;
        Map.Entry entry;
        if (this.isEmpty()) {
            return null;
        }
        HashMap hashMap = new HashMap();
        Iterator iterator = this.o.iterator();
        int n9 = 0;
        boolean bl2 = true;
        int n10 = n8 = 0;
        while (iterator.hasNext()) {
            int n11;
            entry = (Map.Entry)iterator.next();
            String string2 = ((b)entry.getKey()).e();
            hashMap.put((Object)string2, ((n)entry.getValue()).L(bl));
            n8 = n11 = n8 + 1;
            if (!bl2) continue;
            if ((string2.length() <= 1 || string2.charAt(0) != '0') && (entry = Y3.m.k(string2)) != null && entry.intValue() >= 0) {
                n8 = n11;
                if (entry.intValue() <= n10) continue;
                n10 = entry.intValue();
                n8 = n11;
                continue;
            }
            bl2 = false;
            n8 = n11;
        }
        if (!bl && bl2 && n10 < n8 * 2) {
            iterator = new ArrayList(n10 + 1);
            n8 = n9;
            do {
                if (n8 > n10) {
                    return iterator;
                }
                entry = new StringBuilder();
                entry.append("");
                entry.append(n8);
                iterator.add(hashMap.get((Object)entry.toString()));
                ++n8;
            } while (true);
        }
        if (bl && !this.p.isEmpty()) {
            hashMap.put((Object)".priority", this.p.getValue());
        }
        return hashMap;
    }

    public void M(c c8) {
        this.S(c8, false);
    }

    @Override
    public n N(b b8, n n8) {
        S3.c c8;
        if (b8.s()) {
            return this.J(n8);
        }
        S3.c c9 = c8 = this.o;
        if (c8.a(b8)) {
            c9 = c8.D(b8);
        }
        c8 = c9;
        if (!n8.isEmpty()) {
            c8 = c9.s(b8, n8);
        }
        if (c8.isEmpty()) {
            return g.W();
        }
        return new c(c8, this.p);
    }

    @Override
    public String O(n.b b8) {
        n.b b9 = n.b.o;
        if (b8 == b9) {
            Object object;
            boolean bl;
            b8 = new StringBuilder();
            if (!this.p.isEmpty()) {
                b8.append("priority:");
                b8.append(this.p.O(b9));
                b8.append(":");
            }
            b9 = new ArrayList();
            Object object2 = this.iterator();
            block0 : do {
                bl = false;
                while (object2.hasNext()) {
                    object = (m)object2.next();
                    b9.add(object);
                    if (!bl && object.d().t().isEmpty()) continue block0;
                    bl = true;
                }
                break;
            } while (true);
            if (bl) {
                Collections.sort((List)b9, (Comparator)q.j());
            }
            b9 = b9.iterator();
            while (b9.hasNext()) {
                object2 = (m)b9.next();
                object = object2.d().R();
                if (object.equals((Object)"")) continue;
                b8.append(":");
                b8.append(object2.c().e());
                b8.append(":");
                b8.append((String)object);
            }
            return b8.toString();
        }
        throw new IllegalArgumentException("Hashes on children nodes only supported for V1");
    }

    @Override
    public Iterator P() {
        return new d(this.o.P());
    }

    @Override
    public boolean Q(b b8) {
        return this.v(b8).isEmpty() ^ true;
    }

    @Override
    public String R() {
        if (this.q == null) {
            String string2 = this.O(n.b.o);
            string2 = string2.isEmpty() ? "" : Y3.m.i(string2);
            this.q = string2;
        }
        return this.q;
    }

    public void S(final c c8, boolean bl) {
        if (bl && !this.t().isEmpty()) {
            this.o.q(new h.b(){
                public boolean a;
                {
                    this.a = false;
                }

                public void b(b b8, n n8) {
                    if (!this.a && b8.h(b.o()) > 0) {
                        this.a = true;
                        c8.b(b.o(), c.this.t());
                    }
                    c8.b(b8, n8);
                }
            });
            return;
        }
        this.o.q(c8);
    }

    public b T() {
        return (b)this.o.i();
    }

    public b U() {
        return (b)this.o.g();
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    public final void V(StringBuilder var1_1, int var2_2) {
        if (!this.o.isEmpty() || !this.p.isEmpty()) {
            var1_1.append("{\n");
            var5_3 = this.o.iterator();
        } else {
            var5_3 = "{ }";
lbl6: // 2 sources:
            do {
                var1_1.append(var5_3);
                return;
                break;
            } while (true);
        }
        while (var5_3.hasNext()) {
            var6_6 = (Map.Entry)var5_3.next();
            var3_4 = var2_2 + 2;
            c.s(var1_1, var3_4);
            var1_1.append(((b)var6_6.getKey()).e());
            var1_1.append("=");
            var4_5 = var6_6.getValue() instanceof c;
            var6_6 = var6_6.getValue();
            if (var4_5) {
                ((c)var6_6).V(var1_1, var3_4);
            } else {
                var1_1.append(((n)var6_6).toString());
            }
            var1_1.append("\n");
        }
        if (!this.p.isEmpty()) {
            c.s(var1_1, var2_2 + 2);
            var1_1.append(".priority=");
            var1_1.append(this.p.toString());
            var1_1.append("\n");
        }
        c.s(var1_1, var2_2);
        var5_3 = "}";
        ** while (true)
    }

    public boolean equals(Object object) {
        if (object == null) {
            return false;
        }
        if (object == this) {
            return true;
        }
        if (!(object instanceof c)) {
            return false;
        }
        c c8 = (c)object;
        if (!this.t().equals((Object)c8.t())) {
            return false;
        }
        if (this.o.size() != c8.o.size()) {
            return false;
        }
        object = this.o.iterator();
        c8 = c8.o.iterator();
        while (object.hasNext() && c8.hasNext()) {
            Map.Entry entry = (Map.Entry)object.next();
            Map.Entry entry2 = (Map.Entry)c8.next();
            if (((b)entry.getKey()).equals(entry2.getKey()) && ((n)entry.getValue()).equals(entry2.getValue())) continue;
            return false;
        }
        if (!object.hasNext() && !c8.hasNext()) {
            return true;
        }
        throw new IllegalStateException("Something went wrong internally.");
    }

    @Override
    public Object getValue() {
        return this.L(false);
    }

    public int hashCode() {
        Iterator iterator = this.iterator();
        int n8 = 0;
        while (iterator.hasNext()) {
            m m8 = (m)iterator.next();
            n8 = (n8 * 31 + m8.c().hashCode()) * 17 + m8.d().hashCode();
        }
        return n8;
    }

    @Override
    public boolean isEmpty() {
        return this.o.isEmpty();
    }

    public Iterator iterator() {
        return new d(this.o.iterator());
    }

    @Override
    public n t() {
        return this.p;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        this.V(stringBuilder, 0);
        return stringBuilder.toString();
    }

    @Override
    public n v(b b8) {
        if (b8.s() && !this.p.isEmpty()) {
            return this.p;
        }
        if (this.o.a(b8)) {
            return (n)this.o.d(b8);
        }
        return g.W();
    }

    @Override
    public n y(k k8, n n8) {
        b b8 = k8.Z();
        if (b8 == null) {
            return n8;
        }
        if (b8.s()) {
            Y3.m.f(r.b(n8));
            return this.J(n8);
        }
        return this.N(b8, this.v(b8).y(k8.c0(), n8));
    }

    public static abstract class c
    extends h.b {
        public abstract void b(b var1, n var2);

        public void c(b b8, n n8) {
            this.b(b8, n8);
        }
    }

    public static class d
    implements Iterator {
        public final Iterator o;

        public d(Iterator iterator) {
            this.o = iterator;
        }

        public m b() {
            Map.Entry entry = (Map.Entry)this.o.next();
            return new m((b)entry.getKey(), (n)entry.getValue());
        }

        public boolean hasNext() {
            return this.o.hasNext();
        }

        public void remove() {
            this.o.remove();
        }
    }

}

