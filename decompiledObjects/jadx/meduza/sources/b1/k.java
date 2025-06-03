package b1;

import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public abstract class k {

    public enum a {
        ON_CREATE,
        ON_START,
        ON_RESUME,
        ON_PAUSE,
        ON_STOP,
        ON_DESTROY,
        ON_ANY;

        public static final C0029a Companion = new C0029a();

        /* renamed from: b1.k$a$a, reason: collision with other inner class name */
        public static final class C0029a {
            public static a a(b bVar) {
                ec.i.e(bVar, "state");
                int ordinal = bVar.ordinal();
                if (ordinal == 2) {
                    return a.ON_DESTROY;
                }
                if (ordinal == 3) {
                    return a.ON_STOP;
                }
                if (ordinal != 4) {
                    return null;
                }
                return a.ON_PAUSE;
            }

            public static a b(b bVar) {
                ec.i.e(bVar, "state");
                int ordinal = bVar.ordinal();
                if (ordinal == 1) {
                    return a.ON_CREATE;
                }
                if (ordinal == 2) {
                    return a.ON_START;
                }
                if (ordinal != 3) {
                    return null;
                }
                return a.ON_RESUME;
            }
        }

        public /* synthetic */ class b {

            /* renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f1745a;

            static {
                int[] iArr = new int[a.values().length];
                try {
                    iArr[a.ON_CREATE.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[a.ON_STOP.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[a.ON_START.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[a.ON_PAUSE.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[a.ON_RESUME.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                try {
                    iArr[a.ON_DESTROY.ordinal()] = 6;
                } catch (NoSuchFieldError unused6) {
                }
                try {
                    iArr[a.ON_ANY.ordinal()] = 7;
                } catch (NoSuchFieldError unused7) {
                }
                f1745a = iArr;
            }
        }

        public final b f() {
            switch (b.f1745a[ordinal()]) {
                case 1:
                case 2:
                    return b.CREATED;
                case 3:
                case 4:
                    return b.STARTED;
                case 5:
                    return b.RESUMED;
                case 6:
                    return b.DESTROYED;
                default:
                    throw new IllegalArgumentException(this + " has no target state");
            }
        }
    }

    public enum b {
        DESTROYED,
        INITIALIZED,
        CREATED,
        STARTED,
        RESUMED;

        public final boolean f(b bVar) {
            return compareTo(bVar) >= 0;
        }
    }

    public k() {
        new AtomicReference();
    }

    public abstract void a(n nVar);

    public abstract b b();

    public abstract void c(n nVar);
}
