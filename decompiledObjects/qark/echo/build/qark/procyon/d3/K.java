// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package d3;

import k3.i;
import com.google.crypto.tink.shaded.protobuf.A;
import java.security.GeneralSecurityException;
import c3.y;
import k3.o;
import k3.p;
import k3.t;
import k3.b;
import k3.c;
import k3.j;
import k3.k;
import r3.a;

public abstract class K
{
    public static final a a;
    public static final k b;
    public static final j c;
    public static final c d;
    public static final b e;
    
    static {
        final a a2 = a = t.e("type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key");
        b = k.a((k.b)new d3.j(), I.class, p.class);
        c = j.a((j.b)new d3.k(), a2, p.class);
        d = k3.c.a((c.b)new l(), G.class, o.class);
        e = k3.b.a((b.b)new J(), a2, o.class);
    }
    
    public static G b(final o o, final y y) {
        Label_0079: {
            if (!o.f().equals("type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key")) {
                break Label_0079;
            }
            while (true) {
                while (true) {
                    try {
                        final p3.K a0 = p3.K.a0(o.g(), com.google.crypto.tink.shaded.protobuf.p.b());
                        if (a0.Y() == 0) {
                            return G.a(e(o.e()), r3.b.a(a0.X().Y(), y.b(y)), o.c());
                        }
                        throw new GeneralSecurityException("Only version 0 keys are accepted");
                        throw new GeneralSecurityException("Parsing XChaCha20Poly1305Key failed");
                        throw new IllegalArgumentException("Wrong type URL in call to XChaCha20Poly1305Parameters.parseParameters");
                    }
                    catch (A a2) {}
                    continue;
                }
            }
        }
    }
    
    public static void c() {
        d(i.a());
    }
    
    public static void d(final i i) {
        i.h(K.b);
        i.g(K.c);
        i.f(K.d);
        i.e(K.e);
    }
    
    public static I.a e(final p3.I i) {
        final int n = K$a.a[i.ordinal()];
        if (n == 1) {
            return I.a.b;
        }
        if (n == 2 || n == 3) {
            return I.a.c;
        }
        if (n == 4) {
            return I.a.d;
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("Unable to parse OutputPrefixType: ");
        sb.append(i.g());
        throw new GeneralSecurityException(sb.toString());
    }
}
