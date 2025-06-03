package l3;

import c3.AbstractC0829g;
import c3.AbstractC0846x;
import c3.C0834l;
import c3.InterfaceC0842t;
import com.google.crypto.tink.shaded.protobuf.AbstractC1093h;
import com.google.crypto.tink.shaded.protobuf.C1101p;
import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import k3.AbstractC1466d;
import k3.C1470h;
import k3.l;
import m3.C1671b;
import p3.C1797a;
import p3.C1798b;
import p3.C1799c;
import p3.y;
import q3.AbstractC1900p;
import q3.AbstractC1902r;
import q3.C1897m;
import q3.C1899o;

/* renamed from: l3.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1606c extends AbstractC1466d {

    /* renamed from: d, reason: collision with root package name */
    public static final k3.l f17167d = k3.l.b(new l.b() { // from class: l3.b
        @Override // k3.l.b
        public final Object a(AbstractC0829g abstractC0829g) {
            return new C1671b((C1604a) abstractC0829g);
        }
    }, C1604a.class, g.class);

    /* renamed from: l3.c$a */
    public class a extends k3.m {
        public a(Class cls) {
            super(cls);
        }

        @Override // k3.m
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public InterfaceC0842t a(C1797a c1797a) {
            return new C1899o(new C1897m(c1797a.Y().Y()), c1797a.Z().X());
        }
    }

    /* renamed from: l3.c$b */
    public class b extends AbstractC1466d.a {
        public b(Class cls) {
            super(cls);
        }

        @Override // k3.AbstractC1466d.a
        public Map c() {
            HashMap hashMap = new HashMap();
            C1798b c1798b = (C1798b) C1798b.Z().y(32).z((C1799c) C1799c.Y().y(16).n()).n();
            C0834l.b bVar = C0834l.b.TINK;
            hashMap.put("AES_CMAC", new AbstractC1466d.a.C0228a(c1798b, bVar));
            hashMap.put("AES256_CMAC", new AbstractC1466d.a.C0228a((C1798b) C1798b.Z().y(32).z((C1799c) C1799c.Y().y(16).n()).n(), bVar));
            hashMap.put("AES256_CMAC_RAW", new AbstractC1466d.a.C0228a((C1798b) C1798b.Z().y(32).z((C1799c) C1799c.Y().y(16).n()).n(), C0834l.b.RAW));
            return Collections.unmodifiableMap(hashMap);
        }

        @Override // k3.AbstractC1466d.a
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public C1797a a(C1798b c1798b) {
            return (C1797a) C1797a.b0().A(0).y(AbstractC1093h.i(AbstractC1900p.c(c1798b.X()))).z(c1798b.Y()).n();
        }

        @Override // k3.AbstractC1466d.a
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public C1798b d(AbstractC1093h abstractC1093h) {
            return C1798b.a0(abstractC1093h, C1101p.b());
        }

        @Override // k3.AbstractC1466d.a
        /* renamed from: h, reason: merged with bridge method [inline-methods] */
        public void e(C1798b c1798b) {
            C1606c.q(c1798b.Y());
            C1606c.r(c1798b.X());
        }
    }

    public C1606c() {
        super(C1797a.class, new a(InterfaceC0842t.class));
    }

    public static void o(boolean z7) {
        AbstractC0846x.l(new C1606c(), z7);
        f.c();
        C1470h.c().d(f17167d);
    }

    public static void q(C1799c c1799c) {
        if (c1799c.X() < 10) {
            throw new GeneralSecurityException("tag size too short");
        }
        if (c1799c.X() > 16) {
            throw new GeneralSecurityException("tag size too long");
        }
    }

    public static void r(int i7) {
        if (i7 != 32) {
            throw new GeneralSecurityException("AesCmacKey size wrong, must be 32 bytes");
        }
    }

    @Override // k3.AbstractC1466d
    public String d() {
        return "type.googleapis.com/google.crypto.tink.AesCmacKey";
    }

    @Override // k3.AbstractC1466d
    public AbstractC1466d.a f() {
        return new b(C1798b.class);
    }

    @Override // k3.AbstractC1466d
    public y.c g() {
        return y.c.SYMMETRIC;
    }

    public int m() {
        return 0;
    }

    @Override // k3.AbstractC1466d
    /* renamed from: n, reason: merged with bridge method [inline-methods] */
    public C1797a h(AbstractC1093h abstractC1093h) {
        return C1797a.c0(abstractC1093h, C1101p.b());
    }

    @Override // k3.AbstractC1466d
    /* renamed from: p, reason: merged with bridge method [inline-methods] */
    public void j(C1797a c1797a) {
        AbstractC1902r.c(c1797a.a0(), m());
        r(c1797a.Y().size());
        q(c1797a.Z());
    }
}
