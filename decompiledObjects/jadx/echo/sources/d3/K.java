package d3;

import c3.AbstractC0829g;
import c3.C0847y;
import com.google.crypto.tink.shaded.protobuf.C1101p;
import d3.I;
import java.security.GeneralSecurityException;
import k3.AbstractC1464b;
import k3.AbstractC1465c;
import r3.C1919a;
import r3.C1920b;

/* loaded from: classes.dex */
public abstract class K {

    /* renamed from: a, reason: collision with root package name */
    public static final C1919a f13165a;

    /* renamed from: b, reason: collision with root package name */
    public static final k3.k f13166b;

    /* renamed from: c, reason: collision with root package name */
    public static final k3.j f13167c;

    /* renamed from: d, reason: collision with root package name */
    public static final AbstractC1465c f13168d;

    /* renamed from: e, reason: collision with root package name */
    public static final AbstractC1464b f13169e;

    public static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f13170a;

        static {
            int[] iArr = new int[p3.I.values().length];
            f13170a = iArr;
            try {
                iArr[p3.I.TINK.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f13170a[p3.I.CRUNCHY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f13170a[p3.I.LEGACY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f13170a[p3.I.RAW.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    static {
        C1919a e7 = k3.t.e("type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key");
        f13165a = e7;
        f13166b = k3.k.a(new C1224j(), I.class, k3.p.class);
        f13167c = k3.j.a(new C1225k(), e7, k3.p.class);
        f13168d = AbstractC1465c.a(new l(), C1213G.class, k3.o.class);
        f13169e = AbstractC1464b.a(new AbstractC1464b.InterfaceC0227b() { // from class: d3.J
            @Override // k3.AbstractC1464b.InterfaceC0227b
            public final AbstractC0829g a(k3.q qVar, C0847y c0847y) {
                C1213G b7;
                b7 = K.b((k3.o) qVar, c0847y);
                return b7;
            }
        }, e7, k3.o.class);
    }

    public static C1213G b(k3.o oVar, C0847y c0847y) {
        if (!oVar.f().equals("type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key")) {
            throw new IllegalArgumentException("Wrong type URL in call to XChaCha20Poly1305Parameters.parseParameters");
        }
        try {
            p3.K a02 = p3.K.a0(oVar.g(), C1101p.b());
            if (a02.Y() == 0) {
                return C1213G.a(e(oVar.e()), C1920b.a(a02.X().Y(), C0847y.b(c0847y)), oVar.c());
            }
            throw new GeneralSecurityException("Only version 0 keys are accepted");
        } catch (com.google.crypto.tink.shaded.protobuf.A unused) {
            throw new GeneralSecurityException("Parsing XChaCha20Poly1305Key failed");
        }
    }

    public static void c() {
        d(k3.i.a());
    }

    public static void d(k3.i iVar) {
        iVar.h(f13166b);
        iVar.g(f13167c);
        iVar.f(f13168d);
        iVar.e(f13169e);
    }

    public static I.a e(p3.I i7) {
        int i8 = a.f13170a[i7.ordinal()];
        if (i8 == 1) {
            return I.a.f13161b;
        }
        if (i8 == 2 || i8 == 3) {
            return I.a.f13162c;
        }
        if (i8 == 4) {
            return I.a.f13163d;
        }
        throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + i7.g());
    }
}
