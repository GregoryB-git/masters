package d3;

import c3.AbstractC0846x;
import c3.C0834l;
import c3.InterfaceC0823a;
import com.google.crypto.tink.shaded.protobuf.AbstractC1093h;
import com.google.crypto.tink.shaded.protobuf.C1101p;
import f3.C1290a;
import java.security.NoSuchAlgorithmException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.NoSuchPaddingException;
import k3.AbstractC1466d;
import p3.y;
import q3.AbstractC1900p;
import q3.AbstractC1902r;

/* loaded from: classes.dex */
public final class u extends AbstractC1466d {

    public class a extends k3.m {
        public a(Class cls) {
            super(cls);
        }

        @Override // k3.m
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public InterfaceC0823a a(p3.n nVar) {
            return new C1290a(nVar.X().Y());
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
            hashMap.put("AES128_GCM_SIV", u.m(16, bVar));
            C0834l.b bVar2 = C0834l.b.RAW;
            hashMap.put("AES128_GCM_SIV_RAW", u.m(16, bVar2));
            hashMap.put("AES256_GCM_SIV", u.m(32, bVar));
            hashMap.put("AES256_GCM_SIV_RAW", u.m(32, bVar2));
            return Collections.unmodifiableMap(hashMap);
        }

        @Override // k3.AbstractC1466d.a
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public p3.n a(p3.o oVar) {
            return (p3.n) p3.n.Z().y(AbstractC1093h.i(AbstractC1900p.c(oVar.W()))).z(u.this.n()).n();
        }

        @Override // k3.AbstractC1466d.a
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public p3.o d(AbstractC1093h abstractC1093h) {
            return p3.o.Y(abstractC1093h, C1101p.b());
        }

        @Override // k3.AbstractC1466d.a
        /* renamed from: h, reason: merged with bridge method [inline-methods] */
        public void e(p3.o oVar) {
            AbstractC1902r.a(oVar.W());
        }
    }

    public u() {
        super(p3.n.class, new a(InterfaceC0823a.class));
    }

    public static boolean l() {
        try {
            Cipher.getInstance("AES/GCM-SIV/NoPadding");
            return true;
        } catch (NoSuchAlgorithmException | NoSuchPaddingException unused) {
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static AbstractC1466d.a.C0228a m(int i7, C0834l.b bVar) {
        return new AbstractC1466d.a.C0228a((p3.o) p3.o.X().y(i7).n(), bVar);
    }

    public static void p(boolean z7) {
        if (l()) {
            AbstractC0846x.l(new u(), z7);
            x.c();
        }
    }

    @Override // k3.AbstractC1466d
    public String d() {
        return "type.googleapis.com/google.crypto.tink.AesGcmSivKey";
    }

    @Override // k3.AbstractC1466d
    public AbstractC1466d.a f() {
        return new b(p3.o.class);
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
    public p3.n h(AbstractC1093h abstractC1093h) {
        return p3.n.a0(abstractC1093h, C1101p.b());
    }

    @Override // k3.AbstractC1466d
    /* renamed from: q, reason: merged with bridge method [inline-methods] */
    public void j(p3.n nVar) {
        AbstractC1902r.c(nVar.Y(), n());
        AbstractC1902r.a(nVar.X().size());
    }
}
