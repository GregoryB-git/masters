package androidx.lifecycle;

import androidx.lifecycle.d;

/* loaded from: classes.dex */
class FullLifecycleObserverAdapter implements f {

    /* renamed from: o, reason: collision with root package name */
    public final f f9651o;

    public static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f9652a;

        static {
            int[] iArr = new int[d.b.values().length];
            f9652a = iArr;
            try {
                iArr[d.b.ON_CREATE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f9652a[d.b.ON_START.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f9652a[d.b.ON_RESUME.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f9652a[d.b.ON_PAUSE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f9652a[d.b.ON_STOP.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f9652a[d.b.ON_DESTROY.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f9652a[d.b.ON_ANY.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    @Override // androidx.lifecycle.f
    public void a(h hVar, d.b bVar) {
        switch (a.f9652a[bVar.ordinal()]) {
            case 1:
                throw null;
            case 2:
                throw null;
            case 3:
                throw null;
            case 4:
                throw null;
            case 5:
                throw null;
            case 6:
                throw null;
            case 7:
                throw new IllegalArgumentException("ON_ANY must not been send by anybody");
            default:
                f fVar = this.f9651o;
                if (fVar != null) {
                    fVar.a(hVar, bVar);
                    return;
                }
                return;
        }
    }
}
