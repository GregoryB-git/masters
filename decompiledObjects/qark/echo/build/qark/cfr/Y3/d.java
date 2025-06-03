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
 *  java.util.AbstractMap
 *  java.util.AbstractMap$SimpleImmutableEntry
 *  java.util.ArrayList
 *  java.util.Collection
 *  java.util.Iterator
 *  java.util.List
 *  java.util.Map
 *  java.util.Map$Entry
 */
package Y3;

import S3.c;
import S3.l;
import V3.k;
import Y3.i;
import d4.b;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public final class d
implements Iterable {
    public static final S3.c q;
    public static final d r;
    public final Object o;
    public final S3.c p;

    static {
        S3.c c8;
        q = c8 = c.a.c(l.b(b.class));
        r = new d(null, c8);
    }

    public d(Object object) {
        this(object, q);
    }

    public d(Object object, S3.c c8) {
        this.o = object;
        this.p = c8;
    }

    public static d d() {
        return r;
    }

    public d D(b object) {
        if ((object = (d)this.p.d(object)) != null) {
            return object;
        }
        return d.d();
    }

    public S3.c M() {
        return this.p;
    }

    public Object S(k k8) {
        return this.T(k8, i.a);
    }

    public Object T(k object, i i8) {
        Object object2 = this.o;
        object2 = object2 != null && i8.a(object2) ? this.o : null;
        Iterator iterator = object.iterator();
        object = this;
        while (iterator.hasNext()) {
            Object object3 = (b)iterator.next();
            if ((object3 = (d)object.p.d(object3)) == null) {
                return object2;
            }
            Object object4 = object3.o;
            object = object3;
            if (object4 == null) continue;
            object = object3;
            if (!i8.a(object4)) continue;
            object2 = object3.o;
            object = object3;
        }
        return object2;
    }

    public d U(k object) {
        if (object.isEmpty()) {
            if (this.p.isEmpty()) {
                return d.d();
            }
            return new d(null, this.p);
        }
        b b8 = object.Z();
        d d8 = (d)this.p.d(b8);
        if (d8 != null) {
            object = (object = d8.U(object.c0())).isEmpty() ? this.p.D(b8) : this.p.s(b8, object);
            if (this.o == null && object.isEmpty()) {
                return d.d();
            }
            return new d(this.o, (S3.c)object);
        }
        return this;
    }

    public Object V(k object, i i8) {
        Object object2 = this.o;
        if (object2 != null && i8.a(object2)) {
            return this.o;
        }
        Iterator iterator = object.iterator();
        object = this;
        while (iterator.hasNext()) {
            object2 = (b)iterator.next();
            if ((object2 = (d)object.p.d(object2)) == null) {
                return null;
            }
            Object object3 = object2.o;
            object = object2;
            if (object3 == null) continue;
            object = object2;
            if (!i8.a(object3)) continue;
            return object2.o;
        }
        return null;
    }

    public d W(k object, Object object2) {
        d d8;
        if (object.isEmpty()) {
            return new d(object2, this.p);
        }
        b b8 = object.Z();
        d d9 = d8 = (d)this.p.d(b8);
        if (d8 == null) {
            d9 = d.d();
        }
        object = d9.W(object.c0(), object2);
        object = this.p.s(b8, object);
        return new d(this.o, (S3.c)object);
    }

    public d X(k object, d d8) {
        d d9;
        if (object.isEmpty()) {
            return d8;
        }
        b b8 = object.Z();
        d d10 = d9 = (d)this.p.d(b8);
        if (d9 == null) {
            d10 = d.d();
        }
        object = (object = d10.X(object.c0(), d8)).isEmpty() ? this.p.D(b8) : this.p.s(b8, object);
        return new d(this.o, (S3.c)object);
    }

    public d Y(k k8) {
        if (k8.isEmpty()) {
            return this;
        }
        Object object = k8.Z();
        if ((object = (d)this.p.d(object)) != null) {
            return object.Y(k8.c0());
        }
        return d.d();
    }

    public Collection Z() {
        final ArrayList arrayList = new ArrayList();
        this.q(new c(){

            public Void b(k k8, Object object, Void void_) {
                arrayList.add(object);
                return null;
            }
        });
        return arrayList;
    }

    public boolean a(i i8) {
        Object object = this.o;
        if (object != null && i8.a(object)) {
            return true;
        }
        object = this.p.iterator();
        while (object.hasNext()) {
            if (!((d)((Map.Entry)object.next()).getValue()).a(i8)) continue;
            return true;
        }
        return false;
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object != null) {
            if (d.class != object.getClass()) {
                return false;
            }
            object = (d)object;
            Object object2 = this.p;
            if (object2 != null ? !object2.equals(object.p) : object.p != null) {
                return false;
            }
            object2 = this.o;
            object = object.o;
            if (object2 != null ? !object2.equals(object) : object != null) {
                return false;
            }
            return true;
        }
        return false;
    }

    public k f(k k8, i i8) {
        Object object = this.o;
        if (object != null && i8.a(object)) {
            return k.Y();
        }
        if (k8.isEmpty()) {
            return null;
        }
        object = k8.Z();
        d d8 = (d)this.p.d(object);
        if (d8 != null && (k8 = d8.f(k8.c0(), i8)) != null) {
            return new k(new b[]{object}).T(k8);
        }
        return null;
    }

    public k g(k k8) {
        return this.f(k8, i.a);
    }

    public Object getValue() {
        return this.o;
    }

    public int hashCode() {
        Object object = this.o;
        int n8 = 0;
        int n9 = object != null ? object.hashCode() : 0;
        object = this.p;
        if (object != null) {
            n8 = object.hashCode();
        }
        return n9 * 31 + n8;
    }

    public final Object i(k k8, c c8, Object object) {
        Object object22;
        for (Object object22 : this.p) {
            object = ((d)object22.getValue()).i(k8.U((b)object22.getKey()), c8, object);
        }
        object22 = this.o;
        Object object3 = object;
        if (object22 != null) {
            object3 = c8.a(k8, object22, object);
        }
        return object3;
    }

    public boolean isEmpty() {
        if (this.o == null && this.p.isEmpty()) {
            return true;
        }
        return false;
    }

    public Iterator iterator() {
        ArrayList arrayList = new ArrayList();
        this.q(new c((List)arrayList){
            public final /* synthetic */ List a;
            {
                this.a = list;
            }

            public Void b(k k8, Object object, Void void_) {
                this.a.add((Object)new AbstractMap.SimpleImmutableEntry((Object)k8, object));
                return null;
            }
        });
        return arrayList.iterator();
    }

    public Object k(Object object, c c8) {
        return this.i(k.Y(), c8, object);
    }

    public void q(c c8) {
        this.i(k.Y(), c8, null);
    }

    public Object s(k k8) {
        if (k8.isEmpty()) {
            return this.o;
        }
        Object object = k8.Z();
        if ((object = (d)this.p.d(object)) != null) {
            return object.s(k8.c0());
        }
        return null;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("ImmutableTree { value=");
        stringBuilder.append(this.getValue());
        stringBuilder.append(", children={");
        for (Map.Entry entry : this.p) {
            stringBuilder.append(((b)entry.getKey()).e());
            stringBuilder.append("=");
            stringBuilder.append(entry.getValue());
        }
        stringBuilder.append("} }");
        return stringBuilder.toString();
    }

    public static interface c {
        public Object a(k var1, Object var2, Object var3);
    }

}

