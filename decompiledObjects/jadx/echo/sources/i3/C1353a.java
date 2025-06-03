package i3;

import c3.AbstractC0846x;
import c3.C0834l;
import c3.InterfaceC0827e;
import com.google.crypto.tink.shaded.protobuf.AbstractC1093h;
import com.google.crypto.tink.shaded.protobuf.C1101p;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import k3.AbstractC1466d;
import k3.m;
import p3.p;
import p3.q;
import p3.y;
import q3.AbstractC1900p;
import q3.AbstractC1902r;
import q3.C1888d;

/* renamed from: i3.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1353a extends AbstractC1466d {

    /* renamed from: i3.a$a, reason: collision with other inner class name */
    public class C0217a extends m {
        public C0217a(Class cls) {
            super(cls);
        }

        @Override // k3.m
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public InterfaceC0827e a(p pVar) {
            return new C1888d(pVar.X().Y());
        }
    }

    /* renamed from: i3.a$b */
    public class b extends AbstractC1466d.a {
        public b(Class cls) {
            super(cls);
        }

        @Override // k3.AbstractC1466d.a
        public Map c() {
            HashMap hashMap = new HashMap();
            hashMap.put("AES256_SIV", new AbstractC1466d.a.C0228a((q) q.X().y(64).n(), C0834l.b.TINK));
            hashMap.put("AES256_SIV_RAW", new AbstractC1466d.a.C0228a((q) q.X().y(64).n(), C0834l.b.RAW));
            return Collections.unmodifiableMap(hashMap);
        }

        @Override // k3.AbstractC1466d.a
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public p a(q qVar) {
            return (p) p.Z().y(AbstractC1093h.i(AbstractC1900p.c(qVar.W()))).z(C1353a.this.k()).n();
        }

        @Override // k3.AbstractC1466d.a
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public q d(AbstractC1093h abstractC1093h) {
            return q.Y(abstractC1093h, C1101p.b());
        }

        @Override // k3.AbstractC1466d.a
        /* renamed from: h, reason: merged with bridge method [inline-methods] */
        public void e(q qVar) {
            if (qVar.W() == 64) {
                return;
            }
            throw new InvalidAlgorithmParameterException("invalid key size: " + qVar.W() + ". Valid keys must have 64 bytes.");
        }
    }

    public C1353a() {
        super(p.class, new C0217a(InterfaceC0827e.class));
    }

    public static void m(boolean z7) {
        AbstractC0846x.l(new C1353a(), z7);
    }

    @Override // k3.AbstractC1466d
    public String d() {
        return "type.googleapis.com/google.crypto.tink.AesSivKey";
    }

    @Override // k3.AbstractC1466d
    public AbstractC1466d.a f() {
        return new b(q.class);
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
    public p h(AbstractC1093h abstractC1093h) {
        return p.a0(abstractC1093h, C1101p.b());
    }

    @Override // k3.AbstractC1466d
    /* renamed from: n, reason: merged with bridge method [inline-methods] */
    public void j(p pVar) {
        AbstractC1902r.c(pVar.Y(), k());
        if (pVar.X().size() == 64) {
            return;
        }
        throw new InvalidKeyException("invalid key size: " + pVar.X().size() + ". Valid keys must have 64 bytes.");
    }
}
