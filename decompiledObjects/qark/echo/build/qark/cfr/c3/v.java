/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Class
 *  java.lang.Comparable
 *  java.lang.IllegalStateException
 *  java.lang.Integer
 *  java.lang.Object
 *  java.lang.String
 *  java.security.GeneralSecurityException
 *  java.util.ArrayList
 *  java.util.Arrays
 *  java.util.Collection
 *  java.util.Collections
 *  java.util.List
 *  java.util.Map
 *  java.util.concurrent.ConcurrentHashMap
 *  java.util.concurrent.ConcurrentMap
 */
package c3;

import c3.f;
import c3.g;
import c3.y;
import com.google.crypto.tink.shaded.protobuf.h;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import k3.i;
import k3.o;
import n3.a;
import p3.C;
import p3.I;
import p3.y;
import p3.z;
import q3.k;

public final class v {
    public final ConcurrentMap a;
    public c b;
    public final Class c;
    public final a d;
    public final boolean e;

    public v(ConcurrentMap concurrentMap, c c8, a a8, Class class_) {
        this.a = concurrentMap;
        this.b = c8;
        this.c = class_;
        this.d = a8;
        this.e = false;
    }

    public /* synthetic */ v(ConcurrentMap concurrentMap, c c8, a a8, Class class_,  a9) {
        this(concurrentMap, c8, a8, class_);
    }

    public static c b(Object object, Object object2, C.c c8, ConcurrentMap concurrentMap) {
        Object object3 = c8.a0();
        if (c8.b0() == I.s) {
            object3 = null;
        }
        object3 = i.a().d(o.b(c8.Z().a0(), c8.Z().b0(), c8.Z().Z(), c8.b0(), (Integer)object3), f.a());
        object = new c(object, object2, c3.d.a(c8), c8.c0(), c8.b0(), c8.a0(), c8.Z().a0(), (g)object3);
        c8 = new ArrayList();
        c8.add(object);
        object2 = new d(object.b(), null);
        c8 = (List)concurrentMap.put(object2, (Object)Collections.unmodifiableList((List)c8));
        if (c8 != null) {
            object3 = new ArrayList();
            object3.addAll((Collection)c8);
            object3.add(object);
            concurrentMap.put(object2, (Object)Collections.unmodifiableList((List)object3));
        }
        return object;
    }

    public static b j(Class class_) {
        return new b(class_, null);
    }

    public Collection c() {
        return this.a.values();
    }

    public a d() {
        return this.d;
    }

    public c e() {
        return this.b;
    }

    public List f(byte[] list) {
        if ((list = (List)this.a.get((Object)new d((byte[])list, null))) != null) {
            return list;
        }
        return Collections.emptyList();
    }

    public Class g() {
        return this.c;
    }

    public List h() {
        return this.f(c3.d.a);
    }

    public boolean i() {
        return this.d.b().isEmpty() ^ true;
    }

    public static class b {
        public final Class a;
        public ConcurrentMap b = new ConcurrentHashMap();
        public c c;
        public a d;

        public b(Class class_) {
            this.a = class_;
            this.d = a.b;
        }

        public /* synthetic */ b(Class class_,  a8) {
            this(class_);
        }

        public b a(Object object, Object object2, C.c c8) {
            return this.c(object, object2, c8, false);
        }

        public b b(Object object, Object object2, C.c c8) {
            return this.c(object, object2, c8, true);
        }

        public final b c(Object object, Object object2, C.c c8, boolean bl) {
            if (this.b != null) {
                if (object == null && object2 == null) {
                    throw new GeneralSecurityException("at least one of the `fullPrimitive` or `primitive` must be set");
                }
                if (c8.c0() == z.q) {
                    object = v.b(object, object2, c8, this.b);
                    if (bl) {
                        if (this.c == null) {
                            this.c = object;
                            return this;
                        }
                        throw new IllegalStateException("you cannot set two primary primitives");
                    }
                    return this;
                }
                throw new GeneralSecurityException("only ENABLED key is allowed");
            }
            throw new IllegalStateException("addPrimitive cannot be called after build");
        }

        public v d() {
            Object object = this.b;
            if (object != null) {
                object = new v((ConcurrentMap)object, this.c, this.d, this.a, null);
                this.b = null;
                return object;
            }
            throw new IllegalStateException("build cannot be called twice");
        }

        public b e(a a8) {
            if (this.b != null) {
                this.d = a8;
                return this;
            }
            throw new IllegalStateException("setAnnotations cannot be called after build");
        }
    }

    public static final class c {
        public final Object a;
        public final Object b;
        public final byte[] c;
        public final z d;
        public final I e;
        public final int f;
        public final String g;
        public final g h;

        public c(Object object, Object object2, byte[] arrby, z z8, I i8, int n8, String string2, g g8) {
            this.a = object;
            this.b = object2;
            this.c = Arrays.copyOf((byte[])arrby, (int)arrby.length);
            this.d = z8;
            this.e = i8;
            this.f = n8;
            this.g = string2;
            this.h = g8;
        }

        public Object a() {
            return this.a;
        }

        public final byte[] b() {
            byte[] arrby = this.c;
            if (arrby == null) {
                return null;
            }
            return Arrays.copyOf((byte[])arrby, (int)arrby.length);
        }

        public g c() {
            return this.h;
        }

        public int d() {
            return this.f;
        }

        public String e() {
            return this.g;
        }

        public I f() {
            return this.e;
        }

        public Object g() {
            return this.b;
        }

        public z h() {
            return this.d;
        }
    }

    public static class d
    implements Comparable {
        public final byte[] o;

        public d(byte[] arrby) {
            this.o = Arrays.copyOf((byte[])arrby, (int)arrby.length);
        }

        public /* synthetic */ d(byte[] arrby,  a8) {
            this(arrby);
        }

        public int c(d d8) {
            byte[] arrby = this.o;
            int n8 = arrby.length;
            byte[] arrby2 = d8.o;
            if (n8 != arrby2.length) {
                return arrby.length - arrby2.length;
            }
            for (n8 = 0; n8 < (arrby = this.o).length; ++n8) {
                byte by = arrby[n8];
                byte by2 = d8.o[n8];
                if (by == by2) continue;
                return by - by2;
            }
            return 0;
        }

        public boolean equals(Object object) {
            if (!(object instanceof d)) {
                return false;
            }
            object = (d)object;
            return Arrays.equals((byte[])this.o, (byte[])object.o);
        }

        public int hashCode() {
            return Arrays.hashCode((byte[])this.o);
        }

        public String toString() {
            return k.b(this.o);
        }
    }

}

