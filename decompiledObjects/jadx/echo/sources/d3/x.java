package d3;

import c3.AbstractC0829g;
import c3.C0847y;
import com.google.crypto.tink.shaded.protobuf.C1101p;
import d3.v;
import java.security.GeneralSecurityException;
import k3.AbstractC1464b;
import k3.AbstractC1465c;
import r3.C1919a;
import r3.C1920b;

/* loaded from: classes.dex */
public abstract class x {

    /* renamed from: a, reason: collision with root package name */
    public static final C1919a f13257a;

    /* renamed from: b, reason: collision with root package name */
    public static final k3.k f13258b;

    /* renamed from: c, reason: collision with root package name */
    public static final k3.j f13259c;

    /* renamed from: d, reason: collision with root package name */
    public static final AbstractC1465c f13260d;

    /* renamed from: e, reason: collision with root package name */
    public static final AbstractC1464b f13261e;

    public static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f13262a;

        static {
            int[] iArr = new int[p3.I.values().length];
            f13262a = iArr;
            try {
                iArr[p3.I.TINK.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f13262a[p3.I.CRUNCHY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f13262a[p3.I.LEGACY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f13262a[p3.I.RAW.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    static {
        C1919a e7 = k3.t.e("type.googleapis.com/google.crypto.tink.AesGcmSivKey");
        f13257a = e7;
        f13258b = k3.k.a(new C1224j(), v.class, k3.p.class);
        f13259c = k3.j.a(new C1225k(), e7, k3.p.class);
        f13260d = AbstractC1465c.a(new l(), t.class, k3.o.class);
        f13261e = AbstractC1464b.a(new AbstractC1464b.InterfaceC0227b() { // from class: d3.w
            @Override // k3.AbstractC1464b.InterfaceC0227b
            public final AbstractC0829g a(k3.q qVar, C0847y c0847y) {
                t b7;
                b7 = x.b((k3.o) qVar, c0847y);
                return b7;
            }
        }, e7, k3.o.class);
    }

    public static t b(k3.o oVar, C0847y c0847y) {
        if (!oVar.f().equals("type.googleapis.com/google.crypto.tink.AesGcmSivKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to AesGcmSivParameters.parseParameters");
        }
        try {
            p3.n a02 = p3.n.a0(oVar.g(), C1101p.b());
            if (a02.Y() != 0) {
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            }
            return t.a().e(v.a().b(a02.X().size()).c(e(oVar.e())).a()).d(C1920b.a(a02.X().Y(), C0847y.b(c0847y))).c(oVar.c()).a();
        } catch (com.google.crypto.tink.shaded.protobuf.A unused) {
            throw new GeneralSecurityException("Parsing AesGcmSivKey failed");
        }
    }

    public static void c() {
        d(k3.i.a());
    }

    public static void d(k3.i iVar) {
        iVar.h(f13258b);
        iVar.g(f13259c);
        iVar.f(f13260d);
        iVar.e(f13261e);
    }

    public static v.c e(p3.I i7) {
        int i8 = a.f13262a[i7.ordinal()];
        if (i8 == 1) {
            return v.c.f13253b;
        }
        if (i8 == 2 || i8 == 3) {
            return v.c.f13254c;
        }
        if (i8 == 4) {
            return v.c.f13255d;
        }
        throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + i7.g());
    }
}
