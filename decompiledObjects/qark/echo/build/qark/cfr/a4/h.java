/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.io.IOException
 *  java.lang.Class
 *  java.lang.Double
 *  java.lang.Enum
 *  java.lang.IllegalArgumentException
 *  java.lang.IllegalStateException
 *  java.lang.Integer
 *  java.lang.Long
 *  java.lang.NoSuchFieldError
 *  java.lang.Object
 *  java.lang.RuntimeException
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.Throwable
 *  java.util.HashMap
 *  java.util.Map
 */
package a4;

import Y3.m;
import b4.c;
import b4.d;
import b4.e;
import d4.a;
import d4.f;
import d4.g;
import d4.l;
import d4.n;
import d4.o;
import d4.q;
import d4.r;
import d4.t;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public final class h {
    public static final h i = new h();
    public Integer a;
    public b b;
    public n c = null;
    public d4.b d = null;
    public n e = null;
    public d4.b f = null;
    public d4.h g = q.j();
    public String h = null;

    public static h c(Map object) {
        Object object2;
        h h8 = new h();
        h8.a = (Integer)object.get((Object)"l");
        if (object.containsKey((Object)"sp")) {
            h8.c = h.v(o.a(object.get((Object)"sp")));
            object2 = (String)object.get((Object)"sn");
            if (object2 != null) {
                h8.d = d4.b.j((String)object2);
            }
        }
        if (object.containsKey((Object)"ep")) {
            h8.e = h.v(o.a(object.get((Object)"ep")));
            object2 = (String)object.get((Object)"en");
            if (object2 != null) {
                h8.f = d4.b.j((String)object2);
            }
        }
        if ((object2 = (String)object.get((Object)"vf")) != null) {
            object2 = object2.equals((Object)"l") ? b.o : b.p;
            h8.b = object2;
        }
        if ((object = (String)object.get((Object)"i")) != null) {
            h8.g = d4.h.b((String)object);
        }
        return h8;
    }

    public static n v(n n8) {
        if (!(n8 instanceof t || n8 instanceof a || n8 instanceof f)) {
            if (n8 instanceof g) {
                return n8;
            }
            if (n8 instanceof l) {
                return new f(((Long)n8.getValue()).doubleValue(), r.a());
            }
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Unexpected value passed to normalizeValue: ");
            stringBuilder.append(n8.getValue());
            throw new IllegalStateException(stringBuilder.toString());
        }
        return n8;
    }

    public final h a() {
        h h8 = new h();
        h8.a = this.a;
        h8.c = this.c;
        h8.d = this.d;
        h8.e = this.e;
        h8.f = this.f;
        h8.b = this.b;
        h8.g = this.g;
        return h8;
    }

    public h b(n n8, d4.b b8) {
        boolean bl = n8.B() || n8.isEmpty();
        m.f(bl);
        m.f(n8 instanceof l ^ true);
        h h8 = this.a();
        h8.e = n8;
        h8.f = b8;
        return h8;
    }

    public d4.h d() {
        return this.g;
    }

    public d4.b e() {
        if (this.m()) {
            d4.b b8 = this.f;
            if (b8 != null) {
                return b8;
            }
            return d4.b.m();
        }
        throw new IllegalArgumentException("Cannot get index end name if start has not been set");
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object != null) {
            if (h.class != object.getClass()) {
                return false;
            }
            object = (h)object;
            Object object2 = this.a;
            if (object2 != null ? !object2.equals((Object)object.a) : object.a != null) {
                return false;
            }
            object2 = this.g;
            if (object2 != null ? !object2.equals((Object)object.g) : object.g != null) {
                return false;
            }
            object2 = this.f;
            if (object2 != null ? !object2.equals(object.f) : object.f != null) {
                return false;
            }
            object2 = this.e;
            if (object2 != null ? !object2.equals((Object)object.e) : object.e != null) {
                return false;
            }
            object2 = this.d;
            if (object2 != null ? !object2.equals(object.d) : object.d != null) {
                return false;
            }
            object2 = this.c;
            if (object2 != null ? !object2.equals((Object)object.c) : object.c != null) {
                return false;
            }
            if (this.r() != object.r()) {
                return false;
            }
            return true;
        }
        return false;
    }

    public n f() {
        if (this.m()) {
            return this.e;
        }
        throw new IllegalArgumentException("Cannot get index end value if start has not been set");
    }

    public d4.b g() {
        if (this.o()) {
            d4.b b8 = this.d;
            if (b8 != null) {
                return b8;
            }
            return d4.b.n();
        }
        throw new IllegalArgumentException("Cannot get index start name if start has not been set");
    }

    public n h() {
        if (this.o()) {
            return this.c;
        }
        throw new IllegalArgumentException("Cannot get index start value if start has not been set");
    }

    public int hashCode() {
        Object object = this.a;
        int n8 = 0;
        int n9 = object != null ? object.intValue() : 0;
        int n10 = this.r() ? 1231 : 1237;
        object = this.c;
        int n11 = object != null ? object.hashCode() : 0;
        object = this.d;
        int n12 = object != null ? object.hashCode() : 0;
        object = this.e;
        int n13 = object != null ? object.hashCode() : 0;
        object = this.f;
        int n14 = object != null ? object.hashCode() : 0;
        object = this.g;
        if (object != null) {
            n8 = object.hashCode();
        }
        return (((((n9 * 31 + n10) * 31 + n11) * 31 + n12) * 31 + n13) * 31 + n14) * 31 + n8;
    }

    public int i() {
        if (this.n()) {
            return this.a;
        }
        throw new IllegalArgumentException("Cannot get limit if limit has not been set");
    }

    public d j() {
        if (this.u()) {
            return new b4.b(this.d());
        }
        if (this.n()) {
            return new c(this);
        }
        return new e(this);
    }

    public Map k() {
        Object object;
        HashMap hashMap = new HashMap();
        if (this.o()) {
            hashMap.put((Object)"sp", this.c.getValue());
            object = this.d;
            if (object != null) {
                hashMap.put((Object)"sn", (Object)object.e());
            }
        }
        if (this.m()) {
            hashMap.put((Object)"ep", this.e.getValue());
            object = this.f;
            if (object != null) {
                hashMap.put((Object)"en", (Object)object.e());
            }
        }
        if ((object = this.a) != null) {
            int n8;
            hashMap.put((Object)"l", object);
            b b8 = this.b;
            object = b8;
            if (b8 == null) {
                object = this.o() ? b.o : b.p;
            }
            if ((n8 = .a[object.ordinal()]) != 1) {
                if (n8 == 2) {
                    hashMap.put((Object)"vf", (Object)"r");
                }
            } else {
                hashMap.put((Object)"vf", (Object)"l");
            }
        }
        if (!this.g.equals((Object)q.j())) {
            hashMap.put((Object)"i", (Object)this.g.c());
        }
        return hashMap;
    }

    public boolean l() {
        if (this.n() && this.b != null) {
            return true;
        }
        return false;
    }

    public boolean m() {
        if (this.e != null) {
            return true;
        }
        return false;
    }

    public boolean n() {
        if (this.a != null) {
            return true;
        }
        return false;
    }

    public boolean o() {
        if (this.c != null) {
            return true;
        }
        return false;
    }

    public boolean p() {
        if (this.u() && this.g.equals((Object)q.j())) {
            return true;
        }
        return false;
    }

    public boolean q() {
        if (this.o() && this.m() && this.n() && !this.l()) {
            return false;
        }
        return true;
    }

    public boolean r() {
        b b8 = this.b;
        if (b8 != null) {
            if (b8 == b.o) {
                return true;
            }
            return false;
        }
        return this.o();
    }

    public h s(int n8) {
        h h8 = this.a();
        h8.a = n8;
        h8.b = b.o;
        return h8;
    }

    public h t(int n8) {
        h h8 = this.a();
        h8.a = n8;
        h8.b = b.p;
        return h8;
    }

    public String toString() {
        return this.k().toString();
    }

    public boolean u() {
        if (!(this.o() || this.m() || this.n())) {
            return true;
        }
        return false;
    }

    public h w(d4.h h8) {
        h h9 = this.a();
        h9.g = h8;
        return h9;
    }

    public h x(n n8, d4.b b8) {
        boolean bl = n8.B() || n8.isEmpty();
        m.f(bl);
        m.f(n8 instanceof l ^ true);
        h h8 = this.a();
        h8.c = n8;
        h8.d = b8;
        return h8;
    }

    public String y() {
        if (this.h == null) {
            try {
                this.h = f4.b.c(this.k());
            }
            catch (IOException iOException) {
                throw new RuntimeException((Throwable)iOException);
            }
        }
        return this.h;
    }

    public static final class b
    extends Enum {
        public static final /* enum */ b o;
        public static final /* enum */ b p;
        public static final /* synthetic */ b[] q;

        static {
            b b8;
            b b9;
            o = b8 = new b();
            p = b9 = new b();
            q = new b[]{b8, b9};
        }

        public static b valueOf(String string2) {
            return (b)Enum.valueOf(b.class, (String)string2);
        }

        public static b[] values() {
            return (b[])q.clone();
        }
    }

}

