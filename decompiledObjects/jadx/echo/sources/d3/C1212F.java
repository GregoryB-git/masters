package d3;

import c3.AbstractC0841s;
import c3.AbstractC0846x;
import c3.InterfaceC0823a;
import com.google.crypto.tink.shaded.protobuf.AbstractC1093h;
import com.google.crypto.tink.shaded.protobuf.C1101p;
import java.security.GeneralSecurityException;
import k3.AbstractC1466d;
import p3.y;
import q3.AbstractC1902r;

/* renamed from: d3.F, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C1212F extends AbstractC1466d {

    /* renamed from: d3.F$a */
    public class a extends k3.m {
        public a(Class cls) {
            super(cls);
        }

        @Override // k3.m
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public InterfaceC0823a a(p3.G g7) {
            String X6 = g7.X().X();
            return new C1211E(g7.X().W(), AbstractC0841s.a(X6).a(X6));
        }
    }

    /* renamed from: d3.F$b */
    public class b extends AbstractC1466d.a {
        public b(Class cls) {
            super(cls);
        }

        @Override // k3.AbstractC1466d.a
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public p3.G a(p3.H h7) {
            return (p3.G) p3.G.Z().y(h7).z(C1212F.this.k()).n();
        }

        @Override // k3.AbstractC1466d.a
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public p3.H d(AbstractC1093h abstractC1093h) {
            return p3.H.Z(abstractC1093h, C1101p.b());
        }

        @Override // k3.AbstractC1466d.a
        /* renamed from: h, reason: merged with bridge method [inline-methods] */
        public void e(p3.H h7) {
            if (h7.X().isEmpty() || !h7.Y()) {
                throw new GeneralSecurityException("invalid key format: missing KEK URI or DEK template");
            }
        }
    }

    public C1212F() {
        super(p3.G.class, new a(InterfaceC0823a.class));
    }

    public static void m(boolean z7) {
        AbstractC0846x.l(new C1212F(), z7);
    }

    @Override // k3.AbstractC1466d
    public String d() {
        return "type.googleapis.com/google.crypto.tink.KmsEnvelopeAeadKey";
    }

    @Override // k3.AbstractC1466d
    public AbstractC1466d.a f() {
        return new b(p3.H.class);
    }

    @Override // k3.AbstractC1466d
    public y.c g() {
        return y.c.REMOTE;
    }

    public int k() {
        return 0;
    }

    @Override // k3.AbstractC1466d
    /* renamed from: l, reason: merged with bridge method [inline-methods] */
    public p3.G h(AbstractC1093h abstractC1093h) {
        return p3.G.a0(abstractC1093h, C1101p.b());
    }

    @Override // k3.AbstractC1466d
    /* renamed from: n, reason: merged with bridge method [inline-methods] */
    public void j(p3.G g7) {
        AbstractC1902r.c(g7.Y(), k());
    }
}
