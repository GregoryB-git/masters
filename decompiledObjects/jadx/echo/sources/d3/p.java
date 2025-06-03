package d3;

import c3.AbstractC0846x;
import c3.C0834l;
import c3.InterfaceC0823a;
import com.google.crypto.tink.shaded.protobuf.AbstractC1093h;
import com.google.crypto.tink.shaded.protobuf.C1101p;
import h3.AbstractC1336b;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import k3.AbstractC1466d;
import p3.C1808l;
import p3.y;
import q3.AbstractC1900p;
import q3.AbstractC1902r;
import q3.C1887c;

/* loaded from: classes.dex */
public final class p extends AbstractC1466d {

    public class a extends k3.m {
        public a(Class cls) {
            super(cls);
        }

        @Override // k3.m
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public InterfaceC0823a a(C1808l c1808l) {
            return new C1887c(c1808l.X().Y());
        }
    }

    public class b extends AbstractC1466d.a {
        public b(Class cls) {
            super(cls);
        }

        @Override // k3.AbstractC1466d.a
        public Map c() {
            HashMap hashMap = new HashMap();
            C0834l.b bVar = C0834l.b.TINK;
            hashMap.put("AES128_GCM", p.l(16, bVar));
            C0834l.b bVar2 = C0834l.b.RAW;
            hashMap.put("AES128_GCM_RAW", p.l(16, bVar2));
            hashMap.put("AES256_GCM", p.l(32, bVar));
            hashMap.put("AES256_GCM_RAW", p.l(32, bVar2));
            return Collections.unmodifiableMap(hashMap);
        }

        @Override // k3.AbstractC1466d.a
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public C1808l a(p3.m mVar) {
            return (C1808l) C1808l.Z().y(AbstractC1093h.i(AbstractC1900p.c(mVar.W()))).z(p.this.m()).n();
        }

        @Override // k3.AbstractC1466d.a
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public p3.m d(AbstractC1093h abstractC1093h) {
            return p3.m.Y(abstractC1093h, C1101p.b());
        }

        @Override // k3.AbstractC1466d.a
        /* renamed from: h, reason: merged with bridge method [inline-methods] */
        public void e(p3.m mVar) {
            AbstractC1902r.a(mVar.W());
        }
    }

    public p() {
        super(C1808l.class, new a(InterfaceC0823a.class));
    }

    public static AbstractC1466d.a.C0228a l(int i7, C0834l.b bVar) {
        return new AbstractC1466d.a.C0228a((p3.m) p3.m.X().y(i7).n(), bVar);
    }

    public static void o(boolean z7) {
        AbstractC0846x.l(new p(), z7);
        s.c();
    }

    @Override // k3.AbstractC1466d
    public AbstractC1336b.EnumC0213b a() {
        return AbstractC1336b.EnumC0213b.f14585p;
    }

    @Override // k3.AbstractC1466d
    public String d() {
        return "type.googleapis.com/google.crypto.tink.AesGcmKey";
    }

    @Override // k3.AbstractC1466d
    public AbstractC1466d.a f() {
        return new b(p3.m.class);
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
    public C1808l h(AbstractC1093h abstractC1093h) {
        return C1808l.a0(abstractC1093h, C1101p.b());
    }

    @Override // k3.AbstractC1466d
    /* renamed from: p, reason: merged with bridge method [inline-methods] */
    public void j(C1808l c1808l) {
        AbstractC1902r.c(c1808l.Y(), m());
        AbstractC1902r.a(c1808l.X().size());
    }
}
