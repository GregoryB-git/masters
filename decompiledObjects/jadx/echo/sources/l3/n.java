package l3;

import c3.AbstractC0829g;
import c3.C0847y;
import com.google.crypto.tink.shaded.protobuf.A;
import com.google.crypto.tink.shaded.protobuf.C1101p;
import d3.C1224j;
import d3.C1225k;
import java.security.GeneralSecurityException;
import k3.AbstractC1464b;
import k3.AbstractC1465c;
import k3.t;
import l3.l;
import p3.I;
import p3.u;
import p3.v;
import r3.C1919a;
import r3.C1920b;

/* loaded from: classes.dex */
public abstract class n {

    /* renamed from: a, reason: collision with root package name */
    public static final C1919a f17217a;

    /* renamed from: b, reason: collision with root package name */
    public static final k3.k f17218b;

    /* renamed from: c, reason: collision with root package name */
    public static final k3.j f17219c;

    /* renamed from: d, reason: collision with root package name */
    public static final AbstractC1465c f17220d;

    /* renamed from: e, reason: collision with root package name */
    public static final AbstractC1464b f17221e;

    public static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f17222a;

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f17223b;

        static {
            int[] iArr = new int[I.values().length];
            f17223b = iArr;
            try {
                iArr[I.TINK.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f17223b[I.CRUNCHY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f17223b[I.LEGACY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f17223b[I.RAW.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            int[] iArr2 = new int[u.values().length];
            f17222a = iArr2;
            try {
                iArr2[u.SHA1.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f17222a[u.SHA224.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f17222a[u.SHA256.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f17222a[u.SHA384.ordinal()] = 4;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f17222a[u.SHA512.ordinal()] = 5;
            } catch (NoSuchFieldError unused9) {
            }
        }
    }

    static {
        C1919a e7 = t.e("type.googleapis.com/google.crypto.tink.HmacKey");
        f17217a = e7;
        f17218b = k3.k.a(new C1224j(), l.class, k3.p.class);
        f17219c = k3.j.a(new C1225k(), e7, k3.p.class);
        f17220d = AbstractC1465c.a(new d3.l(), i.class, k3.o.class);
        f17221e = AbstractC1464b.a(new AbstractC1464b.InterfaceC0227b() { // from class: l3.m
            @Override // k3.AbstractC1464b.InterfaceC0227b
            public final AbstractC0829g a(k3.q qVar, C0847y c0847y) {
                i b7;
                b7 = n.b((k3.o) qVar, c0847y);
                return b7;
            }
        }, e7, k3.o.class);
    }

    public static i b(k3.o oVar, C0847y c0847y) {
        if (!oVar.f().equals("type.googleapis.com/google.crypto.tink.HmacKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to HmacProtoSerialization.parseKey");
        }
        try {
            v d02 = v.d0(oVar.g(), C1101p.b());
            if (d02.b0() != 0) {
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            }
            return i.c().e(l.a().c(d02.Z().size()).d(d02.a0().Z()).b(e(d02.a0().Y())).e(f(oVar.e())).a()).d(C1920b.a(d02.Z().Y(), C0847y.b(c0847y))).c(oVar.c()).a();
        } catch (A | IllegalArgumentException unused) {
            throw new GeneralSecurityException("Parsing HmacKey failed");
        }
    }

    public static void c() {
        d(k3.i.a());
    }

    public static void d(k3.i iVar) {
        iVar.h(f17218b);
        iVar.g(f17219c);
        iVar.f(f17220d);
        iVar.e(f17221e);
    }

    public static l.c e(u uVar) {
        int i7 = a.f17222a[uVar.ordinal()];
        if (i7 == 1) {
            return l.c.f17206b;
        }
        if (i7 == 2) {
            return l.c.f17207c;
        }
        if (i7 == 3) {
            return l.c.f17208d;
        }
        if (i7 == 4) {
            return l.c.f17209e;
        }
        if (i7 == 5) {
            return l.c.f17210f;
        }
        throw new GeneralSecurityException("Unable to parse HashType: " + uVar.g());
    }

    public static l.d f(I i7) {
        int i8 = a.f17223b[i7.ordinal()];
        if (i8 == 1) {
            return l.d.f17212b;
        }
        if (i8 == 2) {
            return l.d.f17213c;
        }
        if (i8 == 3) {
            return l.d.f17214d;
        }
        if (i8 == 4) {
            return l.d.f17215e;
        }
        throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + i7.g());
    }
}
