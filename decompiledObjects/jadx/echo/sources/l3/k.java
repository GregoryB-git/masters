package l3;

import c3.AbstractC0829g;
import c3.AbstractC0846x;
import c3.C0834l;
import c3.InterfaceC0842t;
import com.google.crypto.tink.shaded.protobuf.AbstractC1093h;
import com.google.crypto.tink.shaded.protobuf.C1101p;
import h3.AbstractC1336b;
import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import javax.crypto.spec.SecretKeySpec;
import k3.AbstractC1466d;
import k3.C1470h;
import k3.l;
import m3.C1672c;
import p3.u;
import p3.v;
import p3.w;
import p3.x;
import p3.y;
import q3.AbstractC1900p;
import q3.AbstractC1902r;
import q3.C1898n;
import q3.C1899o;

/* loaded from: classes.dex */
public final class k extends AbstractC1466d {

    /* renamed from: d, reason: collision with root package name */
    public static final k3.l f17195d = k3.l.b(new l.b() { // from class: l3.j
        @Override // k3.l.b
        public final Object a(AbstractC0829g abstractC0829g) {
            return new C1672c((i) abstractC0829g);
        }
    }, i.class, g.class);

    public class a extends k3.m {
        public a(Class cls) {
            super(cls);
        }

        @Override // k3.m
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public InterfaceC0842t a(v vVar) {
            u Y6 = vVar.a0().Y();
            SecretKeySpec secretKeySpec = new SecretKeySpec(vVar.Z().Y(), "HMAC");
            int Z6 = vVar.a0().Z();
            int i7 = c.f17197a[Y6.ordinal()];
            if (i7 == 1) {
                return new C1899o(new C1898n("HMACSHA1", secretKeySpec), Z6);
            }
            if (i7 == 2) {
                return new C1899o(new C1898n("HMACSHA224", secretKeySpec), Z6);
            }
            if (i7 == 3) {
                return new C1899o(new C1898n("HMACSHA256", secretKeySpec), Z6);
            }
            if (i7 == 4) {
                return new C1899o(new C1898n("HMACSHA384", secretKeySpec), Z6);
            }
            if (i7 == 5) {
                return new C1899o(new C1898n("HMACSHA512", secretKeySpec), Z6);
            }
            throw new GeneralSecurityException("unknown hash");
        }
    }

    public class b extends AbstractC1466d.a {
        public b(Class cls) {
            super(cls);
        }

        @Override // k3.AbstractC1466d.a
        public Map c() {
            HashMap hashMap = new HashMap();
            u uVar = u.SHA256;
            C0834l.b bVar = C0834l.b.TINK;
            hashMap.put("HMAC_SHA256_128BITTAG", k.m(32, 16, uVar, bVar));
            C0834l.b bVar2 = C0834l.b.RAW;
            hashMap.put("HMAC_SHA256_128BITTAG_RAW", k.m(32, 16, uVar, bVar2));
            hashMap.put("HMAC_SHA256_256BITTAG", k.m(32, 32, uVar, bVar));
            hashMap.put("HMAC_SHA256_256BITTAG_RAW", k.m(32, 32, uVar, bVar2));
            u uVar2 = u.SHA512;
            hashMap.put("HMAC_SHA512_128BITTAG", k.m(64, 16, uVar2, bVar));
            hashMap.put("HMAC_SHA512_128BITTAG_RAW", k.m(64, 16, uVar2, bVar2));
            hashMap.put("HMAC_SHA512_256BITTAG", k.m(64, 32, uVar2, bVar));
            hashMap.put("HMAC_SHA512_256BITTAG_RAW", k.m(64, 32, uVar2, bVar2));
            hashMap.put("HMAC_SHA512_512BITTAG", k.m(64, 64, uVar2, bVar));
            hashMap.put("HMAC_SHA512_512BITTAG_RAW", k.m(64, 64, uVar2, bVar2));
            return Collections.unmodifiableMap(hashMap);
        }

        @Override // k3.AbstractC1466d.a
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public v a(w wVar) {
            return (v) v.c0().A(k.this.n()).z(wVar.Z()).y(AbstractC1093h.i(AbstractC1900p.c(wVar.Y()))).n();
        }

        @Override // k3.AbstractC1466d.a
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public w d(AbstractC1093h abstractC1093h) {
            return w.b0(abstractC1093h, C1101p.b());
        }

        @Override // k3.AbstractC1466d.a
        /* renamed from: h, reason: merged with bridge method [inline-methods] */
        public void e(w wVar) {
            if (wVar.Y() < 16) {
                throw new GeneralSecurityException("key too short");
            }
            k.r(wVar.Z());
        }
    }

    public static /* synthetic */ class c {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f17197a;

        static {
            int[] iArr = new int[u.values().length];
            f17197a = iArr;
            try {
                iArr[u.SHA1.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f17197a[u.SHA224.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f17197a[u.SHA256.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f17197a[u.SHA384.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f17197a[u.SHA512.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    public k() {
        super(v.class, new a(InterfaceC0842t.class));
    }

    public static AbstractC1466d.a.C0228a m(int i7, int i8, u uVar, C0834l.b bVar) {
        return new AbstractC1466d.a.C0228a((w) w.a0().z((x) x.a0().y(uVar).z(i8).n()).y(i7).n(), bVar);
    }

    public static void p(boolean z7) {
        AbstractC0846x.l(new k(), z7);
        n.c();
        C1470h.c().d(f17195d);
    }

    public static void r(x xVar) {
        if (xVar.Z() < 10) {
            throw new GeneralSecurityException("tag size too small");
        }
        int i7 = c.f17197a[xVar.Y().ordinal()];
        if (i7 == 1) {
            if (xVar.Z() > 20) {
                throw new GeneralSecurityException("tag size too big");
            }
            return;
        }
        if (i7 == 2) {
            if (xVar.Z() > 28) {
                throw new GeneralSecurityException("tag size too big");
            }
            return;
        }
        if (i7 == 3) {
            if (xVar.Z() > 32) {
                throw new GeneralSecurityException("tag size too big");
            }
        } else if (i7 == 4) {
            if (xVar.Z() > 48) {
                throw new GeneralSecurityException("tag size too big");
            }
        } else {
            if (i7 != 5) {
                throw new GeneralSecurityException("unknown hash type");
            }
            if (xVar.Z() > 64) {
                throw new GeneralSecurityException("tag size too big");
            }
        }
    }

    @Override // k3.AbstractC1466d
    public AbstractC1336b.EnumC0213b a() {
        return AbstractC1336b.EnumC0213b.f14585p;
    }

    @Override // k3.AbstractC1466d
    public String d() {
        return "type.googleapis.com/google.crypto.tink.HmacKey";
    }

    @Override // k3.AbstractC1466d
    public AbstractC1466d.a f() {
        return new b(w.class);
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
    public v h(AbstractC1093h abstractC1093h) {
        return v.d0(abstractC1093h, C1101p.b());
    }

    @Override // k3.AbstractC1466d
    /* renamed from: q, reason: merged with bridge method [inline-methods] */
    public void j(v vVar) {
        AbstractC1902r.c(vVar.b0(), n());
        if (vVar.Z().size() < 16) {
            throw new GeneralSecurityException("key too short");
        }
        r(vVar.a0());
    }
}
