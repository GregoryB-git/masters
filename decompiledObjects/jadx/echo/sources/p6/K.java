package p6;

/* loaded from: classes.dex */
public enum K {
    DEFAULT,
    LAZY,
    ATOMIC,
    UNDISPATCHED;

    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f18500a;

        static {
            int[] iArr = new int[K.values().length];
            try {
                iArr[K.DEFAULT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[K.ATOMIC.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[K.UNDISPATCHED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[K.LAZY.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f18500a = iArr;
        }
    }

    public final void e(g6.p pVar, Object obj, X5.d dVar) {
        int i7 = a.f18500a[ordinal()];
        if (i7 == 1) {
            v6.a.d(pVar, obj, dVar, null, 4, null);
            return;
        }
        if (i7 == 2) {
            X5.f.a(pVar, obj, dVar);
        } else if (i7 == 3) {
            v6.b.a(pVar, obj, dVar);
        } else if (i7 != 4) {
            throw new V5.l();
        }
    }

    public final boolean h() {
        return this == LAZY;
    }
}
