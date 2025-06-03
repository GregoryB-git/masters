/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.CharSequence
 *  java.lang.Class
 *  java.lang.Integer
 *  java.lang.NoSuchFieldError
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.Throwable
 *  java.security.GeneralSecurityException
 *  java.util.ArrayList
 *  java.util.Collections
 *  java.util.Iterator
 *  java.util.List
 */
package c3;

import c3.a;
import c3.f;
import c3.g;
import c3.k;
import c3.p;
import c3.q;
import c3.v;
import c3.x;
import c3.y;
import c3.z;
import com.google.crypto.tink.shaded.protobuf.A;
import com.google.crypto.tink.shaded.protobuf.h;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import k3.i;
import k3.o;
import k3.s;
import p3.C;
import p3.D;
import p3.I;
import p3.t;
import p3.y;

public final class n {
    public final C a;
    public final List b;
    public final n3.a c;

    public n(C c8, List list) {
        this.a = c8;
        this.b = list;
        this.c = n3.a.b;
    }

    public static void a(t t8) {
        if (t8 != null && t8.X().size() != 0) {
            return;
        }
        throw new GeneralSecurityException("empty keyset");
    }

    public static void b(C c8) {
        if (c8 != null && c8.a0() > 0) {
            return;
        }
        throw new GeneralSecurityException("empty keyset");
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static C c(t t8, a a8, byte[] arrby) {
        try {
            void var2_4;
            void var1_3;
            C c8 = C.f0(var1_3.b(t8.X().Y(), (byte[])var2_4), com.google.crypto.tink.shaded.protobuf.p.b());
            n.b(c8);
            return c8;
        }
        catch (A a9) {
            throw new GeneralSecurityException("invalid keyset, corrupted key material");
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static t d(C c8, a a8, byte[] arrby) {
        block4 : {
            byte[] arrby2 = a8.a(c8.f(), arrby);
            try {
                boolean bl = C.f0(a8.b(arrby2, arrby), com.google.crypto.tink.shaded.protobuf.p.b()).equals(c8);
                if (!bl) break block4;
            }
            catch (A a9) {
                throw new GeneralSecurityException("invalid keyset, corrupted key material");
            }
            return (t)t.Y().y(h.i(arrby2)).z(z.b(c8)).n();
        }
        throw new GeneralSecurityException("cannot encrypt keyset");
    }

    public static final n e(C c8) {
        n.b(c8);
        return new n(c8, n.f(c8));
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static List f(C c8) {
        ArrayList arrayList = new ArrayList(c8.a0());
        Iterator iterator = c8.b0().iterator();
        while (iterator.hasNext()) {
            boolean bl;
            Object object = (C.c)iterator.next();
            int n8 = object.a0();
            Object object2 = n.q((C.c)object);
            try {
                object2 = i.a().d((o)object2, f.a());
                object = n.m(object.c0());
                bl = n8 == c8.c0();
            }
            catch (GeneralSecurityException generalSecurityException) {}
            arrayList.add((Object)null);
            continue;
            arrayList.add((Object)new b((g)object2, (k)object, n8, bl, null));
        }
        return Collections.unmodifiableList((List)arrayList);
    }

    public static Object j(C.c object, Class class_) {
        try {
            object = x.g(object.Z(), class_);
            return object;
        }
        catch (GeneralSecurityException generalSecurityException) {
            if (!generalSecurityException.getMessage().contains((CharSequence)"No key manager found for key type ") && !generalSecurityException.getMessage().contains((CharSequence)" not supported by key manager of type ")) {
                throw generalSecurityException;
            }
            return null;
        }
    }

    public static k m(p3.z z8) {
        int n8 = .a[z8.ordinal()];
        if (n8 != 1) {
            if (n8 != 2) {
                if (n8 == 3) {
                    return k.d;
                }
                throw new GeneralSecurityException("Unknown key status");
            }
            return k.c;
        }
        return k.b;
    }

    public static final n n(p p8, a a8) {
        return n.o(p8, a8, new byte[0]);
    }

    public static final n o(p object, a a8, byte[] arrby) {
        object = object.a();
        n.a((t)object);
        return n.e(n.c((t)object, a8, arrby));
    }

    public static o q(C.c object) {
        int n8 = object.a0();
        Integer n9 = object.b0() == I.s ? null : Integer.valueOf((int)n8);
        try {
            object = o.b(object.Z().a0(), object.Z().b0(), object.Z().Z(), object.b0(), n9);
            return object;
        }
        catch (GeneralSecurityException generalSecurityException) {
            throw new s("Creating a protokey serialization failed", (Throwable)generalSecurityException);
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final Object g(g object, Class class_) {
        try {
            return x.c((g)object, class_);
        }
        catch (GeneralSecurityException generalSecurityException) {
            return null;
        }
    }

    public C h() {
        return this.a;
    }

    public D i() {
        return z.b(this.a);
    }

    public Object k(Class class_) {
        Class class_2 = x.d(class_);
        if (class_2 != null) {
            return this.l(class_, class_2);
        }
        class_2 = new StringBuilder();
        class_2.append("No wrapper found for ");
        class_2.append(class_.getName());
        throw new GeneralSecurityException(class_2.toString());
    }

    public final Object l(Class class_, Class class_2) {
        z.d(this.a);
        v.b b8 = v.j(class_2);
        b8.e(this.c);
        for (int i8 = 0; i8 < this.p(); ++i8) {
            C.c c8 = this.a.Z(i8);
            if (!c8.c0().equals((Object)p3.z.q)) continue;
            Object object = n.j(c8, class_2);
            Object object2 = this.b.get(i8) != null ? this.g(((b)this.b.get(i8)).a(), class_2) : null;
            if (c8.a0() == this.a.c0()) {
                b8.b(object2, object, c8);
                continue;
            }
            b8.a(object2, object, c8);
        }
        return x.o(b8.d(), class_);
    }

    public int p() {
        return this.a.a0();
    }

    public void r(q q8, a a8) {
        this.s(q8, a8, new byte[0]);
    }

    public void s(q q8, a a8, byte[] arrby) {
        q8.a(n.d(this.a, a8, arrby));
    }

    public String toString() {
        return this.i().toString();
    }

    public static final class b {
        public final g a;
        public final k b;
        public final int c;
        public final boolean d;

        public b(g g8, k k8, int n8, boolean bl) {
            this.a = g8;
            this.b = k8;
            this.c = n8;
            this.d = bl;
        }

        public /* synthetic */ b(g g8, k k8, int n8, boolean bl,  a8) {
            this(g8, k8, n8, bl);
        }

        public g a() {
            return this.a;
        }
    }

}

