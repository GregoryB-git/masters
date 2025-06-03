package d3;

import c3.AbstractC0846x;
import c3.C0834l;
import c3.InterfaceC0823a;
import com.google.crypto.tink.shaded.protobuf.AbstractC1093h;
import com.google.crypto.tink.shaded.protobuf.C1101p;
import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import k3.AbstractC1466d;
import p3.y;
import q3.AbstractC1900p;
import q3.AbstractC1902r;
import q3.C1891g;

/* loaded from: classes.dex */
public class z extends AbstractC1466d {

    public class a extends k3.m {
        public a(Class cls) {
            super(cls);
        }

        @Override // k3.m
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public InterfaceC0823a a(p3.r rVar) {
            return new C1891g(rVar.X().Y());
        }
    }

    public z() {
        super(p3.r.class, new a(InterfaceC0823a.class));
    }

    public static void m(boolean z7) {
        AbstractC0846x.l(new z(), z7);
        AbstractC1209C.c();
    }

    @Override // k3.AbstractC1466d
    public String d() {
        return "type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key";
    }

    @Override // k3.AbstractC1466d
    public AbstractC1466d.a f() {
        return new b(p3.s.class);
    }

    @Override // k3.AbstractC1466d
    public y.c g() {
        return y.c.SYMMETRIC;
    }

    public int k() {
        return 0;
    }

    @Override // k3.AbstractC1466d
    /* renamed from: l, reason: merged with bridge method [inline-methods] */
    public p3.r h(AbstractC1093h abstractC1093h) {
        return p3.r.a0(abstractC1093h, C1101p.b());
    }

    @Override // k3.AbstractC1466d
    /* renamed from: n, reason: merged with bridge method [inline-methods] */
    public void j(p3.r rVar) {
        AbstractC1902r.c(rVar.Y(), k());
        if (rVar.X().size() != 32) {
            throw new GeneralSecurityException("invalid ChaCha20Poly1305Key: incorrect key length");
        }
    }

    public class b extends AbstractC1466d.a {
        public b(Class cls) {
            super(cls);
        }

        @Override // k3.AbstractC1466d.a
        public Map c() {
            HashMap hashMap = new HashMap();
            hashMap.put("CHACHA20_POLY1305", new AbstractC1466d.a.C0228a(p3.s.V(), C0834l.b.TINK));
            hashMap.put("CHACHA20_POLY1305_RAW", new AbstractC1466d.a.C0228a(p3.s.V(), C0834l.b.RAW));
            return Collections.unmodifiableMap(hashMap);
        }

        @Override // k3.AbstractC1466d.a
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public p3.r a(p3.s sVar) {
            return (p3.r) p3.r.Z().z(z.this.k()).y(AbstractC1093h.i(AbstractC1900p.c(32))).n();
        }

        @Override // k3.AbstractC1466d.a
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public p3.s d(AbstractC1093h abstractC1093h) {
            return p3.s.W(abstractC1093h, C1101p.b());
        }

        @Override // k3.AbstractC1466d.a
        /* renamed from: h, reason: merged with bridge method [inline-methods] */
        public void e(p3.s sVar) {
        }
    }
}
