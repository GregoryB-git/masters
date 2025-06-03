// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package d3;

import p3.I;
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

public abstract class n
{
    public static final a a;
    public static final k b;
    public static final j c;
    public static final c d;
    public static final b e;
    
    static {
        final a a2 = a = t.e("type.googleapis.com/google.crypto.tink.AesEaxKey");
        b = k.a((k.b)new d3.j(), i.class, p.class);
        c = j.a((j.b)new d3.k(), a2, p.class);
        d = k3.c.a((c.b)new l(), g.class, o.class);
        e = k3.b.a((b.b)new m(), a2, o.class);
    }
    
    public static g b(final o o, final y y) {
        Label_0127: {
            if (!o.f().equals("type.googleapis.com/google.crypto.tink.AesEaxKey")) {
                break Label_0127;
            }
            while (true) {
                while (true) {
                    try {
                        final p3.i c0 = p3.i.c0(o.g(), com.google.crypto.tink.shaded.protobuf.p.b());
                        if (c0.a0() == 0) {
                            return g.a().e(i.a().c(c0.Y().size()).b(c0.Z().X()).d(16).e(e(o.e())).a()).d(r3.b.a(c0.Y().Y(), y.b(y))).c(o.c()).a();
                        }
                        throw new GeneralSecurityException("Only version 0 keys are accepted");
                        throw new GeneralSecurityException("Parsing AesEaxcKey failed");
                        throw new IllegalArgumentException("Wrong type URL in call to AesEaxParameters.parseParameters");
                    }
                    catch (A a) {}
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
    
    public static i.c e(final I i) {
        final int n = n$a.a[i.ordinal()];
        if (n == 1) {
            return d3.i.c.b;
        }
        if (n == 2 || n == 3) {
            return d3.i.c.c;
        }
        if (n == 4) {
            return d3.i.c.d;
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("Unable to parse OutputPrefixType: ");
        sb.append(i.g());
        throw new GeneralSecurityException(sb.toString());
    }
}
