// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package c3;

import p3.D;
import k3.s;
import p3.I;
import k3.o;
import java.util.Iterator;
import java.util.Collections;
import k3.i;
import java.util.ArrayList;
import com.google.crypto.tink.shaded.protobuf.h;
import com.google.crypto.tink.shaded.protobuf.A;
import com.google.crypto.tink.shaded.protobuf.p;
import java.security.GeneralSecurityException;
import p3.t;
import n3.a;
import java.util.List;
import p3.C;

public final class n
{
    public final C a;
    public final List b;
    public final a c;
    
    public n(final C a, final List b) {
        this.a = a;
        this.b = b;
        this.c = n3.a.b;
    }
    
    public static void a(final t t) {
        if (t != null && t.X().size() != 0) {
            return;
        }
        throw new GeneralSecurityException("empty keyset");
    }
    
    public static void b(final C c) {
        if (c != null && c.a0() > 0) {
            return;
        }
        throw new GeneralSecurityException("empty keyset");
    }
    
    public static C c(final t t, final c3.a a, final byte[] array) {
        try {
            final C f0 = C.f0(a.b(t.X().Y(), array), p.b());
            b(f0);
            return f0;
        }
        catch (A a2) {
            throw new GeneralSecurityException("invalid keyset, corrupted key material");
        }
    }
    
    public static t d(final C c, final c3.a a, final byte[] array) {
        final byte[] a2 = a.a(c.f(), array);
        try {
            if (C.f0(a.b(a2, array), p.b()).equals(c)) {
                return (t)((com.google.crypto.tink.shaded.protobuf.x.a)t.Y().y(h.i(a2)).z(z.b(c))).n();
            }
            throw new GeneralSecurityException("cannot encrypt keyset");
        }
        catch (A a3) {
            throw new GeneralSecurityException("invalid keyset, corrupted key material");
        }
    }
    
    public static final n e(final C c) {
        b(c);
        return new n(c, f(c));
    }
    
    public static List f(final C c) {
        final ArrayList<Object> list = new ArrayList<Object>(c.a0());
        final Iterator<C.c> iterator = (Iterator<C.c>)c.b0().iterator();
        while (true) {
            Label_0129: {
                if (!iterator.hasNext()) {
                    break Label_0129;
                }
                while (true) {
                    final C.c c2 = iterator.next();
                    final int a0 = c2.a0();
                    final o q = q(c2);
                    while (true) {
                    Label_0118_Outer:
                        while (true) {
                            while (true) {
                                try {
                                    final g d = i.a().d(q, f.a());
                                    final k m = m(c2.c0());
                                    if (a0 == c.c0()) {
                                        final boolean b = true;
                                        break Label_0139;
                                    }
                                    break Label_0118_Outer;
                                    boolean b = false;
                                    list.add(new b(d, m, a0, b, null));
                                    break;
                                    list.add(null);
                                    break;
                                    return Collections.unmodifiableList((List<?>)list);
                                }
                                catch (GeneralSecurityException ex) {}
                                continue;
                            }
                            continue Label_0118_Outer;
                        }
                        final boolean b = false;
                        continue;
                    }
                }
            }
        }
    }
    
    public static Object j(final C.c c, final Class clazz) {
        try {
            return x.g(c.Z(), clazz);
        }
        catch (GeneralSecurityException ex) {
            if (!ex.getMessage().contains("No key manager found for key type ") && !ex.getMessage().contains(" not supported by key manager of type ")) {
                throw ex;
            }
            return null;
        }
    }
    
    public static k m(final p3.z z) {
        final int n = n$a.a[z.ordinal()];
        if (n == 1) {
            return k.b;
        }
        if (n == 2) {
            return k.c;
        }
        if (n == 3) {
            return k.d;
        }
        throw new GeneralSecurityException("Unknown key status");
    }
    
    public static final n n(final c3.p p2, final c3.a a) {
        return o(p2, a, new byte[0]);
    }
    
    public static final n o(final c3.p p3, final c3.a a, final byte[] array) {
        final t a2 = p3.a();
        a(a2);
        return e(c(a2, a, array));
    }
    
    public static o q(final C.c c) {
        final int a0 = c.a0();
        Integer value;
        if (c.b0() == I.s) {
            value = null;
        }
        else {
            value = a0;
        }
        try {
            return o.b(c.Z().a0(), c.Z().b0(), c.Z().Z(), c.b0(), value);
        }
        catch (GeneralSecurityException ex) {
            throw new s("Creating a protokey serialization failed", ex);
        }
    }
    
    public final Object g(final g g, final Class clazz) {
        try {
            return x.c(g, clazz);
        }
        catch (GeneralSecurityException ex) {
            return null;
        }
    }
    
    public C h() {
        return this.a;
    }
    
    public D i() {
        return z.b(this.a);
    }
    
    public Object k(final Class clazz) {
        final Class d = x.d(clazz);
        if (d != null) {
            return this.l(clazz, d);
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("No wrapper found for ");
        sb.append(clazz.getName());
        throw new GeneralSecurityException(sb.toString());
    }
    
    public final Object l(final Class clazz, final Class clazz2) {
        z.d(this.a);
        final v.b j = v.j(clazz2);
        j.e(this.c);
        for (int i = 0; i < this.p(); ++i) {
            final C.c z = this.a.Z(i);
            if (z.c0().equals(p3.z.q)) {
                final Object k = j(z, clazz2);
                Object g;
                if (this.b.get(i) != null) {
                    g = this.g(this.b.get(i).a(), clazz2);
                }
                else {
                    g = null;
                }
                if (z.a0() == this.a.c0()) {
                    j.b(g, k, z);
                }
                else {
                    j.a(g, k, z);
                }
            }
        }
        return x.o(j.d(), clazz);
    }
    
    public int p() {
        return this.a.a0();
    }
    
    public void r(final q q, final c3.a a) {
        this.s(q, a, new byte[0]);
    }
    
    public void s(final q q, final c3.a a, final byte[] array) {
        q.a(d(this.a, a, array));
    }
    
    @Override
    public String toString() {
        return this.i().toString();
    }
    
    public static final class b
    {
        public final g a;
        public final k b;
        public final int c;
        public final boolean d;
        
        public b(final g a, final k b, final int c, final boolean d) {
            this.a = a;
            this.b = b;
            this.c = c;
            this.d = d;
        }
        
        public g a() {
            return this.a;
        }
    }
}
