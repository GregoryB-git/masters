// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package l3;

import p3.I;
import k3.i;
import com.google.crypto.tink.shaded.protobuf.A;
import java.security.GeneralSecurityException;
import c3.y;
import k3.o;
import d3.l;
import k3.p;
import k3.t;
import k3.b;
import k3.c;
import k3.j;
import k3.k;
import r3.a;

public abstract class f
{
    public static final a a;
    public static final k b;
    public static final j c;
    public static final c d;
    public static final b e;
    
    static {
        final a a2 = a = t.e("type.googleapis.com/google.crypto.tink.AesCmacKey");
        b = k.a((k.b)new d3.j(), d.class, p.class);
        c = j.a((j.b)new d3.k(), a2, p.class);
        d = k3.c.a((c.b)new l(), l3.a.class, o.class);
        e = k3.b.a((b.b)new e(), a2, o.class);
    }
    
    public static l3.a b(final o o, final y y) {
        Label_0122: {
            if (!o.f().equals("type.googleapis.com/google.crypto.tink.AesCmacKey")) {
                break Label_0122;
            }
            while (true) {
                while (true) {
                    try {
                        final p3.a c0 = p3.a.c0(o.g(), com.google.crypto.tink.shaded.protobuf.p.b());
                        if (c0.a0() == 0) {
                            return l3.a.c().e(l3.d.a().b(c0.Y().size()).c(c0.Z().X()).d(e(o.e())).a()).c(r3.b.a(c0.Y().Y(), y.b(y))).d(o.c()).a();
                        }
                        throw new GeneralSecurityException("Only version 0 keys are accepted");
                        throw new IllegalArgumentException("Wrong type URL in call to AesCmacParameters.parseParameters");
                        throw new GeneralSecurityException("Parsing AesCmacKey failed");
                    }
                    catch (A a) {}
                    catch (IllegalArgumentException ex) {}
                    continue;
                }
            }
        }
    }
    
    public static void c() {
        d(i.a());
    }
    
    public static void d(final i i) {
        i.h(f.b);
        i.g(f.c);
        i.f(f.d);
        i.e(f.e);
    }
    
    public static d.c e(final I i) {
        final int n = f$a.a[i.ordinal()];
        if (n == 1) {
            return l3.d.c.b;
        }
        if (n == 2) {
            return l3.d.c.c;
        }
        if (n == 3) {
            return l3.d.c.d;
        }
        if (n == 4) {
            return l3.d.c.e;
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("Unable to parse OutputPrefixType: ");
        sb.append(i.g());
        throw new GeneralSecurityException(sb.toString());
    }
}
