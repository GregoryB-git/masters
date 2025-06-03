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
import p3.C1805i;
import p3.C1806j;
import p3.C1807k;
import p3.y;
import q3.AbstractC1900p;
import q3.AbstractC1902r;
import q3.C1886b;

/* renamed from: d3.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1222h extends AbstractC1466d {

    /* renamed from: d3.h$a */
    public class a extends k3.m {
        public a(Class cls) {
            super(cls);
        }

        @Override // k3.m
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public InterfaceC0823a a(C1805i c1805i) {
            return new C1886b(c1805i.Y().Y(), c1805i.Z().X());
        }
    }

    /* renamed from: d3.h$b */
    public class b extends AbstractC1466d.a {
        public b(Class cls) {
            super(cls);
        }

        @Override // k3.AbstractC1466d.a
        public Map c() {
            HashMap hashMap = new HashMap();
            C0834l.b bVar = C0834l.b.TINK;
            hashMap.put("AES128_EAX", C1222h.l(16, 16, bVar));
            C0834l.b bVar2 = C0834l.b.RAW;
            hashMap.put("AES128_EAX_RAW", C1222h.l(16, 16, bVar2));
            hashMap.put("AES256_EAX", C1222h.l(32, 16, bVar));
            hashMap.put("AES256_EAX_RAW", C1222h.l(32, 16, bVar2));
            return Collections.unmodifiableMap(hashMap);
        }

        @Override // k3.AbstractC1466d.a
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public C1805i a(C1806j c1806j) {
            return (C1805i) C1805i.b0().y(AbstractC1093h.i(AbstractC1900p.c(c1806j.X()))).z(c1806j.Y()).A(C1222h.this.m()).n();
        }

        @Override // k3.AbstractC1466d.a
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public C1806j d(AbstractC1093h abstractC1093h) {
            return C1806j.a0(abstractC1093h, C1101p.b());
        }

        @Override // k3.AbstractC1466d.a
        /* renamed from: h, reason: merged with bridge method [inline-methods] */
        public void e(C1806j c1806j) {
            AbstractC1902r.a(c1806j.X());
            if (c1806j.Y().X() != 12 && c1806j.Y().X() != 16) {
                throw new GeneralSecurityException("invalid IV size; acceptable values have 12 or 16 bytes");
            }
        }
    }

    public C1222h() {
        super(C1805i.class, new a(InterfaceC0823a.class));
    }

    public static AbstractC1466d.a.C0228a l(int i7, int i8, C0834l.b bVar) {
        return new AbstractC1466d.a.C0228a((C1806j) C1806j.Z().y(i7).z((C1807k) C1807k.Y().y(i8).n()).n(), bVar);
    }

    public static void o(boolean z7) {
        AbstractC0846x.l(new C1222h(), z7);
        n.c();
    }

    @Override // k3.AbstractC1466d
    public String d() {
        return "type.googleapis.com/google.crypto.tink.AesEaxKey";
    }

    @Override // k3.AbstractC1466d
    public AbstractC1466d.a f() {
        return new b(C1806j.class);
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
    public C1805i h(AbstractC1093h abstractC1093h) {
        return C1805i.c0(abstractC1093h, C1101p.b());
    }

    @Override // k3.AbstractC1466d
    /* renamed from: p, reason: merged with bridge method [inline-methods] */
    public void j(C1805i c1805i) {
        AbstractC1902r.c(c1805i.a0(), m());
        AbstractC1902r.a(c1805i.Y().size());
        if (c1805i.Z().X() != 12 && c1805i.Z().X() != 16) {
            throw new GeneralSecurityException("invalid IV size; acceptable values have 12 or 16 bytes");
        }
    }
}
