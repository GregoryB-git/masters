package d3;

import com.google.crypto.tink.shaded.protobuf.AbstractC1093h;
import com.google.crypto.tink.shaded.protobuf.C1101p;
import java.security.GeneralSecurityException;
import k3.AbstractC1466d;
import p3.C1802f;
import p3.C1803g;
import p3.C1804h;
import p3.y;
import q3.AbstractC1900p;
import q3.AbstractC1902r;
import q3.C1885a;
import q3.InterfaceC1896l;

/* renamed from: d3.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C1220f extends AbstractC1466d {

    /* renamed from: d3.f$a */
    public class a extends k3.m {
        public a(Class cls) {
            super(cls);
        }

        @Override // k3.m
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public InterfaceC1896l a(C1802f c1802f) {
            return new C1885a(c1802f.Z().Y(), c1802f.a0().X());
        }
    }

    /* renamed from: d3.f$b */
    public class b extends AbstractC1466d.a {
        public b(Class cls) {
            super(cls);
        }

        @Override // k3.AbstractC1466d.a
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public C1802f a(C1803g c1803g) {
            return (C1802f) C1802f.c0().z(c1803g.Z()).y(AbstractC1093h.i(AbstractC1900p.c(c1803g.Y()))).A(C1220f.this.l()).n();
        }

        @Override // k3.AbstractC1466d.a
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public C1803g d(AbstractC1093h abstractC1093h) {
            return C1803g.b0(abstractC1093h, C1101p.b());
        }

        @Override // k3.AbstractC1466d.a
        /* renamed from: h, reason: merged with bridge method [inline-methods] */
        public void e(C1803g c1803g) {
            AbstractC1902r.a(c1803g.Y());
            C1220f.this.o(c1803g.Z());
        }
    }

    public C1220f() {
        super(C1802f.class, new a(InterfaceC1896l.class));
    }

    @Override // k3.AbstractC1466d
    public String d() {
        return "type.googleapis.com/google.crypto.tink.AesCtrKey";
    }

    @Override // k3.AbstractC1466d
    public AbstractC1466d.a f() {
        return new b(C1803g.class);
    }

    @Override // k3.AbstractC1466d
    public y.c g() {
        return y.c.SYMMETRIC;
    }

    public int l() {
        return 0;
    }

    @Override // k3.AbstractC1466d
    /* renamed from: m, reason: merged with bridge method [inline-methods] */
    public C1802f h(AbstractC1093h abstractC1093h) {
        return C1802f.d0(abstractC1093h, C1101p.b());
    }

    @Override // k3.AbstractC1466d
    /* renamed from: n, reason: merged with bridge method [inline-methods] */
    public void j(C1802f c1802f) {
        AbstractC1902r.c(c1802f.b0(), l());
        AbstractC1902r.a(c1802f.Z().size());
        o(c1802f.a0());
    }

    public final void o(C1804h c1804h) {
        if (c1804h.X() < 12 || c1804h.X() > 16) {
            throw new GeneralSecurityException("invalid IV size");
        }
    }
}
