// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package l3;

import p3.I;
import p3.u;
import com.google.crypto.tink.shaded.protobuf.A;
import java.security.GeneralSecurityException;
import p3.v;
import c3.y;
import k3.o;
import k3.p;
import k3.t;
import k3.b;
import k3.c;
import k3.j;
import k3.k;
import r3.a;

public abstract class n
{
    public static final a a;
    public static final k b;
    public static final j c;
    public static final c d;
    public static final b e;
    
    static {
        final a a2 = a = t.e("type.googleapis.com/google.crypto.tink.HmacKey");
        b = k.a((k.b)new d3.j(), l.class, p.class);
        c = j.a((j.b)new d3.k(), a2, p.class);
        d = k3.c.a((c.b)new d3.l(), i.class, o.class);
        e = k3.b.a((b.b)new m(), a2, o.class);
    }
    
    public static i b(final o o, final y y) {
        Label_0135: {
            if (!o.f().equals("type.googleapis.com/google.crypto.tink.HmacKey")) {
                break Label_0135;
            }
            while (true) {
                while (true) {
                    try {
                        final v d0 = v.d0(o.g(), com.google.crypto.tink.shaded.protobuf.p.b());
                        if (d0.b0() == 0) {
                            return i.c().e(l.a().c(d0.Z().size()).d(d0.a0().Z()).b(e(d0.a0().Y())).e(f(o.e())).a()).d(r3.b.a(d0.Z().Y(), y.b(y))).c(o.c()).a();
                        }
                        throw new GeneralSecurityException("Only version 0 keys are accepted");
                        throw new IllegalArgumentException("Wrong type URL in call to HmacProtoSerialization.parseKey");
                        throw new GeneralSecurityException("Parsing HmacKey failed");
                    }
                    catch (A a) {}
                    catch (IllegalArgumentException ex) {}
                    continue;
                }
            }
        }
    }
    
    public static void c() {
        d(k3.i.a());
    }
    
    public static void d(final k3.i i) {
        i.h(n.b);
        i.g(n.c);
        i.f(n.d);
        i.e(n.e);
    }
    
    public static l.c e(final u u) {
        final int n = n$a.a[u.ordinal()];
        if (n == 1) {
            return l.c.b;
        }
        if (n == 2) {
            return l.c.c;
        }
        if (n == 3) {
            return l.c.d;
        }
        if (n == 4) {
            return l.c.e;
        }
        if (n == 5) {
            return l.c.f;
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("Unable to parse HashType: ");
        sb.append(u.g());
        throw new GeneralSecurityException(sb.toString());
    }
    
    public static l.d f(final I i) {
        final int n = n$a.b[i.ordinal()];
        if (n == 1) {
            return l.d.b;
        }
        if (n == 2) {
            return l.d.c;
        }
        if (n == 3) {
            return l.d.d;
        }
        if (n == 4) {
            return l.d.e;
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("Unable to parse OutputPrefixType: ");
        sb.append(i.g());
        throw new GeneralSecurityException(sb.toString());
    }
}
