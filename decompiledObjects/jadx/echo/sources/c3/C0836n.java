package c3;

import c3.C0844v;
import com.google.crypto.tink.shaded.protobuf.A;
import com.google.crypto.tink.shaded.protobuf.AbstractC1093h;
import com.google.crypto.tink.shaded.protobuf.C1101p;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import n3.C1725a;
import p3.C1794C;
import p3.C1795D;
import p3.I;

/* renamed from: c3.n, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0836n {

    /* renamed from: a, reason: collision with root package name */
    public final C1794C f10097a;

    /* renamed from: b, reason: collision with root package name */
    public final List f10098b;

    /* renamed from: c, reason: collision with root package name */
    public final C1725a f10099c = C1725a.f17944b;

    /* renamed from: c3.n$a */
    public static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f10100a;

        static {
            int[] iArr = new int[p3.z.values().length];
            f10100a = iArr;
            try {
                iArr[p3.z.ENABLED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f10100a[p3.z.DISABLED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f10100a[p3.z.DESTROYED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* renamed from: c3.n$b */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public final AbstractC0829g f10101a;

        /* renamed from: b, reason: collision with root package name */
        public final C0833k f10102b;

        /* renamed from: c, reason: collision with root package name */
        public final int f10103c;

        /* renamed from: d, reason: collision with root package name */
        public final boolean f10104d;

        public b(AbstractC0829g abstractC0829g, C0833k c0833k, int i7, boolean z7) {
            this.f10101a = abstractC0829g;
            this.f10102b = c0833k;
            this.f10103c = i7;
            this.f10104d = z7;
        }

        public AbstractC0829g a() {
            return this.f10101a;
        }

        public /* synthetic */ b(AbstractC0829g abstractC0829g, C0833k c0833k, int i7, boolean z7, a aVar) {
            this(abstractC0829g, c0833k, i7, z7);
        }
    }

    public C0836n(C1794C c1794c, List list) {
        this.f10097a = c1794c;
        this.f10098b = list;
    }

    public static void a(p3.t tVar) {
        if (tVar == null || tVar.X().size() == 0) {
            throw new GeneralSecurityException("empty keyset");
        }
    }

    public static void b(C1794C c1794c) {
        if (c1794c == null || c1794c.a0() <= 0) {
            throw new GeneralSecurityException("empty keyset");
        }
    }

    public static C1794C c(p3.t tVar, InterfaceC0823a interfaceC0823a, byte[] bArr) {
        try {
            C1794C f02 = C1794C.f0(interfaceC0823a.b(tVar.X().Y(), bArr), C1101p.b());
            b(f02);
            return f02;
        } catch (A unused) {
            throw new GeneralSecurityException("invalid keyset, corrupted key material");
        }
    }

    public static p3.t d(C1794C c1794c, InterfaceC0823a interfaceC0823a, byte[] bArr) {
        byte[] a7 = interfaceC0823a.a(c1794c.f(), bArr);
        try {
            if (C1794C.f0(interfaceC0823a.b(a7, bArr), C1101p.b()).equals(c1794c)) {
                return (p3.t) p3.t.Y().y(AbstractC1093h.i(a7)).z(AbstractC0848z.b(c1794c)).n();
            }
            throw new GeneralSecurityException("cannot encrypt keyset");
        } catch (A unused) {
            throw new GeneralSecurityException("invalid keyset, corrupted key material");
        }
    }

    public static final C0836n e(C1794C c1794c) {
        b(c1794c);
        return new C0836n(c1794c, f(c1794c));
    }

    public static List f(C1794C c1794c) {
        ArrayList arrayList = new ArrayList(c1794c.a0());
        for (C1794C.c cVar : c1794c.b0()) {
            int a02 = cVar.a0();
            try {
                arrayList.add(new b(k3.i.a().d(q(cVar), AbstractC0828f.a()), m(cVar.c0()), a02, a02 == c1794c.c0(), null));
            } catch (GeneralSecurityException unused) {
                arrayList.add(null);
            }
        }
        return Collections.unmodifiableList(arrayList);
    }

    public static Object j(C1794C.c cVar, Class cls) {
        try {
            return AbstractC0846x.g(cVar.Z(), cls);
        } catch (GeneralSecurityException e7) {
            if (e7.getMessage().contains("No key manager found for key type ") || e7.getMessage().contains(" not supported by key manager of type ")) {
                return null;
            }
            throw e7;
        }
    }

    public static C0833k m(p3.z zVar) {
        int i7 = a.f10100a[zVar.ordinal()];
        if (i7 == 1) {
            return C0833k.f10085b;
        }
        if (i7 == 2) {
            return C0833k.f10086c;
        }
        if (i7 == 3) {
            return C0833k.f10087d;
        }
        throw new GeneralSecurityException("Unknown key status");
    }

    public static final C0836n n(InterfaceC0838p interfaceC0838p, InterfaceC0823a interfaceC0823a) {
        return o(interfaceC0838p, interfaceC0823a, new byte[0]);
    }

    public static final C0836n o(InterfaceC0838p interfaceC0838p, InterfaceC0823a interfaceC0823a, byte[] bArr) {
        p3.t a7 = interfaceC0838p.a();
        a(a7);
        return e(c(a7, interfaceC0823a, bArr));
    }

    public static k3.o q(C1794C.c cVar) {
        try {
            return k3.o.b(cVar.Z().a0(), cVar.Z().b0(), cVar.Z().Z(), cVar.b0(), cVar.b0() == I.RAW ? null : Integer.valueOf(cVar.a0()));
        } catch (GeneralSecurityException e7) {
            throw new k3.s("Creating a protokey serialization failed", e7);
        }
    }

    public final Object g(AbstractC0829g abstractC0829g, Class cls) {
        try {
            return AbstractC0846x.c(abstractC0829g, cls);
        } catch (GeneralSecurityException unused) {
            return null;
        }
    }

    public C1794C h() {
        return this.f10097a;
    }

    public C1795D i() {
        return AbstractC0848z.b(this.f10097a);
    }

    public Object k(Class cls) {
        Class d7 = AbstractC0846x.d(cls);
        if (d7 != null) {
            return l(cls, d7);
        }
        throw new GeneralSecurityException("No wrapper found for " + cls.getName());
    }

    public final Object l(Class cls, Class cls2) {
        AbstractC0848z.d(this.f10097a);
        C0844v.b j7 = C0844v.j(cls2);
        j7.e(this.f10099c);
        for (int i7 = 0; i7 < p(); i7++) {
            C1794C.c Z6 = this.f10097a.Z(i7);
            if (Z6.c0().equals(p3.z.ENABLED)) {
                Object j8 = j(Z6, cls2);
                Object g7 = this.f10098b.get(i7) != null ? g(((b) this.f10098b.get(i7)).a(), cls2) : null;
                if (Z6.a0() == this.f10097a.c0()) {
                    j7.b(g7, j8, Z6);
                } else {
                    j7.a(g7, j8, Z6);
                }
            }
        }
        return AbstractC0846x.o(j7.d(), cls);
    }

    public int p() {
        return this.f10097a.a0();
    }

    public void r(InterfaceC0839q interfaceC0839q, InterfaceC0823a interfaceC0823a) {
        s(interfaceC0839q, interfaceC0823a, new byte[0]);
    }

    public void s(InterfaceC0839q interfaceC0839q, InterfaceC0823a interfaceC0823a, byte[] bArr) {
        interfaceC0839q.a(d(this.f10097a, interfaceC0823a, bArr));
    }

    public String toString() {
        return i().toString();
    }
}
