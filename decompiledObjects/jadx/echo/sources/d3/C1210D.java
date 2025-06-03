package d3;

import c3.AbstractC0841s;
import c3.AbstractC0846x;
import c3.InterfaceC0823a;
import com.google.crypto.tink.shaded.protobuf.AbstractC1093h;
import com.google.crypto.tink.shaded.protobuf.C1101p;
import k3.AbstractC1466d;
import p3.C1796E;
import p3.y;
import q3.AbstractC1902r;

/* renamed from: d3.D, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C1210D extends AbstractC1466d {

    /* renamed from: d3.D$a */
    public class a extends k3.m {
        public a(Class cls) {
            super(cls);
        }

        @Override // k3.m
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public InterfaceC0823a a(C1796E c1796e) {
            String W6 = c1796e.X().W();
            return AbstractC0841s.a(W6).a(W6);
        }
    }

    public C1210D() {
        super(C1796E.class, new a(InterfaceC0823a.class));
    }

    public static void m(boolean z7) {
        AbstractC0846x.l(new C1210D(), z7);
    }

    @Override // k3.AbstractC1466d
    public String d() {
        return "type.googleapis.com/google.crypto.tink.KmsAeadKey";
    }

    @Override // k3.AbstractC1466d
    public AbstractC1466d.a f() {
        return new b(p3.F.class);
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
    public C1796E h(AbstractC1093h abstractC1093h) {
        return C1796E.a0(abstractC1093h, C1101p.b());
    }

    @Override // k3.AbstractC1466d
    /* renamed from: n, reason: merged with bridge method [inline-methods] */
    public void j(C1796E c1796e) {
        AbstractC1902r.c(c1796e.Y(), k());
    }

    /* renamed from: d3.D$b */
    public class b extends AbstractC1466d.a {
        public b(Class cls) {
            super(cls);
        }

        @Override // k3.AbstractC1466d.a
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public C1796E a(p3.F f7) {
            return (C1796E) C1796E.Z().y(f7).z(C1210D.this.k()).n();
        }

        @Override // k3.AbstractC1466d.a
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public p3.F d(AbstractC1093h abstractC1093h) {
            return p3.F.X(abstractC1093h, C1101p.b());
        }

        @Override // k3.AbstractC1466d.a
        /* renamed from: h, reason: merged with bridge method [inline-methods] */
        public void e(p3.F f7) {
        }
    }
}
