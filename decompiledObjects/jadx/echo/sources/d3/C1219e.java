package d3;

import c3.AbstractC0846x;
import c3.C0834l;
import c3.InterfaceC0823a;
import c3.InterfaceC0842t;
import com.google.crypto.tink.shaded.protobuf.AbstractC1093h;
import com.google.crypto.tink.shaded.protobuf.C1101p;
import h3.AbstractC1336b;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import k3.AbstractC1466d;
import p3.C1800d;
import p3.C1801e;
import p3.C1802f;
import p3.C1803g;
import p3.C1804h;
import p3.y;
import q3.AbstractC1902r;
import q3.C1892h;
import q3.InterfaceC1896l;

/* renamed from: d3.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1219e extends AbstractC1466d {

    /* renamed from: d3.e$a */
    public class a extends k3.m {
        public a(Class cls) {
            super(cls);
        }

        @Override // k3.m
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public InterfaceC0823a a(C1800d c1800d) {
            return new C1892h((InterfaceC1896l) new C1220f().e(c1800d.Y(), InterfaceC1896l.class), (InterfaceC0842t) new l3.k().e(c1800d.Z(), InterfaceC0842t.class), c1800d.Z().a0().Z());
        }
    }

    /* renamed from: d3.e$b */
    public class b extends AbstractC1466d.a {
        public b(Class cls) {
            super(cls);
        }

        @Override // k3.AbstractC1466d.a
        public Map c() {
            HashMap hashMap = new HashMap();
            p3.u uVar = p3.u.SHA256;
            C0834l.b bVar = C0834l.b.TINK;
            hashMap.put("AES128_CTR_HMAC_SHA256", C1219e.l(16, 16, 32, 16, uVar, bVar));
            C0834l.b bVar2 = C0834l.b.RAW;
            hashMap.put("AES128_CTR_HMAC_SHA256_RAW", C1219e.l(16, 16, 32, 16, uVar, bVar2));
            hashMap.put("AES256_CTR_HMAC_SHA256", C1219e.l(32, 16, 32, 32, uVar, bVar));
            hashMap.put("AES256_CTR_HMAC_SHA256_RAW", C1219e.l(32, 16, 32, 32, uVar, bVar2));
            return Collections.unmodifiableMap(hashMap);
        }

        @Override // k3.AbstractC1466d.a
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public C1800d a(C1801e c1801e) {
            C1802f c1802f = (C1802f) new C1220f().f().a(c1801e.X());
            return (C1800d) C1800d.b0().y(c1802f).z((p3.v) new l3.k().f().a(c1801e.Y())).A(C1219e.this.n()).n();
        }

        @Override // k3.AbstractC1466d.a
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public C1801e d(AbstractC1093h abstractC1093h) {
            return C1801e.a0(abstractC1093h, C1101p.b());
        }

        @Override // k3.AbstractC1466d.a
        /* renamed from: h, reason: merged with bridge method [inline-methods] */
        public void e(C1801e c1801e) {
            new C1220f().f().e(c1801e.X());
            new l3.k().f().e(c1801e.Y());
            AbstractC1902r.a(c1801e.X().Y());
        }
    }

    public C1219e() {
        super(C1800d.class, new a(InterfaceC0823a.class));
    }

    public static AbstractC1466d.a.C0228a l(int i7, int i8, int i9, int i10, p3.u uVar, C0834l.b bVar) {
        return new AbstractC1466d.a.C0228a(m(i7, i8, i9, i10, uVar), bVar);
    }

    public static C1801e m(int i7, int i8, int i9, int i10, p3.u uVar) {
        C1803g c1803g = (C1803g) C1803g.a0().z((C1804h) C1804h.Y().y(i8).n()).y(i7).n();
        return (C1801e) C1801e.Z().y(c1803g).z((p3.w) p3.w.a0().z((p3.x) p3.x.a0().y(uVar).z(i10).n()).y(i9).n()).n();
    }

    public static void p(boolean z7) {
        AbstractC0846x.l(new C1219e(), z7);
    }

    @Override // k3.AbstractC1466d
    public AbstractC1336b.EnumC0213b a() {
        return AbstractC1336b.EnumC0213b.f14585p;
    }

    @Override // k3.AbstractC1466d
    public String d() {
        return "type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey";
    }

    @Override // k3.AbstractC1466d
    public AbstractC1466d.a f() {
        return new b(C1801e.class);
    }

    @Override // k3.AbstractC1466d
    public y.c g() {
        return y.c.SYMMETRIC;
    }

    public int n() {
        return 0;
    }

    @Override // k3.AbstractC1466d
    /* renamed from: o, reason: merged with bridge method [inline-methods] */
    public C1800d h(AbstractC1093h abstractC1093h) {
        return C1800d.c0(abstractC1093h, C1101p.b());
    }

    @Override // k3.AbstractC1466d
    /* renamed from: q, reason: merged with bridge method [inline-methods] */
    public void j(C1800d c1800d) {
        AbstractC1902r.c(c1800d.a0(), n());
        new C1220f().j(c1800d.Y());
        new l3.k().j(c1800d.Z());
    }
}
