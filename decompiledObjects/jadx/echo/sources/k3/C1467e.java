package k3;

import c3.AbstractC0829g;
import c3.C0847y;
import p3.I;
import p3.y;

/* renamed from: k3.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1467e extends AbstractC0829g {

    /* renamed from: a, reason: collision with root package name */
    public final o f16146a;

    /* renamed from: k3.e$a */
    public static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f16147a;

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f16148b;

        static {
            int[] iArr = new int[y.c.values().length];
            f16148b = iArr;
            try {
                iArr[y.c.SYMMETRIC.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f16148b[y.c.ASYMMETRIC_PRIVATE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            int[] iArr2 = new int[I.values().length];
            f16147a = iArr2;
            try {
                iArr2[I.TINK.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f16147a[I.LEGACY.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f16147a[I.RAW.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f16147a[I.CRUNCHY.ordinal()] = 4;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    public C1467e(o oVar, C0847y c0847y) {
        a(oVar, c0847y);
        this.f16146a = oVar;
    }

    public static void a(o oVar, C0847y c0847y) {
        int i7 = a.f16148b[oVar.d().ordinal()];
        if (i7 == 1 || i7 == 2) {
            C0847y.b(c0847y);
        }
    }
}
