// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package d3;

import p3.I;
import k3.i;
import com.google.crypto.tink.shaded.protobuf.A;
import java.security.GeneralSecurityException;
import c3.y;
import k3.p;
import k3.t;
import k3.b;
import k3.c;
import k3.j;
import k3.k;
import r3.a;

public abstract class s
{
    public static final a a;
    public static final k b;
    public static final j c;
    public static final c d;
    public static final b e;
    
    static {
        final a a2 = a = t.e("type.googleapis.com/google.crypto.tink.AesGcmKey");
        b = k.a((k.b)new d3.j(), q.class, p.class);
        c = j.a((j.b)new d3.k(), a2, p.class);
        d = k3.c.a((c.b)new l(), o.class, k3.o.class);
        e = k3.b.a((b.b)new r(), a2, k3.o.class);
    }
    
    public static o b(final k3.o o, final y y) {
        Label_0122: {
            if (!o.f().equals("type.googleapis.com/google.crypto.tink.AesGcmKey")) {
                break Label_0122;
            }
            while (true) {
                while (true) {
                    try {
                        final p3.l a0 = p3.l.a0(o.g(), com.google.crypto.tink.shaded.protobuf.p.b());
                        if (a0.Y() == 0) {
                            return o.a().e(q.a().c(a0.X().size()).b(12).d(16).e(e(o.e())).a()).d(r3.b.a(a0.X().Y(), y.b(y))).c(o.c()).a();
                        }
                        throw new GeneralSecurityException("Only version 0 keys are accepted");
                        throw new IllegalArgumentException("Wrong type URL in call to AesGcmParameters.parseParameters");
                        throw new GeneralSecurityException("Parsing AesGcmKey failed");
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
        i.h(s.b);
        i.g(s.c);
        i.f(s.d);
        i.e(s.e);
    }
    
    public static q.c e(final I i) {
        final int n = s$a.a[i.ordinal()];
        if (n == 1) {
            return q.c.b;
        }
        if (n == 2 || n == 3) {
            return q.c.c;
        }
        if (n == 4) {
            return q.c.d;
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("Unable to parse OutputPrefixType: ");
        sb.append(i.g());
        throw new GeneralSecurityException(sb.toString());
    }
}
