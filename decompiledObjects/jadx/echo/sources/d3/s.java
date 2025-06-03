package d3;

import c3.AbstractC0829g;
import c3.C0847y;
import com.google.crypto.tink.shaded.protobuf.C1101p;
import d3.q;
import java.security.GeneralSecurityException;
import k3.AbstractC1464b;
import k3.AbstractC1465c;
import p3.C1808l;
import r3.C1919a;
import r3.C1920b;

/* loaded from: classes.dex */
public abstract class s {

    /* renamed from: a, reason: collision with root package name */
    public static final C1919a f13235a;

    /* renamed from: b, reason: collision with root package name */
    public static final k3.k f13236b;

    /* renamed from: c, reason: collision with root package name */
    public static final k3.j f13237c;

    /* renamed from: d, reason: collision with root package name */
    public static final AbstractC1465c f13238d;

    /* renamed from: e, reason: collision with root package name */
    public static final AbstractC1464b f13239e;

    public static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f13240a;

        static {
            int[] iArr = new int[p3.I.values().length];
            f13240a = iArr;
            try {
                iArr[p3.I.TINK.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f13240a[p3.I.CRUNCHY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f13240a[p3.I.LEGACY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f13240a[p3.I.RAW.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    static {
        C1919a e7 = k3.t.e("type.googleapis.com/google.crypto.tink.AesGcmKey");
        f13235a = e7;
        f13236b = k3.k.a(new C1224j(), q.class, k3.p.class);
        f13237c = k3.j.a(new C1225k(), e7, k3.p.class);
        f13238d = AbstractC1465c.a(new l(), o.class, k3.o.class);
        f13239e = AbstractC1464b.a(new AbstractC1464b.InterfaceC0227b() { // from class: d3.r
            @Override // k3.AbstractC1464b.InterfaceC0227b
            public final AbstractC0829g a(k3.q qVar, C0847y c0847y) {
                o b7;
                b7 = s.b((k3.o) qVar, c0847y);
                return b7;
            }
        }, e7, k3.o.class);
    }

    public static o b(k3.o oVar, C0847y c0847y) {
        if (!oVar.f().equals("type.googleapis.com/google.crypto.tink.AesGcmKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to AesGcmParameters.parseParameters");
        }
        try {
            C1808l a02 = C1808l.a0(oVar.g(), C1101p.b());
            if (a02.Y() != 0) {
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            }
            return o.a().e(q.a().c(a02.X().size()).b(12).d(16).e(e(oVar.e())).a()).d(C1920b.a(a02.X().Y(), C0847y.b(c0847y))).c(oVar.c()).a();
        } catch (com.google.crypto.tink.shaded.protobuf.A unused) {
            throw new GeneralSecurityException("Parsing AesGcmKey failed");
        }
    }

    public static void c() {
        d(k3.i.a());
    }

    public static void d(k3.i iVar) {
        iVar.h(f13236b);
        iVar.g(f13237c);
        iVar.f(f13238d);
        iVar.e(f13239e);
    }

    public static q.c e(p3.I i7) {
        int i8 = a.f13240a[i7.ordinal()];
        if (i8 == 1) {
            return q.c.f13231b;
        }
        if (i8 == 2 || i8 == 3) {
            return q.c.f13232c;
        }
        if (i8 == 4) {
            return q.c.f13233d;
        }
        throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + i7.g());
    }
}
