// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package d3;

import p3.I;
import k3.i;
import java.security.GeneralSecurityException;
import p3.r;
import k3.o;
import k3.p;
import k3.t;
import k3.b;
import k3.c;
import k3.j;
import k3.k;
import r3.a;

public abstract class C
{
    public static final a a;
    public static final k b;
    public static final j c;
    public static final c d;
    public static final b e;
    
    static {
        final a a2 = a = t.e("type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key");
        b = k.a((k.b)new d3.j(), A.class, p.class);
        c = j.a((j.b)new d3.k(), a2, p.class);
        d = k3.c.a((c.b)new l(), y.class, o.class);
        e = k3.b.a((b.b)new B(), a2, o.class);
    }
    
    public static y b(final o o, final c3.y y) {
        Label_0079: {
            if (!o.f().equals("type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key")) {
                break Label_0079;
            }
            while (true) {
                while (true) {
                    try {
                        final r a0 = r.a0(o.g(), com.google.crypto.tink.shaded.protobuf.p.b());
                        if (a0.Y() == 0) {
                            return y.a(e(o.e()), r3.b.a(a0.X().Y(), c3.y.b(y)), o.c());
                        }
                        throw new GeneralSecurityException("Only version 0 keys are accepted");
                        throw new IllegalArgumentException("Wrong type URL in call to ChaCha20Poly1305Parameters.parseParameters");
                        throw new GeneralSecurityException("Parsing ChaCha20Poly1305Key failed");
                    }
                    catch (com.google.crypto.tink.shaded.protobuf.A a2) {}
                    continue;
                }
            }
        }
    }
    
    public static void c() {
        d(i.a());
    }
    
    public static void d(final i i) {
        i.h(C.b);
        i.g(C.c);
        i.f(C.d);
        i.e(C.e);
    }
    
    public static A.a e(final I i) {
        final int n = C$a.a[i.ordinal()];
        if (n == 1) {
            return A.a.b;
        }
        if (n == 2 || n == 3) {
            return A.a.c;
        }
        if (n == 4) {
            return A.a.d;
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("Unable to parse OutputPrefixType: ");
        sb.append(i.g());
        throw new GeneralSecurityException(sb.toString());
    }
}
