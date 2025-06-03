package c3;

import com.google.crypto.tink.shaded.protobuf.AbstractC1093h;
import p3.C1792A;
import p3.I;

/* renamed from: c3.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0834l {

    /* renamed from: a, reason: collision with root package name */
    public final C1792A f10089a;

    /* renamed from: c3.l$a */
    public static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f10090a;

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f10091b;

        static {
            int[] iArr = new int[b.values().length];
            f10091b = iArr;
            try {
                iArr[b.TINK.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f10091b[b.LEGACY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f10091b[b.RAW.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f10091b[b.CRUNCHY.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            int[] iArr2 = new int[I.values().length];
            f10090a = iArr2;
            try {
                iArr2[I.TINK.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f10090a[I.LEGACY.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f10090a[I.RAW.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f10090a[I.CRUNCHY.ordinal()] = 4;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    /* renamed from: c3.l$b */
    public enum b {
        TINK,
        LEGACY,
        RAW,
        CRUNCHY
    }

    public C0834l(C1792A c1792a) {
        this.f10089a = c1792a;
    }

    public static C0834l a(String str, byte[] bArr, b bVar) {
        return new C0834l((C1792A) C1792A.c0().z(str).A(AbstractC1093h.i(bArr)).y(c(bVar)).n());
    }

    public static I c(b bVar) {
        int i7 = a.f10091b[bVar.ordinal()];
        if (i7 == 1) {
            return I.TINK;
        }
        if (i7 == 2) {
            return I.LEGACY;
        }
        if (i7 == 3) {
            return I.RAW;
        }
        if (i7 == 4) {
            return I.CRUNCHY;
        }
        throw new IllegalArgumentException("Unknown output prefix type");
    }

    public C1792A b() {
        return this.f10089a;
    }
}
