/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Class
 *  java.lang.Iterable
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.Void
 *  java.util.ArrayList
 *  java.util.HashMap
 *  java.util.Iterator
 *  java.util.List
 *  java.util.Map
 *  java.util.Map$Entry
 *  java.util.Set
 */
package V3;

import S3.c;
import V3.k;
import Y3.d;
import d4.m;
import d4.n;
import d4.o;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public final class b
implements Iterable {
    public static final b p = new b(new d(null));
    public final d o;

    public b(d d8) {
        this.o = d8;
    }

    public static b D(Map object) {
        d d8 = d.d();
        Iterator iterator = object.entrySet().iterator();
        object = d8;
        while (iterator.hasNext()) {
            d8 = (Map.Entry)iterator.next();
            d d9 = new d((n)d8.getValue());
            object = object.X((k)d8.getKey(), d9);
        }
        return new b((d)object);
    }

    public static b M(Map object) {
        d d8 = d.d();
        Iterator iterator = object.entrySet().iterator();
        object = d8;
        while (iterator.hasNext()) {
            d8 = (Map.Entry)iterator.next();
            d d9 = new d(o.a(d8.getValue()));
            object = object.X(new k((String)d8.getKey()), d9);
        }
        return new b((d)object);
    }

    public static b s() {
        return p;
    }

    public List S() {
        ArrayList arrayList;
        arrayList = new ArrayList();
        if (this.o.getValue() != null) {
            for (m m8 : (n)this.o.getValue()) {
                arrayList.add((Object)new m(m8.c(), m8.d()));
            }
        } else {
            for (Map.Entry entry : this.o.M()) {
                d d8 = (d)entry.getValue();
                if (d8.getValue() == null) continue;
                arrayList.add((Object)new m((d4.b)entry.getKey(), (n)d8.getValue()));
            }
        }
        return arrayList;
    }

    public n T(k k8) {
        k k9 = this.o.g(k8);
        if (k9 != null) {
            return ((n)this.o.s(k9)).A(k.b0(k9, k8));
        }
        return null;
    }

    public Map U(boolean bl) {
        HashMap hashMap = new HashMap();
        this.o.q(new d.c((Map)hashMap, bl){
            public final /* synthetic */ Map a;
            public final /* synthetic */ boolean b;
            {
                this.a = map;
                this.b = bl;
            }

            public Void b(k k8, n n8, Void void_) {
                this.a.put((Object)k8.d0(), n8.L(this.b));
                return null;
            }
        });
        return hashMap;
    }

    public boolean V(k k8) {
        if (this.T(k8) != null) {
            return true;
        }
        return false;
    }

    public b W(k k8) {
        if (k8.isEmpty()) {
            return p;
        }
        return new b(this.o.X(k8, d.d()));
    }

    public n X() {
        return (n)this.o.getValue();
    }

    public b a(k object, n object2) {
        if (object.isEmpty()) {
            return new b(new d(object2));
        }
        k k8 = this.o.g((k)object);
        if (k8 != null) {
            object = k.b0(k8, object);
            n n8 = (n)this.o.s(k8);
            d4.b b8 = object.X();
            if (b8 != null && b8.s() && n8.A(object.a0()).isEmpty()) {
                return this;
            }
            object = n8.y((k)object, (n)object2);
            return new b(this.o.W(k8, object));
        }
        object2 = new d(object2);
        return new b(this.o.X((k)object, (d)object2));
    }

    public b d(d4.b b8, n n8) {
        return this.a(new k(b8), n8);
    }

    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (object != null && object.getClass() == b.class) {
            return ((b)object).U(true).equals((Object)this.U(true));
        }
        return false;
    }

    public b f(final k k8, b b8) {
        return (b)b8.o.k(this, new d.c(){

            public b b(k k82, n n8, b b8) {
                return b8.a(k8.T(k82), n8);
            }
        });
    }

    public n g(n n8) {
        return this.i(k.Y(), this.o, n8);
    }

    public int hashCode() {
        return this.U(true).hashCode();
    }

    public final n i(k k8, d object, n n8) {
        if (object.getValue() != null) {
            return n8.y(k8, (n)object.getValue());
        }
        Object object2 = object.M().iterator();
        object = null;
        while (object2.hasNext()) {
            Object object3 = (Map.Entry)object2.next();
            d d8 = (d)object3.getValue();
            if ((object3 = (d4.b)object3.getKey()).s()) {
                boolean bl = d8.getValue() != null;
                Y3.m.g(bl, "Priority writes must always be leaf nodes");
                object = (n)d8.getValue();
                continue;
            }
            n8 = this.i(k8.U((d4.b)object3), d8, n8);
        }
        object2 = n8;
        if (!n8.A(k8).isEmpty()) {
            object2 = n8;
            if (object != null) {
                object2 = n8.y(k8.U(d4.b.o()), (n)object);
            }
        }
        return object2;
    }

    public boolean isEmpty() {
        return this.o.isEmpty();
    }

    public Iterator iterator() {
        return this.o.iterator();
    }

    public b k(k k8) {
        if (k8.isEmpty()) {
            return this;
        }
        n n8 = this.T(k8);
        if (n8 != null) {
            return new b(new d(n8));
        }
        return new b(this.o.Y(k8));
    }

    public Map q() {
        HashMap hashMap = new HashMap();
        for (Map.Entry entry : this.o.M()) {
            hashMap.put((Object)((d4.b)entry.getKey()), (Object)new b((d)entry.getValue()));
        }
        return hashMap;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("CompoundWrite{");
        stringBuilder.append(this.U(true).toString());
        stringBuilder.append("}");
        return stringBuilder.toString();
    }

}

