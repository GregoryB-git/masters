// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package d3;

import p3.I;
import k3.i;
import com.google.crypto.tink.shaded.protobuf.A;
import java.security.GeneralSecurityException;
import p3.n;
import c3.y;
import k3.o;
import k3.p;
import k3.t;
import k3.b;
import k3.c;
import k3.j;
import k3.k;
import r3.a;

public abstract class x
{
    public static final a a;
    public static final k b;
    public static final j c;
    public static final c d;
    public static final b e;
    
    static {
        final a a2 = a = t.e("type.googleapis.com/google.crypto.tink.AesGcmSivKey");
        b = k.a((k.b)new d3.j(), v.class, p.class);
        c = j.a((j.b)new d3.k(), a2, p.class);
        d = k3.c.a((c.b)new l(), d3.t.class, o.class);
        e = k3.b.a((b.b)new w(), a2, o.class);
    }
    
    public static d3.t b(final o o, final y y) {
        Label_0112: {
            if (!o.f().equals("type.googleapis.com/google.crypto.tink.AesGcmSivKey")) {
                break Label_0112;
            }
            while (true) {
                while (true) {
                    try {
                        final n a0 = n.a0(o.g(), com.google.crypto.tink.shaded.protobuf.p.b());
                        if (a0.Y() == 0) {
                            return d3.t.a().e(v.a().b(a0.X().size()).c(e(o.e())).a()).d(r3.b.a(a0.X().Y(), y.b(y))).c(o.c()).a();
                        }
                        throw new GeneralSecurityException("Only version 0 keys are accepted");
                        throw new IllegalArgumentException("Wrong type URL in call to AesGcmSivParameters.parseParameters");
                        throw new GeneralSecurityException("Parsing AesGcmSivKey failed");
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
        i.h(x.b);
        i.g(x.c);
        i.f(x.d);
        i.e(x.e);
    }
    
    public static v.c e(final I i) {
        final int n = x$a.a[i.ordinal()];
        if (n == 1) {
            return v.c.b;
        }
        if (n == 2 || n == 3) {
            return v.c.c;
        }
        if (n == 4) {
            return v.c.d;
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("Unable to parse OutputPrefixType: ");
        sb.append(i.g());
        throw new GeneralSecurityException(sb.toString());
    }
}
