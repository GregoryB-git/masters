package V3;

import c4.InterfaceC0852d;
import s3.C1947e;

/* renamed from: V3.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0668g extends AbstractC0667f {

    /* renamed from: V3.g$a */
    public static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f6535a;

        static {
            int[] iArr = new int[Q3.l.values().length];
            f6535a = iArr;
            try {
                iArr[Q3.l.DEBUG.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f6535a[Q3.l.INFO.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f6535a[Q3.l.WARN.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f6535a[Q3.l.ERROR.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f6535a[Q3.l.NONE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    public void I(A a7) {
        this.f6520d = a7;
    }

    public void J(A a7) {
        this.f6519c = a7;
    }

    public synchronized void K(C1947e c1947e) {
        this.f6528l = c1947e;
    }

    public synchronized void L(Q3.l lVar) {
        InterfaceC0852d.a aVar;
        try {
            b();
            int i7 = a.f6535a[lVar.ordinal()];
            if (i7 == 1) {
                aVar = InterfaceC0852d.a.DEBUG;
            } else if (i7 == 2) {
                aVar = InterfaceC0852d.a.INFO;
            } else if (i7 == 3) {
                aVar = InterfaceC0852d.a.WARN;
            } else if (i7 == 4) {
                aVar = InterfaceC0852d.a.ERROR;
            } else {
                if (i7 != 5) {
                    throw new IllegalArgumentException("Unknown log level: " + lVar);
                }
                aVar = InterfaceC0852d.a.NONE;
            }
            this.f6525i = aVar;
        } catch (Throwable th) {
            throw th;
        }
    }

    public synchronized void M(long j7) {
        b();
        if (j7 < 1048576) {
            throw new Q3.d("The minimum cache size must be at least 1MB");
        }
        if (j7 > 104857600) {
            throw new Q3.d("Firebase Database currently doesn't support a cache size larger than 100MB");
        }
        this.f6527k = j7;
    }

    public synchronized void N(boolean z7) {
        b();
        this.f6526j = z7;
    }

    public synchronized void O(String str) {
        b();
        if (str == null || str.isEmpty()) {
            throw new IllegalArgumentException("Session identifier is not allowed to be empty or null!");
        }
        this.f6522f = str;
    }
}
