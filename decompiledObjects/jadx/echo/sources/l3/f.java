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
import l3.d;
import p3.C1797a;
import p3.I;
import r3.C1919a;
import r3.C1920b;

/* loaded from: classes.dex */
public abstract class f {

    /* renamed from: a, reason: collision with root package name */
    public static final C1919a f17180a;

    /* renamed from: b, reason: collision with root package name */
    public static final k3.k f17181b;

    /* renamed from: c, reason: collision with root package name */
    public static final k3.j f17182c;

    /* renamed from: d, reason: collision with root package name */
    public static final AbstractC1465c f17183d;

    /* renamed from: e, reason: collision with root package name */
    public static final AbstractC1464b f17184e;

    public static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f17185a;

        static {
            int[] iArr = new int[I.values().length];
            f17185a = iArr;
            try {
                iArr[I.TINK.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f17185a[I.CRUNCHY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f17185a[I.LEGACY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f17185a[I.RAW.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    static {
        C1919a e7 = t.e("type.googleapis.com/google.crypto.tink.AesCmacKey");
        f17180a = e7;
        f17181b = k3.k.a(new C1224j(), d.class, k3.p.class);
        f17182c = k3.j.a(new C1225k(), e7, k3.p.class);
        f17183d = AbstractC1465c.a(new d3.l(), C1604a.class, k3.o.class);
        f17184e = AbstractC1464b.a(new AbstractC1464b.InterfaceC0227b() { // from class: l3.e
            @Override // k3.AbstractC1464b.InterfaceC0227b
            public final AbstractC0829g a(k3.q qVar, C0847y c0847y) {
                C1604a b7;
                b7 = f.b((k3.o) qVar, c0847y);
                return b7;
            }
        }, e7, k3.o.class);
    }

    public static C1604a b(k3.o oVar, C0847y c0847y) {
        if (!oVar.f().equals("type.googleapis.com/google.crypto.tink.AesCmacKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to AesCmacParameters.parseParameters");
        }
        try {
            C1797a c02 = C1797a.c0(oVar.g(), C1101p.b());
            if (c02.a0() != 0) {
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            }
            return C1604a.c().e(d.a().b(c02.Y().size()).c(c02.Z().X()).d(e(oVar.e())).a()).c(C1920b.a(c02.Y().Y(), C0847y.b(c0847y))).d(oVar.c()).a();
        } catch (A | IllegalArgumentException unused) {
            throw new GeneralSecurityException("Parsing AesCmacKey failed");
        }
    }

    public static void c() {
        d(k3.i.a());
    }

    public static void d(k3.i iVar) {
        iVar.h(f17181b);
        iVar.g(f17182c);
        iVar.f(f17183d);
        iVar.e(f17184e);
    }

    public static d.c e(I i7) {
        int i8 = a.f17185a[i7.ordinal()];
        if (i8 == 1) {
            return d.c.f17175b;
        }
        if (i8 == 2) {
            return d.c.f17176c;
        }
        if (i8 == 3) {
            return d.c.f17177d;
        }
        if (i8 == 4) {
            return d.c.f17178e;
        }
        throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + i7.g());
    }
}
